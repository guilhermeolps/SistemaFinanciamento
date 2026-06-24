package modelo;

public class Terreno extends Financiamento {

    public Terreno(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() * 1.02;
    }
}
