package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Address;
import edu.institute.repository.AddressRepository;

@RestController
public class AddressController {

	@Autowired
	private AddressRepository repository;
	
	@PostMapping("/save/address")
	public String saveAddress(@RequestBody Address address) {
		repository.save(address);
		return "Address Save Successfully...";
	}
	
	@GetMapping("/get-add/address")
	public List<Address> getAddress() {
		return repository.findAll();
	}
	
}
