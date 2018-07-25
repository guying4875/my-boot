-- 创建数据库
CREATE DATABASE IF NOT EXISTS SHOP
    DEFAULT CHARACTER SET = utf8
    DEFAULT COLLATE = utf8_general_ci;

-- 创建菜单资源表
drop table base_source;
CREATE TABLE IF NOT EXISTS base_operation (
  id INT NOT NULL,
  name VARCHAR(50) NOT NULL COMMENT '功能名称',
  level INT NOT NULL COMMENT '功能等级,1：一级菜单；2：二级菜单；3:三级菜单',
  opt_type INT NULL COMMENT '操作类型，1菜单；2普通链接；3按钮' ,
  sort INT NULL DEFAULT 1 COMMENT '排序',
  pid INT NULL COMMENT '上一级菜单id',
  img_static_url VARCHAR(50) NULL COMMENT '未选中状态菜单项图标地址',
  img_active_url VARCHAR(45) NULL COMMENT '选中状态图标地址',
  ele_tag varchar(50) COMMENT '功能项在页面中的元素标记',
  uri varchar(50) null comment '请求地址',
  commen VARCHAR(200) NULL COMMENT '说明',
  system_code varchar(50) DEFAULT 'default' COMMENT '系统简称',
  statue INT NULL DEFAULT 1 COMMENT '状态1.启用2.停用',
  create_time DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '系统功能项表';


-- 创建角色表
drop table base_role;
CREATE TABLE base_role (
  id INT NOT NULL,
  name VARCHAR(50) NOT NULL COMMENT '角色名',
  comment VARCHAR(50) NULL COMMENT '说明',
  status INT NULL COMMENT '状态1.启用，2停用',
  system_code varchar(50) DEFAULT 'default' COMMENT '系统简称',
  create_time DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '系统角色表';

drop table base_role_operation;
CREATE TABLE base_role_operation (
  id INT NOT NULL,
  role_id INT NOT NULL COMMENT '角色表id',
  source_id VARCHAR(45) NULL COMMENT '资源表id',
  create_time DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '角色与资源映射表';

-- 创建字典类型表
drop table base_dict_type;
CREATE TABLE base_dict_type (
  id INT NOT NULL,
  name VARCHAR(50) NOT NULL COMMENT '字典类型名称',
  type_code VARCHAR(50) NOT NULL COMMENT '字典类型编码',
  system_code varchar(50) DEFAULT 'default' COMMENT '系统简称',
  create_time DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '字典类型表';

drop table base_dict;
CREATE TABLE base_dict (
  id INT NOT NULL,
  type_code VARCHAR(50) NOT NULL COMMENT '字典类型编码',
  dict_key VARCHAR(50) NOT NULL COMMENT '字典键',
  dict_value VARCHAR(300) NOT NULL COMMENT '字典--值',
  parent_id int comment '父项id',
  comment VARCHAR(300) NULL COMMENT '说明',
  system_code varchar(50) DEFAULT 'default' COMMENT '系统简称',
  create_time DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '字典表';



