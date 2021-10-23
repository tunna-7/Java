    import java.util.*;

    class MyClass<T,V> {
        T ob;
        V ob2;

        MyClass(T ob,V ob2){
            this.ob = ob;
            this.ob2 = ob2;
        }
        void showType(){
            System.out.println(ob.getClass().getName());
            System.out.println(ob2.getClass().getName());
        }
    }

    class Main {
        public static void main(String[] args){
            MyClass<Integer,Double> obj = new MyClass(10,20.0);
            //MyClass<Double> obj2 = new MyClass(20.0);

            obj.showType();
            //obj2.showType();
        }
    }



![image](https://user-images.githubusercontent.com/66274690/138546002-1215cf9e-fe7b-4a96-bae9-7f85176308e4.png)
