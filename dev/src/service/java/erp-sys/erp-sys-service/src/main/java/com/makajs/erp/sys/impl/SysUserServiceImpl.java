package com.makajs.erp.sys.impl;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.mk.eap.common.domain.BusinessException;
import com.mk.eap.common.domain.DTO;
import com.mk.eap.common.domain.PageObject;
import com.mk.eap.common.domain.Token;
import com.mk.eap.common.utils.DubboServiceHelper;
import com.mk.eap.common.utils.MD5Util;
import com.mk.eap.common.utils.StringTokenizer;
import com.mk.eap.component.oid.itf.IOidService;
import com.mk.eap.entity.dto.InjectorConfig;
import com.mk.eap.entity.dto.PageResultDto;
import com.mk.eap.entity.impl.EntityServiceHelper;
import com.mk.eap.entity.impl.EntityServiceImpl;
import com.mk.eap.entity.itf.IEntityService;
import com.makajs.erp.sys.dao.SysUserMapper;
import com.makajs.erp.sys.dto.SysTaskDto;
import com.makajs.erp.sys.dto.SysUserDto;
import com.makajs.erp.sys.itf.ISysTaskService;
import com.makajs.erp.sys.itf.ISysUserService;
import com.makajs.erp.sys.vo.SysUserVo;

/**
 * @Title: SysUserServiceImpl.java
 * @Package: com.mk.eap.sys.impl
 * @Description: 用户接口实现类
 * @version 1.0
 * 
 *          <p>
 *          用户接口实现类
 *          </p>
 * 
 * @author lsg
 * 
 */
@Component
@Service
public class SysUserServiceImpl extends EntityServiceImpl<SysUserDto, SysUserVo, SysUserMapper>
		implements ISysUserService {

	// Logger log = LoggerFactory.getLogger(SysSysWebsiteServiceImpl.class);

	@Reference
	private IOidService idService; 

	@Override
	protected void setObjectKeyValue(SysUserDto createDto) {
		if (createDto.getId() == null) {
			createDto.setId(idService.generateObjectID());
		}
	}

	@Override
	public SysUserDto login(SysUserDto user) {
		String md5Password = user.getPassword();
		try {
			md5Password = MD5Util.getMD5Str(user.getPassword(), "mk-eap");
		} catch (NoSuchAlgorithmException e1) { 
			e1.printStackTrace();
		}
		SysUserVo userInDB = new SysUserVo();
		userInDB.setAccount(user.getAccount());
		try {
			userInDB = this.mapper.selectOne(userInDB);
		} catch (Exception e) {
			throw e;
		}
		if (userInDB == null || userInDB.getPassword() == null) {
			throw new BusinessException("1000", "用户不存在");
		}
		if (!userInDB.getPassword().equals(md5Password)) {
			throw new BusinessException("1000", "密码不正确");
		}
		SysUserDto userDto = user.fromVo(userInDB);
		userDto.setPassword(null);
		Token token = new Token();
		token.setUserId(userDto.getId());
		userDto.setToken(token);
		 
		/*//test DubboServiceHelper
		SysTaskDto dto = new SysTaskDto();
		String itfName = ISysTaskService.class.getTypeName();
		ISysTaskService taskService = (ISysTaskService)DubboServiceHelper.getService(itfName);
		List<SysTaskDto> tasks = taskService.query(dto);
		
		userDto.setEmail(String.valueOf(tasks.size()));
		//*/
		
		/*//test EntityServiceHelper
		IEntityService personService = EntityServiceHelper.getService("sys_person", null);
		DTO dto = personService.findById(1L);
		userDto.setEmail(dto.getFieldValue("id").toString());
		//*/
		
		return userDto;
	}

	@Override
	public SysUserDto findByToken(Long id) {
		SysUserDto userDto = findById(id);
		userDto.setPassword(null);
		return userDto;
	}

	@Override
	public SysUserDto regist(SysUserDto user) { 
		String md5Password = user.getPassword();

		try {
			md5Password = MD5Util.getMD5Str(user.getPassword(), "mk-eap");
		} catch (NoSuchAlgorithmException e1) { 
			e1.printStackTrace();
		}
		user.setPassword(md5Password);
		SysUserDto userDto = create(user);
		userDto.setPassword(null);
		Token token = new Token();
		token.setUserId(userDto.getId());
		user.setToken(token);
		return userDto;
	} 

}
