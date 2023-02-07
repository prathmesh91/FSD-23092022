package edu.edication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.edication.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "SELECT p FROM Product p WHERE name= :nm") // named param query
	public Product selectProductByName_HQL(@Param("nm") String name);
	
	@Query(value = "SELECT * FROM prodinfo WHERE pname= :nm", nativeQuery = true) // named param query
	public Product selectProductByName_SQL(@Param("nm") String name);
	
	
	//HQL
	@Query(value = "SELECT p FROM Product p WHERE price< :price")
	public List<Product> getListByPrice(@Param("price") double price);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Product SET quantity= :qty WHERE id= :i")
	public void updateQuantity_HQL(@Param("i") int id,@Param("qty") int quantity);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE prodinfo SET quantity= :qty WHERE pid= :i", nativeQuery = true)
	public void updateQuantity_SQL(@Param("i") int id,@Param("qty") int quantity);
	
}
