package com.xworkz.tasks.editor;

public class EditorRunner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.editorName();
        editor.editorType();

        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.editorName();
        photoEditor.editorType();
    }
}
