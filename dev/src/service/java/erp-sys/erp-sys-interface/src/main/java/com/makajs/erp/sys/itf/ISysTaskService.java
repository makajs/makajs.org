package com.makajs.erp.sys.itf;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.sys.dto.SysTaskDto;

@RequestMapping("/sys/task")
@ApiMapping("create;query;update;delete") // create;query;update;delete
public interface ISysTaskService extends IEntityService<SysTaskDto>, IPageService<SysTaskDto> {

	//返回部门树
	//public List<SysTaskDto> queryTree();
}
