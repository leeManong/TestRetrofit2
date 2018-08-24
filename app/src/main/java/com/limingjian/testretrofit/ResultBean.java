package com.limingjian.testretrofit;

public class ResultBean {
    /**
     * resultCode : FAIL
     * resultMsg : 您输入的验证码不正确！
     * resultStatus : 1
     */

    private String resultCode;
    private String resultMsg;
    private int resultStatus;
    private String resultData;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public int getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(int resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResultData() {
        return resultData;
    }

    public void setResultData(String resultData) {
        this.resultData = resultData;
    }
}
