package com.example.bbs.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bbs.dto.BbsDTO;

@Mapper
public interface BbsMapper {


	/**
	 * 게시판마스터 목록 조회
	 * @return
	 */
	public List<BbsDTO> listBbsMst();

	/**
	 * 게시판 상세 조회
	 * @return
	 */
	public BbsDTO getBoard(String bbsSen);
	
	/**
	 * 게시판 마스터 저장
	 * @param bbsDTO
	 */
	public void insertBbsMst(BbsDTO bbsDTO);
	
	/**
	 * 게시판 마스터 수정
	 * @param bbsDTO
	 */
	public void updateBbsMst(BbsDTO bbsDTO);
	
	/**
	 * 게시판 옵션 저장
	 * @param bbsDTO
	 */
	public void insertBbsOptn(BbsDTO bbsDTO);
	
	/**
	 * 게시판 저장 저장
	 * @param bbsDTO
	 */
	public void updateBbsOptn(BbsDTO bbsDTO);
	
	/**
	 * 게시판 설정 마스터 삭제
	 * @param bbsSen
	 */
	public void deleteBbsMst(String bbsSen);
	
	/**
	 * 게시판 설정 옵션 삭제
	 * @param bbsSen
	 */
	public void deleteBbsOptn(String bbsSen);
}
