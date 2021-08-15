package com.github.fsev.k8sswapper.api.explorer

import com.github.fsev.k8sswapper.ui.explorer.K8sExplorerPanel
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.ui.content.Content
import java.util.concurrent.atomic.AtomicReference

@Service
class K8sExplorer {
    private val panel = AtomicReference<K8sExplorerPanel>()

    fun createToolWindowContent(toolWindow: ToolWindow): Content {
        if (panel.get() == null && !panel.compareAndSet(null, K8sExplorerPanel(this))) {
            throw IllegalStateException("Can not initialize explorer twice at the same time")
        }
        return toolWindow.contentManager.factory.createContent(panel.get(), null, false)
    }
}

val Project.k8sExplorer: K8sExplorer get() = getService(K8sExplorer::class.java)
