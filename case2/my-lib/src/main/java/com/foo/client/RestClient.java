package com.foo.client;

import java.net.http.HttpHeaders;
import java.util.Map;



interface RestClient {
    RestResponse performGet(Class c, HttpHeaders headers, Map<String, Object> query, String uri);
    RestResponse performGet(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug);
    RestResponse performPost(Class c, HttpHeaders headers, Map<String, Object> query, String uri);
    RestResponse performPost(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug);
    RestResponse performDelete(Class c, HttpHeaders headers, Map<String, Object> query, String uri);
    RestResponse performDelete(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug);
    RestResponse performPut(Class c, HttpHeaders headers, Map<String, Object> query, String uri);
    RestResponse performPut(Class c, HttpHeaders headers, Map<String, Object> query, String uri, boolean debug);

}