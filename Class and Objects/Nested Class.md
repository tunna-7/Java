## Q
### A school is considered to exist in multiple locations. Each location is defined by attributes like locationId,
### locationName, longitude, latitude. Location is maintained as nested class in department. Write a Java program 
### that displays the details of the various location instances (nested class objects) for a given school name. If
### the user enters the school name as input the system should search and display all the location objects associated with the school.



    import java.util.*;

    class Department {

        String school_name;

        Department(String school_name){
            this.school_name = school_name;
        }

        class Location {
            int locationId;
            String locationName;
            int longitude;
            int latitude;

            Location(int locationId,String locationName,int longitude,int latitude){
                this.locationId = locationId;
                this.locationName = locationName;
                this.longitude = longitude;
                this.latitude = latitude;
            }

            void getDetails(){
                System.out.println("Location Id: "+locationId+" Location Name: "+locationName+" Longitude: "+longitude+" Latitude: "+latitude );
            }
        }
    }

    public class Main{
        public static void main(String[] args){
            Department d = new Department("DPS");
            Department.Location l = d.new Location(11,"Pune",12345,67890);
            if(d.school_name=="DPS"){
                l.getDetails();
            }
        }
    }
    
## OUTPUT
   ![image](https://user-images.githubusercontent.com/66274690/145678488-f6b150f0-66ad-444b-bd93-4ef1f80909f8.png)
