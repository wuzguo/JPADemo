package com.github.wuzguo.datasync.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "t_order")
@NamedQuery(name = "MOrder.findAll", query = "SELECT o FROM MOrder o")
public class MOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "order_num")
    private String ddh;

    @Column(name = "goods_ticket_no")
    private String ydh;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime = new Date();

    @Column(name = "gate2station_fee")
    private Double mdzfy;

    @Column(name = "get_method")
    private String qhfs;

    @Column(name = "goods_amount")
    private int sl;

    @Column(name = "goods_name")
    private String wpmc;

    @Column(name = "goods_size")
    private String cc;

    @Column(name = "goods_weight")
    private Double zzl;

    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "receive_area")
    private String shqx;

    @Column(name = "receive_city")
    private String shshi;

    @Column(name = "receive_province")
    private String shsheng;

    @Column(name = "receive_station_name")
    private String dzzm;

    @Column(name = "receive_station_telegraph_code")
    private String dzdm;

    @Column(name = "receiver_address")
    private String shrxxdz;

    @Column(name = "receiver_name")
    private String shrxm;

    @Column(name = "receiver_phone")
    private String shrsjhm;

    @Column(name = "send_province")
    private String fhsheng;

    @Column(name = "send_station_name")
    private String fzzm;

    @Column(name = "send_station_telegraph_code")
    private String fzdm;

    @Column(name = "sender_address")
    private String fhrxxdz;

    @Column(name = "sender_name")
    private String fhrxm;

    @Column(name = "sender_phone")
    private String fhrsjhm;

    @Column(name = "station2gate_fee")
    private Double zdmfy;

    @Column(name = "station2station_fee")
    private Double zdzfy;

    @Column(name = "total_fee")
    private Double zfy;


    public MOrder() {
    }

    public String getDdh() {
        return ddh;
    }

    public void setDdh(String ddh) {
        this.ddh = ddh;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getMdzfy() {
        return mdzfy;
    }

    public void setMdzfy(Double mdzfy) {
        this.mdzfy = mdzfy;
    }

    public String getQhfs() {
        return qhfs;
    }

    public void setQhfs(String qhfs) {
        this.qhfs = qhfs;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getWpmc() {
        return wpmc;
    }

    public void setWpmc(String wpmc) {
        this.wpmc = wpmc;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Double getZzl() {
        return zzl;
    }

    public void setZzl(Double zzl) {
        this.zzl = zzl;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getShqx() {
        return shqx;
    }

    public void setShqx(String shqx) {
        this.shqx = shqx;
    }

    public String getShshi() {
        return shshi;
    }

    public void setShshi(String shshi) {
        this.shshi = shshi;
    }

    public String getShsheng() {
        return shsheng;
    }

    public void setShsheng(String shsheng) {
        this.shsheng = shsheng;
    }

    public String getDzzm() {
        return dzzm;
    }

    public void setDzzm(String dzzm) {
        this.dzzm = dzzm;
    }

    public String getDzdm() {
        return dzdm;
    }

    public void setDzdm(String dzdm) {
        this.dzdm = dzdm;
    }

    public String getShrxxdz() {
        return shrxxdz;
    }

    public void setShrxxdz(String shrxxdz) {
        this.shrxxdz = shrxxdz;
    }

    public String getShrxm() {
        return shrxm;
    }

    public void setShrxm(String shrxm) {
        this.shrxm = shrxm;
    }

    public String getShrsjhm() {
        return shrsjhm;
    }

    public void setShrsjhm(String shrsjhm) {
        this.shrsjhm = shrsjhm;
    }

    public String getFhsheng() {
        return fhsheng;
    }

    public void setFhsheng(String fhsheng) {
        this.fhsheng = fhsheng;
    }

    public String getFzzm() {
        return fzzm;
    }

    public void setFzzm(String fzzm) {
        this.fzzm = fzzm;
    }

    public String getFzdm() {
        return fzdm;
    }

    public void setFzdm(String fzdm) {
        this.fzdm = fzdm;
    }

    public String getFhrxxdz() {
        return fhrxxdz;
    }

    public void setFhrxxdz(String fhrxxdz) {
        this.fhrxxdz = fhrxxdz;
    }

    public String getFhrxm() {
        return fhrxm;
    }

    public void setFhrxm(String fhrxm) {
        this.fhrxm = fhrxm;
    }

    public String getFhrsjhm() {
        return fhrsjhm;
    }

    public void setFhrsjhm(String fhrsjhm) {
        this.fhrsjhm = fhrsjhm;
    }

    public Double getZdmfy() {
        return zdmfy;
    }

    public void setZdmfy(Double zdmfy) {
        this.zdmfy = zdmfy;
    }

    public Double getZdzfy() {
        return zdzfy;
    }

    public void setZdzfy(Double zdzfy) {
        this.zdzfy = zdzfy;
    }

    public Double getZfy() {
        return zfy;
    }

    public void setZfy(Double zfy) {
        this.zfy = zfy;
    }

    public String getYdh() {
        return ydh;
    }

    public void setYdh(String ydh) {
        this.ydh = ydh;
    }

    @Override
    public String toString() {
        return "MOrder{" +
                "ddh='" + ddh + '\'' +
                ", createTime=" + createTime +
                ", mdzfy=" + mdzfy +
                ", qhfs='" + qhfs + '\'' +
                ", sl=" + sl +
                ", wpmc='" + wpmc + '\'' +
                ", cc='" + cc + '\'' +
                ", zzl=" + zzl +
                ", messageId=" + messageId +
                ", shqx='" + shqx + '\'' +
                ", shshi='" + shshi + '\'' +
                ", shsheng='" + shsheng + '\'' +
                ", dzzm='" + dzzm + '\'' +
                ", dzdm='" + dzdm + '\'' +
                ", shrxxdz='" + shrxxdz + '\'' +
                ", shrxm='" + shrxm + '\'' +
                ", shrsjhm='" + shrsjhm + '\'' +
                ", fhsheng='" + fhsheng + '\'' +
                ", fzzm='" + fzzm + '\'' +
                ", fzdm='" + fzdm + '\'' +
                ", fhrxxdz='" + fhrxxdz + '\'' +
                ", fhrxm='" + fhrxm + '\'' +
                ", fhrsjhm='" + fhrsjhm + '\'' +
                ", zdmfy=" + zdmfy +
                ", zdzfy=" + zdzfy +
                ", zfy=" + zfy +
                ", ydh='" + ydh + '\'' +
                '}';
    }
}