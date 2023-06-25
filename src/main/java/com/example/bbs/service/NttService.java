package com.example.bbs.service;

import java.util.List;

import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;


public interface NttService {

	
	/**
	 * 게시물 목록 조회
	 */
	public List<NttDTO> listNtt(NttSerchDTO nttSerchDTO);
	
	/**
	 * 게시물 저장
	 * @param nttDTO
	 */
	public void saveNtt(NttDTO nttDTO);
	
	/**
	 * 게시물 저장
	 * @param nttDTO
	 */
	public void insertNttMst(NttDTO nttDTO);
	
	/**
	 * 게시물 좋아요 정보 저장
	 * @param nttDTO
	 */
	public void insertNttGdniceMst(NttDTO nttDTO);
	
	/**
	 * 게시물 조회 정보 저장
	 * @param nttDTO
	 */
	public void insertNttSerchMst(NttDTO nttDTO);

	
	/**
	 * 게시물 상세 조회
	 */
	public NttDTO getNtt(NttSerchDTO nttSerchDTO);
}
