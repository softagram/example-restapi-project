package foo;

@Api(

    tags = {"pets"},

    produces = "application/json"

)

@RestController

@RequestMapping(

    value = {"/pets"},

    produces = {"application/json"}

)

public interface PetsEndpoint extends Endpointty
{

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
