package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.domain.Person;

/**
 * @author mariana
 * @Project: javacore
 */
public class BuilderTest01 {
    public static void main(String[] args) {

        Person personOne = new Person.PersonBuilder()
                .firstName("Mariana")
                .lasttName("ferreira")
                .email("teste@ghotmail.com")
                .username("lisbeth salander")
                .build();

        System.out.println(personOne);



    }
}
