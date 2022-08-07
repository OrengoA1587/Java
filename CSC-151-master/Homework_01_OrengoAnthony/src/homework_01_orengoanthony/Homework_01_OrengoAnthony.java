/*Description: This program calculates the buy and sell transactions for stocks,
 using the JOptionPane method. 
 *Programmer: Anthony Orengo
 *Date: 01.25.2020 
 */
package homework_01_orengoanthony;

//Used to display JOptionPane Dialog box
import javax.swing.JOptionPane;
//Decimal format object for decimal variables
import java.text.DecimalFormat;
//Formats the date and time
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;
//Object class to create random numbers
import java.util.Random;
import javax.swing.ImageIcon;



public class Homework_01_OrengoAnthony {

    
    //--------------Beginning of main method--------------------------//
    public static void main(String[] args) {
        pseudocode(); //Begins program with pseudocode       
        stock();// Calls the method stock()
        
    } 
    //=============End of main method=================================//
    
    
    //------------------Beginning of stock method----------------------------//
    public static void stock(){
             
     //------Set random int gen,decimal format, date/time, and image icon----//
        
        //Random int generator (10)
        Random order = new Random(); 
        int order_Number = order.nextInt(1000000000); 
        int order_Number2 = order.nextInt(1000000000); 
        
        //Displays numbers in currency format
        DecimalFormat dollar = new DecimalFormat("$0.00");
        //Diplays numbers in decimal format using the first decimal place
        DecimalFormat dec = new DecimalFormat("0");

        //Date time format object to generate current time of transaction
        Date date = new Date();
        LocalDateTime currentTime = LocalDateTime.now(); 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(
                                       "yyyy/MM/dd HH:mm:ss");         
              
        //Custom image icon for dialog box//
        ImageIcon tradeSymbol = new ImageIcon("OTResize.png");
        ImageIcon boxSymbol = new ImageIcon("OTResize2.png");
     //=======================================================================//
        
     //------------------------Declared Variables-----------------------------//
        //Constant variables
        double TRADE_FEE = .02d;       
         
        //Declared variables
        int shares = 0;
        double stockPrice = 0.0d;   
        String tickerSymbol;       
        String type;
        String input;
        String title = "Welcome to Orengo Trade";
          
     
     //**************Beginning of stock purchase transaction*****************//     
     
        //Welcome dialog box        
        JOptionPane.showMessageDialog(null,"Press OK to Enter",
               title, JOptionPane.INFORMATION_MESSAGE,tradeSymbol);
        
        //Get ticker/stock symbol from user
        tickerSymbol = (String) JOptionPane.showInputDialog(null, 
                 "Enter Ticker Symbol: ","Ticker Symbol",JOptionPane.NO_OPTION,
                 boxSymbol,null,"");                                
        
        //Get fill type from user (Market or Limit)
        type = (String)JOptionPane.showInputDialog(null, "Market/Limit", 
                "Fill Type", JOptionPane.NO_OPTION,boxSymbol,null,"");
       
        //Get user to enter amount of ahres to be purchased
        input = (String)JOptionPane.showInputDialog(null,"How many shares : "
                + "","Shares", JOptionPane.NO_OPTION,boxSymbol,null,"");
        shares = Integer.parseInt(input); //Converts String to Integer//
        
        //Get user to enter current stock price
        input = (String)JOptionPane.showInputDialog(null,"Enter stock price: ",
                "Shares",JOptionPane.NO_OPTION, boxSymbol,null,"");        
        stockPrice = Double.parseDouble(input);//Converts String to Double//
        
        
        //Declared variables to calculate stock purchase to include fees-----//
        double stockPurchase = shares * stockPrice;        
        double purchaseFee = TRADE_FEE * stockPurchase;
        double totalPurchase = stockPurchase + purchaseFee;
        
        
        //Object array to display stock purchase transaction
        Object [] stockPur = {
           
           "******************************",
           "Order#:  " + order_Number,
           "Filled:  " + type,
           "Ticker Symbol:  " + tickerSymbol,
           "",
           "Account:  " + "OrengoA0000",
           "Expires:  " + "DAY",
           "Routing:  " + "SMART",
           "Special Inst: " + dtf.format(currentTime),
           "Purchase Shares:  " + shares,
           "Stock Price:  " +  dollar.format(stockPrice),
           "Total Price:  " + dollar.format(stockPurchase),
           "Commission Fee:  " + dollar.format(purchaseFee),
           "Total Purchase Price :  " + dollar.format(totalPurchase),
           "***********************************"
        };        
            
            //Displays object array "stockPur in JOptionPane dialog box
            JOptionPane.showMessageDialog(null, stockPur,
               "Stock Purchase Transaction",JOptionPane.INFORMATION_MESSAGE,
                                                                 boxSymbol);
       
       //*************End of stock purchase transaction********************//
       
                
        /*This section of the program gives the user the option to sell 
        his/her shares or end the program.*/
        
            //Object array to display stock option menu
            Object [] optionsMenu = 
            {
                
                "Would you like to sell shares?",
                "Enter 1: Yes",
                "Enter 2: No"
            };
          
          //Displays object array "menu in JOptionPane dialog box  
          String option = JOptionPane.showInputDialog(null, optionsMenu, 
                                      "*WARNING*",JOptionPane.OK_CANCEL_OPTION);
          //Converts purchaseOption to int
          int optionChoice = Integer.parseInt(option);
          
          //Gives user the option to continue or not.
          if(optionChoice == 1)
          {
          }
          else if(optionChoice == 2){
             JOptionPane.showMessageDialog(null, "Good Bye!"); 
             //Ends program
             System.exit(0);
          }   
          
     //*****************Beginning of stock sell transaction******************//
                      
        //---------------Declared Variables for stock sell----------//
        double percentShares;
        double sellPrice;     
        double sellAmount;  
        double shareNumber;
       
       //Welcome back dialog box  
      JOptionPane.showMessageDialog(null,"Welcome Back to Orengo Trade",
                title, JOptionPane.OK_CANCEL_OPTION,tradeSymbol);          
              
        // Get current stock price from user
       input = (String)JOptionPane.showInputDialog(null,"Enter stock price: ",
               "Current Stock Price",JOptionPane.NO_OPTION,boxSymbol,null,"");        
       stockPrice = Double.parseDouble(input); 
       
        // Object array to display menu option for percentage and number
        Object []shareMenu = 
            {
                
                "Would you like to enter a number or percentage of shares?",
                "Enter 1: Number",
                "Enter 2: Percent"
            };
      
          //Displays object array "menu in JOptionPane dialog box  
          String shareChoice = (String)JOptionPane.showInputDialog(null, 
                  shareMenu, " Share number",JOptionPane.OK_CANCEL_OPTION,
                  boxSymbol,null,"");
          
          //Converts shareChoice to int
          int shareOption = Integer.parseInt(shareChoice);
          percentShares = 0;
          //Gives user the option t enter a number or percentage of shares.
          if(shareOption == 1)
          {
              //Get number of shares user wants to sell
            input = (String)JOptionPane.showInputDialog(null, 
                 "Enter number of shares","Shares",JOptionPane.OK_CANCEL_OPTION,
                 boxSymbol,null,"");
            shareNumber = Integer.parseInt(input);
            //Converts number of shares inputted to a percentage
            percentShares = (shareNumber / shares) * 100;           
          }
          else if(shareOption == 2)
          
          {
             //Get percentage of shares the user wants to sell
             input = (String)JOptionPane.showInputDialog(null,
                   "What percentage would you like to sell? ", 
                   "Percent of Shares",JOptionPane.NO_OPTION,boxSymbol,null,"");
             percentShares = Double.parseDouble(input);
           
          }   
                        
        
        //Calculates the percentage of shares to be sold
        double sharesPercent = percentShares / 100;
        double stockPurPercent = sharesPercent * totalPurchase;
        //Calculates the amount of shares to be sold
        double sharesToSell = sharesPercent * shares;       
        
        //Total amount from sell shares
        double sell = sharesToSell * stockPrice; 
        
        //Total fees equals totalSell + TRADE_FEE 
        double sellFee = sell * TRADE_FEE;
        /*Calculates the total profit by subtracting tade fees and 
        purchase price from total sell.*/
        double totalSell = sell - sellFee;
        double totalFees = sellFee+ purchaseFee;
        double profit = (totalSell - stockPurPercent); 
        
        //Totals shares left over//
        double sharesRemaining = shares - sharesToSell;
        //Current account value after transaction
        double currentValue = sharesRemaining * stockPrice; 
        
        //Object array to display stock sell transaction
         Object[] stockSel = {
           
           "******************************",
           "Order#:  " + order_Number2,
           "Filled:  " + type,
           "Ticker Symbol:  " + tickerSymbol,
           "",
           "Account:  " + "OrengoA0000",
           "Expires:  " + "DAY",
           "Routing:  " + "SMART",
           "Special Inst:  " + dtf.format(currentTime),
           "Sell Shares:  " + dec.format(sharesToSell),
           "Stock Price:  " +  dollar.format(stockPrice),
           "Sell Price:  " + dollar.format(sell),
           "Commission Fee: " + dollar.format(sellFee),
           "Total Sell Price:  "  + dollar.format(totalSell),
           "***********************************"
       };      
       
       //Displays sell transaction
      JOptionPane.showMessageDialog(null, stockSel,"Stock Sell Transaction",
                                   JOptionPane.INFORMATION_MESSAGE,boxSymbol);
      
      // Object array to display menu option to sell or not
      Object [] menuSell = {
                
            "Do you wish to continue",
             "Enter 1: Yes",
             "Enter 2: No"
        };
      
      String sellChoice = JOptionPane.showInputDialog(null, menuSell, 
                                     "*WARNING*",JOptionPane.OK_CANCEL_OPTION);
          int sellOption = Integer.parseInt(sellChoice);
          
          
          //Gives user the option to continue or not.
          if(sellOption == 1)
          {
             
          }
          else if(sellOption == 2){
             JOptionPane.showMessageDialog(null, "Good Bye!"); 
             System.exit(0);
          }   
         
      //Object array to display stock transaction Summary 
      Object[] transactionSum = new Object[]
      {
          "*******************************",
          "     Transaction Summary",
          "*******************************",
          " ",
          "Stock Purchase Summary",
           stockPur,
          "Stock Sell Summary",
           stockSel,
          "Account Summary",
          "*******************",
          "Total Profit: " + dollar.format(profit),
          "Shares Remaining: " + dec.format(sharesRemaining),
          "Current Account Value: " + dollar.format(currentValue)
          
      };
      
     JOptionPane.showMessageDialog(null,transactionSum,"Stock Trade Summary",
                                   JOptionPane.INFORMATION_MESSAGE,boxSymbol);
     
     
            
     JOptionPane.showMessageDialog(null,"Thank you for using Orengo Trade!",
                                   "End of Transaction",
                                   JOptionPane.INFORMATION_MESSAGE,boxSymbol);

      //****************End of stock sell transaction***********************// 
      
    }    
    //================Ending of stock method================================//          
    
     
    
    
    //**************************Pseudocode**********************************//
    
