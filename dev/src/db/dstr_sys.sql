
#用户表
CREATE TABLE IF NOT EXISTS `sys_user` (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `account` varchar(100) NOT NULL COMMENT '账号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `passwordStrength` tinyint(1) NOT NULL COMMENT '密码强度（1：弱，2：中，3：强）',
  `uname` varchar(10) DEFAULT NULL COMMENT '昵称',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别（1：男，2：女，null：保密）',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `createIp` varchar(20) DEFAULT NULL COMMENT '注册IP',
  `updater` bigint(18) DEFAULT NULL COMMENT '更新者',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `lastLoginIp` varchar(20) DEFAULT NULL COMMENT '最后登录IP', 
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UQ_ACCOUNT` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

  #任务表
CREATE TABLE IF NOT EXISTS `sys_task`(
  `id` bigint(18) NOT NULL COMMENT 'ID', 
  `code` varchar(50) NOT NULL COMMENT '编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(255) NULL COMMENT '描述', 
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '任务表';

#实体包表
CREATE TABLE IF NOT EXISTS `sys_entity_group`(
  `id` bigint(18) NOT NULL COMMENT 'ID', 
  `parentId` bigint(18) NULL COMMENT '上级包ID',
  `code` varchar(500) NOT NULL COMMENT '编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(255) NULL COMMENT '描述', 
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '实体包表';

#实体表
CREATE TABLE IF NOT EXISTS `sys_entity`(
  `id` bigint(18) NOT NULL COMMENT 'ID', 
  `entityGroupId` bigint(18) NOT NULL COMMENT '所属包ID',
  `code` varchar(200) NOT NULL COMMENT '编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `tableName` varchar(50) NOT NULL COMMENT '表名',
  `description` varchar(255) NULL COMMENT '描述', 
  `options`  varchar(4000) NULL COMMENT '配置',
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`),
  CONSTRAINT `sys_entity.entityGroup` FOREIGN KEY (`entityGroupId`) REFERENCES `sys_entity_group`(`id`) ON UPDATE CASCADE ON DELETE RESTRICT
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '实体表';

#实体字段表
CREATE TABLE IF NOT EXISTS `sys_entity_field`(
  `id` bigint(18) NOT NULL COMMENT 'ID', 
  `entityId` bigint(18) NOT NULL COMMENT '所属实体ID',
  `code` varchar(200) NOT NULL COMMENT '编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(255) NULL COMMENT '描述', 
  `typeName` varchar(50) NOT NULL COMMENT '类型',
  `options`  varchar(4000) NULL COMMENT '配置',
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`),
  CONSTRAINT `sys_entity.fields` FOREIGN KEY (`entityId`) REFERENCES `sys_entity`(`id`) ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '实体字段表';


#实体数据表
CREATE TABLE IF NOT EXISTS `sys_entity_data`(
  `id` bigint(18) NOT NULL COMMENT 'ID', 
  `entityId` bigint(18) NOT NULL COMMENT '所属实体ID',
  `code` varchar(200) NOT NULL COMMENT '编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(255) NULL COMMENT '描述',  
  `extra`  JSON NULL COMMENT '扩展字段',
  `isNoUsed`  tinyint(1) NULL DEFAULT 0 COMMENT '不使用',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '实体数据表';
