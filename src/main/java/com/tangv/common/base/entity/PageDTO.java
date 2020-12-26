package com.tangv.common.base.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * author:   tangwei
 * Date:     2020/12/26 11:37
 * Description: 分页参数
 */

public class PageDTO implements Serializable {

    private Integer page = 1;

    private Integer size = 10;

    private String order = "DESC";

    private String orderBy = "modifyTime";

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}