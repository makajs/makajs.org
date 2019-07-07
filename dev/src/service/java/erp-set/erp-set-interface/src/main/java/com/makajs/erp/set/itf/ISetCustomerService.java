package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetCustomerDto;

@RequestMapping("/set/customer")
@ApiMapping("create;query;update;delete,queryPageList") // *
public interface ISetCustomerService extends IEntityService<SetCustomerDto>, IPageService<SetCustomerDto> {

	//返回树
	//public List<SetCustomerDto> queryTree();
}
