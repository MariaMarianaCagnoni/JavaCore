package Oexcecao.runtimeexception.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class RunTimeException03 {
    public static void main(String[] args) {
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //sempre será executado, mesmo que ocorra um erro
            System.out.println("fechando o recurso liberado pelo SO");
        }
        /*
         * esse poderia ser uma simulação de banco de dados
         * perceba que sem o finally, a conexão não seria encerrada, causando esgotamento de recursos/memoria.
         */
        return null;
    }

    private static void abrirConexao2() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo no arquivo");
        } finally {
            //sempre será executado, mesmo que ocorra um erro.
            //nesse caso o metodo que está chamando lidaria com a exceção.
            System.out.println("fechando o recurso liberado pelo SO");
        }
        /*
         * esse poderia ser uma simulação de banco de dados
         * perceba que sem o finally, a conexão não seria encerrada, causando esgotamento de recursos/memoria.
         */
    }

}
