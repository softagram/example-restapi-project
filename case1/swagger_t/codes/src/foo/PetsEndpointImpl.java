package foo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

public class PetsEndpointImpl implements PetsEndpoint {


    @ApiOperation(

            value = "creates a new pet",

            response = Pet.class

        )

        @RequestMapping(

            method = {RequestMethod.POST},

            consumes = {"application/json"}

        )
    DeferredResult<Pet> createPet(@RequestBody @ApiParam(name = "petRequest",value = "The payload",required = true) PetRequest var1)
    {
        return null;
    }


    @Override
    public DeferredResult<Pet> trashPet(PetRequest var1) {
        return null;
    }

    @Override
    public DeferredResult<Pet> modPet(PetRequest var1) {
        return null;
    }
}