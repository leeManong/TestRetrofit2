package com.limingjian.testretrofit;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * desc:TCPCont 报文对象
 *
 * @author Bian
 * create at 2018/4/17 10:14
 */
public class TcpContBean {
    /**
     * ServiceCode : updateAppUserPersonalInfo
     * SrcSysID : 1003
     * SrcSysSign : 123456
     * TransactionID : 1322017119413
     * srcSysPassWord : 1003
     */

    @JSONField(name = "ServiceCode")
    private String serviceCode;
    @JSONField(name = "SrcSysID")
    private String srcSysID;
    @JSONField(name = "SrcSysPassWord")
    private String srcSysPassWord;
    @JSONField(name = "SrcSysSign")
    private String srcSysSign;
    @JSONField(name = "TransactionID")
    private String transactionID;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getSrcSysID() {
        return srcSysID;
    }

    public void setSrcSysID(String srcSysID) {
        this.srcSysID = srcSysID;
    }

    public String getSrcSysPassWord() {
        return srcSysPassWord;
    }

    public void setSrcSysPassWord(String srcSysPassWord) {
        this.srcSysPassWord = srcSysPassWord;
    }

    public String getSrcSysSign() {
        return srcSysSign;
    }

    public void setSrcSysSign(String srcSysSign) {
        this.srcSysSign = srcSysSign;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
}
