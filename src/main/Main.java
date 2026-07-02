package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.AumentoMaiorDoqueJurosException;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario usuario = new InterfaceUsuario();
        List<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        System.out.println("\n--- Financiamento 1 (Casa - entrada do usuario) ---");
        double valorImovel = usuario.pedirValorImovel();
        int prazoFinanciamento = usuario.pedirPrazoFinanciamento();
        double taxaJuros = usuario.pedirTaxaJuros();
        double areaConstruida = usuario.pedirAreaConstruida();
        double areaTerreno = usuario.pedirAreaTerreno();
        listaDeFinanciamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJuros, areaConstruida, areaTerreno));

        System.out.println("\n--- Financiamento 2 (Apartamento - entrada do usuario) ---");
        valorImovel = usuario.pedirValorImovel();
        prazoFinanciamento = usuario.pedirPrazoFinanciamento();
        taxaJuros = usuario.pedirTaxaJuros();
        int vagasGaragem = usuario.pedirVagasGaragem();
        int andar = usuario.pedirAndar();
        listaDeFinanciamentos.add(new Apartamento(valorImovel, prazoFinanciamento, taxaJuros, vagasGaragem, andar));

        System.out.println("\n--- Financiamento 3 (Terreno - entrada do usuario) ---");
        valorImovel = usuario.pedirValorImovel();
        prazoFinanciamento = usuario.pedirPrazoFinanciamento();
        taxaJuros = usuario.pedirTaxaJuros();
        String tipoZona = usuario.pedirTipoZona();
        listaDeFinanciamentos.add(new Terreno(valorImovel, prazoFinanciamento, taxaJuros, tipoZona));

        listaDeFinanciamentos.add(new Casa(400000, 20, 0.12, 150, 300));
        listaDeFinanciamentos.add(new Apartamento(300000, 15, 0.11, 1, 5));
        listaDeFinanciamentos.add(new Terreno(250000, 8, 0.09, "comercial"));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento financiamento : listaDeFinanciamentos) {
            totalImoveis += financiamento.getValorImovel();
            try {
                totalFinanciamentos += financiamento.calcularTotalPagamento();
            } catch (AumentoMaiorDoqueJurosException e) {
                System.out.println("Erro ao calcular o financiamento: " + e.getMessage());
            }
        }

        System.out.println("\n----- RESUMO -----");
        System.out.println(String.format("Total dos imoveis: R$ %.2f", totalImoveis));
        System.out.println(String.format("Total dos financiamentos: R$ %.2f", totalFinanciamentos));
    }
}
