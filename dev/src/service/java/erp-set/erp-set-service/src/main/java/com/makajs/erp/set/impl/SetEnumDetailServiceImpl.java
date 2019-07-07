package com.makajs.erp.set.impl;

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
import com.makajs.erp.set.dao.SetEnumDetailMapper; 
import com.makajs.erp.set.dto.SetEnumDetailDto;
import com.makajs.erp.set.itf.ISetEnumDetailService;
import com.makajs.erp.set.vo.SetEnumDetailVo;
import com.mk.eap.entity.utils.QueryPageListUtil;
import com.mk.eap.entity.dto.PageQueryDto;
import com.mk.eap.entity.dto.InjectorConfig;

/**
 * @Title: SetEnumDetailServiceImpl.java
 * @Package: com.makajs.erp.set.impl
 * @Description: 接口实现类
 * @version 1.0
 * 
 *          <p>
 *          接口实现类
 *          </p>
 * 
 * @author lsg
 * 
 */
@Component
@Service
public class SetEnumDetailServiceImpl extends EntityServiceImpl<SetEnumDetailDto, SetEnumDetailVo, SetEnumDetailMapper>
		implements ISetEnumDetailService {

	@Reference(lazy = true)
	private IOidService idService;

	public SetEnumDetailServiceImpl() {
		super();
	}

	@Override
	protected void setObjectKeyValue(SetEnumDetailDto createDto) {
		if (createDto.getId() == null) {
			createDto.setId(idService.generateObjectID());
		}
	} 
/*
	public SetEnumDetailServiceImpl() {
		super();
		this.getInjectors().add(departmentRefInjector());
	}
	

	private EntityReflectionInjector<SetEnumDetailDto,SetEnumDetailDto> departmentRefInjector() { 
		return new EntityReflectionInjector<>("department", "departmentId", SetEnumDetailDto.class,
				() -> this);
	}
	
	@Override
	protected void beforeQueryPageList(PageQueryDto<SetEnumDetailDto> queryDto, InjectorConfig cfg) {
		super.beforeQueryPageList(queryDto, cfg);

		QueryPageListUtil.advanceSearch(queryDto, new String[] { "name", "code" }, SetEnumDetailVo.class);
	}
	
	@Override
	public List<SetEnumDetailDto> queryTree() {
		List<SetEnumDetailDto> dtos = query(new SetEnumDetailDto());
		List<SetEnumDetailDto> tree = DtoTreeUtil.Builder(dtos, "id", "departmentId", "children", null);
		return tree;
	} 
*/	
	

	// Logger log = LoggerFactory.getLogger(SysSetEnumDetailServiceImpl.class);
	
	

}
