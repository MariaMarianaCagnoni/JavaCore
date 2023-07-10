package Kenum.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Cliente {
    public enum TipoPagamento {
        CREDITO(1) {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.01;
            }
        }, DEBITO(2) {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        }, DINHEIRO(3) {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.6;
            }
        }, BOLETO(4){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.5;
            }
        };


        private final int COD;


        TipoPagamento(int cod) {
            COD = cod;
        }

        public int getCOD() {
            return COD;
        }

        public double calcularDesconto(double valor) {
            return 0;
        }
//        public abstract double calcularDesconto(double valor) {
//
//        }

    }

    private String nome;
    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;

    //enums funcionanm como classes staticas e finais


    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoPagamento =" + tipoPagamento.getCOD() +
                ", Cod de Cliente =" + tipoCliente.getCod() +
                '}';
    }
}