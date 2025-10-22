public class Cliente{
    private String nome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double preco;

    Cliente(String nomeDigitado, int diaDigitado, int mesDigitado, int anoDigitado, double precoDigitado) {
        this.nome = nomeDigitado;
        this.diaNasc = diaDigitado;
        this.mesNasc = mesDigitado;
        this.anoNasc = anoDigitado;
        this.preco = precoDigitado;
    }

    String getNome() {
        return this.nome;
    }
    int getDiaNasc() {
        return this.diaNasc;
    }
    int getMesNasc() {
        return this.mesNasc;
    }

    public double getPrecoTotal() {
        return this.preco;
    }
}