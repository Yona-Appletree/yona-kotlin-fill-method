package com.github.yonaappletree.yonakotlinfillmethod.services

import com.github.yonaappletree.yonakotlinfillmethod.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
