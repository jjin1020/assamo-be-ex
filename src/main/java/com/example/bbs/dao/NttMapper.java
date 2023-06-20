package com.example.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;

@Mapper
public interface NttMapper {

	
	/**
	 * 게시물 목록 조회
	 */
	public List<NttDTO> listNtt(NttSerchDTO nttSerchDTO);
}
