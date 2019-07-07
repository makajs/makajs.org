package com.makajs.erp.sys.itf;

import org.springframework.web.bind.annotation.RequestMapping;

import com.mk.eap.common.annotation.ApiMapping;
import com.mk.eap.common.itf.IInterfaceService;


@RequestMapping("/")
@ApiMapping("*")
public interface ISysInterfaceService extends  IInterfaceService {
	 
}
