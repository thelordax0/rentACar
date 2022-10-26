package kodlama.io.rentACar.bussiness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.bussiness.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
	
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}



	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brandRepository.getAll();
	}

	
}
