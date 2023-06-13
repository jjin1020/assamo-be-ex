package com.example.bbs.web;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.service.BbsService;

@RestController
@RequestMapping("/api/bbs")
public class BbsController {

	private final BbsService bbsService;
	
	public BbsController(BbsService bbsService) {
		this.bbsService = bbsService;
	}

	@GetMapping("/list")
	public ResponseEntity<List<HashMap<String, String>>> listBbs() {
		
		List<HashMap<String, String>> list = bbsService.listBbsMst();
		
		return ResponseEntity.ok(list);
	}
	
}
