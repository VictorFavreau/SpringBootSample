package sample.service.impl;

import sample.dao.HelloDao;
import sample.dto.HelloDto;
import sample.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    public HelloDto sayHello() {
        return new HelloDto(helloDao.getHelloMessage());
    }

}