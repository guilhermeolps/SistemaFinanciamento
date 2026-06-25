package util;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner entrada = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel;

        do {
            System.out.print("Digite o valor do imovel: ");
            valorImovel = entrada.nextDouble();

            if (valorImovel <= 0) {
                System.out.println("Erro: o valor do imovel deve ser maior que zero.");
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

    public double pedirAreaConstruida() {
        System.out.print("Digite a area construida (m2): ");
        return entrada.nextDouble();
    }

    public double pedirAreaTerreno() {
        System.out.print("Digite a area do terreno (m2): ");
        return entrada.nextDouble();
    }

    public int pedirVagasGaragem() {
        System.out.print("Digite o numero de vagas na garagem: ");
        return entrada.nextInt();
    }

    public int pedirAndar() {
        System.out.print("Digite o numero do andar: ");
        return entrada.nextInt();
    }

    public String pedirTipoZona() {
        System.out.print("Digite o tipo de zona (residencial ou comercial): ");
        return entrada.next();
    }
}
