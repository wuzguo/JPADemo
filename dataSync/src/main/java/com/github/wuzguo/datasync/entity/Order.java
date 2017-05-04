package com.github.wuzguo.datasync.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name = "t_order")
@NamedQuery(name = "Order.findAll", query = "SELECT o FROM Order o")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "order_num")
    private String orderNum;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "gate2station_fee")
    private Double gate2stationFee;

    @Column(name = "get_method")
    private String getMethod;

    @Column(name = "goods_amount")
    private int goodsAmount;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_size")
    private String goodsSize;

    @Column(name = "goods_weight")
    private Double goodsWeight;

    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "receive_area")
    private String receiveArea;

    @Column(name = "receive_city")
    private String receiveCity;

    @Column(name = "receive_province")
    private String receiveProvince;

    @Column(name = "receive_station_name")
    private String receiveStationName;

    @Column(name = "receive_station_telegraph_code")
    private String receiveStationTelegraphCode;

    @Column(name = "receiver_address")
    private String receiverAddress;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_phone")
    private String receiverPhone;

    @Column(name = "send_province")
    private String sendProvince;

    @Column(name = "send_station_name")
    private String sendStationName;

    @Column(name = "send_station_telegraph_code")
    private String sendStationTelegraphCode;

    @Column(name = "sender_address")
    private String senderAddress;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "sender_phone")
    private String senderPhone;

    @Column(name = "station2gate_fee")
    private Double station2gateFee;

    @Column(name = "station2station_fee")
    private Double station2stationFee;

    @Column(name = "total_fee")
    private Double totalFee;

    @Column(name = "goods_ticket_no")
    private String goodsTicketNo;

    public Order() {
    }

    public String getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getGate2stationFee() {
        return this.gate2stationFee;
    }

    public void setGate2stationFee(Double gate2stationFee) {
        this.gate2stationFee = gate2stationFee;
    }

    public String getGetMethod() {
        return this.getMethod;
    }

    public void setGetMethod(String getMethod) {
        this.getMethod = getMethod;
    }

    public int getGoodsAmount() {
        return this.goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSize() {
        return this.goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public Double getGoodsWeight() {
        return this.goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Long getMessageId() {
        return this.messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getReceiveArea() {
        return this.receiveArea;
    }

    public void setReceiveArea(String receiveArea) {
        this.receiveArea = receiveArea;
    }

    public String getReceiveCity() {
        return this.receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
    }

    public String getReceiveProvince() {
        return this.receiveProvince;
    }

    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince;
    }

    public String getReceiveStationName() {
        return this.receiveStationName;
    }

    public void setReceiveStationName(String receiveStationName) {
        this.receiveStationName = receiveStationName;
    }

    public String getReceiveStationTelegraphCode() {
        return this.receiveStationTelegraphCode;
    }

    public void setReceiveStationTelegraphCode(String receiveStationTelegraphCode) {
        this.receiveStationTelegraphCode = receiveStationTelegraphCode;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getSendProvince() {
        return this.sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince;
    }

    public String getSendStationName() {
        return this.sendStationName;
    }

    public void setSendStationName(String sendStationName) {
        this.sendStationName = sendStationName;
    }

    public String getSendStationTelegraphCode() {
        return this.sendStationTelegraphCode;
    }

    public void setSendStationTelegraphCode(String sendStationTelegraphCode) {
        this.sendStationTelegraphCode = sendStationTelegraphCode;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return this.senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public Double getStation2gateFee() {
        return this.station2gateFee;
    }

    public void setStation2gateFee(Double station2gateFee) {
        this.station2gateFee = station2gateFee;
    }

    public Double getStation2stationFee() {
        return this.station2stationFee;
    }

    public void setStation2stationFee(Double station2stationFee) {
        this.station2stationFee = station2stationFee;
    }

    public Double getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public String getGoodsTicketNo() {
        return goodsTicketNo;
    }

    public void setGoodsTicketNo(String goodsTicketNo) {
        this.goodsTicketNo = goodsTicketNo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum='" + orderNum + '\'' +
                ", createTime=" + createTime +
                ", gate2stationFee=" + gate2stationFee +
                ", getMethod='" + getMethod + '\'' +
                ", goodsAmount=" + goodsAmount +
                ", goodsName='" + goodsName + '\'' +
                ", goodsSize='" + goodsSize + '\'' +
                ", goodsWeight=" + goodsWeight +
                ", messageId=" + messageId +
                ", receiveArea='" + receiveArea + '\'' +
                ", receiveCity='" + receiveCity + '\'' +
                ", receiveProvince='" + receiveProvince + '\'' +
                ", receiveStationName='" + receiveStationName + '\'' +
                ", receiveStationTelegraphCode='" + receiveStationTelegraphCode + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", sendProvince='" + sendProvince + '\'' +
                ", sendStationName='" + sendStationName + '\'' +
                ", sendStationTelegraphCode='" + sendStationTelegraphCode + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderPhone='" + senderPhone + '\'' +
                ", station2gateFee=" + station2gateFee +
                ", station2stationFee=" + station2stationFee +
                ", totalFee=" + totalFee +
                ", goodsTicketNo='" + goodsTicketNo + '\'' +
                '}';
    }
}