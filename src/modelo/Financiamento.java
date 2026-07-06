package modelo;

import java.io.Serializable;

import util.AumentoMaiorDoqueJurosException;

public abstract class Financiamento implements Serializable {

    private static final long serialVersionUID = 1L;

    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImv;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public abstract double calcularPagamentoMensal() throws AumentoMaiorDoqueJurosException;

    public double calcularTotalPagamento() throws AumentoMaiorDoqueJurosException {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento() throws AumentoMaiorDoqueJurosException {
        System.out.println("\n----- DADOS DO FINANCIAMENTO -----");
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.println("Prazo: " + prazoFinanciamento + " anos");
        System.out.printf("Taxa de juros anual: %.2f%n", taxaJurosAnual);
        System.out.printf("Pagamento mensal: R$ %.2f%n", calcularPagamentoMensal());
        System.out.printf("Valor total do financiamento: R$ %.2f%n", calcularTotalPagamento());
    }
}