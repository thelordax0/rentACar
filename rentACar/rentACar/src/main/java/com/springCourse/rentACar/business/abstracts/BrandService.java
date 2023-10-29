package com.springCourse.rentACar.business.abstracts;

import com.springCourse.rentACar.business.requests.CreateBrandRequest;
import com.springCourse.rentACar.business.requests.UpdateBrandRequest;
import com.springCourse.rentACar.business.responses.GetAllBrandsResponse;
import com.springCourse.rentACar.business.responses.GetByIdBrandResponse;


import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    GetByIdBrandResponse getById(int id);
    void delete(int id);

}
