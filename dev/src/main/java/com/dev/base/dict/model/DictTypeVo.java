package com.dev.base.dict.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

/**
 *
 * @description 字典类型对象类
 * @author zhhy
 * @date 2018-07-18-7-25 上午11:02
 *
 */
@EntityScan
public class DictTypeVo {
    private int id ;
    private String name ; //'字典类型名称',
    private String typeCode ;   //'字典类型编码',
    private String systemCode ;  // '所属系统简称',
    private Long createTimeLong ;   //'系统时间'

    private Date createTime ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public Long getCreateTimeLong() {
        return this.createTime.getTime();
    }

    public void setCreateTimeLong(Long createTimeLong) {
        this.createTimeLong = createTimeLong;
    }
}
