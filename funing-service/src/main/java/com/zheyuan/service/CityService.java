package com.zheyuan.service;

import com.zheyuan.common.model.City;

import java.util.List;

/**
 * 城市服务类
 *
 * @author Dannis
 * @version 1.0.0
 * @date 2015-05-29 01:03
 */
public interface CityService {
    /**
     * 查询所有城市
     *
     * @return 所有城市列表
     */
    List<City> queryAllCities();

    /**
     * 根据省份编码查询城市
     *
     * @param provinceCode 省份编码
     * @return 城市列表
     */
    List<City> queryCityByProvinceCode(String provinceCode);

    /**
     * 根据城市名称查找城市编码
     *
     * @param cityName 城市名称
     * @return 城市编码
     */
    String queryCityCodeByName(String cityName);
}
