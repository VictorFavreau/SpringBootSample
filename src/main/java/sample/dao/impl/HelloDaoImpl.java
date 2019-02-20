package sample.dao.impl;

import sample.dao.HelloDao;
import sample.utils.Constants;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl extends DaoImpl<Object> implements HelloDao {

    @Override
    public String getHelloMessage() {
        return Constants.HELLO_MESSAGE;
    }

}
