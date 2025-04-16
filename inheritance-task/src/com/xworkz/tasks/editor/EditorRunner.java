package com.xworkz.tasks.editor;

public class EditorRunner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.editorName();
        editor.editorType();
        editor.editContent();
        editor.saveFile();
        editor.closeFile();

        Editor editor2 = new PhotoEditor();
        editor2.editorName();
        editor2.editorType();
        editor2.editContent();
        editor2.saveFile();
        editor2.closeFile();

        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.applyFilter();
        photoEditor.cropImage();
        photoEditor.adjustBrightness();
        photoEditor.resizeImage();
        photoEditor.addWatermark();

        Editor editor1 = new PhotoEditor();

        PhotoEditor photoEditor1 = (PhotoEditor) editor1;
        System.out.println(photoEditor1);
    }
}
