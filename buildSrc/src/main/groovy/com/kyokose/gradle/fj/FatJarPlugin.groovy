package com.kyokose.gradle.fj;

import com.kyokose.gradle.PluginTypeUtil
import org.gradle.api.Plugin;
import org.gradle.api.Project

/**
 * fatjar to include all the dependencies into the resulting-jar
 */
public class FatJarPlugin implements Plugin<Project> {

    @Override
    public void apply(final Project project) {
        if (PluginTypeUtil.isJavaModule(project)) {

            project.getConfigurations().create("extraLibs");

            project.getTasks().getByName("jar").configure {
                from {
                    project.getConfigurations().getByName("extraLibs").collect {
                        it.isDirectory() ? it : project.zipTree(it)
                    }
                }
            }

            project.getConfigurations().getByName("compile").extendsFrom(project.getConfigurations().getByName("extraLibs"));
        }
    }
}
