/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlecture;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PrintNum implements Runnable{
    private int lastNum; 

    /** Construct a task for printing 1, 2, ... i */
    public PrintNum(int n) { lastNum = n; } 

    @Override /** Tell the thread how to run */ 
    public void run() {
//        Thread th4 = new Thread(new PrintChar('S',60));
//        th4.start();
        for (int i = 1; i <= lastNum; i++) { 
            System.out.println(Thread.currentThread().getName() + ": " + i);
//            if(i == 50) {
//                try {
//                    th4.join();
//                } catch (Exception ex) {
//                }
//            }
        }
    }
}
