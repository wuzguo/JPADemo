package com.github.wuzguo.api.vo;


import com.github.wuzguo.datasync.entity.OrderTrack;

/**
 * Intellij IDEA 2016.2
 *
 * @描述 订单物流信息对象
 * @作者 wzguo
 * @版本 1.0.0
 * @日期 2016.11.30
 */
public class OrderTrackVo {

    private String id;

    private String beginBureauCode;

    private String createTime;

    private String departureDate;

    private String endBureauCode;

    private String flowName;

    private String inputTime;

    private String jjcc;

    private String jjsj;

    private Long messageId;

    private String orderNum;

    private String remark;

    private String statusOperater;

    private String statusTime;

    private String trainNo;

    private String trainNum;


    public OrderTrackVo() {
    }

    public OrderTrackVo(String id, String beginBureauCode) {
        this.id = id;
        this.beginBureauCode = beginBureauCode;
    }

    public OrderTrackVo(OrderTrack orderTrack) {
        if (orderTrack != null) {
            this.id = orderTrack.getId();
            this.beginBureauCode = orderTrack.getBeginBureauCode();
            this.endBureauCode = orderTrack.getEndBureauCode();
            this.flowName = orderTrack.getFlowName();
            this.jjcc = orderTrack.getJjcc();
            this.messageId = orderTrack.getMessageId();
            this.orderNum = orderTrack.getOrderNum();
            this.remark = orderTrack.getRemark();
            this.statusOperater = orderTrack.getStatusOperater();
            this.trainNo = orderTrack.getTrainNo();
            this.trainNum = orderTrack.getTrainNum();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeginBureauCode() {
        return beginBureauCode;
    }

    public void setBeginBureauCode(String beginBureauCode) {
        this.beginBureauCode = beginBureauCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getEndBureauCode() {
        return endBureauCode;
    }

    public void setEndBureauCode(String endBureauCode) {
        this.endBureauCode = endBureauCode;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getJjcc() {
        return jjcc;
    }

    public void setJjcc(String jjcc) {
        this.jjcc = jjcc;
    }

    public String getJjsj() {
        return jjsj;
    }

    public void setJjsj(String jjsj) {
        this.jjsj = jjsj;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatusOperater() {
        return statusOperater;
    }

    public void setStatusOperater(String statusOperater) {
        this.statusOperater = statusOperater;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    @Override
    public String toString() {
        return "OrderTrackVo{" +
                "id='" + id + '\'' +
                ", beginBureauCode='" + beginBureauCode + '\'' +
                ", createTime='" + createTime + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", endBureauCode='" + endBureauCode + '\'' +
                ", flowName='" + flowName + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", jjcc='" + jjcc + '\'' +
                ", jjsj='" + jjsj + '\'' +
                ", messageId=" + messageId +
                ", orderNum='" + orderNum + '\'' +
                ", remark='" + remark + '\'' +
                ", statusOperater='" + statusOperater + '\'' +
                ", statusTime='" + statusTime + '\'' +
                ", trainNo='" + trainNo + '\'' +
                ", trainNum='" + trainNum + '\'' +
                '}';
    }
}
