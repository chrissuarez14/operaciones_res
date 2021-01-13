package com.campgemini.operaciones_res;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Compare")
@ApiOperation("Two numbers are comparaded")
public class CompareController {
    @GetMapping("/{a}/{b}")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK"),
            @ApiResponse(code = 404,message = "NOT FOUND")    })
    public String compare(@ApiParam(value = "The Second number",required = true,example = "2")@PathVariable("a") float a,@ApiParam(value = "The Second number",required = true,example = "2") @PathVariable("b") float b){
        if(a==b){
            return "The numbers are equals";
        }else {
            return "The numbers aren´t not equalas";
        }
    }
}
