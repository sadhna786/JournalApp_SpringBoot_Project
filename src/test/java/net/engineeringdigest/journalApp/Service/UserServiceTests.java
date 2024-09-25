package net.engineeringdigest.journalApp.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.repository.UserRepository;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Disabled
    @Test
    public void testFindByUserName(){
        assertNotNull(userRepository.findByUserName("abc"));
    }
    
    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "3,4,7",
        "6,5,11"
    })
    public void test(int a , int b , int expected){
        assertEquals(expected, a + b);
    }

}
