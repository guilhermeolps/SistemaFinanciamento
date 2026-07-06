package util;

import modelo.Financiamento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoFinanciamento {

    private static final String ARQUIVO_TEXTO = "financiamentos.txt";
    private static final String ARQUIVO_SERIALIZADO = "financiamentos.ser";

    // Salva os financiamentos em um arquivo texto
    public void salvarTexto(List<Financiamento> financiamentos) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_TEXTO))) {

            for (Financiamento financiamento : financiamentos) {
                writer.println(financiamento.toString());
            }

            System.out.println("\nArquivo texto salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo texto: " + e.getMessage());
        }
    }

    // Lê o arquivo texto
    public void lerTexto() {

        System.out.println("\n===== LEITURA DO ARQUIVO TEXTO =====");

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_TEXTO))) {

            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo texto: " + e.getMessage());
        }
    }

    // Salva o ArrayList serializado
    public void salvarSerializado(List<Financiamento> financiamentos) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(ARQUIVO_SERIALIZADO))) {

            out.writeObject(new ArrayList<>(financiamentos));

            System.out.println("\nArquivo serializado salvo com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao serializar: " + e.getMessage());
        }
    }

    // Lê o ArrayList serializado
    @SuppressWarnings("unchecked")
    public void lerSerializado() {

        System.out.println("\n===== LEITURA DO ARQUIVO SERIALIZADO =====");

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(ARQUIVO_SERIALIZADO))) {

            List<Financiamento> lista =
                    (ArrayList<Financiamento>) in.readObject();

            for (Financiamento financiamento : lista) {
                System.out.println(financiamento);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao desserializar: " + e.getMessage());
        }
    }
}
