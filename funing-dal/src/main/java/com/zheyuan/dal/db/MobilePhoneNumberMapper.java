package com.zheyuan.dal.db;

import com.zheyuan.common.model.MobilePhoneNumber;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 手机号码mapper类
 *
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-04-26 13:33
 */
@Component
public interface MobilePhoneNumberMapper {
    /**
     * 根据ID查找手机号码信息
     *
     * @param id 手机号码ID
     * @return 若存在，返回手机号码实体对象；否则返回null
     */
    MobilePhoneNumber queryById(Integer id);

    /**
     * 根据号码查询手机号码信息
     *
     * @param number 手机号码
     * @return 若存在，返回手机号码信息对象；否则返回null
     */
    MobilePhoneNumber queryByNumber(String number);

    /**
     * 分页查询符合查询条件的手机号码
     *
     * @param queryParams 分页查询参数
     * @return 手机号码列表
     */
    List<MobilePhoneNumber> queryByPage(Map<String, Object> queryParams);

    /**
     * 查询符合条件的手机号码总数
     *
     * @param queryParams 查询参数
     * @return 符合条件的手机号码总数
     */
    long queryTotal(Map<String, Object> queryParams);
}
