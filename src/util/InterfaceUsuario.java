package util;

import java.util.Scanner;

public class InterfaceUsuario {

    private final Scanner entrada = new Scanner(System.in);

    public double pedirValorImovel() {
        while (true) {
            try {
                double valorImovel = lerDouble("Digite o valor do imovel: ");

                if (valorImovel <= 0) {
                    throw new IllegalArgumentException("o valor do imovel deve ser maior que zero.");
                }

                return valorImovel;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public int pedirPrazoFinanciamento() {
        while (true) {
            try {
                int prazoFinanciamento = lerInteiro("Digite o prazo do financiamento (anos): ");

                if (prazoFinanciamento <= 0) {
                    throw new IllegalArgumentException("o prazo deve ser maior que zero.");
                }

                return prazoFinanciamento;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public double pedirTaxaJuros() {
        while (true) {
            try {
                double taxaJuros = lerDouble("Digite a taxa de juros anual: ");

                if (taxaJuros <= 0) {
                    throw new IllegalArgumentException("a taxa de juros deve ser maior que zero.");
                }

                return taxaJuros;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public double pedirAreaConstruida() {
        return lerDouble("Digite a area construida (m2): ");
    }

    public double pedirAreaTerreno() {
        return lerDouble("Digite a area do terreno (m2): ");
    }

    public int pedirVagasGaragem() {
        return lerInteiro("Digite o numero de vagas na garagem: ");
    }

    public int pedirAndar() {
        return lerInteiro("Digite o numero do andar: ");
    }

    public String pedirTipoZona() {
        while (true) {
            try {
                System.out.print("Digite o tipo de zona (residencial ou comercial): ");
                String tipoZona = entrada.nextLine().trim().toLowerCase();

                if (!tipoZona.equals("residencial") && !tipoZona.equals("comercial")) {
                    throw new IllegalArgumentException("use residencial ou comercial.");
                }

                return tipoZona;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(entrada.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor inválido. Digite apenas números inteiros.");
            }
        }
    }

    private double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Double.parseDouble(entrada.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor inválido. Digite apenas números.");
            }
        }
    }
}
