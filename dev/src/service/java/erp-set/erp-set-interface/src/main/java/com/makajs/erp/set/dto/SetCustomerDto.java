package com.makajs.erp.set.dto;
import com.makajs.erp.set.dto.SetCustomerGroupDto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.eap.common.domain.DTO;
import com.mk.eap.common.annotation.ApiContext;
import com.mk.eap.common.domain.Token;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SetCustomerDto extends DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID	
	private Long id;

	//企业ID	
	private Long orgId;

	//客户组ID	
	private Long customerGroupId;

	//编码	
	private String code;

	//名称	
	private String name;

	//描述	
	private String description;

	//不使用	
	private Integer isNoUsed;

	//创建时间	
	private Date createTime;

	//更新时间	
	private Date updateTime;

	//时间戳	
	private Timestamp ts;

	//任务表	
	private SetCustomerGroupDto customerGroup;
}
