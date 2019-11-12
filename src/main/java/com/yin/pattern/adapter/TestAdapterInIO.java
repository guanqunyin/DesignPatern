package com.yin.pattern.adapter;

import java.io.*;

/**
 * Created by Administrator on 2019/11/5.
 */
public class TestAdapterInIO {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c://test.txt");

        //这个inputstreanReader就是一个包装器
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = "";
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        fileInputStream.close();
    }

}
