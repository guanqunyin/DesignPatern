package com.yin.pattern.chainofresponsibilitybyguanqun;

public class Main {

    public static void main(String[] args) {
        //1.新建一个请求和一个响应
        MyRequest myRequest = new MyRequest("request 1");
        MyResponse myResponse = new MyResponse("request 2");

        //1.1 模拟多个请求


        //2.新建一个链子
        FilterChain filterChain = new FilterChain();

        //3. 把所有的过滤器加入链子中
        Filter1 filter1 = new Filter1("1");
        Filter2 filter2 = new Filter2("2");
        Filter2 filter3 = new Filter2("3");
        filterChain.addFilter(filter1);
        filterChain.addFilter(filter2);
        filterChain.addFilter(filter3);

        //4. 当请求来临的时候，执行每一个链子的dofilter方法， 并一步步返回.
        filterChain.doFilter(myRequest, myResponse);

        //4.返回结果
    }
}
