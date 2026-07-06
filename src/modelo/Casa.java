package modelo;

import util.AumentoMaiorDoqueJurosException;

public class Casa extends Financiamento {

    private static final long serialVersionUID = 1L;

    private double tamanhoAreaConstruida;
    private double tamanhoAreaTerreno;

    public Casa(double valorDesejadoImv,
                int prazoFinanciamentoAnos,
                double taxaJurosAnual,
                double tamanhoAreaConstruida,
                double tamanhoAreaTerreno) {

        super(valorDesejadoImv, prazoFinanciamentoAnos, taxaJurosAnual);

        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoAreaTerreno = tamanhoAreaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() throws AumentoMaiorDoqueJurosException {

        double valorBase = getValorImovel() / (getPrazoFinanciamento() * 12);

        double jurosMensal = valorBase * (getTaxaJurosAnual() / 12);

        double pagamento = valorBase + jurosMensal;

        double valorAcrescimo = 80;

        if (valorAcrescimo > (jurosMensal / 2)) {
            throw new AumentoMaiorDoqueJurosException(
                    "O acréscimo de R$ 80 não pode ser maior que a metade dos juros mensais.");
        }

        return pagamento + valorAcrescimo;
    }

    public double getTamanhoAreaConstruida() {
        return tamanhoAreaConstruida;
    }

    public double getTamanhoAreaTerreno() {
        return tamanhoAreaTerreno;
    }

    @Override
    public String toString() {
        return "CASA;" +
                getValorImovel() + ";" +
                getPrazoFinanciamento() + ";" +
                getTaxaJurosAnual() + ";" +
                tamanhoAreaConstruida + ";" +
                tamanhoAreaTerreno;
    }
}