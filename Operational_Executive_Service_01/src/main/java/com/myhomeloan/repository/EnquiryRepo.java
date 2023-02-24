package com.myhomeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.Enquiry_Details;
@Repository
public interface EnquiryRepo  extends JpaRepository<Enquiry_Details, Integer>{

}
