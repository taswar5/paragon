package com.paragon.spring.data.jpa.api.controller;


import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paragon.spring.data.jpa.api.dao.Bills;
import com.paragon.spring.data.jpa.api.model.BillsReqModel;
import com.paragon.spring.data.jpa.api.service.BillsService;

@RestController
@RequestMapping("/spring-data-jpa")
public class BillsController {

	
	@Autowired
	BillsService billsService;
	
	@PostMapping("/saveBill")
	public Bills saveBill(@RequestBody BillsReqModel req) throws ParseException
	{
	
		return billsService.saveBill2(req);	
	}
	
}
