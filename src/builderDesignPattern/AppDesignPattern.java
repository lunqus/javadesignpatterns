package builderDesignPattern;

public class AppDesignPattern {

    public static void main(String[] args) {

        User James = new User.UserBuilder("James", "Bond")
                .address("123, London")
                .age(45)
                .phoneNumber("007")
                .build();

        System.out.println(James);
    }
}
