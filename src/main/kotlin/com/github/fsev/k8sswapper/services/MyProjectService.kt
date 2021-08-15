package com.github.fsev.k8sswapper.services

import com.github.fsev.k8sswapper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
