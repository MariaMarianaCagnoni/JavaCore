package Kenum.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public enum TipoCliente {
    //todos atributos são CONSTANTES
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");


    public final int cod;
    public final String nomeNoRelatorio;

    TipoCliente(int cod, String nomeNoRelatorio) {
        this.cod = cod;
        this.nomeNoRelatorio = nomeNoRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeNoRelatorio){
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if(tipoCliente.nomeNoRelatorio.equals(nomeNoRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getCod() {
        return cod;
    }
}
