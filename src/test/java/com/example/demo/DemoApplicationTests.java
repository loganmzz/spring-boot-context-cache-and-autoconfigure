package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureJson
public abstract class DemoApplicationTests {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test() {
        System.out.printf("%-20s > %s@%x%n", getClass().getSimpleName(), applicationContext.getClass().getSimpleName(), System.identityHashCode(applicationContext));
    }
}
