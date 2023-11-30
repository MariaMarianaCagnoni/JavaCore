package ZZHpadroesdeprojeto.builder.test;

import ZZHpadroesdeprojeto.builder.domain.Person;

/**
 * @author mariana
 * @Project: javacore
 */
public class BuilderTest01 {
    public static void main(String[] args) {

        Person personOne = new Person.PersonBuilder()
                .firstName("Mariana")
                .lastName("ferreira")
                .email("teste@ghotmail.com")
                .username("lisbeth salander")
                .build();

        System.out.println(personOne);



    }
}
