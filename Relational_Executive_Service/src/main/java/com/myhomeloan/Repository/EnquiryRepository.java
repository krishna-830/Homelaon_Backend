package com.myhomeloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhomeloan.model.Enquiry_Details;
@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry_Details, Integer> {

}
