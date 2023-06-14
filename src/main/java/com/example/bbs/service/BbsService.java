package com.example.bbs.service;

import java.util.HashMap;
import java.util.List;

import com.example.bbs.dto.BbsDTO;


public interface BbsService {

	
	/**
	 * 게시판마스터 목록 조회
	 */
	public List<BbsDTO> listBbsMst();
}
