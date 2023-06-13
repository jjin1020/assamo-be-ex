package com.example.bbs.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BbsMapper {


	/**
	 * 게시판마스터 목록 조회
	 * @return
	 */
	public List<HashMap<String, String>> listBbsMst();
	
}
