package ZZHpadroesdeprojeto.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Person {

    private String firstName;
    private String lastName;
    private String email;

    private String username;

    private Person(String firstName, String lastName, String email, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String email;

        private String username;


        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public PersonBuilder lasttName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;

        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public Person build(){
            return new Person(firstName,lastName,email,username);
        }
    }


}
