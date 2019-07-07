package com.makajs.erp.set.constant;

/**
 * 常量枚举
 * @author work
 *
 */
public final class ConstCode {
		
	//操作结果成功
	public static final int OPERATOR_SUCCESS = 0;
	
	//操作结果失败
	public static final int OPERATOR_FAIL = 1;
	
	//注册验证码
	public static final int REGISTER_CODE = 1;
	
	//找回密码验证码
	public static final int FORGOT_PASSWORD_CODE = 2;
	
	//手机或邮箱绑定验证码
	public static final int BIND_CODE = 3;
	
	//验证码正确
	public static final int SUCCESS_CODE = 0;
	
	//验证码错误
	public static final int ERROR_CODE = 1;
	
	//验证码过期
	public static final int INVALID_CODE = 2;
	
	//验证码过期时间30分钟
	public static final long INVALID_TIME_30 = 1800000;
	
	//email标志符号
	public static final String EMAIL_TAG = "@";
	
	/** 用户-企业机构-状态：3：已激活 */
	public static final byte ORGUSER_STATUS_3 = 3;
	
	//用户-性别：0：男
	public static final int USER_SEX_0 = 0;
	
	//用户-性别：1：女
	public static final int USER_SEX_1 = 1;
	
	//用户-性别：2：保密
	public static final int USER_SEX_2 = 2;
	
	/** 
	 * 用户-密码强度：0：弱
	 */
	public static final int USER_PASSWORDSTRENGTH_0 = 0;
	
	/** 
	 * 用户-密码强度：1：中
	 */
	public static final int USER_PASSWORDSTRENGTH_1 = 1;
	
	/** 
	 * 用户-密码强度：2：强
	 */
	public static final int USER_PASSWORDSTRENGTH_2 = 2;
	
	/** 
	 * 用户-安全级别：di：低
	 */
	public static final String USER_SECURITYLEVEL_DI = "低";
	
	/** 
	 * 用户-安全级别：zhong：中
	 */
	public static final String USER_SECURITYLEVEL_ZHONG = "中";
	
	/** 
	 * 用户-安全级别：gao：高
	 */
	public static final String USER_SECURITYLEVEL_GAO = "高";
	
	/** 
	 * 分页参数
	 */
	public static final String STRING_PAGE = "page";
	
	/** 
	 * 列表参数
	 */
	public static final String STRING_LIST = "list";
	
	
}
