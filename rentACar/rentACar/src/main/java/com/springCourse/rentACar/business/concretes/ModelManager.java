package com.springCourse.rentACar.business.concretes;

import com.springCourse.rentACar.business.abstracts.ModelService;
import com.springCourse.rentACar.business.requests.GetByNameModelRequest;
import com.springCourse.rentACar.business.responses.GetAllModelsResponse;
import com.springCourse.rentACar.business.responses.GetByIdBrandResponse;
import com.springCourse.rentACar.business.responses.GetByNameModelResponse;
import com.springCourse.rentACar.core.utilities.mappers.ModelMapperService;
import com.springCourse.rentACar.dataAccess.abstracts.ModelRepository;
import com.springCourse.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<GetAllModelsResponse> response=this.modelRepository.findAll().stream().map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class)).collect(Collectors.toList());

        return response;
    }

    @Override
    public GetByNameModelResponse getByName(GetByNameModelRequest getByNameModelRequest) {
        Model model=this.modelRepository.getByName(getByNameModelRequest.getName());
        GetByNameModelResponse response=this.modelMapperService.forRequest().map(model, GetByNameModelResponse.class);

        return response ;
    }
}
