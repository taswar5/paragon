package com.paragon.spring.data.jpa.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paragon.spring.data.jpa.api.dao.Bills;
import com.paragon.spring.data.jpa.api.dao.BillsRepository;
import com.paragon.spring.data.jpa.api.model.BillsReqModel;

import java.util.List;

@Service
public class BillsService {

	@Autowired
	BillsRepository billsRepository;
	
	public Bills saveBill(BillsReqModel req)
	{
		Bills bill_Old=billsRepository.getBill(req.getShp_id());
		Bills bill=new Bills();
		if(bill_Old!=null && bill_Old.getBalance()!=null) {
			bill.setBalance(bill_Old.getBalance()+req.getBill_amount()-req.getDeposit());
		}
		else 
			{
			bill.setBalance(req.getBill_amount()-req.getDeposit());
			}
		
		if(req.getBill_amount().equals(req.getDeposit()))
			bill.setBill_type("Cash");
		else if (req.getBill_amount()==0)
			bill.setBill_type("Deposit Only");
		else bill.setBill_type("Credit");
		
		bill.setName(req.getName());
		bill.setBill_amount(req.getBill_amount());
		bill.setCity(req.getCity());
		bill.setBill_date(req.getBill_date());
		bill.setShp_name(req.getShp_name());
		bill.setShp_id(req.getShp_id());
		bill.setDeposit(req.getDeposit());
		return billsRepository.save(bill);
		
	}
	
	public Bills saveBill2(BillsReqModel req)
	{
		int total_deposit=0; 
		int total_bills=0;
		Bills bill=new Bills();

		List<Bills> bill_list=billsRepository.findAllBills(req.getShp_id());

		if(bill_list!=null && !bill_list.isEmpty()) {
			for(Bills b:bill_list)
				total_deposit=total_deposit+b.getDeposit();
			for(Bills b:bill_list)
				total_bills=total_bills+b.getBill_amount();
			bill.setBalance(total_bills-total_deposit-req.getDeposit()+req.getBill_amount());
		}
		
		else 
			{
			bill.setBalance(req.getBill_amount()-req.getDeposit());
			}
		
		if(req.getBill_amount().equals(req.getDeposit()))
			bill.setBill_type("Cash");
		else if (req.getBill_amount()==0)
			bill.setBill_type("Deposit Only");
		else bill.setBill_type("Credit");
		
		bill.setName(req.getName());
		bill.setBill_amount(req.getBill_amount());
		bill.setCity(req.getCity());
		bill.setBill_date(req.getBill_date());
		bill.setShp_name(req.getShp_name());
		bill.setShp_id(req.getShp_id());
		bill.setDeposit(req.getDeposit());
		return billsRepository.save(bill);
		
	}
	
}
