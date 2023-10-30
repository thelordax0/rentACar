package com.springCourse.rentACar;

import com.springCourse.rentACar.core.utilities.exceptions.ValidationException;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);


	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}



	@ExceptionHandler
	public ValidationException validationException(MethodArgumentNotValidException methodArgumentNotValidException){
		 return new ValidationException(methodArgumentNotValidException.getBody().getDetail());
	}

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ValidationException mainExceptionHandler(Exception exception){
		return new ValidationException(exception.getMessage());
	}
}
