package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        double totalPagamento = getValorImovel()
                * (1 + (getTaxaJurosAnual() * getPrazoFinanciamento()));
        return totalPagamento / (getPrazoFinanciamento() * 12);
    }
}
