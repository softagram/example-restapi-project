package com.example.endpoint;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Api(
        value = "anotherEndpoint",

        tags = {"foo"},

        produces = "application/json"

)

@RestController

public interface AnotherEndpoint extends SuperEndpoint
{

    @ApiOperation(

            value = "handle it",

            response = Case2Response.class

    )

    @GetMapping(
            value="/parties/by-customer-id"
    )

    DeferredResult<Case2Response> getCase2(@RequestBody @ApiParam(name = "customerid",value = "The payload",required = true) Object var1);


    @ApiOperation(

            value = "adjustit",

            response = Case2Response.class

    )

    @RequestMapping(

            value = "mod",

            method = {RequestMethod.PUT},

            consumes = {"application/json"}

    )

    DeferredResult<Case2Response> getCase3(@RequestBody @ApiParam(name = "myReq",value = "The payload",required = true) Runnable var1);


}
