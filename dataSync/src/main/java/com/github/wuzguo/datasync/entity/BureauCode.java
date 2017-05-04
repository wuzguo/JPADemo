package com.github.wuzguo.datasync.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Intellij IDEA 2016.2
 *
 * @描述 字典表
 * @作者 wzguo
 * @版本 1.0.0
 * @日期 2016.12.02
 */

@Entity
@Table(name = "t_code_bureau")
@NamedQuery(name = "BureauCode.findAll", query = "SELECT o FROM BureauCode o")
public class BureauCode {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "simple_name")
    private String simpleName;

    @Column(name = "name")
    private String name;

    @Column(name = "seq")
    private int seq;

    @Column(name = "flag")
    private String flag;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BureauCode{" +
                "code='" + code + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", name='" + name + '\'' +
                ", seq=" + seq +
                ", flag='" + flag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
