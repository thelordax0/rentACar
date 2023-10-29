package com.springCourse.rentACar.webApi.controllers;

import com.springCourse.rentACar.business.abstracts.BrandService;

import com.springCourse.rentACar.business.requests.CreateBrandRequest;
import com.springCourse.rentACar.business.requests.UpdateBrandRequest;
import com.springCourse.rentACar.business.responses.GetAllBrandsResponse;
import com.springCourse.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;




    @GetMapping()
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }


    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }


    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable() int id){

        return this.brandService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }
    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
    }
}
