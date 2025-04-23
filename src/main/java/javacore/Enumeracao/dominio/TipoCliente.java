package javacore.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Jurdica"),
    PESSOA_JURIDICA(2, "Pessoa Fisica");

     private int valor;
   private  String NomeRelatorio;

   TipoCliente(int valor, String NomeRelatorio){
        this.valor = valor;
        this.NomeRelatorio= NomeRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String NomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(NomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNomeRelatorio() {
        return NomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        NomeRelatorio = nomeRelatorio;
    }


}



