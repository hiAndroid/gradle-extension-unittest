package com.taobao;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by wuzhong on 16/4/22.
 */
public class TestPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println(">>> this is java test plugin");
    }
}
