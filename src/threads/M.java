/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author david salmon
 */
public class M {

    int a, b, c;

    public M() {
        a = 3;
        b = 5;
        c = 8;
    }

    synchronized public void M1(String theString) {
        a = a + 5;
        try {
            System.out.println(theString + "a: " + a + "b: " + b + "c: " + c);
            wait();
        } catch (InterruptedException e) {
        }
        c = c + 7;
        System.out.println(theString + "a: " + a + "b: " + b + "c: " + c);
        notify();
    }

    synchronized public void M2(String theString) {
        a = a + 10;
        notify();
        try {
            System.out.println(theString + "a: " + a + "b: " + b + "c: " + c);
            wait();
        } catch (InterruptedException e) {
        }
        b = b + c;
        System.out.println(theString + "a: " + a + "b: " + b + "c: " + c);

    }
}
