package com.github.fsev.k8sswapper.ui.explorer

import com.github.fsev.k8sswapper.api.explorer.K8sExplorer
import com.intellij.openapi.Disposable
import com.intellij.openapi.ui.SimpleToolWindowPanel

class K8sExplorerPanel(val explorer: K8sExplorer) : SimpleToolWindowPanel(true, true), Disposable {
    override fun dispose() {
        TODO("Not yet implemented")
    }
}