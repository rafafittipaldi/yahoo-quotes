package br.com.yahoo.financas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FinancasService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String quotes(String symbols){
		
		return restTemplate.getForObject(
				"https://query1.finance.yahoo.com/v7/finance/quote?symbols={symbols}", String.class, symbols);
	}
}
