package com.myproject.candidateapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.myproject.candidateapi.models.CandidateDetails;

public interface CandidateDetailsRepository extends CrudRepository<CandidateDetails,Integer> {

	CandidateDetails findById( int id);
	CandidateDetails findByAddress( String  address);
	CandidateDetails deleteById(int id);
}
