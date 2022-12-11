package com.myproject.candidateapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.candidateapi.models.CandidateDetails;
import com.myproject.candidateapi.service.CandidateDetailsService;

@RestController
@RequestMapping("/api")
public class CandidateDetailsController {

	@Autowired
	CandidateDetailsService  candidateDetailsService;
	
	@PostMapping("/save/candidateDetails")
	public CandidateDetails saveCandidateDetails(@RequestBody CandidateDetails candidateDetails) {
		 
		CandidateDetails canDetails = candidateDetailsService.saveCandidateDetails(candidateDetails);
		
		return canDetails;
	}
	
	@GetMapping("/getAllCandidateDetails")
	public List<CandidateDetails> getAllCandidateDetails(){
		
		List<CandidateDetails> canDetails = candidateDetailsService.getAllCandidateDetails();
		  return canDetails;
	}
	
	@GetMapping("/getCandidateDetailsById/{id}")
	public CandidateDetails getCandidateDetailsById(@PathVariable int id) {
		CandidateDetails canDetail = candidateDetailsService.getCandidateDetailsById(id);
		return canDetail;
	}
	
	@GetMapping("/getCandidateDetailsByAddress/{address}")
	public CandidateDetails getCandidateDetailsByAddress(@PathVariable String address) {
		CandidateDetails canDetail = candidateDetailsService.getCandidateDetailsByAddress(address);
		return canDetail;
	}
	
	@PutMapping("/updateCandidateDetails")
	public CandidateDetails updateCandidateDetails(@RequestBody CandidateDetails candidateDetails) {
		 
		CandidateDetails canDetails = candidateDetailsService.updateCandidateDetails(candidateDetails);
		
		return canDetails;
	}
	
	@DeleteMapping("/deleteCandidateDetailsById/{id}")
	public void deleteCandidateDetailsById(@PathVariable int id) {
		CandidateDetails canDetail = candidateDetailsService.deleteCandidateDetailsById(id);
		
	}
}
