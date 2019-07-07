package com.makajs.erp.set.impl;
import com.makajs.erp.set.dto.SetCustomerGroupDto;
import com.makajs.erp.set.itf.ISetCustomerGroupService;

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
import com.mk.eap.common.domain.Token;
import com.mk.eap.entity.itf.IEntityInjector;
import com.makajs.erp.set.dao.SetCustomerMapper; 
import com.makajs.erp.set.dto.SetCustomerDto;
import com.makajs.erp.set.itf.ISetCustomerService;
import com.makajs.erp.set.vo.SetCustomerVo;
import com.mk.eap.entity.utils.QueryPageListUtil;
import com.mk.eap.entity.utils.EntityCodeUtil;
import com.mk.eap.entity.dto.PageQueryDto;
import com.mk.eap.entity.dto.InjectorConfig;

/**
 * @Title: SetCustomerServiceImpl.java
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
public class SetCustomerServiceImpl extends EntityServiceImpl<SetCustomerDto, SetCustomerVo, SetCustomerMapper>
		implements ISetCustomerService {

	@Reference(lazy = true)
	private IOidService idService;

	@Reference
	private ISetCustomerGroupService setCustomerGroupService;

	public SetCustomerServiceImpl() {
		super();
		this.getInjectors().add(customerGroupInjector());
	}

	private EntityReflectionInjector<SetCustomerDto, SetCustomerGroupDto> customerGroupInjector() {
		return new EntityReflectionInjector<>("customerGroup", "customerGroupId", SetCustomerGroupDto.class,() -> setCustomerGroupService);
	}

	@Override
	protected void setObjectKeyValue(SetCustomerDto createDto) {
		if (createDto.getId() == null) {
			createDto.setId(idService.generateObjectID());
		}
		/*
		//自动生成编码
		if (createDto.getCode() == null) {
			createDto.setCode(EntityCodeUtil.genCode("dpt", this));
		}
		*/
	} 
/* 
	Logger log = LoggerFactory.getLogger(SysSetCustomerServiceImpl.class);

	@Override
	protected void beforeQueryPageList(PageQueryDto<SetCustomerDto> queryDto, InjectorConfig cfg) {
		super.beforeQueryPageList(queryDto, cfg);
		if (queryDto.getFilter() == null || queryDto.getExample() != null) {
			return;
		} 
		if (queryDto.getSearchFields() == null) {
			String[] searchFields = new String[] { "name", "mobile" };
			queryDto.setSearchFields(searchFields);
			QueryPageListUtil.advanceSearch(queryDto, searchFields, SetPersonVo.class);
		}
	}
	
	@Override
	public List<SetCustomerDto> queryTree() {
		List<SetCustomerDto> dtos = query(new SetCustomerDto());
		List<SetCustomerDto> tree = DtoTreeUtil.Builder(dtos, "id", "departmentId", "children", null);
		return tree;
	} 
*/	
	

	
	

}
