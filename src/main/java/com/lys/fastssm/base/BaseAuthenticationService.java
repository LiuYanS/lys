package com.lys.fastssm.base;

import com.lys.fastssm.shiro.ShiroToken;

/**
 * 通用认证服务接口
 *
 * @author LYS
 */
public interface BaseAuthenticationService {

	/**
	 * 获取认证信息
	 * @param token
	 * @return
	 */
	ShiroToken getAuthenticationInfo(ShiroToken token);
}
