    import java.util.*;

    class MyNum<T extends Number> {
        T num;
        MyNum(T ob){
            this.num = ob;
        }

        //We're using '?' as we don't know what the type would be 
        //be it a float, string or a double
        boolean absEqual(MyNum<?> ob){
            if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue()))
                return true;
            else
                return false;
        }
    }

    class Main {
        public static void main(String[] args){
            MyNum<Integer> obj = new MyNum(10);
            MyNum<Double> obj2 = new MyNum(-6);
            System.out.println(obj.absEqual(obj2));
        } 
    }

### Output
false
