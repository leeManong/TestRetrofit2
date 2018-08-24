package com.limingjian.testretrofit;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * desc:
 *
 * @author Bian
 * create at 2018/4/17 16:03
 */
public class ResMessageBean {
    @JSONField(name="SvcCont")
    private SvcContBean svcContBean;
    @JSONField(name="tcpCont")
    private TcpContBean tcpContBean;

    public SvcContBean getSvcContBean() {
        return svcContBean;
    }

    public void setSvcContBean(SvcContBean svcContBean) {
        this.svcContBean = svcContBean;
    }

    public TcpContBean getTcpContBean() {
        return tcpContBean;
    }

    public void setTcpContBean(TcpContBean tcpContBean) {
        this.tcpContBean = tcpContBean;
    }

}
