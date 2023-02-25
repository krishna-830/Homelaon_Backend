package com.myhomeloan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhomeloan.Dao.LedgerDao;
import com.myhomeloan.Service.LedgerService;
import com.myhomeloan.model.Ledger;
import com.myhomeloan.model.SanctionLetter;

@RestController
@RequestMapping("/accouthead-api")
public class LedgerController {

	@Autowired
	private LedgerService service;

	public ResponseEntity<List<SanctionLetter>> getAllSantionLetter() {

		List<SanctionLetter> slist = service.getAllSantionLetter();

		return ResponseEntity.status(HttpStatus.OK).body(slist);
	}

	@PostMapping("/createLedger")
	public ResponseEntity<Ledger> createLedger(@RequestBody Ledger ledger) {

		Ledger ledg = service.createLedger(ledger);

		return ResponseEntity.status(HttpStatus.CREATED).body(ledg);
	}
}
