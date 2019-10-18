package com.example.service.springbootrewards.rewards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.springbootrewards.model.Customer;

@Service
public class RewardsService {
	
	@Autowired
	private RewardsRepository rewardsRepository;
	
	
	public Customer getCustomerById(Integer customerId) {
		return rewardsRepository.findById(customerId).get();
	}

}
