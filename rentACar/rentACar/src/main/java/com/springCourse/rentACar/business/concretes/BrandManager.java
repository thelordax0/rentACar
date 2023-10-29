package com.springCourse.rentACar.business.concretes;

import com.springCourse.rentACar.business.abstracts.BrandService;
import com.springCourse.rentACar.business.requests.CreateBrandRequest;
import com.springCourse.rentACar.business.requests.UpdateBrandRequest;
import com.springCourse.rentACar.business.responses.GetAllBrandsResponse;
import com.springCourse.rentACar.business.responses.GetByIdBrandResponse;
import com.springCourse.rentACar.core.utilities.mappers.ModelMapperService;
import com.springCourse.rentACar.dataAccess.abstracts.BrandRepository;
import com.springCourse.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponses;

        getAllBrandsResponses=brands.stream().map(brand ->  this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());


        return getAllBrandsResponses;
    }


    @Override
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {

        Brand brand=this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);

        //Save id yi biliyorsa update bilmiyorsa create işlemi yapar
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand=this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand=this.brandRepository.findById(id).orElseThrow();

        return  this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
