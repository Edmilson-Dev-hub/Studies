import java.time.LocalDate;

public class ClienteVip extends Cliente {
    private double desconto;

    ClienteVip(String nomeDigitado, int diaDigitado, int mesDigitado, int anoDigitado, double precoDigitado, double desconto) {
        super(nomeDigitado, diaDigitado, mesDigitado, anoDigitado, precoDigitado);
        this.desconto = desconto;
    }

    @Override 
    public double getPrecoTotal() {
        LocalDate dataAtual = LocalDate.now();

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();

        int diaNasc = super.getDiaNasc();
        int mesNasc = super.getMesNasc();

        if (diaNasc == diaAtual && mesNasc == mesAtual) {
            System.out.println("O cliente é aniversariante e tem desconto");
            return super.getPrecoTotal() - (super.getPrecoTotal() * this.desconto)/100;
            
        } else {
            System.out.println("o cliente não é aniversariante e não tem desconto");
            return super.getPrecoTotal();
        }
}
}