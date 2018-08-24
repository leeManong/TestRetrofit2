package com.limingjian.testretrofit;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * desc:   SVC 对象
 *
 * @author Bian
 * create at 2018/4/17 10:17
 */
public class SvcContBean {
    @JSONField(name = "PARAMS")
    private Object params;


    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @JSONField(name = "result")
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
