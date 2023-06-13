package com.example.bbs.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bbs.dao.BbsMapper;
import com.example.bbs.service.BbsService;

@Service
public class BbsServiceImpl implements BbsService{

	private final BbsMapper bbsMapper;
	
	public BbsServiceImpl(BbsMapper bbsMapper) {
		this.bbsMapper = bbsMapper;
	}
	
	
	@Transactional(readOnly = true)
	@Override
	public List<HashMap<String, String>> listBbsMst() {
		// TODO Auto-generated method stub
		return bbsMapper.listBbsMst();
	}

}
