package com.github.fsev.k8sswapper.listeners

import com.github.fsev.k8sswapper.services.MyApplicationService
import com.intellij.ide.AppLifecycleListener
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project

class StartupListener : AppLifecycleListener {

    override fun appStarting(projectFromCommandLine: Project?) {
        service<MyApplicationService>()
    }
}
