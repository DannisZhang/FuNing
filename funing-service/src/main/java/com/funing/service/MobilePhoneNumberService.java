package com.funing.service;

import com.funing.common.model.MobilePhoneNumber;
import com.funing.service.impl.result.PaginationQueryResult;
import com.funing.service.query.QueryParams;

import java.util.List;
import java.util.Map;

/**
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-05-11 20:08
 */
public interface MobilePhoneNumberService {
    /**
     * 根据ID查找手机号码信息
     *
     * @param id 手机号码ID
     * @return 若存在，返回手机号码实体对象；否则返回null
     */
    MobilePhoneNumber queryById(Integer id);

    /**
     * 分页查询手机号码
     *
     * @param queryParams 查询参数
     * @return 查询结果
     */
    PaginationQueryResult<MobilePhoneNumber> queryByPage(QueryParams queryParams);
}
