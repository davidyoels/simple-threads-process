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
public class A extends Thread {

    M m;

    public A() {
        m = new M();
        start();
    }

    public void run() {
        m.M1("A");

    }

}
