## Q
### Create a UsedVehicleException class that extends Exception; its constructor receives a value for a vehicle identification number (VIN) that is passed to the parent constructor so it can be used in a getMessage() call. Create a UsedVehicle class with fields for VIN, make, year, mileage, and price. The UsedVehicle constructor throws a UsedVehicleException when the VIN is not four digits; when the make is not Ford, Honda, Toyota, or Other; when the year is not between 2000 and 2020 inclusive; or either the mileage or price is negative. Write a Java application that establishes an array of at least five UsedVehicle objects and handles any Exceptions. Display a list of only the UsedVehicle objects that were constructed successfully.

      class UsedVehicle {
          int VIN;
          String make;
          int year;
          float mileage;
          float price;

          UsedVehicle(int VIN,String make,int year,float mileage,float price){
              this.VIN = VIN;
              this.make = make;
              this.year = year;
              this.mileage = mileage;
              this.price = price;

              try{
                  if(String.valueOf(VIN).length()!=4){
                      throw new UsedVehicleException("VIN Error");
                  }
                  else if(make!="Ford" || make!="Honda" || make!="Toyota" || make!="Other"){
                      throw new UsedVehicleException("Make Error");
                  }
                  else if(year<2000 && year>2020){
                      throw new UsedVehicleException("Year Error");
                  }
                  else if(mileage<0 || price<0){
                      throw new UsedVehicleException("Mileage or Price Error");
                  }
                  else{
                      System.out.println("Successfully added");
                  }
              }catch(Exception e){
                  System.out.println(e);
              }
          }
      }

      class UsedVehicleException extends Exception {
          String x;
          public UsedVehicleException(String msg){
              super(msg);
              x = msg;
              getMessage(x);
          }
          void getMessage(String y){
              switch(y){
                  case "VIN Error": System.out.println("Only 4 digit VIN allowed!");
                                    break;

                  case "Make Error": System.out.println("Make can only be Toyota"+"\\" +"Ford"+"\\"+"Honda"+"\\"+"Other");
                                    break; 

                  case "Year Error": System.out.println("Year can only be between 2000-2020");
                                    break;

                  case "Mileage or Price Error": System.out.println("Mileage or Price can never be negative!");
                                                  break;

                  default: System.out.println("That's it");
              }

          }
      }

      public class QuestionException {
          public static void main(String[] args){
              UsedVehicle u = new UsedVehicle(1111,"Chevy", 2001, 10, 10);
          }
      }
      
### Output
![image](https://user-images.githubusercontent.com/66274690/145702828-412636d6-2b61-4dc3-9baf-3b50e0f46825.png)

