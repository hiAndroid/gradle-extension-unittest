package com.taobao.extension;

import com.sun.javafx.beans.annotations.NonNull;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.internal.reflect.Instantiator;

/**
 * Created by wuzhong on 16/6/7.
 */
public class Nest3Factory implements NamedDomainObjectFactory<Nest3> {

    @NonNull
    private final Instantiator instantiator;
    @NonNull
    private final Project project;

    public Nest3Factory(@NonNull Instantiator instantiator, @NonNull Project project) {
        this.instantiator = instantiator;
        this.project = project;
    }

    @Override
    public Nest3 create(String name) {
        return instantiator.newInstance(Nest3.class, name);
    }
}
