package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetPersonDto;

@RequestMapping("/set/person")
@ApiMapping("create;query;update;delete,queryPageList") // *
public interface ISetPersonService extends IEntityService<SetPersonDto>, IPageService<SetPersonDto> {

	//返回树
	//public List<SetPersonDto> queryTree();
}
