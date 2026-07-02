package modelo;

import util.AumentoMaiorDoqueJurosException;

public abstract class Financiamento {

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
        return calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento() throws AumentoMaiorDoqueJurosException {
        System.out.println("\n----- DADOS DO FINANCIAMENTO -----");
        System.out.println(String.format("Valor do imovel: R$ %.2f", getValorImovel()));
        System.out.println("Prazo: " + getPrazoFinanciamento() + " anos");
        System.out.println(String.format("Taxa de juros anual: %.2f%%", getTaxaJurosAnual()));
        System.out.println(String.format("Pagamento mensal: R$ %.2f", calcularPagamentoMensal()));
        System.out.println(String.format("Valor total do financiamento: R$ %.2f", calcularTotalPagamento()));
    }
}
