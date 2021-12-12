## Usin normal - extend thread

    class Hi extends Thread{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }
    }

    class Hello extends Thread{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Hi obj1 = new Hi();
            Hello obj2 = new Hello();

      obj1.start();
      obj2.start();
        }
    }

## using implement - Runnable

        class Hi implements Runnable{
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        }

        class Hello implements Runnable{
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                Runnable obj1 = new Hi();
                Runnable obj2 = new Hello();

                Thread t1= new Thread(obj1);
                Thread t2 = new Thread(obj2);

                t1.start();
                t2.start();
            }
        }

### Output:
![image](https://user-images.githubusercontent.com/66274690/145707804-a4d6da22-fa4b-4ae2-9aa0-cd7a1c697216.png)
