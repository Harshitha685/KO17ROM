package com.xworkz.methodoverriding.tv;

public class TVRunner {
        public static void main(String[] args) {

            TV tv = new TV();
            tv.display();
            tv.volumeControl();
            tv.remoteControl();
            tv.connectivity();
            System.out.println();

            TV android1 = new AndroidTV();
            android1.display();
            android1.volumeControl();
            android1.remoteControl();
            android1.connectivity();
            System.out.println();

            AndroidTV android2 = new AndroidTV();
            android2.display();
            android2.volumeControl();
            android2.remoteControl();
            android2.connectivity();
    }

}
