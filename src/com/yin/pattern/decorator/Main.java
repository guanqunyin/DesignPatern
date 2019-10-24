package com.yin.pattern.decorator;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.*;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args)  {
        CoatWoman coatWoman = new CoatWoman(new LipstickWoman(new LongHairWoman()));
        coatWoman.print();


        /*FileInputStream fileInputStream = new FileInputStream("test.txt");
        new BufferedInputStream(fileInputStream);*/

        TenThousandManDecorator tenThousandManDecorator = new TenThousandManDecorator(new TenThousandMan());
        tenThousandManDecorator.printPossession();
    }
}
