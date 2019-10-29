package com.yin.pattern.chainofresponsibilitybyguanqun;

public class Filter1 extends AbstractFilter {

    public Filter1(String filterName) {
        this.filterName = filterName;
    }

    public Filter1() {
    }


    @Override
    void doFilter(MyRequest myRequest, MyResponse myResponse, FilterChain filterChain) {
        System.out.println(myRequest.getName() + " 经过了过滤器" + filterName + " 的过滤之前");
        filterChain.doFilter(myRequest, myResponse);
        System.out.println(myRequest.getName() + " 经过了过滤器" + filterName + " 的过滤之后");
    }
}
