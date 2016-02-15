# android-thrift-plugin
Thrift DSL compilation for Android projects
# add to project directory gradle file
buildscript {<br/>
    repositories {<br/>
        maven {<br/>
            url "http://dl.bintray.com/adyach/maven"v
        }<br/>
    }<br/>
    dependencies {<br/>
        classpath 'org.crazycoder:android-thrift-plugin:0.1'v
    }<br/>
}<br/>
# add to app gradle file
apply plugin: 'android-thrift-plugin'

compileThrift {
    generatedFilesFolder '.'
    thriftFilesFolder 'thrift'
    thriftPath '/usr/local/bin/thrift'
    includeThriftFiles '**/*.thrift'
    params '-debug -r'
}
