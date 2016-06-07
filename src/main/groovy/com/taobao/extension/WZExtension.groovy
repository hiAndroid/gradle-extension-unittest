package com.taobao.extension

import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.internal.reflect.Instantiator

/**
 * Created by wuzhong on 16/6/7.
 */
public class WZExtension implements WZ {

    private Instantiator instantiator;

    private String name;

    private Integer age;

    private Nest1 nest1;

    private Nest2 nest2;

    private NamedDomainObjectContainer<Nest3> nest3;

    public WZExtension(Instantiator instantiator, Project project) {
        this.instantiator = instantiator
        this.nest1 = instantiator.newInstance(Nest1.class);
        this.nest2 = instantiator.newInstance(Nest2.class);
        this.nest3 = project.container(
                Nest3.class,
                new Nest3Factory(instantiator, project))
    }


    @Override
    public String getName() {
        return name
    }

    @Override
    public Integer getAge() {
        return age
    }

    public void setName(String name) {
        this.name = name
    }

    public void setAge(Integer age) {
        this.age = age
    }

    public Nest1 getNest1() {
        return nest1
    }

    void setNest1(Nest1 nest1) {
        this.nest1 = nest1
    }

    void nest1(Action<Nest1> action) {
        action.execute(nest1)
    }

    void nest2(Action<Nest2> action) {
        action.execute(nest2)
    }

    void nest3(Action<? super NamedDomainObjectContainer<Nest3>> action) {
        action.execute(nest3);
    }

    @Override
    public String toString() {
        return "WZExtension{" +
                "instantiator=" + instantiator +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nest1=" + nest1 +
                ", nest2=" + nest2 +
                ", nest3=" + nest3 +
                '}';
    }
}
