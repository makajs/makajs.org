package com.makajs.erp.set.impl;
import com.makajs.erp.set.dto.SetEnumDetailDto;
import com.makajs.erp.set.itf.ISetEnumDetailService;

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
import com.makajs.erp.set.dao.SetEnumMapper; 
import com.makajs.erp.set.dto.SetEnumDto;
import com.makajs.erp.set.itf.ISetEnumService;
import com.makajs.erp.set.vo.SetEnumVo;
import com.mk.eap.entity.utils.QueryPageListUtil;
import com.mk.eap.entity.dto.PageQueryDto;
import com.mk.eap.entity.dto.InjectorConfig;

/**
 * @Title: SetEnumServiceImpl.java
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
public class SetEnumServiceImpl extends EntityServiceImpl<SetEnumDto, SetEnumVo, SetEnumMapper>
		implements ISetEnumService {

	@Reference(lazy = true)
	private IOidService idService;

	@Reference
	private ISetEnumDetailService setEnumDetailService;

	public SetEnumServiceImpl() {
		super();
		this.getInjectors().add(detailsInjector());
	}

	private EntityCompositionInjector<SetEnumDto, SetEnumDetailDto> detailsInjector() {
		return new EntityCompositionInjector<>("details", "enumId", SetEnumDetailDto.class, () -> setEnumDetailService);
	}
	@Override
	protected void setObjectKeyValue(SetEnumDto createDto) {
		if (createDto.getId() == null) {
			createDto.setId(idService.generateObjectID());
		}
	} 
/*
	public SetEnumServiceImpl() {
		super();
		this.getInjectors().add(departmentRefInjector());
	}
	

	private EntityReflectionInjector<SetEnumDto,SetEnumDto> departmentRefInjector() { 
		return new EntityReflectionInjector<>("department", "departmentId", SetEnumDto.class,
				() -> this);
	}
	
	@Override
	protected void beforeQueryPageList(PageQueryDto<SetEnumDto> queryDto, InjectorConfig cfg) {
		super.beforeQueryPageList(queryDto, cfg);

		QueryPageListUtil.advanceSearch(queryDto, new String[] { "name", "code" }, SetEnumVo.class);
	}
	
	@Override
	public List<SetEnumDto> queryTree() {
		List<SetEnumDto> dtos = query(new SetEnumDto());
		List<SetEnumDto> tree = DtoTreeUtil.Builder(dtos, "id", "departmentId", "children", null);
		return tree;
	} 
*/	
	

	// Logger log = LoggerFactory.getLogger(SysSetEnumServiceImpl.class);
	
	

}
