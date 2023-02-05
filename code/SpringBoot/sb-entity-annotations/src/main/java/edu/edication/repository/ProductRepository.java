package edu.edication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.edication.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "SELECT p FROM Product p WHERE name= :nm") // named param query
	public Product selectProductByName_HQL(@Param("nm") String name);
	
	@Query(value = "SELECT * FROM prodinfo WHERE pname= :nm", nativeQuery = true) // named param query
	public Product selectProductByName_SQL(@Param("nm") String name);
	
}
