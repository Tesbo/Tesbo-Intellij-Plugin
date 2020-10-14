package com.github.viral1010.tesbointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.viral1010.tesbointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
