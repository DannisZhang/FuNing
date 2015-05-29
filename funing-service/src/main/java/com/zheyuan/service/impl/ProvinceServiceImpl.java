package com.zheyuan.service.impl;

import com.zheyuan.manager.CityManager;
import com.zheyuan.manager.ProvinceManager;
import com.zheyuan.service.ProvinceService;
import com.zheyuan.common.model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dannis
 * @version 1.0.0
 * @date 2015-05-29 23:51
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    /**
     * 省份管理类
     */
    @Autowired
    private ProvinceManager provinceManager;
    /**
     * 城市管理类
     */
    @Autowired
    private CityManager cityManager;

    @Override
    public List<Province> queryAllProvinces() {
        List<Province> provinces = provinceManager.queryAllProvinces();
        if (provinces != null && provinces.size() > 0) {
            for (Province province : provinces) {
                province.setCities(cityManager.queryCityByProvinceCode(province.getCode()));
            }
        }
        return provinces;
    }
}
