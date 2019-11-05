package com.example.endpoint;

import java.net.URI;

import com.mylib.in.Case2Response;
import com.mylib.in.Case3Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(
    value = "case2",

    tags = {"takit"},

    produces = "application/json"

)

@RestController

public interface Case2Endpoint extends SuperEndpoint
{

@ApiOperation(

        value = "handle it",

        response = Case2Response.class

    )

    @GetMapping(
            value="/v1/parties/by-customer-id"
    )

    DeferredResult<Case2Response> getCase2(@RequestBody @ApiParam(name = "customerid",value = "The payload",required = true) Object var1);


@ApiOperation(

        value = "adjustit",

        response = Case2Response.class

    )

    @RequestMapping(

        value = "zbi/fwl",

        method = {RequestMethod.PUT},

        consumes = {"application/json"}

    )

    DeferredResult<Case3Response> getCase3(@RequestBody @ApiParam(name = "foobarry",value = "The payload",required = true) Object var1);


}
