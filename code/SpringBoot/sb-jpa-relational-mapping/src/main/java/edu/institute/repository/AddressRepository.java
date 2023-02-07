package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
