package javacore.Heranca.test;

import javacore.Heranca.dominio.Funcionario;

public class HerencaTest02 {
    // 0 - Nloco de inicialização estatico da super classe é executado quando a JVM carregar classse pai
    // 1 - Nloco de inicialização estatico da sub classe é executado quando a JVM carregar classse Filh
    // 2- Alocando espaço em memoria pro objetivo da super classe
    // 3 - Cada atributo da  spuer classe pai é inicilazado com valores default ou o que for passado
    // 4 - Bloco de inizialização da super classe é executado na ordem que parece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memeoria pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que parece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Martins");
        System.out.println(funcionario.getNome());
    }
}
