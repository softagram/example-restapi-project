package com.example.foo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import com.example.domain.response.Case4;
import com.example.domain.response.Case3Response;
import com.example.domain.response.Case2Response;
import com.mylib.FooBarRestClient;

class Meh {

}

class User {
    //@Autowired
    //private RestClientImpl restClient;

    public static final String CASE2_URI = "/case2/v1/parties/by-customer-id";

    public User() {
        fooBarRestClient = new FooBarRestClient();
    }
 
    @Transactional(readOnly = true, propagation = Propagation.NEVER)
    public String useApi(@AuditSource Meh request, Map<String, String> headers) {
        try {
            Case2Response c2Response = fooBarRestClient.getCase2(
                request.getContext(), CASE2_URI, headers);
 
            return c2Response.text;
        } catch (RestClientException ex) {

        }
    }
}