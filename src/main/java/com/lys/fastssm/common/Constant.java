package com.lys.fastssm.common;

import java.nio.charset.Charset;

/**
 *常量
 * @author LYS
 */
public class Constant {

	/**
	 * 字符集 utf-8
	 */
	public static final Charset CHARSET_UTF_8 = Charset.forName("UTF-8");
	
	public static final String RESPONSE_KEY_CODE = "code";
	
	public static final String RESPONSE_KEY_MSG = "msg";
	
	public static final String RESPONSE_KEY_DATA = "data";
	
	public static final String RESPONSE_CODE_SUCCESS = "success";
	
	public static final String RESPONSE_CODE_ERROR = "error";
	
	public final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public final static String DATE_FORMAT_CHINA = "yyyy年MM月dd日 HH:mm:ss";
	
	public final static String DATE_FORMAT_DATE = "yyyy-MM-dd";
	
	public final static String DATE_FORMAT_TIME = "HH:mm:ss";

	/**
	 * 操作符
	 */
	public final static String OPERATOR_EQUAL = "=";
	public final static String OPERATOR_NOT_EQUAL = "!=";
	public final static String OPERATOR_GREATER_LESS = "<>";
	public final static String OPERATOR_LIKE = "like";
	public final static String OPERATOR_NOT_LIKE = "not like";
	public final static String OPERATOR_GREATER = ">";
	public final static String OPERATOR_GREATER_EQUAL = ">=";
	public final static String OPERATOR_LESS = "<";
	public final static String OPERATOR_LESS_EQUAL = "<=";
	public final static String OPERATOR_IN = "in";
	public final static String OPERATOR_NOT_IN = "not in";
	public final static String OPERATOR_IS_NULL = "isnull";
	public final static String OPERATOR_IS_EMPTY_NULL = "is null";
	public final static String OPERATOR_IS_NOT_NULL = "is not null";

}
