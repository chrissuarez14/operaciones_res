package com.campgemini.operaciones_res;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Multiply")
@ApiOperation("Two numbers are Multiplicated")
public class MultController {
    float a,b;
    @GetMapping("/{a}/{b}")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK"),
            @ApiResponse(code = 404,message = "NOT FOUND")    })


    public ResponseEntity<String> makeMult(@ApiParam(value = "The First number",required = true,example = "2")@PathVariable("a") float a, @ApiParam(value = "The Second number",required = true,example = "2") @PathVariable("b") float b){
        return new ResponseEntity<>("The result of the multiplication is  " + (a*b), HttpStatus.OK);
    }

}
