package com.makajs.erp.sys.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
	private static final String STRING_TITLE = "发生异常";
	private static final String STRING_PARAM_TITLE = "现场参数：%s";
	private static final String STRING_TIP = "异常信息：";
	private static final String STRING_L = "-";
	private static final String STRING_ENTER = "\r\n";
	private static final String STRING_LINE = "==================================";
	
	/**
	 * 输出对象所有字段
	 * @param object
	 * @return
	 */
	public static void printLog(Class<? extends Object> clazz, Exception ex, String message, String paramStr){
		Logger log = LoggerFactory.getLogger(clazz);
		if(null != message && message.trim().length() > 0){
			message = message + STRING_L + STRING_TITLE;
		}else{
			message = STRING_TITLE;
		}
		if(null != paramStr && paramStr.length() > 0){
			paramStr = String.format(STRING_PARAM_TITLE, paramStr);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(STRING_ENTER);
		sb.append(STRING_LINE);
		sb.append(message);
		sb.append(STRING_LINE);
		sb.append(STRING_ENTER);
		sb.append(paramStr);
		sb.append(STRING_ENTER);
		sb.append(STRING_ENTER);
		sb.append(STRING_TIP);
		log.error(sb.toString());
		log.error(log.getName(), ex);
		sb = new StringBuilder();
		sb.append(STRING_ENTER);
		sb.append(STRING_LINE);
		sb.append(STRING_LINE);
		sb.append(STRING_ENTER);
		log.error(sb.toString());
	}

	public static void main(String[] args) {

	}

}
