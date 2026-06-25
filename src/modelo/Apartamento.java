package modelo;

public class Apartamento extends Financiamento {

    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual,
            int vagasGaragem, int andar) {
        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double totalPagamento = getValorImovel()
                * (1 + (getTaxaJurosAnual() * getPrazoFinanciamento()));
        return totalPagamento / (getPrazoFinanciamento() * 12);
    }
}
