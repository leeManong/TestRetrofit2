package com.limingjian.testretrofit;

public class RequestParamQueryImages {
    private String imageType;
    private String merchantCode;

    public RequestParamQueryImages(String imageType, String merchantCode) {
        this.imageType = imageType;
        this.merchantCode = merchantCode;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
}
