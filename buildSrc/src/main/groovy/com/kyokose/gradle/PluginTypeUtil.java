package com.kyokose.gradle;

import org.gradle.api.Project;

public class PluginTypeUtil {

    private PluginTypeUtil() {}

    private static final String[] JAVA_SUPPORT_PLUGINS = new String[] {"java", "java-library"};

    private static boolean hasPlugins(Project project, String... plugins) {
        for (String plugin : plugins) {
            if (project.getPlugins().hasPlugin(plugin)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Decide if it's a java module
     *
     * @param project
     * @return
     */
    public static boolean isJavaModule(Project project) {
        return hasPlugins(project, JAVA_SUPPORT_PLUGINS);
    }
}
