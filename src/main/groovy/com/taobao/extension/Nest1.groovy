package com.taobao.extension

import com.taobao.extension.Nest

/**
 * Created by wuzhong on 16/6/7.
 */
public class Nest1 implements Nest{

    public String a;
    public String b;

    @Override
    public String getA() {
        return a
    }

    public void setA(String a) {
        this.a = a
    }

    @Override
    public String getB() {
        return b
    }

    public void setB(String b) {
        this.b = b
    }

    @Override
    public String toString() {
        return "Nest1{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
