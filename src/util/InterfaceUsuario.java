package util;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner entrada = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel;

        do {
            System.out.print("Digite o valor do imóvel: ");
            valorImovel = entrada.nextDouble();

            if (valorImovel <= 0) {
                System.out.println("Erro: o valor do imóvel deve ser maior que zero.");
            }

        } while (valorImovel <= 0);

        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;

        do {
            System.out.print("Digite o prazo do financiamento (anos): ");
            prazoFinanciamento = entrada.nextInt();

            if (prazoFinanciamento <= 0) {
                System.out.println("Erro: o prazo deve ser maior que zero.");
            }

        } while (prazoFinanciamento <= 0);

        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;

        do {
            System.out.print("Digite a taxa de juros anual: ");
            taxaJuros = entrada.nextDouble();

            if (taxaJuros <= 0) {
                System.out.println("Erro: a taxa de juros deve ser maior que zero.");
            }

        } while (taxaJuros <= 0);

        return taxaJuros;
    }
}