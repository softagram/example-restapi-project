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

public interface PetsEndpoint extends SuperEndpoint
{

@ApiOperation(

        value = "handle the pet",

        response = Pet.class

    )

    @RequestMapping(
        
        value = "kill",

        method = {RequestMethod.DELETE},

        consumes = {"application/json"}

    )

    DeferredResult<Pet> trashPet(@RequestBody @ApiParam(name = "petRequest",value = "The payload",required = true) PetRequest var1);


@ApiOperation(

        value = "adjust the pet",

        response = Pet.class

    )

    @RequestMapping(
        
        value = "mod",

        method = {RequestMethod.PUT},

        consumes = {"application/json"}

    )

    DeferredResult<Pet> modPet(@RequestBody @ApiParam(name = "petRequest",value = "The payload",required = true) PetRequest var1);


}
