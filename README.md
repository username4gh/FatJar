# What's for

This gradle-plugin will do what's been described in the link below automatically

https://stackoverflow.com/questions/3445825/gradle-how-do-i-build-a-jar-with-a-lib-dir-with-other-jars-in-it


#  Usage


Just set it up like below with your /path/to/project\_root\_dir/build.gradle

```
buildscript {
    repositories {
        maven {
            url "https://raw.githubusercontent.com/username4gh/repository/master/"
        }
    }

    dependencies {
        classpath 'com.kyokose.gradle:fatjar:{version}'
    }
}
```