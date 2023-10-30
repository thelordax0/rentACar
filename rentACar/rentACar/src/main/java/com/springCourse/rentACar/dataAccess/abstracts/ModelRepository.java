package com.springCourse.rentACar.dataAccess.abstracts;

import com.springCourse.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
    Model getByName(String name);
}
