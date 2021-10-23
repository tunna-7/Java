    import java.util.*;

    class MyTask extends Thread {
        @Override
        public void run(){
            for(int i=1;i<6;i++){
                System.out.println("Ayush Wunnava "+i);
            }
        }
    }

    public class App {
        // main method represents main thread
        public static void main(String[] args){
            //whatever we write in here will be executed by main thread
            //thread laways execute the job in sequence
            //Execution Context

            System.out.println("==Application Started==");

            MyTask t = new MyTask();
            t.start();

            for(int i=1;i<8;i++){
                System.out.println("Java "+i);
            }

            System.out.println("==Application Ended==");
        }
    }

### OUTPUT
Output will change after each executiom

==Application Started==
Java 1
Java 2
Ayush Wunnava 1
Ayush Wunnava 2
Java 3
Java 4
Ayush Wunnava 3
Ayush Wunnava 4
Java 5
Java 6
Ayush Wunnava 5
Java 7
==Application Ended==
