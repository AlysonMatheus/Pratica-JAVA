package javacore.Estruturas;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra quantas ele pode ser parcelado
    // Condicao valorParcela >=1000
    public static void main(String[] args) {
        double valor = 40000;
       for ( int parcela  = 1; parcela <=valor; parcela++){
           double valorparcela = valor/parcela;
           if (valorparcela >=500){
               continue;

           }
           System.out.println("Parcela "+parcela+ "R$ "+valorparcela);
                  }

    }
}
