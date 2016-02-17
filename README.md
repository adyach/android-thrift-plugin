# android-thrift-plugin
Thrift DSL compilation for Android projects

# Installation
### Connect maven repository
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

### Plugin usage
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
