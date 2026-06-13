package modelo;

public class Financiamento {

    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorDesejadoImv, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImv;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Métodos de cálculo
    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12))
                * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    // Exibir dados do financiamento
    public void mostrarDadosFinanciamento() {
        System.out.println("\n===== DADOS DO FINANCIAMENTO =====");
        System.out.println("Valor do imóvel: R$ " + getValorImovel());
        System.out.println("Prazo: " + getPrazoFinanciamento() + " anos");
        System.out.println("Taxa de juros anual: " + getTaxaJurosAnual() + "%");
        System.out.println("Pagamento mensal: R$ " + calcularPagamentoMensal());
        System.out.println("Valor total do financiamento: R$ " + calcularTotalPagamento());
    }
}