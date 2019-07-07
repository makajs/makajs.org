package com.makajs.erp.sys.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.mk.eap.common.utils.DtoTreeUtil;
import com.mk.eap.component.oid.itf.IOidService;
import com.mk.eap.entity.impl.EntityCompositionInjector;
import com.mk.eap.entity.impl.EntityReflectionInjector;
import com.mk.eap.entity.impl.EntityServiceImpl;
import com.mk.eap.entity.itf.IEntityInjector;
import com.makajs.erp.sys.dao.SysTaskMapper;
import com.makajs.erp.sys.dto.SysTaskDto;
import com.makajs.erp.sys.itf.ISysTaskService;
import com.makajs.erp.sys.vo.SysTaskVo;

/**
 * @Title: SysTaskServiceImpl.java
 * @Package: com.makajs.erp.sys.impl
 * @Description: 部门接口实现类
 * @version 1.0
 * 
 *          <p>
 *          部门接口实现类
 *          </p>
 * 
 * @author lsg
 * 
 */
@Component
@Service
public class SysTaskServiceImpl extends EntityServiceImpl<SysTaskDto, SysTaskVo, SysTaskMapper>
		implements ISysTaskService {

	@Reference(lazy = true)
	private IOidService idService;

	@Override
	protected void setObjectKeyValue(SysTaskDto createDto) {
		if (createDto.getId() == null) {
			createDto.setId(idService.generateObjectID());
		}  
	}
	
	
/*
	public SysTaskServiceImpl() {
		super();
		this.getInjectors().add(departmentRefInjector());
	}
	

	private EntityReflectionInjector<SysTaskDto,SysTaskDto> departmentRefInjector() { 
		return new EntityReflectionInjector<>("department", "departmentId", SysTaskDto.class,
				() -> this);
	}
	@Override
	public List<SysTaskDto> queryTree() {
		List<SysTaskDto> dtos = query(new SysTaskDto());
		List<SysTaskDto> tree = DtoTreeUtil.Builder(dtos, "id", "departmentId", "children", null);
		return tree;
	} 
*/	
	

	// Logger log = LoggerFactory.getLogger(SysSysTaskServiceImpl.class);

}
