package sample.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import sample.dto.HelloDto;
import sample.service.HelloService;
import sample.utils.Constants;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = {})
public class HelloControllerTest {

    @Autowired
    HelloService helloService;

    @Test
    public void sayHello() throws Exception {
        HelloDto hDto = helloService.sayHello();
        assertEquals(Constants.HELLO_MESSAGE, hDto.getMessage());
    }


}