package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetCustomerGroupDto;

@RequestMapping("/set/customer/group")
@ApiMapping("create;query;update;delete,queryPageList") // *
public interface ISetCustomerGroupService extends IEntityService<SetCustomerGroupDto>, IPageService<SetCustomerGroupDto> {

	//返回树
	//public List<SetCustomerGroupDto> queryTree();
}
