package com.makajs.erp.set.dto;
import com.makajs.erp.set.dto.SetDepartmentDto;

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
public class SetPersonDto extends DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID	
	private Long id;

	//企业ID	
	private Long orgId;

	//所属部门ID	
	private Long departmentId;

	//用户ID	
	private Long userId;

	//编码	
	private String code;

	//姓名	
	private String name;

	//性别	
	private Integer sex;

	//手机号	
	private String mobile;

	//身份证号	
	private String idCardNo;

	//生日	
	private Date birthday;

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

	//部门表	
	private SetDepartmentDto department;
}
