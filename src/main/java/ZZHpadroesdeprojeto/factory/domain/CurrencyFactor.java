package ZZHpadroesdeprojeto.factory.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class CurrencyFactor {

    public static Currency newCurrency(Country country){
        switch(country){
            case USA:
                return new Real();
            case BRAZIL:
                return new Dolar();

            default: throw  new IllegalArgumentException("No currency found for this country");
        }
    }

}
