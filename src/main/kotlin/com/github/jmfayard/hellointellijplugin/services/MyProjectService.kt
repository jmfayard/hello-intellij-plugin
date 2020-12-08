package com.github.jmfayard.hellointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jmfayard.hellointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
