package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {

	//Repository veya Dao lar veri tabanı işi yapan sınıflardır.
	//tüm markaları listeler
	List<Brand> getAll();
}
