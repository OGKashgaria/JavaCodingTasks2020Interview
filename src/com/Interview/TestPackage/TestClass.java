package com.Interview.TestPackage;

public class TestClass  extends RegularClass{

    void test(){
        System.out.println("Test method from TestClass");
    }

    public static void main(String[] args) {
//   AbstractClass object = new RegularClass();
//   object.an_Interfaces();
//   object.abstractMethod();


        int num = 10;
        byte num1 = (byte) num;

        double num2 = num;
        AbstractClass object = new RegularClass();// object of RegularClass
        RegularClass object1 = ((RegularClass) object);

        //given super class as reference (AbstractClass)
        RegularClass obj = ((RegularClass) object);// downCasting
//        //creating an object of super class, casting it to subclass's object
        obj.regular_Method();
        obj.an_Interfaces();
        obj.abstractMethod();


        RegularClass regularClassObject = new TestClass();
        TestClass testClassObject= ((TestClass) regularClassObject);
//
//        testClassObject.test();
//        testClassObject.regular_Method();

//        regularClassObject.regular_Method();
//        regularClassObject.abstractMethod();
//        regularClassObject.an_Interfaces();

//        testClassObject.regular_Method();
//        testClassObject.abstractMethod();
//        testClassObject.an_Interfaces();
//        testClassObject.test();

    }
}
