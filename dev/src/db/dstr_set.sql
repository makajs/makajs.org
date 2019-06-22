 
CREATE TABLE IF NOT EXISTS`set_enum`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '枚举类型编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '枚举类型名称',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '1不使用,0使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '枚举类型表' ROW_FORMAT = Dynamic;
 
CREATE TABLE IF NOT EXISTS`set_enum_detail`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `enumId` bigint(18) NOT NULL COMMENT '枚举类型ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '枚举编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '枚举名称',
  `groupCode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '枚举类型编码',
  `groupName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '枚举类型名称',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '1不使用,0使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `set_enum.details`(`enumId`) USING BTREE,
  CONSTRAINT `set_enum.details` FOREIGN KEY (`enumId`) REFERENCES `set_enum` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '枚举表' ROW_FORMAT = Dynamic;


CREATE TABLE IF NOT EXISTS`set_customer_group`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `orgId` bigint(18) DEFAULT NULL COMMENT '企业ID',
  `parentId` bigint(18) DEFAULT NULL COMMENT '上线ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '不使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表' ROW_FORMAT = Dynamic;


CREATE TABLE IF NOT EXISTS`set_customer`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `orgId` bigint(18) DEFAULT NULL COMMENT '企业ID',
  `customerGroupId` bigint(18) DEFAULT NULL COMMENT '客户组ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '不使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `set_customer.customerGroup`(`customerGroupId`) USING BTREE,
  CONSTRAINT `set_customer.customerGroup` FOREIGN KEY (`customerGroupId`) REFERENCES `set_customer_group` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表' ROW_FORMAT = Dynamic;

 
CREATE TABLE IF NOT EXISTS`set_department`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `orgId` bigint(18) DEFAULT NULL COMMENT '部门ID',
  `departmentId` bigint(18) DEFAULT NULL COMMENT '上级部门ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门编码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `sort` int(8) DEFAULT NULL COMMENT '排序号',
  `layer` tinyint(1) DEFAULT NULL COMMENT '部门所属层级',
  `parentIdList` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '父级Id层级列表（如0，1，3，5）',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '不使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

 
CREATE TABLE IF NOT EXISTS`set_person`  (
  `id` bigint(18) NOT NULL COMMENT 'ID',
  `orgId` bigint(18) DEFAULT NULL COMMENT '企业ID',
  `departmentId` bigint(18) DEFAULT NULL COMMENT '所属部门ID',
  `userId` bigint(18) DEFAULT NULL COMMENT '用户ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
  `idCardNo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '身份证号',
  `birthday` datetime(0) DEFAULT NULL COMMENT '生日',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
  `isNoUsed` tinyint(1) DEFAULT 0 COMMENT '不使用',
  `createTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `ts` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `set_person.department`(`departmentId`) USING BTREE,
  CONSTRAINT `set_person.department` FOREIGN KEY (`departmentId`) REFERENCES `set_department` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '人员表' ROW_FORMAT = Dynamic;
