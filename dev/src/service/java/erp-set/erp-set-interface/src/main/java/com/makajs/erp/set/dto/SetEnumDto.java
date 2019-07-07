package com.makajs.erp.set.dto;
import com.makajs.erp.set.dto.SetEnumDetailDto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.eap.common.domain.DTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetEnumDto extends DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID
	private Long id;

	//枚举类型编号
	private String code;

	//枚举类型名称
	private String name;

	//1不使用,0使用
	private Integer isNoUsed;

	//创建时间
	private Date createTime;

	//更新时间
	private Date updateTime;

	//时间戳
	private Timestamp ts;

	//set_enum,id,set_enum_detail,enumId
	private List<SetEnumDetailDto> details;
}
