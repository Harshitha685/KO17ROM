package com.xworkz.methodoverriding.file;

public class FileRunner {
        public static void main(String[] args) {
            File file = new File();
            file.open();
            file.read();
            file.write();
            file.close();
            System.out.println();

            File tf = new TextFile();
            tf.open();
            tf.close();
            tf.read();
            tf.write();
            tf.close();
            System.out.println();

            TextFile textFile = new TextFile();
            textFile.open();
            textFile.read();
            textFile.write();
            textFile.close();
            textFile.search();
        }
    }


