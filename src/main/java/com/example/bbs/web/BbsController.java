package com.example.bbs.web;

import java.util.HashMap;
import java.util.List;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.dto.BbsDTO;
import com.example.bbs.service.BbsService;
import com.example.bbs.service.impl.BbsServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Tag(name = "게시판 API", description = "게시판 API")
@RestController
@RequestMapping("/api/bbs")
public class BbsController {

	private final BbsService bbsService;
	
	@Operation(summary = "게시판 내역 조회", description = "게시판 내역 조회")
	@GetMapping("/list")
	public ResponseEntity<List<BbsDTO>> listBbs() {
		
		List<BbsDTO> list = bbsService.listBbsMst();
		
		return ResponseEntity.ok(list);
	}
	
}
