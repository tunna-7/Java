    import java.util.*;
    import java.util.regex.*;

    class StudentDetails {
        int regnNo;
        String name;
        String aadharNum;
        String passportNum;

        StudentDetails(int regnNo, String name, String aadharNum){
            this.regnNo = regnNo;
            this. name = name;
            this. aadharNum = aadharNum;
            this. passportNum = passportNum;
        }
    }

    class InvalidAadharException extends Exception{
        public InvalidAadharException(String msg){
            super(msg);
        }
    }

    class App {
        public static void checkAadhar(String s){
            try{
                if(!Pattern.matches("[0-9]{3} [0-9]{3} [0-9]{3}",s)){
                    throw new InvalidAadharException("Invalid Aadhar Number Entered!");
                }
            }catch(Exception e){
                System.out.println(e);
            }

        }
        // public static void checkPassport(String s){
        //     if(Pattern.matches("[A-Z]{1}[0-9]{7}",s))
        //         return true
        //     return false
        // }

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            while(true){
                // System.out.println("Enter Name:");
                // String student_name = input.nextLine();
                // System.out.println("Enter Reg No:");
                // int student_reg = input.nextInt();
                System.out.println("Enter Aadhar Number:");
                String student_aadhar = input.nextLine();
                System.out.println("Enter Passport Number:");
                String student_passport = input.nextLine();
                checkAadhar(student_aadhar);


            }
        }
    }
    
### OUTPUT

![image](https://user-images.githubusercontent.com/66274690/138567199-ff34666a-834a-4c36-9ce6-872801294146.png)
