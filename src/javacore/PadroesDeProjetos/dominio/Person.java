package javacore.PadroesDeProjetos.dominio;

public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

public PersonBuilder(){

}


        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.email = this.email;
            person.userName = this.userName;
            person.lastName = this.lastName;
            return person;
        }
    }
}

