package org.crazycoder.androidthriftplugin

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.file.FileTree

class AndroidThriftPlugin implements Plugin<Project> {

    void apply(Project project) {

        def pluginModel = project.extensions.create("compileThrift", PluginModel)

        project.task('compileThrift') << {
            File dir = project.file(pluginModel.generatedFilesFolder)
            if (!dir.exists()) {
                dir.mkdir()
            }

            FileTree tree = project.fileTree(pluginModel.thriftFilesFolder).include(pluginModel.includeThriftFiles)
            tree.each { File file ->
                println file.path
                "${pluginModel.thriftPath} ${pluginModel.params} -o ${dir.path} --gen java:android ${file.path}".execute()
            }
        }
    }

}

class PluginModel {
    def String generatedFilesFolder
    def String thriftPath
    def String thriftFilesFolder
    def String[] includeThriftFiles
    def String params
}