package com.myproject.candidateapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.candidateapi.models.CandidateDetails;
import com.myproject.candidateapi.repository.CandidateDetailsRepository;

@Service
public class CandidateDetailsService {

	@Autowired
	CandidateDetailsRepository candidateDetailsRepository;
	
	// saving data in database using post
	public CandidateDetails saveCandidateDetails(CandidateDetails candidateDetails) {
		return candidateDetailsRepository.save(candidateDetails);
	}
	
	// getting all the candidate details using get method
	public List<CandidateDetails> getAllCandidateDetails() {
		return (List<CandidateDetails>)candidateDetailsRepository.findAll();
	}
	
	// getting candidate details by id using get method
	public CandidateDetails getCandidateDetailsById(int id) {
		return candidateDetailsRepository.findById(id);
	}

	 // getting candidate details by address using get
	public CandidateDetails getCandidateDetailsByAddress(String address) {
		
		return candidateDetailsRepository.findByAddress(address);
	}

	  
	// updating candidate details
	public CandidateDetails updateCandidateDetails(CandidateDetails candidateDetails) {
		
		 return candidateDetailsRepository.save(candidateDetails);
	}

	  // deleting canidate details by id
	public CandidateDetails deleteCandidateDetailsById(int id) {
		
		return candidateDetailsRepository.deleteById(id);
	}

	
	

	
}
