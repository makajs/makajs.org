package com.makajs.erp.set.itf;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.entity.itf.IEntityService;
import com.mk.eap.entity.itf.IPageService;
import com.makajs.erp.set.dto.SetEnumDetailDto;

@RequestMapping("/set/enum/detail")
@ApiMapping("create;query;update;delete") // create;query;update;delete
public interface ISetEnumDetailService extends IEntityService<SetEnumDetailDto>, IPageService<SetEnumDetailDto> {

	//返回树
	//public List<SetEnumDetailDto> queryTree();
}
