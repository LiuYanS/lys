package com.lys.fastssm.base;

import tk.mybatis.mapper.common.Mapper;


/**
 * mapper基础类
 * 继承了mybatis的一些对数据库操作的方法
 * @author LYS
 */
public interface BaseMapper<T> extends Mapper<T> {

}
