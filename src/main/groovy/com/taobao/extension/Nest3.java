package com.taobao.extension;

/**
 * Created by wuzhong on 16/6/7.
 */
public class Nest3 {

    /**
     * 1. 必须要有name属性
     * 2. 有get/set方法
     */

    public String name;
    public String a3;

    public Nest3(String name) {
        this.name = name;
    }

    public Nest3() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    @Override
    public String toString() {
        return "Nest3{" +
                "name='" + name + '\'' +
                ", a3='" + a3 + '\'' +
                '}';
    }
}
