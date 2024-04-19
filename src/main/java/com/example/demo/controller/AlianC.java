package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.madel.AlianM;
import com.example.demo.service.AlianS;

@RestController
public class AlianC 
{
	@Autowired
	AlianS alianS;
	
	@GetMapping("/getAllAlians")
	public List<AlianM> getAllAlians()
	{
		return alianS.getAlians();
	}
}
