package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario usuario = new InterfaceUsuario();
        List<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            System.out.println("\n=== Financiamento " + (i + 1) + " ===");

            double valorImovel = usuario.pedirValorImovel();
            int prazoFinanciamento = usuario.pedirPrazoFinanciamento();
            double taxaJuros = usuario.pedirTaxaJuros();

            Financiamento financas =
                    new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);

            listaDeFinanciamentos.add(financas);
        }

        double totalImoveis = 0;
        double totalFinanciamentos = 0;


        for (Financiamento financiamento : listaDeFinanciamentos) {

            totalImoveis += financiamento.getValorImovel();

            totalFinanciamentos += financiamento.calcularTotalPagamento();
        }

        System.out.println("\n===== RESUMO =====");
        System.out.println("Total dos imóveis: R$ " + totalImoveis);
        System.out.println("Total dos financiamentos: R$ " + totalFinanciamentos);
    }
}