package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	private List<Brand> brands;
	
	
	

	
	
	
	
	public InMemoryBrandRepository() {
		super();
		this.brands = new ArrayList<Brand>();
		brands.add(new Brand("bmw", 1));
		brands.add(new Brand("porsche", 2));
		brands.add(new Brand("ford", 3));
	}








	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
