    import java.util.*;

    class App {
        public static void main(String[] args){
            int [] ayush = {10,20,30,40,50};
            int [] wunnava = {1,0,3,4,5};
            for(int i=0;i<ayush.length;i++){
                try{
                    System.out.println(ayush[i]/wunnava[i]);
                }catch(Exception e){
                    System.out.println("Can't divide by 0!");
                }
            }
        }
    }
    
### OUTPUT

    10
    Can't divide by 0!
    10
    10
    10
