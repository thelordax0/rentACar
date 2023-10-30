package com.springCourse.rentACar.business.abstracts;

import com.springCourse.rentACar.business.responses.GetAllModelsResponse;
import com.springCourse.rentACar.entities.concretes.Model;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
 }
