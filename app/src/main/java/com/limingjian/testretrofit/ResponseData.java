package com.limingjian.testretrofit;

public class ResponseData {


    /**
     * SvcCont : {"result":{"resultCode":"SUCCESS","resultMsg":"保存成功","resultData":[{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}],"serverDate":0}}
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
         * result : {"resultCode":"SUCCESS","resultMsg":"保存成功","resultData":[{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}],"serverDate":0}
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
             * resultMsg : 保存成功
             * resultData : [{"createDt":1530169729000,"fee_rat":"0.3","fee_rat1":"0.3","fee_rat1_scan":"0.6","fee_rat2_scan":"0.5","fee_rat_scan":"0.5","id":1,"max_fee_amt":"5000","merchantCode":"3W3258","updateDt":1530169732000}]
             * serverDate : 0
             */

            private String resultCode;
            private String resultMsg;
            private int serverDate;
            private Object resultData;

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

            public int getServerDate() {
                return serverDate;
            }

            public void setServerDate(int serverDate) {
                this.serverDate = serverDate;
            }

            public Object getResultData() {
                return resultData;
            }

            public void setResultData(Object resultData) {
                this.resultData = resultData;
            }

            public static class ResultDataBean {
                /**
                 * createDt : 1530169729000
                 * fee_rat : 0.3
                 * fee_rat1 : 0.3
                 * fee_rat1_scan : 0.6
                 * fee_rat2_scan : 0.5
                 * fee_rat_scan : 0.5
                 * id : 1
                 * max_fee_amt : 5000
                 * merchantCode : 3W3258
                 * updateDt : 1530169732000
                 */

                private long createDt;
                private String fee_rat;
                private String fee_rat1;
                private String fee_rat1_scan;
                private String fee_rat2_scan;
                private String fee_rat_scan;
                private int id;
                private String max_fee_amt;
                private String merchantCode;
                private long updateDt;

                public long getCreateDt() {
                    return createDt;
                }

                public void setCreateDt(long createDt) {
                    this.createDt = createDt;
                }

                public String getFee_rat() {
                    return fee_rat;
                }

                public void setFee_rat(String fee_rat) {
                    this.fee_rat = fee_rat;
                }

                public String getFee_rat1() {
                    return fee_rat1;
                }

                public void setFee_rat1(String fee_rat1) {
                    this.fee_rat1 = fee_rat1;
                }

                public String getFee_rat1_scan() {
                    return fee_rat1_scan;
                }

                public void setFee_rat1_scan(String fee_rat1_scan) {
                    this.fee_rat1_scan = fee_rat1_scan;
                }

                public String getFee_rat2_scan() {
                    return fee_rat2_scan;
                }

                public void setFee_rat2_scan(String fee_rat2_scan) {
                    this.fee_rat2_scan = fee_rat2_scan;
                }

                public String getFee_rat_scan() {
                    return fee_rat_scan;
                }

                public void setFee_rat_scan(String fee_rat_scan) {
                    this.fee_rat_scan = fee_rat_scan;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getMax_fee_amt() {
                    return max_fee_amt;
                }

                public void setMax_fee_amt(String max_fee_amt) {
                    this.max_fee_amt = max_fee_amt;
                }

                public String getMerchantCode() {
                    return merchantCode;
                }

                public void setMerchantCode(String merchantCode) {
                    this.merchantCode = merchantCode;
                }

                public long getUpdateDt() {
                    return updateDt;
                }

                public void setUpdateDt(long updateDt) {
                    this.updateDt = updateDt;
                }
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
