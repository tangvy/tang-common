/**
 * shipper.id Inc.
 * Copyright (c) 2018-2022 All Rights Reserved.
 */
package com.tangv.common.enums;

import lombok.Setter;

/**
 * @author tang wei
 * @version BinlogConsumeTableEnum.java, v 0.1 2023/3/2 16:40 tang wei Exp $
 * binlog源表
 */
public enum BinlogConsumeTableEnum {

    //todo 需要配置正确源表名
    MARCKET_PLACE_CITY("oms_owner");

    BinlogConsumeTableEnum(String tableName) {
        this.tableName = tableName;
    }

    @Setter
    String tableName;

    public static BinlogConsumeTableEnum getByTableName(String tableName) {
        for (BinlogConsumeTableEnum value : BinlogConsumeTableEnum.values()) {
            if (value.tableName.equals(tableName)) {
                return value;
            }
        }
        return null;
    }
}
