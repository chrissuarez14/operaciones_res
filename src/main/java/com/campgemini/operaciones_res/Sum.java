package com.campgemini.operaciones_res;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sum")
@ApiOperation("Two numbers are Summed")

public class Sum {

    private float a,b,result;

    @GetMapping("/{a}/{b}")
    @ApiResponses({
    @ApiResponse(code = 200,message = "OK"),
    @ApiResponse(code = 404,message = "NOT FOUND")    })

    public ResponseEntity<String> makeSum(@ApiParam(value = "The first number",required = true,example = "2") @PathVariable("a") float a, @ApiParam(value = "The Second number",required = true,example = "2") @PathVariable("b") float b){
        return new ResponseEntity<>("The result of the Sum is  " + (a+b), HttpStatus.OK);
    }




}
