package com.funing.service.impl;

import com.funing.common.model.MobilePhoneNumber;
import com.funing.manager.MobilePhoneNumberManager;
import com.funing.service.MobilePhoneNumberService;
import com.funing.service.impl.result.PaginationQueryResult;
import com.funing.service.query.QueryParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-05-11 20:09
 */
@Service
public class MobilePhoneNumberServiceImpl implements MobilePhoneNumberService {
    /**
     * 手机号码管理类
     */
    @Autowired
    private MobilePhoneNumberManager mobilePhoneNumberManager;

    public MobilePhoneNumber queryById(Integer id) {
        return mobilePhoneNumberManager.queryById(id);
    }

    public PaginationQueryResult<MobilePhoneNumber> queryByPage(QueryParams queryParams) {
        PaginationQueryResult<MobilePhoneNumber> result = new PaginationQueryResult<>();
        if (null == queryParams) {
            result.setMessage("未指定查询参数");
            return result;
        }
        result.setTotal(mobilePhoneNumberManager.queryTotal(queryParams.getParams()));
        result.setRows(mobilePhoneNumberManager.queryByPage(queryParams.getParams()));

        return result;
    }
}
