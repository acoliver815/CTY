import java.util.*;


public class NewWorkplace {
    public static void main(String[] args){
        StringBuilder evallist = new StringBuilder();
        Scanner myObj = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Welcome to the Game Bazaar's financial website!\nPlease enter then number of sites you wish to evaluate.");
        int evalnum = myObj.nextInt();
        while(evalnum!=0){
            Boolean discheck = false;
            Boolean placecheck = false;
            while (!placecheck) {
                System.out.println("Please enter the address of a building that is between 100 and 800 miles away.");
                String word = "";
                word += myObj.next();
                System.out.println("Is this the correct address?(y/n):" + word);
                String pcheck = myObj.next();
                if (pcheck.equals("y")) {
                    evallist.append(word + ", ");
                    placecheck = true;
                }
            }
            while (!discheck){
                System.out.println("Please enter the distance to that building between 100 and 800 miles away.");
                int distance = myObj.nextInt();
                if(distance<801&&distance>99) {
                    evallist.append(distance + " miles away\n");
                    discheck = true;
                } else{
                    System.out.println("Unusable distance, please enter a viable distance.");
                }
            }
            evalnum--;

        }
        System.out.println(evallist);


    }
}
