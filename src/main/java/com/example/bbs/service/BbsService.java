package com.example.bbs.service;

import java.util.HashMap;
import java.util.List;


public interface BbsService {

	
	/**
	 * 게시판마스터 목록 조회
	 */
	public List<HashMap<String, String>> listBbsMst();
}
