package foo;

public class PetsEndpointImpl implements PetsEndpoint {


    @ApiOperation(

            value = "creates a new pet",

            response = Pet.class

        )

        @RequestMapping(

            method = {RequestMethod.POST},

            consumes = {"application/json"}

        )

        DeferredResult<Pet> createPet(@RequestBody @ApiParam(name = "petRequest",value = "The payload",required = true) PetRequest var1);


}