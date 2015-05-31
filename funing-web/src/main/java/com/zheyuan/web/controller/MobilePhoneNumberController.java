package com.zheyuan.web.controller;

import com.zheyuan.common.model.MobilePhoneNumber;
import com.zheyuan.common.util.DateUtil;
import com.zheyuan.service.MobilePhoneNumberService;
import com.zheyuan.service.impl.result.PaginationQueryResult;
import com.zheyuan.service.impl.result.SingleQueryResult;
import com.zheyuan.service.query.QueryParams;
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

    @RequestMapping(value = "/queryDetail.ajax")
    @ResponseBody
    public SingleQueryResult<?> queryDetail(String number) {
        SingleQueryResult<MobilePhoneNumber> result = new SingleQueryResult<>();
        try {
            MobilePhoneNumber mobilePhoneNumber = mobilePhoneNumberService.queryByNumber(number);
            if (mobilePhoneNumber != null) {
                mobilePhoneNumber.setCreatedOnStr(DateUtil.dateToStr(mobilePhoneNumber.getCreatedOn()));
                result.setData(mobilePhoneNumber);
                result.setSuccess(true);
            } else {
                result.setMessage("号码不存在！");
                result.setSuccess(false);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("查询失败");
            System.out.println("查询失败" + e);
        }
        return result;
    }

    /**
     * 分页查询手机号码
     *
     * @param queryParams 查询参数
     * @return 查询结果
     */
    @RequestMapping(value = "queryByPage.ajax")
    @ResponseBody
    public PaginationQueryResult<?> queryByPage(QueryParams queryParams) {
        PaginationQueryResult<MobilePhoneNumber> result = new PaginationQueryResult<>();
        if (queryParams != null) {
            result = mobilePhoneNumberService.queryByPage(queryParams);
        }
        return result;
    }
}
