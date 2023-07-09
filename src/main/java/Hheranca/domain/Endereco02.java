package Hheranca.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Endereco02 {

    protected String rua;
    protected String cep;

    public Endereco02(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
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

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
