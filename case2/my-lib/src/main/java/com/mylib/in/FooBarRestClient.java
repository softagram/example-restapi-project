package com.mylib.in;


import java.util.Map;

public interface FooBarRestClient {
    public Case3Response getCase3(String context,
                                  String case3URI, Map<String, String> headers);


    public Case2Response getCase2(String context,
                                  String case2Uri, Map<String, String> headers);

}