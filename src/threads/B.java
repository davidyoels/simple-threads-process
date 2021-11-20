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
public class B extends Thread{
     M m;

    public B() {
        m = new M();
        start();
    }

    public void run() {
        m.M2("B");
    }
}
