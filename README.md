# android-thrift-plugin
Thrift DSL compilation for Android projects

# Instalation
### Add to project directory gradle file
```
buildscript {
    repositories {
        maven {
            url "http://dl.bintray.com/adyach/maven"
        }
    }
    dependencies {
        classpath 'org.crazycoder:android-thrift-plugin:0.1'
    }
}
```

### Add to app gradle file
```
apply plugin: 'android-thrift-plugin'

compileThrift {
    generatedFilesFolder '.'
    thriftFilesFolder 'thrift'
    thriftPath '/usr/local/bin/thrift'
    includeThriftFiles '**/*.thrift'
    params '-debug -r'
}
```
