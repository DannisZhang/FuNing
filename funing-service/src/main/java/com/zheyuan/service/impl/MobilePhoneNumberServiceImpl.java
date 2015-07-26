package com.zheyuan.service.impl;

import com.zheyuan.common.model.MobilePhoneNumber;
import com.zheyuan.manager.MobilePhoneNumberManager;
import com.zheyuan.service.MobilePhoneNumberService;
import com.zheyuan.service.impl.result.PaginationQueryResult;
import com.zheyuan.service.query.QueryParams;
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

    @Override
    public MobilePhoneNumber queryByNumber(String number) {
        return mobilePhoneNumberManager.queryByNumber(number);
    }

    public PaginationQueryResult<MobilePhoneNumber> queryByPage(QueryParams queryParams) {
        PaginationQueryResult<MobilePhoneNumber> result = new PaginationQueryResult<>();
        if (null == queryParams) {
            result.setMessage("未指定查询参数");
            return result;
        }
        String operators = (String) queryParams.getParams().get("operators");
        if (operators != null && !"".equals(operators.trim())) {
            queryParams.getParams().put("operators", operators.split(","));
        }
        String attributions = (String) queryParams.getParams().get("attributions");
        if (attributions != null && !"".equals(attributions.trim())) {
            queryParams.getParams().put("attributions", attributions.split(","));
        }
        result.setTotal(mobilePhoneNumberManager.queryTotal(queryParams.getParams()));
        result.setRows(mobilePhoneNumberManager.queryByPage(queryParams.getParams()));

        return result;
    }
}
