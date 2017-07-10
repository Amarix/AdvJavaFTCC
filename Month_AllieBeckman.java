
package month_alliebeckman;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Allie
 */
public class Month_AllieBeckman {
      
    
  /**  
   public boolean monthNameAcceptor()
    {
        
        Scanner usersMonth = new Scanner(System.in);
        System.out.println("Please enter the month in either number format "
                + "(1 - 12) or the full name ex: November:");
        
        usersMonthStringVersion = usersMonth.next();   
        
        try
        {
            int usersMonthNumberVersion = 
                Integer.parseInt(usersMonthStringVersion);
            
            userMonthIsString = false;
            
        }
        catch(NumberFormatException nfe)
        {
            userMonthIsString = true;
        }
        
        
        if (userMonthIsString == true){
            return true;
        }
        else
        {
        return false;
        }
    }
    **/
    
    public static void main(String[] args)
    {
        int correspondingNumber;
        int monthNumber = 1;
                
        String[] monthName = new String[13];
        
        monthName[0] = "invalid";
        monthName[1] = "January";
        monthName[2] = "February";
        monthName[3] = "March";
        monthName[4] = "April";
        monthName[5] = "May";
        monthName[6] = "June";
        monthName[7] = "July";
        monthName[8] = "August8";
        monthName[9] = "September";
        monthName[10] = "October";
        monthName[11] = "November";
        monthName[12] = "December";
                
        
        Scanner usersMonth = new Scanner(System.in);
        System.out.println("Please enter the month in either number format "
                + "(1 - 12) or the full name ex: November:");
        
        String usersMonthEntry = usersMonth.next();
  
        boolean itsAString = itsAString(usersMonthEntry, monthNumber);
        
        if (itsAString == true)
        {
           correspondingNumber = 
                   Arrays.asList(usersMonthEntry).indexOf(monthName);
           

           System.out.println("The month you entered is :");
           System.out.println(usersMonthEntry);
        }

        if (itsAString == false)
        {
            
            
            // try to figure out how to pull the int for the index from the
            // boolean to find the right index
            if (monthNumber < 1 || monthNumber > 12)
            {
                monthNumber = 1;
            }
        
            String translatingMonthNumber = monthName[monthNumber];
            
            System.out.println("You entered month: ");
            System.out.println(translatingMonthNumber);
            }
    }
    
    public static boolean itsAString(String a, int b)
    {       
        
        try
        {
            b = 
                Integer.parseInt(a);
            
            // the number is the number needed for the if/false statement in 
            // the main method. This value needs to carry over to that
            // if statement.
            int theNumber = b;
            return false; // it's a number
            
        }
        catch(NumberFormatException nfe)
        {
            return true; // it's a string
        }
        
        
        
    }
}
    
    /**
    public void monthName(String[] args)
    {
        monthName = new String[11];
        
        monthName[0] = "January";
        monthName[1] = "February";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "October";
        monthName[10] = "November";
        monthName[11] = "December";
    }
    **/
    
    /**
    public void monthNameAcceptor()
    {
        
        Scanner usersMonth = new Scanner(System.in);
        System.out.println("Please enter the month in either number format "
                + "(1 - 12) or the full name ex: November:");
        
        usersMonthStringVersion = usersMonth.next();   
        
        try
        {
            int usersMonthNumberVersion = 
                Integer.parseInt(usersMonthStringVersion);
            
            userMonthIsString = false;
            
        }
        catch(NumberFormatException nfe)
        {
            userMonthIsString = true;
        }
        
        
    }
}
**/   



