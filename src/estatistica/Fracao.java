package estatistica;

public class Fracao {

    public final double numerador, denominador;

    public Fracao(double numerador, double denominador) {
        final int[] primos = {2, 3, 5, 7, 11};

        for (int i = 0; i < primos.length; i++) {
            if (numerador % primos[i] == 0 && denominador % primos[i] == 0) {
                numerador /= primos[i];
                denominador /= primos[i];
                i = -1;
            }
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao somar(Fracao fracao) {
        return new Fracao(this.numerador * fracao.denominador + this.denominador * fracao.numerador,
                this.denominador * fracao.denominador);
    }

    public Fracao subtrair(Fracao fracao) {
        return new Fracao(this.numerador * fracao.denominador - this.denominador * fracao.numerador,
                this.denominador * fracao.denominador);
    }

    public Fracao multiplicar(Fracao fracao) {
        return new Fracao(this.numerador * fracao.numerador, this.denominador * fracao.denominador);
    }

    public Fracao dividir(Fracao fracao) {
        return this.multiplicar(new Fracao(fracao.denominador, fracao.numerador));
    }

    public Fracao elevar(int potencia) {
        if (potencia == 0) return new Fracao(1, 1);
        
        if (potencia < 0) return new Fracao(Math.pow(this.numerador, potencia * -1), Math.pow(this.denominador, potencia * -1));
        
        return new Fracao(Math.pow(this.numerador, potencia), Math.pow(this.denominador, potencia));
    }
    
    public double emDecimal(int precisao){
        return Math.round(this.numerador / this.denominador * Math.pow(10, precisao)) / Math.pow(10, precisao);
    }

    @Override
    public String toString() {
        if (this.denominador == 1) return String.valueOf(this.numerador);
        return this.numerador + "/" + this.denominador;
    }
    public static double fatorial(double numero){
        if (numero == 0) return 1;
        double r = numero;
        for (double i = numero - 1; i > 1; i--) {
            r *= i;
        }
        return r;
    }
}
