package com.example.endpoint;

import com.example.ws.CarServiceImpl;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

    public static void main(String[] args) {
    	System.out.println("im here!!!!");
        Endpoint.publish("http://localhost:8080/ws/carservice", new CarServiceImpl());
    }
}
