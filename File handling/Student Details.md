### Getting,Writing and Reading the student details

    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.ObjectOutputStream;

    import java.io.FileInputStream;
    import java.io.ObjectInputStream;

    import java.io.Serializable;  
    import java.util.*;

    class Student implements Serializable {
        String name;
        int age;
        // String address;
        // String prog_name;
        double cgpa;
        // String uni_name;
        // String game_name;
        boolean rep_Country;
        // boolean rep_State;
        // int rep_State_Position = 0;

        Student(String name,double cgpa,boolean rep_Country){
            this.name = name;
            this.cgpa = cgpa;
            this.rep_Country = rep_Country;
        }

    }

    class App1{
        public static void main(String[] args){
            try{
                //Creating the object
                Student s1 = new Student("Ayush",8.47,true);

                //Creating stream and writing the object
                FileOutputStream fout = new FileOutputStream("Details.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(s1);
                out.flush();

                //closing the stream
                out.close();

                System.out.println("File successfuly created!");
            }catch(Exception e){System.out.println(e); }

            try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("Details.txt"));  
            Student s = (Student)in.readObject();

            //Printing the data of the serialized object
            System.out.println(s.name+" "+s.cgpa);

            if(s.cgpa>8.40){
                System.out.println("Congratulations "+s.name+"!, You're applicable for our internship");
            }

            //Closing Stream
            in.close();
            }catch(Exception e){System.out.println(e);}
        }
    }
    
### OUTPUT
![image](https://user-images.githubusercontent.com/66274690/138569451-49fde996-d8e0-418a-9122-886d5f189d39.png)
