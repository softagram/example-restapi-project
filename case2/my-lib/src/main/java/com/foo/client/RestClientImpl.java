package com.foo.client;

/*import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
*/
//import org.springframework.web.client.RestTemplate;



import java.net.http.HttpHeaders;
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
}