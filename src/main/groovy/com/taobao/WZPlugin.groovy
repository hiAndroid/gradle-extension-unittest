package com.taobao

import com.taobao.extension.WZExtension;
import org.gradle.api.Plugin;
import org.gradle.api.Project
import org.gradle.internal.reflect.Instantiator

import javax.inject.Inject;

/**
 * Created by wuzhong on 16/6/7.
 */
public class WZPlugin implements Plugin<Project> {

    Instantiator instantiator;

    @Inject
    public MtlPlugin(Instantiator instantiator) {
        this.instantiator = instantiator;
    }


    @Override
    public void apply(Project project) {

        if(instantiator == null){
            instantiator = project.gradle.services.get(Instantiator);
        }

        project.extensions.create("wz",WZExtension, instantiator,project);

        println "plugin applyed 2"

        project.task('hello') << {
            println project.wz
        }

        project.beforeEvaluate {
            println("before evaluate")
        }

        project.afterEvaluate{
            println("after evaluate")
        }

    }
}
