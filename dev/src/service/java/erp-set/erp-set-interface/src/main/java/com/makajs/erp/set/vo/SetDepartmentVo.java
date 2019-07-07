package com.makajs.erp.set.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.eap.common.domain.VO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString 
@Table(name="set_department")
public class SetDepartmentVo extends VO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID	
	@Id
	private Long id;

	//部门ID	
	private Long orgId;

	//上级部门ID	
	private Long departmentId;

	//部门编码	
	private String code;

	//部门名称	
	private String name;

	//排序号	
	private Integer sort;

	//部门所属层级	
	private Integer layer;

	//父级Id层级列表（如0，1，3，5）	
	private String parentIdList;

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
}
