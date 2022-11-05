package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void detailsTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        assertEquals("Mr", newPass.getTitle());
        assertEquals("Patryk", newPass.getName());
        assertEquals("1234567890", newPass.getId());
        assertEquals("0853849583", newPass.getPhone());
        assertEquals(26, newPass.getAge());
    }

    @Test
    void titleTestFail(){
        Passenger newPass = new Passenger("King", "Patryk", "1234567890", "0853849583", 21);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, newPass::getTitle);
        assertEquals("Please Enter a valid title", exception.getMessage());
    }

    @Test
    void nameTestFail(){
        Passenger newPass = new Passenger("Mr", "Pa", "1234567890", "0853849583", 21);
        IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class, newPass::getName);
        assertEquals("This is not a valid name, must be three or more characters", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}