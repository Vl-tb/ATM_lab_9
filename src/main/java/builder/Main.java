package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Vlad")
                .lastName("Protsenko")
                .age(19)
                .gender("m")
                .build();
        System.out.println(user);
    }
}
