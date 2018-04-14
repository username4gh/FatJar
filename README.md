# What's this thing for?

[how to build a jar with all the libs in it](https://stackoverflow.com/questions/3445825/gradle-how-do-i-build-a-jar-with-a-lib-dir-with-other-jars-in-it)

This plugin will do this automatically for you.

# Usage

1. Config your build.gradle in your project-root-dir

```
buildscript {
    repositories {
	    ...	
        maven {
            url "https://raw.githubusercontent.com/username4gh/repository/master/"
        }
        ...
    }
    dependencies {
        classpath 'com.kyokose.gradle:fatjar:${version-number}'
    }
}
```


Then, place below code in your module's build.gradle

```
apply plugin: 'com.kyokose.gradle.fatjar'


dependencies {
	extraLibs '${group}:${artifactId}:${version-nubmer}'
}

```