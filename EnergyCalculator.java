/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * This program calculates the energy that can be calculated from a given mass
 *     
 *
 ****************************************************************************/



//have to import the following in order to use the scanner:
import java.util.Scanner;

//****************************************************************************
public class EnergyCalculator {

    public static void main(String[] args) {
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set variables to a random default
    	//float = decimal with less places
    	double massInput=0, totalEnergy=0;
        double speedOfLight= 2.998*Math.pow(10,8);
        //no input yet
        String input = null;
    	
        
        //while appropriate response has not been collected
        //use while-true functions to break out of
    	while (true) {
    		//keep asking for input
    		System.out.println("Input mass (kg) to be converted: ");
		
    		//Get input as a string value------------------------------------
    		input = scanner.nextLine();
		
    		//check if response if a number:----------------------------------
    		try {
			
    			//Convert string to double
    			massInput = Double.parseDouble(input);
    			//여기 안에다 할거 넣으면 operate 됨.
			
    			//calculate  (E=mc^2)
    			totalEnergy= massInput*speedOfLight;
    			System.out.println("Maximum amount of energy the mass can be converted into: " + totalEnergy + "J.");
    			break; //need break to get out of while loop and not repeat question
    			
    		} catch (NumberFormatException stringInput) {
    			//if not number then
    			System.out.println("ERROR:\nPut in a numeric value. TRY AGAIN. \n\n");
    		}
		
    	}//closing for while
    
    }//closing for public main
}//closing for public class EnergyCalculator
