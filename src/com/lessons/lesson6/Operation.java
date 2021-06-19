package com.lessons.lesson6;

public class Operation extends Thread {
    private String operationName;
    private int operationTime;

    public Operation() {
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public void run() {
        try {
            System.out.println("Operation " + "\"" + operationName + "\": started");
            for (int i = 0; i < 5; i++) {
                System.out.println("Operation " + "\"" + operationName + "\": " + i + " second");
                Thread.sleep(1000);
            }
            System.out.println("Operation " + "\"" + operationName + "\": finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
