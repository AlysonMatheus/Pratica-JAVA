package alyson.dev;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra quantas ele pode ser parcelado
    // Condicao valorParcela >=1000
    public static void main(String[] args) {
        double valor = 30000;
        for (int parcela = (int) valor; parcela >= 1; parcela--) {
            double valorparcela = valor / parcela;
            if(valorparcela <1000){
                continue;
            }
            System.out.println("Parcela "+parcela+ "R$ "+valorparcela);

        }

    }
}
