/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19tempcheck_orengoanthony;
 // <editor-fold defaultstate="collapsed" desc="~Imported Classes~">
import javax.swing.JOptionPane;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.ImageIcon;
// </editor-fold>
/**
 *
 * @author Anthony
 */
public class DocumentWriter {
    
    //Fields
    public String covidDate;
    public String guardName;
    public DocumentWriter(){
    
        covidDate = "";
        guardName = "";
    }
     // <editor-fold defaultstate="collapsed" desc="~Write to Daily Tracker~">
    public static void WriteToDocument(DocumentWriter doc, 
            Tracker trackResults) throws IOException
    {
        //Create date and time formatter object 
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern
        ("yyyy/MM/dd HH:mm:ss");
        
        //Get name of file from user
        LocalDateTime currentDateTime = LocalDateTime.now();  
        doc.covidDate =(String)JOptionPane.showInputDialog(null, 
                             "\nCreate File:\n"
        + "*******************************************************\n"
        + "1. Enter Name of file without .txt:\n"
        + "2. File Name Format: DDMMMYYYY\n"
        + "ex. 01SEP2020\n\nNote:\nA. This will only write the current\n"       
        + "daily tracker results for positive and\n"
        + "negative cases. This will not include\npersonal data.\n"       
        + "B. If you enter in an existing file name,\n"
        + "the data on that file will be overwritten\n"
        + "to update the current results.\n\nEnter File Name:");                    
        
      //Create or write to existing document. This will write over existing 
      //document if file name is the same.
      FileWriter writer = new FileWriter("CovidDailyTrackerDocs/" + 
              doc.covidDate + ".txt");
      //Allows user to write to docuemnt
      BufferedWriter buff = new BufferedWriter(writer);
        
        try
        {
            //Writes current covid19 numbers to document specified by the user.
            buff.write("Covid-19 Daily Tracker\n"
               + "*************************************\n"
                + "\nCurrent Date: " + java.time.LocalDate.now()
                + "\nLast Update: " + dateTimeFormatter.format(currentDateTime)
                + "\nGuards Name: " + doc.guardName);
            
        
            buff.write("\n\nCurrent Positive Cases\n"
                + "*************************************\n"
                + "Student Cases: " + 
                    Integer.toString(trackResults.studentTrackerPos) 
                + "\nFalculty Cases: " + 
                    Integer.toString(trackResults.falcultyStaffTrackerPos)
                + "\nOther Cases: " + 
                    Integer.toString(trackResults.otherTrackerPos));  
        
            buff.write("\n\nCurrent Negative Cases\n"
                + "*************************************\n"
                + "Student Cases: " + 
                    Integer.toString(trackResults.studentTrackerNeg) 
                + "\nFalculty Cases: " + 
                    Integer.toString(trackResults.falcultyStaffTrackerNeg)
                + "\nOther Cases: " + 
                    Integer.toString(trackResults.otherTrackerNeg));  
            buff.newLine();
            //Closes buff reader
            buff.close();
            //Closes file used for writing to.
            writer.close();
            //Displays if data is successfully writtent to the document.
            System.out.println("Successfully wrote to the file.");
            
        }catch(Exception e)
        {
            //Display if data faild to write to the specified document.
            System.out.println("Document failed to write!");
            
        }       
    }
    // </editor-fold>
    public static void WritePositiveCasesInformationToDocument(
            DocumentWriter positiveCaseDoc, Person person) throws IOException
    {
        //Declare variables 
        boolean loop = false;
        String input;
        //Create date and time format object
         DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern
        ("yyyy/MM/dd HH:mm:ss");
        //Create current time object
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        //Get user to enter a new or existing document name------------------//
         do
         {
             input = JOptionPane.showInputDialog(null, 
           "1. Create new document\n 2. Write to existing file","Document Name", 
           JOptionPane.PLAIN_MESSAGE );
            switch(input)
            {
                case "1":
                    input = JOptionPane.showInputDialog(null, 
                "Enter New Document Name(w/o .txt)","Document Name", 
                JOptionPane.PLAIN_MESSAGE );
                    loop = true;
                    break;                    
                case "2":
                    input = JOptionPane.showInputDialog(null, 
                "Enter Existing Document Name(w/o .txt)","Document Name", 
                JOptionPane.PLAIN_MESSAGE );
                    loop = true;
                    break;                  
                default:                    
                    System.out.println("Invalid option! Try again!");
                    break;                
            }              
         }while(loop == false);        
        //====================================================================
        //Create new file and writer and buff objects
        File file = new File("PositiveTrackerDocs/" 
                + input +"_Covid19TempResults.txt");        
        FileWriter writer = new FileWriter(file, true);        
        BufferedWriter buff = new BufferedWriter(writer);
        
        //Create print writter object to allow user to append the document.
        PrintWriter printWriter = new PrintWriter(buff);
        
        /*Determine if file has anything written to it. If the file is empty
        the title will be written to the document. Else the title will not 
        be written and the writer will add the current data to the exisitng 
        document-------------------------------------------------------------*/
        if(file.length() == 0){
         file.createNewFile();
         System.out.println("File created.");
         buff.write("Fayetteville Technical Community College\nCovid-19 Tracker"
         + "\n******************************************************\n"
         + "Document Created: " + dateTimeFormatter.format(currentDateTime) +
         "\n******************************************************\n");
        }
        else{
            System.out.println("file exist! Select to add!");
        }
        //====================================================================
        //Reset loop sentinel to false
        loop = false;
        
        //Get user to add data to specified document or exit and return to main.
        do{             
            input = JOptionPane.showInputDialog(null,  
            "1. Add to Doc\n" +            
            "2. Exit\n" + 
            "\nSelect from the menu");
            switch(input)
            {               
                case "1":
                 try{                       
                    printWriter.print("\nDate/Time Observed: " 
                 + dateTimeFormatter.format(currentDateTime) 
                 + "\nPersonal Data" + "\n______________________________" + 
                      "\n\nName: " + person.firstName + " " + person.lastName +
                   "\nID#: " + person.identificationNumber + 
                   "\nPhone Number: " + person.phoneNumber +
                   "\nAge: " + person.age +
                   "\nStatus: " + person.status +"\n"
                 + "Reason: Positive Covid-19 Case\n"
                 + "*********************************\n");
                    buff.close();
                    writer.close();
                    printWriter.close();
                    System.out.println("Successfully wrote to the file.");
                    //Display invalid if document does not exist
                   }catch(Exception e){
                    
                       JOptionPane.showMessageDialog(null, "Invalid entry!   \n"
                          + "Try Again!  ","Invalid",JOptionPane.PLAIN_MESSAGE);
                   }                    
                    break;               
                    case "2":
                        //Exits menu and returns to main menu
                        loop = true;
                    break;
                default:
                    System.out.println("Invalid option! Try again!");                    
                    break;                  
            }           
        }while(loop == false);       
    }
    
