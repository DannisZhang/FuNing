package com.funing.web.controller;

import com.funing.common.model.MobilePhoneNumber;
import com.funing.service.MobilePhoneNumberService;
import com.funing.service.impl.result.PaginationQueryResult;
import com.funing.service.query.QueryParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-05-11 20:10
 */
@Controller
@RequestMapping("/mobilePhoneNumber")
public class MobilePhoneNumberController {
    /**
     * 手机号码服务
     */
    @Autowired
    private MobilePhoneNumberService mobilePhoneNumberService;

    /**
     * 分页查询手机号码
     *
     * @param queryParams 查询参数
     * @return 查询结果
     */
    @RequestMapping(value = "queryByPage.json")
    @ResponseBody
    public PaginationQueryResult<?> queryByPage(QueryParams queryParams) {
        return mobilePhoneNumberService.queryByPage(queryParams);
    }
}
