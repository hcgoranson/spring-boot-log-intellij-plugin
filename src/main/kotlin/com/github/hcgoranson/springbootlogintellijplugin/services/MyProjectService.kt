package com.github.hcgoranson.springbootlogintellijplugin.services

import com.github.hcgoranson.springbootlogintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
