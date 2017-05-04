package com.github.wuzguo.datasync.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "t_order_track")
@NamedQuery(name = "OrderTrack.findAll", query = "SELECT o FROM OrderTrack o")
public class OrderTrack implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "begin_bureau_code")
    private String beginBureauCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "end_bureau_code")
    private String endBureauCode;

    @Column(name = "flow_name")
    private String flowName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "input_time")
    private Date inputTime;

    private String jjcc;

    @Temporal(TemporalType.TIMESTAMP)
    private Date jjsj;

    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "order_num")
    private String orderNum;

    private String remark;

    @Column(name = "status_operater")
    private String statusOperater;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "status_time")
    private Date statusTime;

    @Column(name = "train_no")
    private String trainNo;

    @Column(name = "train_num")
    private String trainNum;

    public OrderTrack() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeginBureauCode() {
        return this.beginBureauCode;
    }

    public void setBeginBureauCode(String beginBureauCode) {
        this.beginBureauCode = beginBureauCode;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getEndBureauCode() {
        return this.endBureauCode;
    }

    public void setEndBureauCode(String endBureauCode) {
        this.endBureauCode = endBureauCode;
    }

    public String getFlowName() {
        return this.flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public Date getInputTime() {
        return this.inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getJjcc() {
        return this.jjcc;
    }

    public void setJjcc(String jjcc) {
        this.jjcc = jjcc;
    }

    public Date getJjsj() {
        return this.jjsj;
    }

    public void setJjsj(Date jjsj) {
        this.jjsj = jjsj;
    }

    public Long getMessageId() {
        return this.messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatusOperater() {
        return this.statusOperater;
    }

    public void setStatusOperater(String statusOperater) {
        this.statusOperater = statusOperater;
    }

    public Date getStatusTime() {
        return this.statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public String getTrainNo() {
        return this.trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainNum() {
        return this.trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    @Override
    public String toString() {
        return "OrderTrack{" +
                "id='" + id + '\'' +
                ", beginBureauCode='" + beginBureauCode + '\'' +
                ", createTime=" + createTime +
                ", departureDate=" + departureDate +
                ", endBureauCode='" + endBureauCode + '\'' +
                ", flowName='" + flowName + '\'' +
                ", inputTime=" + inputTime +
                ", jjcc='" + jjcc + '\'' +
                ", jjsj=" + jjsj +
                ", messageId=" + messageId +
                ", orderNum='" + orderNum + '\'' +
                ", remark='" + remark + '\'' +
                ", statusOperater='" + statusOperater + '\'' +
                ", statusTime=" + statusTime +
                ", trainNo='" + trainNo + '\'' +
                ", trainNum='" + trainNum + '\'' +
                '}';
    }
}