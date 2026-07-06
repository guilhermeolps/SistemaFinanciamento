package modelo;

public class Apartamento extends Financiamento {

    private static final long serialVersionUID = 1L;

    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorDesejadoImv,
                       int prazoFinanciamentoAnos,
                       double taxaJurosAnual,
                       int vagasGaragem,
                       int andar) {

        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);

        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamento = (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));

        return pagamento + 150;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String toString() {
        return "APARTAMENTO;" +
                getValorImovel() + ";" +
                getPrazoFinanciamento() + ";" +
                getTaxaJurosAnual() + ";" +
                vagasGaragem + ";" +
                andar;
    }
}