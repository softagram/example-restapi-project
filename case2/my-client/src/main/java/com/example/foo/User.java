package com.example.foo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.mylib.FooBarRestClientImpl;
import com.mylib.in.FooBarRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

import com.mylib.in.Case3Response;
import com.mylib.in.Case2Response;
import org.springframework.web.client.RestClientException;

class Meh {

    public String getContext() {
        return null;
    }
}

class User {
    @Autowired

    public static final String CASE2_URI = "/case2/v1/middle/by-customer-id";
    private final FooBarRestClientImpl fooBarRestClient;

    public User() {
        fooBarRestClient = new FooBarRestClientImpl();
    }
 
    public String useApi(@AuditSource Meh request, Map<String, String> headers) {
        try {
            Case2Response c2Response = fooBarRestClient.getCase2(
                request.getContext(), CASE2_URI, headers);
 
            return c2Response.text;
        } catch (RestClientException ex) {

        }
        return null;
    }
}