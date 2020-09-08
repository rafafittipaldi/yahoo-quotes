package br.com.yahoo.financas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.yahoo.financas.service.FinancasService;
import br.com.yahoo.financas.util.Util;

@RestController
@RequestMapping("/quotes")
public class FinancasController {

	@Autowired
	private FinancasService financasService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> quotes(@RequestParam(value = "symbols", defaultValue = "TLS.AX,MUS.AX") String symbols) {
		
		String quotes = financasService.quotes(symbols);
		
		System.out.println(Util.convertStringToJson(quotes));
		
		return ResponseEntity.ok().body(Util.convertStringToJson(quotes));
	}
}