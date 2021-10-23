    import java.util.*;

    // Number includes:
    // ->Integer
    // ->Float
    // ->Double

    class MyNum<T extends Number> {
        T ob;
        MyNum(T ob){
            this.ob = ob;
        }
        double square(){
            return ob.doubleValue()*ob.doubleValue();
        }
    }

    class Main {
        public static void main(String[] args){
            MyNum<Integer> obj = new MyNum(10);
            System.out.println(obj.square());
        } 
    }
    
### Output
100.0
