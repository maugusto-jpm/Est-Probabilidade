package estatistica;

public class CalculoNormal {
    private final double media, desviopadrao;
    private final int precisao;

    public CalculoNormal(double media, double desviopadrao, int precisao) {
        this.media = media;
        this.desviopadrao = desviopadrao;
        this.precisao = precisao;
    }
    
    public void deAaB(double a, double b){
        if (a > b){
            double tmp = a;
            a = b;
            b = tmp;
        }
        
        if (this.media != 0 || this.desviopadrao != 1){
            FracaoTela ft = new FracaoTela(precisao);
            ft.adicionar("z", null, null, null);
            ft.adicionar(media + " - " + media, String.valueOf(desviopadrao), null, "=");
            ft.adicionar("0", null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n\n");
            
            ft = new FracaoTela(precisao);
            ft.adicionar("z1", null, null, null);
            ft.adicionar(a + " - " + media, String.valueOf(desviopadrao), null, "=");
            a = new Fracao(a - media, desviopadrao).emDecimal(precisao);
            ft.adicionar(String.valueOf(a), null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n\n");
            
            ft = new FracaoTela(precisao);
            ft.adicionar("z2", null, null, null);
            ft.adicionar(b + " - " + media, String.valueOf(desviopadrao), null, "=");
            b = new Fracao(b - media, desviopadrao).emDecimal(precisao);
            ft.adicionar(String.valueOf(b), null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n\n");
        }
        double media = 0;
        double za = areaIntervalo(a);
        Principal.escreverPular("Tabela de " + Math.abs(a) + " = " + za);
        
        
        double zb = areaIntervalo(b);
        Principal.escreverPular("Tabela de " + Math.abs(b) + " = " + zb);
        Principal.escrever("\n");
                
        if (a <= media && b >= media) {
            double h = za + zb;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df + %%.%df = %%.%df ou %%.%df%%%%",
                            precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), za, zb, h, Math.abs(h * 100)));
        }
        else if (a < media && b < media) {
            double h = za - zb;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df - %%.%df = %%.%df ou %%.%df%%%%",
                            precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), za, zb, h, Math.abs(h * 100)));
        }
        else {
            double h = zb - za;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df - %%.%df = %%.%df ou %%.%df%%%%",
                                precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), zb, za, h, Math.abs(h * 100)));
        }
    }
    
    public void ateX(double x){
        if (x == media) {
            Principal.escrever("Probabilidade = 0,5 ou 50%");
            return;
        }
        if (this.media != 0 || this.desviopadrao != 1){
            FracaoTela ft = new FracaoTela(precisao);
            ft.adicionar("z", null, null, null);
            ft.adicionar(media + " - " + media, String.valueOf(desviopadrao), null, "=");
            ft.adicionar("0", null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n");
            
            ft = new FracaoTela(precisao);
            ft.adicionar("z1", null, null, null);
            ft.adicionar(x + " - " + media, String.valueOf(desviopadrao), null, "=");
            x = new Fracao(x - media, desviopadrao).emDecimal(precisao);
            ft.adicionar(String.valueOf(x), null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n");
        }
        double media = 0;
        double z = areaIntervalo(x);
        Principal.escreverPular("Tabela de " + Math.abs(x) + " = " + z);
        Principal.escrever("\n");
        
        if (x < media){
            double h = 0.5 - z;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df - %%.%df = %%.%df ou %%.%df%%%%",
                                precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), 0.5, z, h, Math.abs(h * 100)));
        } else {
            double h = 0.5 + z;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df + %%.%df = %%.%df ou %%.%df%%%%",
                                precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), 0.5, z, h, Math.abs(h * 100)));
        }
    }
    
    public void acimaDeX(double x){
        if (x == media) {
            Principal.escrever("Probabilidade = 0,5 ou 50%");
            return;
        }
        if (this.media != 0 || this.desviopadrao != 1){
            FracaoTela ft = new FracaoTela(precisao);
            ft.adicionar("z", null, null, null);
            ft.adicionar(media + " - " + media, String.valueOf(desviopadrao), null, "=");
            ft.adicionar("0", null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n");
            
            ft = new FracaoTela(precisao);
            ft.adicionar("z1", null, null, null);
            ft.adicionar(x + " - " + media, String.valueOf(desviopadrao), null, "=");
            x = new Fracao(x - media, desviopadrao).emDecimal(precisao);
            ft.adicionar(String.valueOf(x), null, null, "=");
            ft.escrever();
            Principal.escreverPular("\n");
        }
        double media = 0;
        double z = areaIntervalo(x);
        Principal.escreverPular("Tabela de " + Math.abs(x) + " = " + z);
        Principal.escrever("\n");
        
        if (x > media){
            double h = 0.5 - z;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df - %%.%df = %%.%df ou %%.%df%%%%",
                                precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), 0.5, z, h, Math.abs(h * 100)));
        } else {
            double h = 0.5 + z;
            Principal.escrever(String.format(String.format("Probabilidade = %%.%df + %%.%df = %%.%df ou %%.%df%%%%",
                                precisao, precisao, precisao, precisao > 2 ? precisao - 2 : 0), 0.5, z, h, Math.abs(h * 100)));
        }
    }
    
    private double areaIntervalo(double numero){
        if (numero == 0) return 0;
        numero = Math.abs(numero);
        final double somatorio = numero / Math.pow(10, precisao);
        double resultado = 0;
        for (double n = 0; n < numero; n += somatorio)
            resultado += somatorio * (1 / (Math.sqrt(2 * Math.PI) * 1)) *
                    Math.exp(-0.5 * (Math.pow((n - 0) / 1, 2)));
        
        return Math.round(resultado * Math.pow(10, precisao)) / Math.pow(10, precisao);
    }
}