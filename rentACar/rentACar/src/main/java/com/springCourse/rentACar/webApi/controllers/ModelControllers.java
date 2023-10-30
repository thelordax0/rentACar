package com.springCourse.rentACar.webApi.controllers;

import com.springCourse.rentACar.business.abstracts.ModelService;
import com.springCourse.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
