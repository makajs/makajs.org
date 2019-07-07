package com.makajs.erp.set.constant;

import com.mk.eap.common.domain.BusinessException;

/**
 * 错误码枚举
 * @author work
 *
 */
public final class ErrorCode { 
	public static final BusinessException SERVICE_ERROR = new BusinessException("50000","哎呀，操作发生错误了，您可以稍后重试哦!");
	public static final BusinessException PARAM_ERROR = new BusinessException("50001","参数错误!");
	public static final BusinessException LOGIN_FAIL_PLEASE_INPUT_USERANDPASSWORD = new BusinessException("40001","请输入用户名和密码!");
	public static final BusinessException LOGIN_FAIL_USERNAME_PASSWORD_WRONG = new BusinessException("40002","账户名与密码不匹配，请重新输入!");
	public static final BusinessException LOGIN_FAIL_ACCOUNT_NOT_FOUND = new BusinessException("40003","用户不存在，请重新输入!");
	public static final BusinessException LOGIN_FAIL_LOGIN_ERROR_MAX_NUM = new BusinessException("40004","登录已超过最大次数!");
	public static final BusinessException REGISTER_FAIL_ACCOUNT_EXIST = new BusinessException("40005","账号已经存在!");
	
	
}
