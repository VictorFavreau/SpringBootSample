package sample.controllers;

import sample.dto.HelloDto;
import sample.utils.Constants;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = {})
public class HelloControllerTest {

    @Autowired
    HelloController helloController;

    @Test
    public void sayHello() throws Exception {
        HelloDto hDto = helloController.sayHello();
        assertEquals(Constants.HELLO_MESSAGE, hDto.getMessage());
    }


}