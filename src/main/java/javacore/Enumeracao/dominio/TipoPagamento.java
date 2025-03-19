package javacore.Enumeracao.dominio;

public enum TipoPagamento {

        debito {
                @Override
                public double calcularDesconto(double valor) {
                        return valor  * 0.1;

                }
        },

        credito {
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.5 ;
                }
        };


        public  abstract double calcularDesconto(double valor);
 }