    @SuppressWarnings("empty-statement")
    //View current documents stored in folders
    public static void ViewCurrentDocument(DocumentWriter doc, 
            Tracker trackResults) throws IOException{
        //Create miage icon object to display red x
        ImageIcon redX = new ImageIcon("Images/RedX.jpg");
        
        try{
            //Get folder name from user
            String input =(String)JOptionPane.showInputDialog(null, 
                    "Input Folder Name   ");   
            //Get file name from user
            doc.covidDate =(String)JOptionPane.showInputDialog(null, 
                    "Enter File Name without .txt:      ");       
            //Create buffered reader object to read files from folder
            BufferedReader read = new BufferedReader(new FileReader(input + "/" 
                    + doc.covidDate + ".txt"));
            int index = 0;
            String str = "";
            
            //Create Scanner object to scan data read by the buffered reader
            Scanner sc = new Scanner(read); 
            while(sc.hasNextLine())
                //Diplay document data in the console
            System.out.println(sc.nextLine());  
            
           //Close the file 
            read.close();
        }
            //Create exception if user enters a letter instead of a number
        catch(Exception e)
        {
            //Display if file or folder is invalid
            JOptionPane.showMessageDialog(null, 
            "Invalid Document!   \nTry Again!  ","Invalid",
            JOptionPane.PLAIN_MESSAGE, redX);                
        }              
    }
}
