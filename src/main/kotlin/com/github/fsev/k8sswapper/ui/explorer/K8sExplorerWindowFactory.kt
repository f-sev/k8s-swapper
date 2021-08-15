package com.github.fsev.k8sswapper.ui.explorer

import com.github.fsev.k8sswapper.api.explorer.k8sExplorer
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory

internal class K8sExplorerWindowFactory : ToolWindowFactory, DumbAware {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val contentManager = toolWindow.contentManager
        val explorer = project.k8sExplorer
        val content = explorer.createToolWindowContent(toolWindow)
        contentManager.addContent(content)
    }
}
