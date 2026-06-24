package modelo;

public class Casa extends Financiamento {

    public Casa(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        return super.calcularPagamentoMensal() + 240;
    }
}
