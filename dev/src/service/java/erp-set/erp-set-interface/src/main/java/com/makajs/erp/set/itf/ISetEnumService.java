package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetEnumDto;

@RequestMapping("/set/enum")
@ApiMapping("create;query;update;delete") // create;query;update;delete
public interface ISetEnumService extends IEntityService<SetEnumDto>, IPageService<SetEnumDto> {

	//返回树
	//public List<SetEnumDto> queryTree();
}
