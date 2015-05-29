package com.zheyuan.web.controller.param;

import java.util.List;

/**
 * 手机号码查询参数
 *
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-05-27 21:13
 */
public class MobilePhoneNumberParam {
    /**
     * 运营商列表
     */
    private List<String> operators;
    /**
     * 归属地
     */
    private String attribution;
    /**
     * 价格范围
     */
    private String priceRange;
    /**
     * 号码规律
     */
    private String numberRule;
    /**
     * 包含数字
     */
    private String containNumeric;
    /**
     * 输入的包含数字是否是尾数
     */
    private String isEndNumeric;

    public List<String> getOperators() {
        return operators;
    }

    public void setOperators(List<String> operators) {
        this.operators = operators;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getNumberRule() {
        return numberRule;
    }

    public void setNumberRule(String numberRule) {
        this.numberRule = numberRule;
    }

    public String getContainNumeric() {
        return containNumeric;
    }

    public void setContainNumeric(String containNumeric) {
        this.containNumeric = containNumeric;
    }

    public String getIsEndNumeric() {
        return isEndNumeric;
    }

    public void setIsEndNumeric(String isEndNumeric) {
        this.isEndNumeric = isEndNumeric;
    }
}
