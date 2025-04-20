package com.xworkz.methodoverriding.form;

public class FormRunner {

        public static void main(String[] args) {
            Form form = new Form();
            form.open();
            form.fillDetails();
            form.submit();
            form.close();
            System.out.println();

            Form of = new OnlineForm();
            of.open();
            of.fillDetails();
            of.submit();
            of.close();
            System.out.println();

            OnlineForm online = new OnlineForm();
            online.open();
            online.fillDetails();
            online.submit();
            online.close();
            online.autoSave();  // Unique method
        }
    }


