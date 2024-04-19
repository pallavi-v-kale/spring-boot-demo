package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.madel.AlianM;
import com.example.demo.repository.AlianR;

@Service
public class AlianS 
{
	@Autowired 
	AlianR alianR;
	
	public List<AlianM> getAlians() 
	{
		return alianR.findAll();		
	}
}
