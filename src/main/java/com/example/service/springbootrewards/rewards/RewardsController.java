package com.example.service.springbootrewards.rewards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.service.springbootrewards.model.Customer;
import com.example.service.springbootrewards.model.MyTransaction;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RewardsController {

	//@Autowired
	//private RewardsServiceMock rewardsService;
	
	@Autowired
	private RewardsService rewardsService;
	
	
//	@GetMapping("/{idUser}/rewards")
//	public List<MyTransaction> getAll(@PathVariable Integer idUser) {
//		return rewardsService.getAll();
//	}
	
	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
}
