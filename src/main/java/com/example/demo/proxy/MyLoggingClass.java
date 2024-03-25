package com.example.demo.proxy;

public class MyLoggingClass {

    private final MyClass myClass;

    public MyLoggingClass(MyClass myClass) {
        this.myClass = myClass;
    }

    Logger logger = new Logger();

    private void preProcess() {
        logger.log("Pre process");
    }
    private void postProcess() {
        logger.log("Post process");
    }
    public void doSomething() {
        preProcess();
        if(myClass != null)
            myClass.doSomething();
        postProcess();
    }

}
