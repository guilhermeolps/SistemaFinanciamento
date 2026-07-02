package modelo;

import util.AumentoMaiorDoqueJurosException;

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
    public double calcularPagamentoMensal() throws AumentoMaiorDoqueJurosException {
        double pagamento = (getValorImovel() / (getPrazoFinanciamento() * 12))
                * (1 + (getTaxaJurosAnual() / 12));

        double valorAcrescimo = 80;
        double jurosMensal = (getValorImovel() * getTaxaJurosAnual()) / 12;

        if (valorAcrescimo > (jurosMensal / 2)) {
            throw new AumentoMaiorDoqueJurosException(
                    "O acréscimo de R$ 80 não pode ser maior que a metade dos juros mensais.");
        }

        return pagamento + valorAcrescimo;
    }
}
