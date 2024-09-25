package net.engineeringdigest.journalApp.Service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import net.engineeringdigest.journalApp.service.UserDetailsServiceImpl;



public class UserDetailsServiceImplTests {

    @InjectMocks
    private UserDetailsServiceImpl UserDetailsService;

   @Mock 
   private UserRepository userRepository;

   @SuppressWarnings("deprecation")
@BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

//     @Test
//     void loadUserByUsernameTest(){
//       when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("abc").password("abc").roles(new ArrayList<>()).build());
//       UserDetails user = UserDetailsService.loadUserByUsername("tyagi");
//       Assertions.assertNotNull(user);
//    }
}