package me.kyren223.harpoonforjb

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HarpoonToggleQuickMenuAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        if (e.project != null) {
            HarpoonState.toggleQuickMenu(e.project!!)
        }
    }
}
