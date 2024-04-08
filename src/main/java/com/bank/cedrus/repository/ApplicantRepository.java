package com.bank.cedrus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.cedrus.model.request.Applicant;
import com.bank.cedrus.model.request.ClaimDetails;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
 	boolean existsByUrn(String urn);
 	Applicant findByUrn(String urn);
}