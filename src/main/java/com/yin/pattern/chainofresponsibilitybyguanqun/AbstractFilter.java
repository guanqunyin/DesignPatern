package com.yin.pattern.chainofresponsibilitybyguanqun;

import java.util.Objects;

public abstract class AbstractFilter {

    protected String filterName;

    abstract void doFilter(MyRequest myRequest, MyResponse myResponse, FilterChain filterChain);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFilter that = (AbstractFilter) o;
        return Objects.equals(filterName, that.filterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterName);
    }
}
