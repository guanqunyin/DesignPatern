package com.yin.pattern.chainofresponsibilitybyguanqun;

import java.util.LinkedList;

public class FilterChain {

    protected ThreadLocal<LinkedList<AbstractFilter>> allFilters = new ThreadLocal<>();

    private int currentPosition;

    public void addFilter(AbstractFilter filter) {
        System.out.println("这是在往链子上加入：" + filter.filterName);
        if (allFilters.get() == null)
            allFilters.set(new LinkedList<AbstractFilter>());
        allFilters.get().add(filter);
    }

    public void doFilter(MyRequest myRequest, MyResponse response) {
        //1. 获取所有的filter
        LinkedList<AbstractFilter> filters = allFilters.get();
        //2. 先走第一个filter
        if (!filters.isEmpty()) {
            if ( currentPosition >= filters.size()) {
                return;
            } else {
                AbstractFilter currentFilter = filters.get(currentPosition);
                ++currentPosition;
                currentFilter.doFilter(myRequest, response, this);
            }
        }


    }

    public LinkedList<AbstractFilter> getFilters() {
        return allFilters.get();
    }

}
