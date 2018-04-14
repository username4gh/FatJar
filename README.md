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