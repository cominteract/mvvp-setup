package com.github.cominteract.mvvpsetup.services

import com.intellij.openapi.project.Project
import com.github.cominteract.mvvpsetup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
