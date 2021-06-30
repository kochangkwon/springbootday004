package me.changkwon;

import me.changkwon.user.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author changkwon
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApplicationTest {

    @Autowired
    UserService userService;

    @Test
    public void testDI() {
        assertNotNull(userService);
        assertNotNull(userService.getUserRepository());
    }

}