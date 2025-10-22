/* ATIVIDADE AVALIATIVA */
/* QUESTÃO 1 */
/*import java.util.Scanner;

public class Strike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Resultado da " + i + "ª partida (V, E, D): ");
            char resultado = scan.next().toUpperCase().charAt(0);

            if (resultado == 'V') {
                contador += 10;
            } else if (resultado == 'E') {
                contador += 5;
            } else if (resultado == 'D') {
                contador -= 2;
            } else {
                System.out.println("Entrada inválida!");
                i--;
            }
        }

        System.out.println("Pontuação final: " + contador);

        if (contador >= 60) {
            System.out.println("Subiu de patente!");
        } else if (contador >= 21) {
            System.out.println("Permaneceu na patente.");
        } else {
            System.out.println("Caiu de patente.");
        }
        
        scan.close();
    }
}*/

/* QUESTÃO 2 */
/*
import java.util.Scanner;

public class Strike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int respostasPositivas = 0;
        String resposta;

        System.out.println("Telefonou para a vítima? (sim ou não)");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        System.out.println("Esteve no local do crime? (sim ou não)");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }

        System.out.println("Mora perto da vítima? (sim ou não)");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }

        System.out.println("Tinha dívidas com a vítima? (sim ou não)");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }

        System.out.println("Já trabalhou com a vítima? (sim ou não)");
        resposta = scan.next();
        if (resposta.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }

        if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("Cumplice");
        } else if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
    }
}
*/

/* QUESTÃO 3 */

public class Strike {

    private String nome;
    private Double preco;
    private int quantidade;
    private String codigoBarras;
        
    public String getNome() {
        return nome;
        }
    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome.toUpperCase();
        }
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        if (preco != null && preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade () {
        return quantidade; 
        }
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
            }
        }

    public String getCodigoBarras () {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras != null) {
            this.codigoBarras = codigoBarras.toLowerCase();
        }
    }
    public static void main(String[] args) {
        Strike S = new Strike();

        // testando valores
        
        // válidos
        S.setNome("mouse gamer");
        S.setPreco(150.0);
        S.setQuantidade(10);
        S.setCodigoBarras("7891234567890");
        
        // inválidos
        S.setPreco(-50.0);      
        S.setQuantidade(-3);       
        S.setCodigoBarras("12345"); 

        System.out.println("nome: " + S.getNome());
        System.out.println("preço: " + S.getPreco());
        System.out.println("quantidade: " + S.getQuantidade());
        System.out.println("código de barras: " + S.getCodigoBarras());
    }
}
