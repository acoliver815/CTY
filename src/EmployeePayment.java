
import java.util.Scanner;

public class EmployeePayment {
    public static void main(String[] args) {
     System.out.println(emid(6));
        /*
        Overview:
As you have learned throughout this unit, arrays are very powerful tools designed to perform complex tasks with large amounts of data. Therefore, as a continuation of your course portfolio, for this assignment you will be required to use arrays to store, manipulate, and display employee data.

Now that the company has grown, you have more employees to manage and track. There are a mix of salaried and hourly employees, too. In this unit assignment, you will allow the user to enter employee IDs and store them in an array.

Once all employees are entered, the array will be sorted and printed in numerical order, then your program will loop through the array, display the employee ID, and ask the user to input a code to indicate whether the employee receives a set salary or is paid hourly.

The Employee ID and their employment type will then be stored in a two-dimensional array.

Finally, the user will be presented with a report that lists all salaried workers by ID number, followed by a report that lists all hourly workers by ID.

Specification:
The initial output to be displayed is:

 A welcome message that informs the user on the purpose of the program
Instructions on the input process that is to be used (for example, “Enter the total number of employees to be entered" and "Please enter an employee ID.”)
The inputs required for testing this Java program are listed below:

The total number of employees to be entered.
At least 10 six digit employee IDs
The secondary output to be displayed is:

All employee IDs sorted in numerical order
A message asking user to enter employee type for each employee
A request to enter 1 for salaried and 2 for hourly when prompted
The final output to be displayed is:

A formatted listing of all salaried employees
A formatted listing of all hourly employees
The data constructs, calculations and decisions required are:

An array that will store the employee ID data.
Sort the initial array into numerical order
A two dimensional array to store employee ID and employee type
Depending on program design, you may use interim arrays to hold hourly and salaried workers for the final reporting, or you may sort the array by employee type before reporting, or some combination thereof.
         */
    }
    public static Boolean check(){
        Scanner myObj = new Scanner(System.in);
        Boolean result = true;

        System.out.println("Is this your final input? (Y/N)");
        String Check = myObj.next();
        if(Check.equals("y") || Check.equals("Y")){
            result = true;
        } else if(Check.equals("n") || Check.equals("N")){
            result = false;
        }
        return result;
    }
    public static int emnum(){
        Scanner myObj = new Scanner(System.in);
        Boolean numcheck = false;
        int em_num = 0;
        System.out.println("This is a program for entering payment types for employees.\n Begin be enterting the number of employees you wish to add to this list.\n Then eneter their 10-digit employee number.\n Finally, when prompted with an ID, please enter 1 if they have a salary, or 2 if they are paid hourly");
        while(numcheck == false) {
            System.out.println("Please enter the number of employees you wish to add into the program.");

            em_num = myObj.nextInt();
            if (check()) {
                numcheck = true;
            }
        }

        return em_num;
    }
    public static int[] emid(int num){
        Scanner myObj = new Scanner(System.in);
        Boolean idcheck = false;
        int[] emids = new int [num];
        int num2 = 0;
            while (num2!=num){
                System.out.println("Please enter the 10-digit id number of the employee.");
                int emid = myObj.nextInt();
                emids[num2] = emid;
                num2-=1 ;
            }
        return emids;
    }
}