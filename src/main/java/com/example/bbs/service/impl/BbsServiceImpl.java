package com.example.bbs.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bbs.dao.BbsMapper;
import com.example.bbs.dto.BbsDTO;
import com.example.bbs.service.BbsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
public class BbsServiceImpl implements BbsService{

	private final BbsMapper bbsMapper;
	
	@Transactional(readOnly = true)
	@Override
	public List<BbsDTO> listBbsMst() {
		// TODO Auto-generated method stub
		return bbsMapper.listBbsMst();
	}

}
