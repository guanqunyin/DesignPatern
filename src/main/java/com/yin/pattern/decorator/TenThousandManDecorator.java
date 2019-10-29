package com.yin.pattern.decorator;

public class TenThousandManDecorator implements Rich{

    private TenThousandMan tenThousandMan;

    TenThousandManDecorator(TenThousandMan tenThousandMan) {
        this.tenThousandMan = tenThousandMan;
    }

    @Override
    public void printPossession() {
        System.out.println("这是万元户的装饰方法。。。。。。莫掌门装饰之前");
        tenThousandMan.printPossession();
        System.out.println("这是万元户的装饰方法。。。。。。莫掌门装饰之后");
    }
}
