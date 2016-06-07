package com.taobao

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by wuzhong on 16/4/25.
 */
class TestPlugin2 implements Plugin<Project>{
    @Override
    void apply(Project project) {

        project.beforeEvaluate {
            println("before evaluate")
        }

        project.afterEvaluate {
            println("after evaluate")

             project.tasks.getByName("hello",{
                 println ">>>>>>>>>>>>>"
                it.doFirst{
                    println "before hello ${project.name}"
                }
                it.doLast{
                    println "after hello ${project.name}"
                }
            });

        }


        project.tasks.whenTaskAdded {
            println( ">>" + this.class.getName());
        }

        println ">>> this is groovy plugin"
        //增加一个插件
        project.task('hello') << {
            println "task hello"
        }

//        project.getTasksByName()
    }
}





