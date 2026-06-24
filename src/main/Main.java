package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario usuario = new InterfaceUsuario();
        List<Financiamento> listaDeFinanciamentos = new ArrayList<>();

        System.out.println("\n=== Financiamento 1 (Casa - entrada do usuário) ===");
        double valorImovel = usuario.pedirValorImovel();
        int prazoFinanciamento = usuario.pedirPrazoFinanciamento();
        double taxaJuros = usuario.pedirTaxaJuros();
        listaDeFinanciamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJuros));

        listaDeFinanciamentos.add(new Casa(400000, 20, 0.12));
        listaDeFinanciamentos.add(new Apartamento(300000, 15, 0.11));
        listaDeFinanciamentos.add(new Apartamento(500000, 10, 0.10));
        listaDeFinanciamentos.add(new Terreno(250000, 8, 0.09));

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
