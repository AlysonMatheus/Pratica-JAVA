package javacore.Enumeracao.test;

import javacore.Enumeracao.dominio.Cliente;
import javacore.Enumeracao.dominio.TipoCliente;
import javacore.Enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alyson", TipoCliente.PESSOA_FISICA,TipoPagamento.debito);
        Cliente cliente2 = new Cliente("LIVIA",TipoCliente.PESSOA_JURIDICA,TipoPagamento.credito );

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.debito.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 =TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica221");
        System.out.println(tipoCliente2);


    }

}
