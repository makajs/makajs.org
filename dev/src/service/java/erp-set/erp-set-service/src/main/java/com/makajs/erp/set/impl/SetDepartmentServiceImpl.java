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
import com.mk.eap.common.domain.Token;
import com.mk.eap.entity.itf.IEntityInjector;
import com.makajs.erp.set.dao.SetDepartmentMapper; 
import com.makajs.erp.set.dto.SetDepartmentDto;
import com.makajs.erp.set.itf.ISetDepartmentService;
import com.makajs.erp.set.vo.SetDepartmentVo;
import com.mk.eap.entity.utils.QueryPageListUtil;
import com.mk.eap.entity.utils.EntityCodeUtil;
import com.mk.eap.entity.dto.PageQueryDto;
import com.mk.eap.entity.dto.InjectorConfig;

/**
 * @Title: SetDepartmentServiceImpl.java
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
public class SetDepartmentServiceImpl extends EntityServiceImpl<SetDepartmentDto, SetDepartmentVo, SetDepartmentMapper>
		implements ISetDepartmentService {

	@Reference(lazy = true)
	private IOidService idService;

	public SetDepartmentServiceImpl() {
		super();
	}

	@Override
	protected void setObjectKeyValue(SetDepartmentDto createDto) {
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
	Logger log = LoggerFactory.getLogger(SysSetDepartmentServiceImpl.class);

	@Override
	protected void beforeQueryPageList(PageQueryDto<SetDepartmentDto> queryDto, InjectorConfig cfg) {
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
	public List<SetDepartmentDto> queryTree() {
		List<SetDepartmentDto> dtos = query(new SetDepartmentDto());
		List<SetDepartmentDto> tree = DtoTreeUtil.Builder(dtos, "id", "departmentId", "children", null);
		return tree;
	} 
*/	
	

	
	

}
