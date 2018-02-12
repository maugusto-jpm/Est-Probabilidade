package estatistica;

import java.util.ArrayList;

public class FracaoTela {

    private final int precisao;
    
    public FracaoTela(int precisao){
        this.precisao = precisao;
    }

    private ArrayList<FracaoNaTela> fracoes = new ArrayList<>();

    public void adicionar(String cima, String baixo, String expoente, String sinal) {
        fracoes.add(new FracaoNaTela(cima, baixo, expoente, sinal));
    }
    
    public void adicionar(double cima, double baixo, String expoente, String sinal) {
        fracoes.add(new FracaoNaTela(String.format(cima == (int)cima ? " %.0f " : String.format(" %%.%df ", precisao), cima),
                String.format(baixo == (int)baixo ? " %.0f " : String.format(" %%.%df ", precisao), baixo), expoente, sinal));
    }
    
    public void adicionar(double numero, String expoente, String sinal) {
        fracoes.add(new FracaoNaTela(String.format(numero == (int)numero ? "%.0f" : String.format("%%.%df", precisao), numero),
                null, expoente, sinal));
    }
    
    public void adicionar(Fracao fracao, String expoente, String sinal) {
        if (fracao.numerador != (int)fracao.numerador) adicionar(fracao.emDecimal(precisao), expoente, sinal);
        else adicionar(fracao.numerador, fracao.denominador, expoente, sinal);
    }
    
    public void adicionar(Fracao fracao, String sinal) {
        adicionar(fracao.numerador, fracao.denominador, null, sinal);
    }

    public void escrever() {
        StringBuilder cima = new StringBuilder(), meio = new StringBuilder(), baixo = new StringBuilder();
        int exp = 0;
        for (FracaoNaTela fracao : fracoes) {
            if (fracao.sinal != null) {
                if (exp > 0) {
                    for (int i = 0; i <= exp; i++) {
                        meio.append(" ");
                        baixo.append(" ");
                    }
                    cima.append("    ");
                    baixo.append("   ");
                    meio.append(fracao.sinal);
                    meio.append("  ");
                    
                } else {
                    cima.append("   ");
                    meio.append(" ");
                    meio.append(fracao.sinal);
                    meio.append(" ");
                    baixo.append("   ");
                }
            }

            if (fracao.baixo == null) {
                if (fracao.expoente != null) {
                    meio.append("(");
                    meio.append(fracao.cima);
                    meio.append(")^");
                    meio.append(fracao.expoente);
                    exp = fracao.expoente.length() + 1;
                } else {
                    meio.append(fracao.cima);
                    exp = 0;
                }
                
                int c;
                if (exp > 0) c = exp + 2;
                else c = 0;
                
                while (c < fracao.cima.length()) {
                    cima.append(" ");
                    baixo.append(" ");
                    c++;
                }
            } else {
                int tam = fracao.baixo.length();
                if (fracao.cima.length() > tam) tam = fracao.cima.length();
                
                if (fracao.expoente == null) {
                    cima.append(centralizar(fracao.cima, tam));
                    for (int i = 0; i < tam; i++) meio.append("-");
                    baixo.append(centralizar(fracao.baixo, tam));
                    exp = 0;
                } else {
                    cima.append("(");
                    cima.append(centralizar(fracao.cima, tam));
                    cima.append(")^");
                    cima.append(fracao.expoente);
                    meio.append("(");
                    for (int i = 0; i < tam; i++) meio.append("-");
                    meio.append(")");
                    baixo.append("(");
                    baixo.append(centralizar(fracao.baixo, tam));
                    baixo.append(")");
                    exp = fracao.expoente.length() + 1;
                }
            }
        }
        for (int i = 0; i <= exp; i++) {
            if (cima.length() > meio.length()) {
                meio.append(" ");
                baixo.append(" ");
            } else if (baixo.length() < meio.length()) {
                cima.append(" ");
                baixo.append(" ");
            }
        }

        cima.append("\n");
        meio.append("\n");
        
        if (!cima.toString().trim().isEmpty()) {
            Principal.escrever(cima.toString());
        }
        
        Principal.escrever(meio.toString());
        
        if (!baixo.toString().trim().isEmpty()) {
            Principal.escrever(baixo.toString());
        }
        
        //return new String[]{cima.toString(), meio.toString(), baixo.toString()};
    }

    private String centralizar(String texto, int tamanho) {
        if (texto.length() >= tamanho) return texto;
        
        int sobra = tamanho - texto.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sobra / 2; i++) res.append(" ");
        res.append(texto);
        for (int i = 0; i < sobra - sobra / 2; i++) res.append(" ");
        return res.toString();
    }

    private class FracaoNaTela {
        private final String expoente, cima, baixo, sinal;

        public FracaoNaTela(String cima, String baixo, String expoente, String sinal) {
            this.cima = cima;
            this.baixo = baixo;
            this.expoente = expoente;
            this.sinal = sinal;
        }
    }
}
