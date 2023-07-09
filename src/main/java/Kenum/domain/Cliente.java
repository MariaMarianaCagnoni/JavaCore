package Kenum.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Cliente {
    public enum TipoPagamento{

        CREDITO, DEBITO, BOLETO
    }
    private String nome;
    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;

    //enums funcionanm como classes staticas e finais



}