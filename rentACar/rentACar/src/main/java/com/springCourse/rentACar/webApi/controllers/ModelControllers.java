package com.springCourse.rentACar.webApi.controllers;

import com.springCourse.rentACar.business.abstracts.ModelService;
import com.springCourse.rentACar.business.requests.GetByNameModelRequest;
import com.springCourse.rentACar.business.responses.GetAllModelsResponse;
import com.springCourse.rentACar.business.responses.GetByNameModelResponse;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/models")
@AllArgsConstructor
public class ModelControllers {

    private ModelService modelService;





    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return this.modelService.getAll();
    }

    @PostMapping("/getByName")
    public GetByNameModelResponse getByName(@RequestBody GetByNameModelRequest getByNameModelRequest){
        return this.modelService.getByName(getByNameModelRequest);
    }
}
