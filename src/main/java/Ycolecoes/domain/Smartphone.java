package Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;

    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //reflexivo: x.equals(x) tem que ser true pra tudo que for diferente de null
    //simétrico: se x.equals(y) é true,o inverso tambem é verdadeiro.
    //Transitividade: para x,y,z diferente de null,se x.equals(y) == true e x.equals(z) == true, entao y.equals(z) == true.
    //Consistência:para x diferente de null e true, x.equals(x) sem pre retornará null
    //para x diferente de null, se x.equals(null) tem que retornar false.


    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }if(this == obj){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Smartphone obj1 = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(obj1.serialNumber);
    }

    @Override
    public int hashCode() {
        //native significa que foi escrito em outra linguagem

        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
}
