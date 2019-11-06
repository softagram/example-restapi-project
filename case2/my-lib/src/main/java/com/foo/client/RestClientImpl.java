package com.foo.client;

import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;
import java.util.Map;

public class RestClientImpl implements RestClient {

    @Override
    public RestResponse performGet(Class c, HttpHeaders headers, Map<String, Object> query, String uri) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return null;
    }

    @Override
    public RestResponse performGet(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug) {
        return null;
    }

    @Override
    public RestResponse performPost(Class c, HttpHeaders headers, Map<String, Object> query, String uri) {
        return null;
    }

    @Override
    public RestResponse performPost(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug) {
        return null;
    }

    @Override
    public RestResponse performDelete(Class c, HttpHeaders headers, Map<String, Object> query, String uri) {
        return null;
    }

    @Override
    public RestResponse performDelete(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug) {
        return null;
    }

    @Override
    public RestResponse performPut(Class c, HttpHeaders headers, Map<String, Object> query, String uri) {
        return null;
    }

    @Override
    public RestResponse performPut(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug) {
        return null;
    }

    public static class MapBuilder {
        public static Map<String, Object> newMap() {
            return null;
        }
    }
}