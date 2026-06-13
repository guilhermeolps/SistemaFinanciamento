package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main (String[] args){

        InterfaceUsuario usuario = new InterfaceUsuario();

        double valorImovel = usuario.pedirValorImovel();
        int pedirPrazoFinanciamento =  usuario.pedirPrazoFinanciamento();
        double PedirTaxaJuros = usuario.pedirTaxaJuros();

        Financiamento financas = new Financiamento(valorImovel, pedirPrazoFinanciamento, PedirTaxaJuros);


    }


}

