package com.makajs.erp.sys.dto; 

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.eap.common.domain.DTO;
import com.mk.eap.common.domain.Token;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SysUserDto extends DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//ID
	private Long id;
	
	//账号
	private String account;

	//密码
	private String password;

	//密码强度（1：弱，2：中，3：强）
	private Integer passwordStrength;

	//昵称
	private String uname;

	//性别（1：男，2：女，null：保密）
	private Integer sex;

	//手机号
	private String mobile;

	//邮箱
	private String email;

	//注册IP
	private String createIp;

	//更新者
	private Long updater;

	//最后登录时间
	private Date lastLoginTime;

	//最后登录IP
	private String lastLoginIp;

	//注册时间
	private Date createTime;

	//更新时间
	private Date updateTime;

	//时间戳
	private Timestamp ts;

	//
	private Integer isNoUsed;
 
}
