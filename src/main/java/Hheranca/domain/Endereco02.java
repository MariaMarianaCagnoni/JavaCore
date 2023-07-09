package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Endereco02 {

    protected String rua;
    protected String cep;


    static{
        System.out.println("dentro do bloco inicializaçãoe statico de endereço");
    }
    {
        System.out.println("dentro do bloco de inicialização de endereço");
    }

    public Endereco02(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
        System.out.println("Dentro do construtor de endereço");
    }



    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   public void imprimirEnd(){

       System.out.println("Rua: "+this.rua);
       System.out.println("CEP: "+this.cep);
   }

}
