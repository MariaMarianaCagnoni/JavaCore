package Kenum.test;

import Kenum.domain.Cliente;
import Kenum.domain.Cliente.TipoPagamento;
//importei a classe dentro da classe
import Kenum.domain.TipoCliente;

/**
 * @author mariana
 * @Project: javacore
 */
public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("mariana", TipoCliente.PESSOA_FISICA, TipoPagamento.BOLETO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Kame", TipoCliente.PESSOA_FISICA, TipoPagamento.DINHEIRO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DINHEIRO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurica");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);



    }
}