    public static void pseudocode(){
        
        ImageIcon tradeSymbol = new ImageIcon("OTResize.png");
        String [] pseudo = new String []
        {
            
           "                                                        "
                + "     * Pseudocode *", 
           "------------------------------------------------------------------"
                + "-----------------------------------------------------------",
           "1. Import JOptionPane, Decimal format, time/date format, "
                + "Random, Image.",
           " ",
           "2. Declare/ initialize Decimal format, time/date format, "
                + "Random, Image variables.",
           " ",
           "3. Declare stock trade variables and include one constant variable"
                + "(trade fee).",
           " ",
           "4. Create a welcome box for the program and change image icon to "
                + "OTResize.png",
           " ",
           "5. Get user input by creating input dialog boxes for ticker symbol,"
                + " order type,",
                           
           "number of shares, and current stock price.",
           " ",
           "6. Declare variables to calculate the total cost to include fees.",
           " ",
           "7. Place variables in an object array called stockPur, and "
                + "display it ",
           "using a message dialog box. Note: format the object array to "
                + "look like a reciet.",
           " ",
           "8. Create a menu from an object array  called optionsMenu, to give "
                + "the user an option to sell. ",
            " Note: If user chooses yes proceed to sell transaction, "
                + "if user chooses no end program.",
            " ",
           "9. Create welcome back dialog box to begin the sell transaction",
           " ",
           "10. Declare sell variables.",
           " ",
           "11. Get user to input updated and current stock price.",
           " ",
           "12. Create object array menu called shareMenu, to give "
                + "user an option to ",          
           "enter a number or percentage of shares.",
           " ",
           "13.Declare sell variables to calculate the total cost of "
                + "stock sell.",
           " ",
           "14. Calculate total profit by multiplying the total purchase by the"
                + "percentage used to sell shares.  ",
           " ",
           "15. Place variables in an object array called stockSel, and "
                + "display it ",           
           "using a message dialog box. Note: format the object array to "
                + "to look like a receipt.",     
           " ",
           "16. Create an object array called menuSell and give user an "
                + "option to sell or not.",
            " ", 
           "17. Create a final object array called transactionSum and place the"
                + "stockPur, stockSel arrays",
           "plus the total profit, remaining shares and current account value."
                + " Note: Display like a receipt.",
            "================================================================="
                + "=============="
              
        };
        
        JOptionPane.showMessageDialog(null, pseudo, "Pseudocode", 
                JOptionPane.NO_OPTION,tradeSymbol);
        
        
    }//*********************Pseudocode***************************************//
    
    
}//Ending of Homework_01_OrengoAnthony//
