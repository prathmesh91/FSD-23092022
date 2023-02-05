package edu.edication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.edication.entity.Product;
import edu.edication.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/save")
	public String save(@RequestBody Product product) {
		repository.save(product);
		return "Product Save Successfully...";
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Product product) {
		repository.save(product);
		return "Product Update Successfully...";
	}
	
	@GetMapping("/get-all")
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(name="id") int id) {
		repository.deleteById(id);
		return "Product Deleted Successfully";
	}
	
	@GetMapping("/get-by-name")
	public Product getProductByName(@RequestParam("name") String name) {
		//return repository.selectProductByName_HQL(name);
		return repository.selectProductByName_SQL(name);
	}
	
}













