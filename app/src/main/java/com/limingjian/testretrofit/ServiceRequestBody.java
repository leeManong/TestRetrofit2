package com.limingjian.testretrofit;

import com.google.gson.annotations.SerializedName;

public class ServiceRequestBody {

    @SerializedName("SvcCont")
    private SvcContBean mSvcContBean;
    @SerializedName("TcpCont")
    private TcpContBean mTcpContBean;

    public SvcContBean getSvcContBean() {
        return mSvcContBean;
    }

    public void setSvcContBean(SvcContBean svcContBean) {
        mSvcContBean = svcContBean;
    }

    public TcpContBean getTcpContBean() {
        return mTcpContBean;
    }

    public void setTcpContBean(TcpContBean tcpContBean) {
        mTcpContBean = tcpContBean;
    }
}
