package Jmodificadorfinal.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Carro {
    private String nome;
   public final Comprador COMPRADOR = new Comprador();
    //tipo referéncia final
    //vc pode mudar o conteudo mas não a REFERENCIA

   public static final double VELOCIDADE_LIMITE = 250;
    //final é uma constante



    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public void imprimir(){
         System.out.println(this.nome);
         System.out.println(VELOCIDADE_LIMITE);
         System.out.println(this.COMPRADOR.getNome());
     }

}
