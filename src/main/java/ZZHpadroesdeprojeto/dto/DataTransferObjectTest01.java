package ZZHpadroesdeprojeto.dto;

import ZZHpadroesdeprojeto.builder.domain.Person;
import ZZHpadroesdeprojeto.factory.domain.Country;
import ZZHpadroesdeprojeto.factory.domain.Currency;
import ZZHpadroesdeprojeto.factory.domain.CurrencyFactor;
import ZZHpadroesdeprojeto.singleton.domain.Aircraft;

import static ZZHpadroesdeprojeto.factory.domain.CurrencyFactor.newCurrency;

/**
 * @author mariana
 * @Project: javacore
 */
public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft();
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactor.newCurrency(country);
        Person.PersonBuilder person = new Person.PersonBuilder();
        person.firstName("mariana").build();

        reportDto.builder().AircraftName(aircraft.getAvailableSeats().toString()).country(country).currency(currency).name("mariana").build();


    }
}
