/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlecture;
import java.util.concurrent.*; 

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ThreadLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Create tasks
//        Runnable printA = new PrintChar('a', 100); 
//        Runnable printB = new PrintChar('b', 100); 
//        Runnable printC = new PrintChar('c', 100); 
//        Runnable printD = new PrintChar('d', 100); 
//        Runnable printE = new PrintChar('e', 100); 
//        Runnable printF = new PrintChar('f', 100); 
//        Runnable printG = new PrintChar('g', 100); 
//        Runnable printH = new PrintChar('h', 100); 
//        Runnable printI = new PrintChar('i', 100); 
//        Runnable printJ = new PrintChar('j', 100); 
//        Runnable print100 = new PrintNum(100);
//
//        // Create threads 
//        Thread thread1 = new Thread(printA); 
//        Thread thread2 = new Thread(printB); 
//        Thread thread3 = new Thread(printC); 
//        Thread thread4 = new Thread(printD); 
//        Thread thread5 = new Thread(printE); 
//        Thread thread6 = new Thread(printF); 
//        //Thread thread7 = new Thread(print100);
//        Thread thread8 = new Thread(printG); 
//        Thread thread9 = new Thread(printH); 
//        Thread thread10 = new Thread(printI);
//        Thread thread11 = new Thread(printJ); 
//        Thread thNum = new Thread(new PrintNum(100));
//        thNum.setPriority(Thread.MAX_PRIORITY);
//        
//        // Start threads 
//        thread1.start();
//        thread2.start(); 
//        thread3.start();
//        thread4.start();
//        thread5.start(); 
//        thread6.start();
//        //thread7.start(); 
//        thread8.start();
//        thread9.start(); 
//        thread10.start();
//        thread11.start(); 
//        thNum.start();
//        
//        
//        Runnable Printx = new PrintOneChar();
//        Thread th = new Thread(Printx);
//        th.start();
//        // thing bellow is the thing above using lambda
//        new Thread(() -> {
//            for (int i = 0; i < 100; i++){
//                System.out.println(Thread.currentThread().getName() + ": " + "X");    
//                //Thread.yield();
//                if (i == 50){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception ex) {
//                        System.out.println("NICE COCK!!!!!");
//                    }
//                }
//            }
//        }).start();
//        
        
        
        
//            // Create a fixed thread pool with maximum three threads     
//            ExecutorService executor = Executors.newFixedThreadPool(3); 
//
//            // Submit runnable tasks to the executor 
//            executor.execute(new PrintChar('a', 10)); 
//            executor.execute(new PrintChar('b', 10)); 
//            executor.execute(new PrintNum(10)); 
//
//            // Shut down the executor 
//            executor.shutdown(); 
//
//           System.out.println("All tasks done!");

            
        // using chached Thread
         // Create a fixed thread pool with maximum three threads     
            ExecutorService executor = Executors.newCachedThreadPool(); 

            // Submit runnable tasks to the executor 
            executor.execute(new PrintChar('a', 10)); 
            executor.execute(new PrintChar('b', 10)); 
            executor.execute(new PrintNum(10)); 
            executor.shutdownNow(); 
            while(!executor.isTerminated()) {
                
            } 
            // Shut down the executor 
            System.out.println("All tasks done!");
    }
    
}
