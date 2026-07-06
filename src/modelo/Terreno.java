package modelo;

public class Terreno extends Financiamento {

    private static final long serialVersionUID = 1L;

    private String tipoZona;

    public Terreno(double valorDesejadoImv,
                   int prazoFinanciamentoAnos,
                   double taxaJurosAnual,
                   String tipoZona) {

        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);

        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamento = (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));

        return pagamento + 100;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    @Override
    public String toString() {
        return "TERRENO;" +
                getValorImovel() + ";" +
                getPrazoFinanciamento() + ";" +
                getTaxaJurosAnual() + ";" +
                tipoZona;
    }
}