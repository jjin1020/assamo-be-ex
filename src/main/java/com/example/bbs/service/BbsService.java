package com.example.bbs.service;

import java.util.HashMap;
import java.util.List;

import com.example.bbs.dto.BbsDTO;


public interface BbsService {

	
	/**
	 * 게시판마스터 목록 조회
	 */
	public List<BbsDTO> listBbsMst();
	
	/**
	 * 게시판 상세조회
	 * @param bbsSen
	 * @return
	 */
	public BbsDTO getBoard(String bbsSen);
	
	/**
	 * 게시판 설정 저장
	 * @param bbsDTO
	 */
	public BbsDTO saveBoard(BbsDTO bbsDTO);
	
	/**
	 * 게시판 설정 삭제
	 * @param bbsSen
	 */
	public void deleteBoard(String bbsSen);
}
