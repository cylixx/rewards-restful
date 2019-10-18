package com.example.service.springbootrewards.rewards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return rewardsService.getCustomerById(id);
	}
	
	
}
