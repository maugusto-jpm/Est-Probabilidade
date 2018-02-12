package estatistica;

import java.awt.TextArea;

public final class CalculoBinomial {
    private final Fracao sucesso, fracasso;
    private final int n;
    private final Integer[] k, nk;
    private final int precisao;

    public CalculoBinomial(Fracao sucesso, Fracao fracasso, int n, Integer[] k, Integer[] nk, int precisao) {
        this.sucesso = sucesso;
        this.fracasso = fracasso;
        this.n = n;
        this.k = k;
        this.nk = nk;
        this.precisao = precisao;
        
        this.calcular();
    }
    
    public void calcular(){
        if (nk.length >= k.length) {
            resolver(k);
        } else {
            Fracao res = resolver(nk);
            Principal.escreverPular("\n");
            FracaoTela ft = new FracaoTela(precisao);
            ft.adicionar(1, null, "=");
            ft.adicionar(res, null, "-");
            res = new Fracao(1, 1).subtrair(res);
            ft.adicionar(res, null, "=");
            double r = 1.0 * res.emDecimal(precisao);
            ft.adicionar(r, null, "=");
            ft.adicionar(String.format(String.format("%%.%df %%%%", precisao > 2 ? precisao - 2 : 0), r * 100), null, null, "ou");
            
            ft.escrever();
        }    
    }
    
    private Fracao resolver(Integer[] casos){
        Fracao[] resultados = new Fracao[casos.length];
        
        if (casos.length == 1) return calcular(casos[0]);
        

        for (int i = 0; i < casos.length; i++) {
            resultados[i] = calcular(casos[i]);
            Principal.escreverPular("\n");
        }
        
        FracaoTela ft = new FracaoTela(precisao);
        
        Fracao resultado = null;

        for (int i = 0; i < resultados.length; i++) {
            ft.adicionar(resultados[i], null, i > 0 ? "+" : null);
            if (resultado == null) resultado = resultados[i];
            else resultado = resultado.somar(resultados[i]);
        }

        double res = resultado.emDecimal(precisao);
        ft.adicionar(resultado, null, "=");
        ft.adicionar(res, null, "=");
        ft.adicionar(String.format(String.format("%%.%df %%%%",
                precisao > 2 ? precisao - 2 : 0), res * 100), null, null, "ou");
        
        ft.escrever();
        return resultado;
    }
    
    private Fracao calcular(int k){
        FracaoTela passo1 = new FracaoTela(precisao);
        passo1.adicionar(String.format("P(X = %d)", k), null, null, null);
        
        
        passo1.adicionar(String.format("%d!", n),
                String.format("%d! * (%d - %d)!", k, n, k),
                null, "=");
        
        passo1.adicionar(sucesso, String.valueOf(k), "*");
        
        passo1.adicionar(fracasso, String.format("%d - %d", n, k), "*");
        
        // =======================================================
        
        Fracao um = new Fracao(Fracao.fatorial(n), Fracao.fatorial(k) * Fracao.fatorial(n - k));
        
        passo1.adicionar(um, null, "=");
        
        Fracao dois = new Fracao(sucesso.numerador, sucesso.denominador);
        dois = dois.elevar(k);
        
        passo1.adicionar(dois, null, "*");
        
        Fracao tres = new Fracao(fracasso.numerador, fracasso.denominador);
        tres = tres.elevar(n - k);
        
        passo1.adicionar(tres, null, "*");
        
        // ========================================================
        
        Fracao res = um.multiplicar(dois).multiplicar(tres);
        passo1.adicionar(res, null, "=");
        
        // ========================================================
        
        double resultado = 1.0 * res.numerador / res.denominador;
        passo1.adicionar(resultado, null, "=");
        passo1.adicionar(String.format(String.format("%%.%df %%%%", precisao > 2 ? precisao - 2 : 0), resultado * 100), null, null, "ou");
        
        passo1.escrever();
        /*
        Principal.resultado.append(r[0]);
        Principal.resultado.append(r[1]);
        Principal.resultado.append(r[2]);
        */
        return res;
    }
    
}