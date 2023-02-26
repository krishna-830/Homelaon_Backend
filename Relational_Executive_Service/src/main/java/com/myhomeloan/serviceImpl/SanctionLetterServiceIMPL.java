package com.myhomeloan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.myhomeloan.Repository.CustomerRepository;
import com.myhomeloan.Repository.SanctionLettrerRepository;
import com.myhomeloan.model.Customer;
import com.myhomeloan.model.SanctionLetter;
import com.myhomeloan.proxyService.CMproxy;
import com.myhomeloan.service.SanctionLetterService;

@Service
public class SanctionLetterServiceIMPL implements SanctionLetterService{
	@Autowired
	private SanctionLettrerRepository sanctionLetterRepo;
    @Autowired
    private CMproxy cmproxy;
    @Autowired
    private SanctionLettrerRepository sancrepo;
    @Autowired
    private CustomerRepository customerrepo;
	@Override
	public String saveSanctionLetter() {
		 ResponseEntity<List<SanctionLetter>> entity = cmproxy.getSanctionLetter();
            List<SanctionLetter> list = entity.getBody();
            for (SanctionLetter sanctionLetter : list) {
				
			
		if(chechSnctionLetter(sanctionLetter.getSid())) {
			SanctionLetter savedSanction = sancrepo.save(sanctionLetter);
			  String name = savedSanction.getApplicantName();
			  Customer customer = customerrepo.findByName(name);
			  sendmail("sourabhbhukan09@gmail.com",customer.getEmail() , "Sanction Letter from MyHomeLoanFinance", "You are eligible for home loan from our side"+savedSanction.getLoanAmtSanctioned());
			return "ok";
		}
		
            }
            return "not ok";
	}
	
	
	
	
	private boolean chechSnctionLetter(int sid) {
		if(sancrepo.findById(sid).isPresent()) {
			return false;
		}
		return true;
	}





	@Autowired
	  private MailSender sender;
	  public String sendmail(String from,String to,String sub,String msg) {
		SimpleMailMessage s=new SimpleMailMessage();
		
		s.setFrom("sourabhbhukan09@gmail.com");
		s.setTo(to);
		s.setSubject(sub);
		s.setText(msg);
		
		sender.send(s);
		return "mail sent successful to:-"+to;
	}




	@Override
	public List<SanctionLetter> getAllSanctionLetter() {
	
		return sancrepo.findAll();
	}


}
