package com.eone8.active.ws;

import javax.jws.WebService;

/**
 * Created by eone on 14/11/15 21:14.
 *
 * @author eone
 */
@WebService
public class CXFDemoImpl implements CXFDemo {
    @Override
    public String sayHello(String foo) {
        return "hello "+foo;
    }
}
