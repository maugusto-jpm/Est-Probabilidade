package estatistica;

public class CalculoPoisson {
    private final int precisao;
    private final Integer[] x,  nx;
    private final Fracao m, t;
    
    public CalculoPoisson(Integer[] x, Integer[] nx, Fracao m, Fracao t, int precisao){
        this.x = x;
        this.nx = nx;
        this.m = m;
        this.t = t;
        this.precisao = precisao;
        
        this.calcular();
    }

    private void calcular() {
        FracaoTela ft = new FracaoTela(precisao);
        
        ft.adicionar("λt", null, null, null);
        ft.adicionar(m, "=");
        ft.adicionar(t, "*");
        Fracao u = m.multiplicar(t);
        ft.adicionar(u, null, "=");
        ft.escrever();
        Principal.escreverPular("\n\n");
        if (x.length == 1) {
            resolver(x[0], u);
            return;
        }
        
        ft = new FracaoTela(precisao);
        Fracao[] resultados;
        Fracao resultado = null;
        
        if ((x.length <= nx.length) || nx.length == 0){
            resultados = new Fracao[x.length];
            for (int i = 0; i < x.length; i++){
                resultados[i] = resolver(x[i], u);
                Principal.escreverPular("\n");
            }
        
            for (int i = 0; i < resultados.length; i++) {
                ft.adicionar(resultados[i], null, i > 0 ? "+" : null);
                if (resultado == null) resultado = resultados[i];
                else resultado = resultado.somar(resultados[i]);
            }
        } else {
            resultados = new Fracao[nx.length];
            
            for (int i = 0; i < nx.length; i++){
                resultados[i] = resolver(nx[i], u);
                Principal.escreverPular("\n");
            }
            
            ft.adicionar(1, null, null);
        
            for (int i = 0; i < resultados.length; i++) {
                ft.adicionar(resultados[i], null, i > 0 ? "+" : "-");
                if (resultado == null) resultado = resultados[i];
                else resultado = resultado.somar(resultados[i]);
            }
            resultado = new Fracao(1, 1).subtrair(resultado);
        }
        double res = resultado.emDecimal(precisao);
        ft.adicionar(res, null, "=");
        ft.adicionar(String.format(String.format("%%.%df %%%%",
                precisao > 2 ? precisao - 2 : 0), res * 100), null, null, "ou");

        ft.escrever();
    }
    
    private Fracao resolver(int x, Fracao rt){
        FracaoTela ft = new FracaoTela(precisao);
        
        ft.adicionar("P(X = " + x + ")", null, null, null);
        double rtd = rt.emDecimal(precisao);
        
        ft.adicionar(String.format(rtd == (int)rtd ? "(e^-(%.0f)) * (%.0f^%d)" :
                String.format("(e^-(%%.%df)) * (%%.%df^%%d)", precisao, precisao),
                rtd, rtd, x), String.format("%d!", x), null, "=");
        
        double c1 = Math.round(Math.pow(Math.E, -1 * rt.emDecimal(precisao)) *
                Math.pow(10, precisao)) / Math.pow(10, precisao);
        
        double c2 = Math.round(Math.pow(rt.emDecimal(precisao), x) *
                Math.pow(10, precisao)) / Math.pow(10, precisao);
        
        double bx = Fracao.fatorial(x);
        
        ft.adicionar(String.format(c1 == (int)c1 ? "%.0f * " : String.format("%%.%df * ", precisao) +
                (c2 == (int)c2 ? "%.0f" : String.format("%%.%df", precisao)), c1, c2),
                String.format(bx == (int)bx ? "%.0f" : String.format("%%.%df", precisao), bx), null, "=");
        
        Fracao res = new Fracao(c1 * c2, bx);
        ft.adicionar(res, "=");
        double r = res.emDecimal(precisao);
        ft.adicionar(r, null, "=");
        ft.adicionar(String.format(String.format("%%.%df %%%%",
                precisao > 2 ? precisao - 2 : 0), r * 100), null, null, "ou");
        
        ft.escrever();
        return res;
    }
}