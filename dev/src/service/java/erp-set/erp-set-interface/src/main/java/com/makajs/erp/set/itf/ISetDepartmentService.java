package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetDepartmentDto;

@RequestMapping("/set/department")
@ApiMapping("create;query;update;delete,queryPageList") // *
public interface ISetDepartmentService extends IEntityService<SetDepartmentDto>, IPageService<SetDepartmentDto> {

	//返回树
	//public List<SetDepartmentDto> queryTree();
}
