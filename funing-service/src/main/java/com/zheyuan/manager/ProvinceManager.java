package com.zheyuan.manager;

import com.zheyuan.common.model.Province;
import com.zheyuan.dal.db.ProvinceMapper;
import com.zheyuan.dal.entity.ProvinceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 省份管理类
 *
 * @author Dannis
 * @version 1.0.0
 * @date 2015-05-29 23:36
 */
@Component
public class ProvinceManager {
    /**
     * 省份mapper
     */
    @Autowired
    private ProvinceMapper provinceMapper;

    /**
     * 查询所有省份
     *
     * @return 省份列表
     */
    public List<Province> queryAllProvinces() {
        return convertToModels(provinceMapper.queryAllProvinces());
    }

    private List<Province> convertToModels(List<ProvinceEntity> provinceEntities) {
        List<Province> provinces = new ArrayList<>();
        if (provinceEntities != null && provinceEntities.size() > 0) {
            for (ProvinceEntity provinceEntity : provinceEntities) {
                provinces.add(convertToModel(provinceEntity));
            }
        }
        return provinces;
    }

    private Province convertToModel(ProvinceEntity provinceEntity) {
        Province province = null;
        if (provinceEntity != null) {
            province = new Province();
            province.setName(provinceEntity.getName());
            province.setCode(provinceEntity.getCode());
        }
        return province;
    }
}
