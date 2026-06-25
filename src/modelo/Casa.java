package modelo;

public class Casa extends Financiamento {

    private double tamanhoAreaConstruida;
    private double tamanhoAreaTerreno;

    public Casa(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual,
            double tamanhoAreaConstruida, double tamanhoAreaTerreno) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoAreaTerreno = tamanhoAreaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamento = (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));
        return pagamento + 240;
    }
}
