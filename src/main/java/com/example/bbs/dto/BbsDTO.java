package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "게시판 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BbsDTO {
	
	@Schema(description = "게시판 일련번호", example = "")
	private int bbsSen;
	@Schema(description = "게시판 유형", example = "")
	private String bbsTyCd;
	@Schema(description = "게시판 명", example = "")
	private String bbsNae;
	@Schema(description = "게시판 설명", example = "")
	private String bbsDescript;
	@Schema(description = "게시판 순서", example = "")
	private int sortOrd;

}
