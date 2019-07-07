package com.makajs.erp.sys.itf;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.mk.eap.common.annotation.ApiContext;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.common.annotation.ApiResult;
import com.mk.eap.common.domain.BusinessException;
import com.mk.eap.common.domain.PageObject;
import com.mk.eap.common.domain.Token;
import com.mk.eap.entity.dto.PageResultDto;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.sys.dto.SysUserDto; 

@RequestMapping("/sys/user")
@ApiMapping("login;regist;findByToken")
public interface ISysUserService extends IEntityService<SysUserDto>, IPageService<SysUserDto> {

	@ApiResult("token")
	SysUserDto login(SysUserDto user);

	SysUserDto regist(SysUserDto user);
	
	SysUserDto findByToken(@ApiContext("userId") Long id); 
 }
