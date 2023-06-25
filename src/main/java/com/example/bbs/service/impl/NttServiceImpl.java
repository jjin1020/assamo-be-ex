package com.example.bbs.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bbs.dao.BbsMapper;
import com.example.bbs.dto.AreaDTO;
import com.example.bbs.dto.BbsDTO;
import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;
import com.example.bbs.service.BbsService;
import com.example.bbs.service.NttService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
public class NttServiceImpl implements NttService{

	private final BbsMapper bbsMapper;

	@Transactional(readOnly = true)
	@Override
	public List<NttDTO> listNtt(NttSerchDTO nttSerchDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional()
	@Override
	public void saveNtt(NttDTO nttDTO) {
		// TODO Auto-generated method stub
		
	}
	
}
