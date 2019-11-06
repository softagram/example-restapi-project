package com.example.endpoint;

import com.mylib.in.Case2Response;
import com.mylib.in.Case3Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

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
            value="/v1/middle/by-customer-id"
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
