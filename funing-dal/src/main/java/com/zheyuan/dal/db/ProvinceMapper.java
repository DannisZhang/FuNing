package com.zheyuan.dal.db;


import com.zheyuan.dal.entity.ProvinceEntity;

import java.util.List;

/**
 * 省份mapper
 *
 * @author Dannis
 * @version 1.0.0
 * @date 2015-05-29 23:21
 */
public interface ProvinceMapper {
    /**
     * 查询所有省份
     *
     * @return 省份列表
     */
    List<ProvinceEntity> queryAllProvinces();
}
