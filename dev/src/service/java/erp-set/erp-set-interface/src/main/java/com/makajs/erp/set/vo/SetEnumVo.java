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
@Table(name="set_enum")
public class SetEnumVo extends VO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID
	@Id
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
}
