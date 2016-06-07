import com.taobao.WZPlugin
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert
import org.junit.Test

/**
 * Created by wuzhong on 16/6/7.
 */
public class ExtensionTest2 {

    @Test
    public void test() {

        System.out.println(1);

        Project project = ProjectBuilder.builder().withProjectDir(
                new File("build", "test")).build();


        project.getPluginManager().apply(WZPlugin.class);

        def task = project.tasks.hello;
        task.actions.each { Action action ->
            action.execute(task)
        }

        project.wz {
            name "wz"
            age 30

            nest1 {
                a "a123"
                b "b123"
            }

            nest2 {
                a2 "22222"
                b2 true
            }

            nest3 {

                debug {
                    a3 "aaaa3333"
                }

                release {
                    a3 "bbbbb3333"
                }

            }
        }

        WZPlugin wzPlugin = project.plugins.getPlugin(WZPlugin);

        task.actions.each { Action action ->
            action.execute(task)
        }


        project.hello.execute();

//        project.hello();

        Assert.assertNotNull(project);
    }

}
