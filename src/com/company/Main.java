package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(80);
        simpleSubject.setValue(180);

        simpleSubject.removeObserver(simpleObserver);

        simpleSubject.setValue(280);

    }
}
