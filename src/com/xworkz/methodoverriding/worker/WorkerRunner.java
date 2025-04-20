package com.xworkz.methodoverriding.worker;

public class WorkerRunner {
        public static void main(String[] args) {

            Worker worker = new Worker();
            worker.workType();
            worker.shift();
            worker.salary();
            worker.toolsUsed();
            System.out.println();

            Worker cw1 = new ConstructionWorker();
            cw1.workType();
            cw1.shift();
            cw1.salary();
            cw1.toolsUsed();
            System.out.println();

            ConstructionWorker cw2 = new ConstructionWorker();
            cw2.workType();
            cw2.shift();
            cw2.salary();
            cw2.toolsUsed();
            cw2.location();
    }

}
