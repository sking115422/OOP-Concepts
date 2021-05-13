package BSIL;


import java.util.Scanner;

public class Cars
{

        Scanner userInput = new Scanner(System.in);

        private String make = " ";
        private String model = " ";
        private String year = " ";
        private String lastName = " ";


        public Cars (){

                System.out.println();
                System.out.print("Please enter the name of the car owner: ");
                lastName = userInput.nextLine();

                System.out.println();
                System.out.print("Please enter the make of the car: ");
                make = userInput.next();

                System.out.println();
                System.out.print("Please enter the model of the car: ");
                model = userInput.next();

                System.out.println();
                System.out.print("Please enter the year of the car: ");
                year = userInput.next();

        }



        public String getMake () {
                return make;
        }

        public String getModel () {
                return model;
        }

        public String getYear () {
                return year;
        }

        public String getLastName () {
                return lastName;
        }

        public void setMake (String make) {
                this.make = make;
        }

        public void setModel (String model) {
                this.model = model;
        }

        public void setYear (String year) {
                this.year = year;
        }

        public void setLastName (String lastName) {
                this.lastName = lastName;
        }

        public String toString () {
                    return (lastName + "   " + make + "   " + model + "   " + year);
        }




}
