import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //CLIENTE 
        System.out.println("Nome Cliente: ");
        String nome = scan.nextLine();
        System.out.println("Dia do nascimento do cliente: ");
        int dia = scan.nextInt();
        System.out.println("Mês de nascimento: ");
        int mes = scan.nextInt();
        System.out.println("Ano de nascimento: ");
        int ano = scan.nextInt();
        System.out.println("Preço do cliente: ");
        double preco = scan.nextDouble();
        scan.nextLine();

        //CLIENTE VIP
        System.out.println("Nome ClienteVip: ");
        String nomeVip = scan.nextLine();
        System.out.println("Dia do nascimento do cliente: ");
        int diaVip = scan.nextInt();
        System.out.println("Mês de nascimento: ");
        int mesVip = scan.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoVip = scan.nextInt();
        System.out.println("Preço do cliente: ");
        double precoVip = scan.nextDouble();
        System.out.println("Diga quando de desconto o cliente terá: ");
        double desconto = scan.nextDouble();

        Cliente cliente = new Cliente(nome, dia, mes, ano, preco);
        ClienteVip clienteVip = new ClienteVip(nomeVip, diaVip, mesVip, anoVip, precoVip, desconto);
        
        System.out.println("Cliente comum");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Preço total" + cliente.getPrecoTotal());


        System.out.println("ClienteVIP");
        System.out.println("Nome: " + clienteVip.getNome());
        System.out.println("Preço total: " + clienteVip.getPrecoTotal());

        scan.close();

    }
}