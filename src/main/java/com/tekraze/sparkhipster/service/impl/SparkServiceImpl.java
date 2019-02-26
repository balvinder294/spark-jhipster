//SparkServiceImpl.java

package com.tekraze.sparkhipster.service.impl;

import com.tekraze.sparkhipster.service.SparkService;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SparkServiceImpl {

    SparkService sparkService;

    @EventListener(ContextRefreshedEvent.class)
    public void myMain(){
        System.out.println("My Spark Service IMPL");
        System.out.println("xxxxxxxxxxxxxxxxxx");
    }
}