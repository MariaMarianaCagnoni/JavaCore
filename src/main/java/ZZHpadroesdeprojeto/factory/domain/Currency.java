package ZZHpadroesdeprojeto.factory.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public interface Currency {

    String newCurrency();
}

class Real implements Currency {


    @Override
    public String newCurrency() {
        return "R$";
    }

}

class Dolar implements Currency {
    @Override
    public String newCurrency() {
        return "$";
    }
}