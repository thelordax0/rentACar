package com.springCourse.rentACar.dataAccess.abstracts;

import com.springCourse.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BrandRepository  extends JpaRepository<Brand,Integer> {

}
