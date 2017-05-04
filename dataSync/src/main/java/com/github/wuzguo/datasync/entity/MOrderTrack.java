package com.github.wuzguo.datasync.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "t_order_track")
@NamedQuery(name = "MOrderTrack.findAll", query = "SELECT o FROM MOrderTrack o")
public class MOrderTrack implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "begin_bureau_code")
    private String fzljdm;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date lrsj;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date")
    private Date kxrq;

    @Column(name = "end_bureau_code")
    private String dzljdm;

    @Column(name = "flow_name")
    private String lcmc;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "input_time")
    private Date inputTime = new Date();

    @Column(name = "jjcc")
    private String jjcc;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jjsj;

    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "order_num")
    private String ddh;

    @Column(name = "remark")
    private String bz;

    @Column(name = "status_operater")
    private String ztqrdw;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss.SSS")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "status_time")
    private Date ztfssj;

    @Column(name = "train_no")
    private String ch;

    @Column(name = "train_num")
    private String chc;

    public MOrderTrack() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFzljdm() {
        return fzljdm;
    }

    public void setFzljdm(String fzljdm) {
        this.fzljdm = fzljdm;
    }


    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public Date getKxrq() {
        return kxrq;
    }

    public void setKxrq(Date kxrq) {
        this.kxrq = kxrq;
    }

    public String getDzljdm() {
        return dzljdm;
    }

    public void setDzljdm(String dzljdm) {
        this.dzljdm = dzljdm;
    }

    public String getLcmc() {
        return lcmc;
    }

    public void setLcmc(String lcmc) {
        this.lcmc = lcmc;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getJjcc() {
        return jjcc;
    }

    public void setJjcc(String jjcc) {
        this.jjcc = jjcc;
    }

    public Date getJjsj() {
        return jjsj;
    }

    public void setJjsj(Date jjsj) {
        this.jjsj = jjsj;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getDdh() {
        return ddh;
    }

    public void setDdh(String ddh) {
        this.ddh = ddh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getZtqrdw() {
        return ztqrdw;
    }

    public void setZtqrdw(String ztqrdw) {
        this.ztqrdw = ztqrdw;
    }

    public Date getZtfssj() {
        return ztfssj;
    }

    public void setZtfssj(Date ztfssj) {
        this.ztfssj = ztfssj;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getChc() {
        return chc;
    }

    public void setChc(String chc) {
        this.chc = chc;
    }


    @Override
    public String toString() {
        return "MOrderTrack{" +
                "id='" + id + '\'' +
                ", fzljdm='" + fzljdm + '\'' +
                ", lrsj=" + lrsj +
                ", kxrq=" + kxrq +
                ", dzljdm='" + dzljdm + '\'' +
                ", lcmc='" + lcmc + '\'' +
                ", inputTime=" + inputTime +
                ", jjcc='" + jjcc + '\'' +
                ", jjsj=" + jjsj +
                ", messageId=" + messageId +
                ", ddh='" + ddh + '\'' +
                ", bz='" + bz + '\'' +
                ", ztqrdw='" + ztqrdw + '\'' +
                ", ztfssj=" + ztfssj +
                ", ch='" + ch + '\'' +
                ", chc='" + chc + '\'' +
                '}';
    }
}