package com.limingjian.testretrofit;

import java.util.List;

/**
 * Created by lmj on 2018/7/4.
 */
public class Response {


    /**
     * SvcCont : {"result":{"resultCode":"SUCCESS","resultData":[{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}],"serverDate":0}}
     * TcpCont : {"ServiceCode":"queryMerchantStarPayRate","SrcSysID":"1003","SrcSysSign":"123456","TransactionID":"1322017119413","srcSysPassWord":"1003"}
     */

    private SvcContBean SvcCont;
    private TcpContBean TcpCont;

    public SvcContBean getSvcCont() {
        return SvcCont;
    }

    public void setSvcCont(SvcContBean SvcCont) {
        this.SvcCont = SvcCont;
    }

    public TcpContBean getTcpCont() {
        return TcpCont;
    }

    public void setTcpCont(TcpContBean TcpCont) {
        this.TcpCont = TcpCont;
    }

    public static class SvcContBean {
        /**
         * result : {"resultCode":"SUCCESS","resultData":[{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}],"serverDate":0}
         */

        private ResultBean result;

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * resultCode : SUCCESS
             * resultData : [{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}]
             * serverDate : 0
             */

            private String resultCode;
            private int serverDate;
            private String resultData;

            public String getResultCode() {
                return resultCode;
            }

            public void setResultCode(String resultCode) {
                this.resultCode = resultCode;
            }

            public int getServerDate() {
                return serverDate;
            }

            public void setServerDate(int serverDate) {
                this.serverDate = serverDate;
            }

            public String getResultData() {
                return resultData;
            }

            public void setResultData(String resultData) {
                this.resultData = resultData;
            }
        }
    }

    public static class TcpContBean {
        /**
         * ServiceCode : queryMerchantStarPayRate
         * SrcSysID : 1003
         * SrcSysSign : 123456
         * TransactionID : 1322017119413
         * srcSysPassWord : 1003
         */

        private String ServiceCode;
        private String SrcSysID;
        private String SrcSysSign;
        private String TransactionID;
        private String srcSysPassWord;

        public String getServiceCode() {
            return ServiceCode;
        }

        public void setServiceCode(String ServiceCode) {
            this.ServiceCode = ServiceCode;
        }

        public String getSrcSysID() {
            return SrcSysID;
        }

        public void setSrcSysID(String SrcSysID) {
            this.SrcSysID = SrcSysID;
        }

        public String getSrcSysSign() {
            return SrcSysSign;
        }

        public void setSrcSysSign(String SrcSysSign) {
            this.SrcSysSign = SrcSysSign;
        }

        public String getTransactionID() {
            return TransactionID;
        }

        public void setTransactionID(String TransactionID) {
            this.TransactionID = TransactionID;
        }

        public String getSrcSysPassWord() {
            return srcSysPassWord;
        }

        public void setSrcSysPassWord(String srcSysPassWord) {
            this.srcSysPassWord = srcSysPassWord;
        }
    }
}
