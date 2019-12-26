package com.lys.fastssm.callback;

/**
 * ActionCallback
 *
 * @author LYS
 * @param <T> 类型
 */
public interface ActionCallback<T> {
	/**
	 * 回调函数
	 * @param t 对象
	 */
	void callback(T t);
}
