package com.shencangblue.iwps.dto;

import com.shencangblue.iwps.entity.SwimmingPool;

public class SwimmingPoolDto extends SwimmingPool {
    private Integer pId;

    private Integer page;

    private Integer limit;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
