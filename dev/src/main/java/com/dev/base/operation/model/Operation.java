package com.dev.base.operation.model;

/**
 * Created by zhjx on 2018/7/18.
 */
public class Operation {

    private int id ;//'主键',
    private String name; //'功能项名称',
    private String url; //'请求访问地址',
    private int matchType; //'标记请求地址类型，1完整路径；2正则表达式',
    private int oper_type; //'功能项类型1菜单，2普通超链接，3修改、删除等功能按钮提交地址',
    private String eleId ;  //'在页面中元素id',
    private int parentId ;   //'父级id',
    private String remark ;//'备注',
    private String createTime ;  //
    private String update_time ;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMatchType() {
        return matchType;
    }

    public void setMatchType(int matchType) {
        this.matchType = matchType;
    }

    public int getOper_type() {
        return oper_type;
    }

    public void setOper_type(int oper_type) {
        this.oper_type = oper_type;
    }

    public String getEleId() {
        return eleId;
    }

    public void setEleId(String eleId) {
        this.eleId = eleId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
