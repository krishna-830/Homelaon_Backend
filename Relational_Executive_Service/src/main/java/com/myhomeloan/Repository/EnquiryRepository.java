package com.myhomeloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myhomeloan.model.Enquiry_Details;

public interface EnquiryRepository extends JpaRepository<Enquiry_Details, Integer> {

}
