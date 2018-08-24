package com.limingjian.testretrofit;

public class RequestParamMerchantCode {
    private String merchantCode;

    public RequestParamMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
}
