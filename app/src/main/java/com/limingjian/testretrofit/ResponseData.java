package com.limingjian.testretrofit;

public class ResponseData {


    /**
     * SvcCont : {"Message":{"messageType":"voice","resultCode":"SUCCESS","serverDate":"1234556777665","resultData":"消息已收到","transactionID":"1322017119413"}}
     * TcpCont : {"ServiceType":"back","MsgSender":"1003","MsgReceiver":"123456","TransactionID":"1322017119413","ChannelId":"1003","SendTime":"21312384776","Sign":"123"}
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
         * Message : {"messageType":"voice","resultCode":"SUCCESS","serverDate":"1234556777665","resultData":"消息已收到","transactionID":"1322017119413"}
         */

        private MessageBean Message;

        public MessageBean getMessage() {
            return Message;
        }

        public void setMessage(MessageBean Message) {
            this.Message = Message;
        }

        public static class MessageBean {
            /**
             * messageType : voice
             * resultCode : SUCCESS
             * serverDate : 1234556777665
             * resultData : 消息已收到
             * transactionID : 1322017119413
             */

            private String messageType;
            private String resultCode;
            private String serverDate;
            private String resultData;
            private String transactionID;
            private String data;
            private String resultMsg;

            public String getMessageType() {
                return messageType;
            }

            public void setMessageType(String messageType) {
                this.messageType = messageType;
            }

            public String getResultCode() {
                return resultCode;
            }

            public void setResultCode(String resultCode) {
                this.resultCode = resultCode;
            }

            public String getServerDate() {
                return serverDate;
            }

            public void setServerDate(String serverDate) {
                this.serverDate = serverDate;
            }

            public String getResultData() {
                return resultData;
            }

            public void setResultData(String resultData) {
                this.resultData = resultData;
            }

            public String getTransactionID() {
                return transactionID;
            }

            public void setTransactionID(String transactionID) {
                this.transactionID = transactionID;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getResultMsg() {
                return resultMsg;
            }

            public void setResultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
            }
        }
    }

    public static class TcpContBean {
        /**
         * ServiceType : back
         * MsgSender : 1003
         * MsgReceiver : 123456
         * TransactionID : 1322017119413
         * ChannelId : 1003
         * SendTime : 21312384776
         * Sign : 123
         */

        private String ServiceType;
        private String MsgSender;
        private String MsgReceiver;
        private String TransactionID;
        private String ChannelId;
        private String SendTime;
        private String Sign;

        public String getServiceType() {
            return ServiceType;
        }

        public void setServiceType(String ServiceType) {
            this.ServiceType = ServiceType;
        }

        public String getMsgSender() {
            return MsgSender;
        }

        public void setMsgSender(String MsgSender) {
            this.MsgSender = MsgSender;
        }

        public String getMsgReceiver() {
            return MsgReceiver;
        }

        public void setMsgReceiver(String MsgReceiver) {
            this.MsgReceiver = MsgReceiver;
        }

        public String getTransactionID() {
            return TransactionID;
        }

        public void setTransactionID(String TransactionID) {
            this.TransactionID = TransactionID;
        }

        public String getChannelId() {
            return ChannelId;
        }

        public void setChannelId(String ChannelId) {
            this.ChannelId = ChannelId;
        }

        public String getSendTime() {
            return SendTime;
        }

        public void setSendTime(String SendTime) {
            this.SendTime = SendTime;
        }

        public String getSign() {
            return Sign;
        }

        public void setSign(String Sign) {
            this.Sign = Sign;
        }
    }
}
