package com.zheyuan.manager;

import com.zheyuan.common.model.MobilePhoneNumber;
import com.zheyuan.dal.db.MobilePhoneNumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 手机号码管理类
 *
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-04-26 14:18
 */
@Component
public class MobilePhoneNumberManager {
    /**
     * 手机号码mapper
     */
    @Autowired
    private MobilePhoneNumberMapper mobilePhoneNumberMapper;

    /**
     * 根据ID查找手机号码信息
     *
     * @param id 手机号码ID
     * @return 手机号码
     */
    public MobilePhoneNumber queryById(Integer id) {
        return mobilePhoneNumberMapper.queryById(id);
    }

    /**
     * 分页查询手机号码信息
     *
     * @param queryParams 分页查询参数
     * @return 手机号码实体对象列表
     */
    public List<MobilePhoneNumber> queryByPage(Map<String, Object> queryParams) {
        return mobilePhoneNumberMapper.queryByPage(queryParams);
    }

    /**
     * 查询符合条件的手机号码总数
     *
     * @param queryParams 查询参数
     * @return 符合条件的手机号码总数
     */
    public long queryTotal(Map<String, Object> queryParams) {
        return mobilePhoneNumberMapper.queryTotal(queryParams);
    }
}
