package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = User.builder()
                .firstName("Vlad")
                .lastName("Protsenko")
                .age(19)
                .gender("m")
                .build();
    }

    @Test
    void testToString() {
        assertEquals("User(firstName=Vlad, lastName=Protsenko, occupations=[], gender=m, age=19, weight=0)",
                user.toString());
    }

    @Test
    void testBuilder() {
        assertEquals("Vlad", user.getFirstName());
        assertEquals("Protsenko", user.getLastName());
        assertEquals(19, user.getAge());
        assertEquals("m", user.getGender());
    }
}