## Incorrect Ans

    import java.util.*;

    class Exam extends Thread {
        @Override
        public void run(){
            for(int i=1;i<6;i++){
                try{
                    Thread.sleep(30000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println("Time Up! for Q"+i);
            }
        }
    }

    class User extends Thread {
        @Override
        public void run(){
            for(int i=1;i<6;i++){
                System.out.println("Question "+i+" attempted");
            }
        }
    }
    class App {
        public static void main(String[] args){
            Exam ex = new Exam();
            User s = new User();
            ex.start();
            try{
                    ex.join();
            }catch(InterruptedException e){
                   e.printStackTrace();
               }
            s.start();
        }
    }
    
    
### OUTPUT

    Time Up! for Q1
    Time Up! for Q2
    Time Up! for Q3
    Time Up! for Q4
    Time Up! for Q5
    Question 1 attempted
    Question 2 attempted
    Question 3 attempted
    Question 4 attempted
    Question 5 attempted
