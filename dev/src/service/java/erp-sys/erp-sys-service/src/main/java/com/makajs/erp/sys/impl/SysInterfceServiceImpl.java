package com.makajs.erp.sys.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.mk.eap.common.domain.ApiJsRouter;
import com.mk.eap.common.domain.ClassDto;
import com.mk.eap.common.domain.Context;
import com.mk.eap.common.domain.InterfaceSerializer;
import com.makajs.erp.sys.itf.ISysInterfaceService;

/**
 * @Title: InterfceServiceImpl.java
 * @Package: com.mk.eap.component.impl
 * @Description: 发现服务实现类
 * @version 1.0
 * 
 *               <p>
 *               发现服务实现类
 *               </p>
 * 
 * @author zl
 * 
 */
@Component
@Service
public class SysInterfceServiceImpl implements ISysInterfaceService {
	@Override
	public ArrayList<ClassDto> interfaceSerializer(String[] interfaceNames) { 
		try {
			return InterfaceSerializer.serialize(interfaceNames);
		} catch (Exception e) { 
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Object notFound(Context context, String payload) {  
		return ApiJsRouter.Handler(context, payload);
	}
 
}
