package modelo;

public class Terreno extends Financiamento {

    private String tipoZona;

    public Terreno(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual,
            String tipoZona) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamento = (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));
        return pagamento * 1.02;
    }
}
