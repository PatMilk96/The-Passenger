package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
        Passenger newPass = new Passenger("TheDude", "Patryk", "1234567890", "0853849583", 21);
        assertThrows(IllegalArgumentException.class, newPass::getTitle); //Checks if exception for wrong title is thrown
    }

    @Test
    void nameTest(){
        Passenger newPass = new Passenger("Mr", "Pa", "1234567890", "0853849583", 21);
        assertThrows(IllegalArgumentException.class, newPass::getName);
    }

    @AfterEach
    void tearDown() {
    }
}