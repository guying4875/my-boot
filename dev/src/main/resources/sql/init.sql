--页面功能资源表
CREATE TABLE IF NOT EXISTS base_operation(
   id INT comment '主键',
   name varchar(500) comment '功能项名称',
   url varchar(300) comment '请求访问地址',
   match_type int default '1' comment '标记请求地址类型，1完整路径；2正则表达式',
   oper_type int comment '功能项类型1菜单，2普通超链接，3修改、删除等功能按钮提交地址',
   ele_id varchar(200) comment '在页面中元素id',
   parent_id int comment '父级id',
   remark varchar(500) comment '备注',
   create_time datetime default now(),
   update_time datetime default now(),
   PRIMARY KEY  (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table base_operation comment '页面功能资源表';