package com.mylib;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;*/

import com.mylib.in.Case2Response;
import com.mylib.in.FooBarRestClient;
import com.example.domain.response.Case4;
import com.example.domain.response.Case3Response;
import com.example.domain.response.Case2Response;
import com.foo.client.RestClientImpl;

/**
 * Dummy example
 */
@Component
@MethodTrace(logValues = true)
public class FooBarRestClientImpl implements FooBarRestClient {

    @Autowired
    private RestClientImpl restClient;

    private static final String CONTEXT = "context";
    private static final String HEADER_API_KEY = "x-api-key";
    private static final List<String> REQUEST_HEADERS = Arrays.asList("x-application-id", "rr.customerid",
            "samlv2auth", "representation.roles", "channel", "userid");

    @Override
    public Case2Response getCase3(String context,
                                  String case3URI, Map<String, String> headers) {

        Map<String, Object> query = buildQueryWithContext(context);
        HttpHeaders httpHeaders = filterHeaders(headers);
        //restClient.setApiKey(headers.get(HEADER_API_KEY));
        return (Case2Response) restClient.performGet(Case2Response.class, httpHeaders, query,
                case3URI);
    }

    @Override
    public Case2Response getCase2(String context,
            String case2Uri, Map<String, String> headers) {

        Map<String, Object> query = buildQueryWithContext(context);
        HttpHeaders httpHeaders = filterHeaders(headers);
        //restClient.setApiKey(headers.get(HEADER_API_KEY));
        return (Case2Response) restClient.performGet(Case2Response.class, httpHeaders, query, case2Uri);
    }

    private Map<String, Object> buildQueryWithContext(String context) {
        return RestClientImpl.MapBuilder.newMap()
                                        .with(CONTEXT, context)
                                        .build();
    }

    private HttpHeaders filterHeaders(Map<String, String> headers) {
        HttpHeaders filteredHeaders = new HttpHeaders();
        headers.forEach((key, value) -> {
            if (REQUEST_HEADERS.contains(key.toLowerCase())) {
                filteredHeaders.add(key, value);
            }
        });

        return filteredHeaders;
    }
}
