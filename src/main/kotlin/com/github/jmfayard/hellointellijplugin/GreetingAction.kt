package com.github.jmfayard.hellointellijplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.ui.Messages.showMessageDialog
import com.intellij.pom.Navigatable
import java.lang.String


class GreetingAction: AnAction("Bonjouuuurrr") {
    override fun actionPerformed(event: AnActionEvent) {
        // Using the event, create and show a dialog
        val currentProject: Project? = event.project
        val dlgMsg = StringBuffer(event.presentation.text + System.getProperty("user.name"))
        val dlgTitle = event.presentation.description
        // If an element is selected in the editor, add info about it.
        val nav: Navigatable? = event.getData(CommonDataKeys.NAVIGATABLE)
        if (nav != null) {
            dlgMsg.append(String.format("\nSelected Element: %s", nav.toString()))
        }
        Messages.showMessageDialog(currentProject, dlgMsg.toString(), dlgTitle, Messages.getInformationIcon())
    }


    override fun update(e: AnActionEvent) {
        super.update(e)
    }
}