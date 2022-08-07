/************************************************************************
/*Description: This program determines if a student or falculty member
 *is in accordance with the Fayetteville Technical Community College
 *Covid-19 Temperature Policy. The user will input the student or falculty 
 *members temperature and follow the instructions on the screen. Positive 
 *Covid cases will be recorded and saved to a separate document in the 
 *PositiveTrackerDocs folder. The daily tracker total will be saved in a 
 *separate document in the CovidDocs folder.
 *Programmer: Anthony Orengo
 *Date: 08.23.2020 
 * 
 *Date of completion pending
 */
package covid19tempcheck_orengoanthony;
// <editor-fold defaultstate="collapsed" desc="~Import classes~">
import static covid19tempcheck_orengoanthony.DocumentWriter.ViewCurrentDocument;
import static covid19tempcheck_orengoanthony.DocumentWriter.WriteToDocument;
import static covid19tempcheck_orengoanthony.
        DocumentWriter.WritePositiveCasesInformationToDocument;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Image;
import java.awt.*;  
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.plaf.FontUIResource;
// </editor-fold>
/**
 *
 * @author Anthony
 */
public class COVID19TempCheck_OrengoAnthony {
    /**
     * @param args the command line arguments
     */
    //BEGINNING OF MAIN------------------------------------------------------///
    public static void main(String[] args) throws IOException { 
        // <editor-fold defaultstate="collapsed" desc="~Variables/Objects~">
        //VARIABLES//--------------------------------------------------------
        //Declare and initialize variables////////////////////////////////////
        String input = "";
        String title = "Welcome";
        int studentTracker = 0;
        int falcultyStaffTracker = 0;
        int otherTracker = 0;
        
        double temperature = 0.0;
        //Set sentinel for loop
        boolean menuLoop = false; 
        //=====================================================================
        //OBJECTS--------------------------------------------------------------
        //Create scanner,tracker, writer, readers,person objects
        Scanner keyboard = new Scanner(System.in); 
        Tracker trackResults = new Tracker();
        DocumentWriter doc = new DocumentWriter();
        Person person = new Person();
        FileWriter writer = new FileWriter("PositiveTrackerDocs/" 
                + java.time.LocalDate.now() + ".txt");
        BufferedWriter buff = new BufferedWriter(writer);
        //=====================================================================
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="~Background/Border~">
        //BACKGROUND/BORDER COLORS----------------------------------------------
        //Create UI manager object to adjust background////////////////////////
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.LIGHT_GRAY);
        UI.put("Panel.background", Color.LIGHT_GRAY);   
        UI.put("Panel.", Color.red);  
         UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          " Century Gothic", Font.ROMAN_BASELINE, 18)));  
         //====================================================================
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="~Image Icons~">

        //IMAGE ICONS----------------------------------------------------------
        //Create image icon objectsto diplay various pictures
        ImageIcon covidImage = new ImageIcon("Images/CovidMapImage.png");
        ImageIcon resultsPosIconImage = new ImageIcon
        ("Images/PosCovidCasesImage.jpg");
        ImageIcon resultsNegIconImage = new ImageIcon
        ("Images/NegCovidCasesImage.jpg");
        ImageIcon icon = new ImageIcon("Images/Covid19Image4.jpg");
        ImageIcon icon2 = new ImageIcon("Images/TempCheckImage.jpg");
        ImageIcon highTempIcon = new ImageIcon("Images/HighReading.jpg");
        ImageIcon personIcon = new ImageIcon("Images/PersonSelection.png");
        ImageIcon maleFemaleIcon = new ImageIcon("Images/MaleFemaleImage.jpg");
        ImageIcon wristBandIcon = new ImageIcon("Images/Covid19WristBand.jpg");
        ImageIcon guard = new ImageIcon("Images/GuardImage2.jpg");
        ImageIcon ice = new ImageIcon("Images/ColdImage.jpeg"); 
        ImageIcon hot = new ImageIcon("Images/HotImage.jpeg");
        ImageIcon redX = new ImageIcon("Images/RedX.jpg");
        //=====================================================================
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="~Splash Screen~">
        //SPLASH SCREEN--------------------------------------------------------
        //Create JFrame object to create main splash page//////////////////////
        JFrame frame = new JFrame();        
        JLabel label = new JLabel(covidImage);
        frame.add(label);
        frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
         frame.pack(); 
        frame.setVisible(true); 
        //=====================================================================
        // </editor-fold>
        //ENTER GUARDS NAME----------------------------------------------------
        boolean guardLoop = false;
        do{
            doc.guardName = (String)JOptionPane.showInputDialog(null,
            "Enter Guards Name                 "
                    + "", "", JOptionPane.PLAIN_MESSAGE,guard, null,"");
                
                if(doc.guardName.length() == 0){
                 guardLoop = false; 
                }
                else
                {
                 guardLoop = true;                 
                }
        }while(guardLoop == false);
        //=====================================================================
        // <editor-fold defaultstate="collapsed" desc="~Main Menu~">
        //MAIN MENU------------------------------------------------------------
        do
        {           
            //Get user to make selection from main menu
          input = (String) JOptionPane.showInputDialog(null,""
                  + "\n\n\n\n\n\n\n\n\nCOVID-19 Temperature Check             "
                   + "\n**************************************************\n"
                   + "Main Menu\n"
                   + "1. Enter temperature\n"
                   + "2. Positive Cases\n"
                   + "3. Negative Cases\n"
                  +  "4. Write to Document\n"
                  +  "5. View Document\n"
                   + "6. Exit\n"
                   + "**************************************************\n"
                   + "\nMake a selection:","Covid-19",
                   JOptionPane.INFORMATION_MESSAGE,icon, null, ""); 
            
           switch(input)
           {
               case "1":
                   //Get Temperature readings from user
                   GetTemperatureReading(temperature, keyboard,input, 
                  studentTracker, falcultyStaffTracker,otherTracker,person,icon,
                  icon2,highTempIcon, personIcon,maleFemaleIcon,wristBandIcon,
                  ice,hot,redX,trackResults,writer,buff);                   
                   break;                  
               case "2": 
                   //Display positive case numbers
                   TotalPositiveCases(input,trackResults,resultsPosIconImage);                                                      
                   break; 
               case "3":
                   //Display negative case numbers
                   TotalNegativeCases(input,trackResults,resultsNegIconImage);                  
                   break; 
               case "4":
                   //Write to specified document
                   WriteToDocument(doc, trackResults);
                                   
                   break;
                case "5":
                    //Allows user to view any document in console
                   ViewCurrentDocument(doc, trackResults);
                                   
                   break;
               case "6":
                   //Ends program
                   menuLoop = true;                   
                   break;
               default:     
                   //Displays invalid option to user
                   JOptionPane.showMessageDialog(null,"Invalid Selection! "
                           + "Try again...");
                   break;
           }            
            
        }while(menuLoop == false);   
         // </editor-fold>
        //END OF MAIN MENU=====================================================
    }
    //START GETTEMPERATUREREADING METHOD------------------------------------//
     // <editor-fold defaultstate="collapsed" desc="~Temp Reading~">
    public static void GetTemperatureReading(double temperature,
        Scanner keyboard, String input, int studentTracker, 
        int falcultyStaffTracker,int otherTracker, Person person,ImageIcon icon,
        ImageIcon icon2,ImageIcon highTempIcon, ImageIcon personIcon,
        ImageIcon maleFemaleIcon,ImageIcon wristBandIcon,ImageIcon ice,
        ImageIcon hot, ImageIcon redX, Tracker trackResults, 
        FileWriter writer, BufferedWriter buff) throws IOException    
    {   
       
        //DECLARE VARIABLES---------------------------------------------------
        boolean loop; 
        String result = "";
        //=====================================================================
        
        //START TEMPERATURE READINGS------------------------------------------
        //GET FIRST TEMP READING FROM USER------------------------------------
        do{
          loop = false;
          result = "";
          //Validate if input is a number or letter
         try{            
             input = (String)JOptionPane.showInputDialog(null, 
             "Enter Temperature:","1st Temperature Reading",
             JOptionPane.INFORMATION_MESSAGE,icon2,null,"");
            temperature = Double.parseDouble(input);
            }
            //Create exception if user enters a letter instead of a number
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid entry!   "
                 + "\n Try Again!  ","Invalid",JOptionPane.PLAIN_MESSAGE, redX);
                result = "true";
            }    
          if(result == "true")
          {               
          }
          else{
              loop = true;
          }           
        }while(loop == false);        
        
        //DISPLAY FIRST HIGH TEMP RESULTS INSTRUCTIONS------------------------
        if(temperature >= 100.4 && temperature <= 104.0)        
        {
           DisplayFirstHighTempInstructions(highTempIcon);
           do{
               //GET SECOND TEMP READING FROM USER------------------------------
               //Reset sentinel to false
                loop = false;
                result = "";
                //Validate if input is a number or letter
                try
                {            
                     //Get second temperture reading from user
                     input = (String)JOptionPane.showInputDialog(null, 
                     "Enter Temperature:","2nd Temperature Reading",
                     JOptionPane.INFORMATION_MESSAGE,icon2,null,"");        
                     temperature = Double.parseDouble(input);
                 }
                 //Create exception if user enters a letter instead of a number
                 catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Invalid entry!  "
                + " \n Try Again!  ","Invalid",JOptionPane.PLAIN_MESSAGE, redX);
                    result = "true";
                }    
                if(result == "true")
                {               
                }
                else
                {
                    loop = true;
                }           
            }while(loop == false);          
            //DISPLAY SECOND HIGH TEMP RESULTS INSTRUCTIONS---------------------
            //Give additional instructions if temperature still exceeds allowed
            if(temperature >= 100.4 && temperature <= 104.0)
            {
               DisplaySecondHighTempInstructions(highTempIcon); 
               
               //GET DATA FROM USER ON POSITIVE CASES--------------------------
               StudentFalcultyOtherPositive(input, studentTracker, 
               falcultyStaffTracker, otherTracker,person,personIcon,
               maleFemaleIcon, trackResults, writer, buff);   
               //===============================================================
            }  
            //DISPLAY MESSAGE IF INPUT IS AN UNREALISTIC NUMBER(2ND READING)----
            else if (temperature >= 104.1)
            {                
                JOptionPane.showMessageDialog(null,"Your brain is frying! "
                    + "Go to the hospital...    ", "Hot Temp Reading", 
                    JOptionPane.PLAIN_MESSAGE, hot);
            }
            else if (temperature <= 96.9)
            {   
            
            JOptionPane.showMessageDialog(null,"You are ice! Try again...   ",
                    "Cold Temp Reading", JOptionPane.PLAIN_MESSAGE, ice);
            }
            //=================================================================
            //DISPLAY NORMAL TEMP INSTRUCTIONS (2ND READING)-------------------
            else
            {
              //Displays normal temperature reading instructions
              DisplayNormalTempInstructions(wristBandIcon);  
              StudentFalcultyOtherNegative(input, studentTracker, 
              falcultyStaffTracker, otherTracker,personIcon,maleFemaleIcon, 
              wristBandIcon,trackResults);
            }           
        }
        //DISPLAY MESSAGE IF INPUT IS AN UNREALISTIC NUMBER(1ST READING)--------
        else if (temperature <= 96.9)
        {   
            
            JOptionPane.showMessageDialog(null,"You are ice! Try again...   ",
                    "Cold Temp Reading", JOptionPane.PLAIN_MESSAGE, ice);
        }  
        else if (temperature >= 104.1)
        {                
            JOptionPane.showMessageDialog(null,"Your brain is frying! "
                    + "Go to the hospital...   ", "Hot Temp Reading", 
                    JOptionPane.PLAIN_MESSAGE, hot);
        }
        //DISPLAY NORMAL TEMP INSTRUCTIONS (1ST READING)-----------------------
        else
        {
            //Displays normal temperature reading instructions
             DisplayNormalTempInstructions(wristBandIcon);    
             StudentFalcultyOtherNegative(input, studentTracker, 
             falcultyStaffTracker, otherTracker,personIcon,maleFemaleIcon, 
             wristBandIcon,trackResults);
        }       
    } 
     // </editor-fold>
    //END OF GETTEMPERATUREREADING===========================================//
    //DISPLAY MESSAGES----------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="~Temperature Instructions~">
    
    //-----------------Start DisplayFirstHighTempInstructions-----------------//
    public static void  DisplayFirstHighTempInstructions(ImageIcon highTempIcon)
    {
             JOptionPane.showMessageDialog(null,"1st High Temperature Reading\n"
                + "************************************\n"
                + "1. Have the individual sit in designated area.\n"
                + "2. Immediately call Public Safety at (910) 678-8433.   \n"
                + "An officer will be dispatched.\n"
                + "3. Wait 3-5 minutes and retake temperature.", "1st High "
                + "Reading", JOptionPane.INFORMATION_MESSAGE,highTempIcon);
    }
    //================End DisplayFirstHighTempInstructions===================//
    //-----------------Start DisplaySecondHighTempInstructions----------------//
    public static void DisplaySecondHighTempInstructions(ImageIcon highTempIcon)
    {
             JOptionPane.showMessageDialog(null,"2nd High Temperature Reading\n"
                + "**************************\n"
                + "1. Tell the person they will need to leave campus for\n"
                     + "everyones safety.\n"
                + "2. Instruct the individual to monitor their temperature\n"
                     + "and health symptoms.\n"               
                + "3. Give the individual a copy of the COVID-19 Campus   \n"
                     + "Exposure Procedures.\n"
                + "4. Instruct the individual wait for Public Safety Officer.\n"
                + "5. The officer will collect information and escort\n"
                     + "individual off campus.\n"
                + "6. If the individual does not have a ride, the officer\n"
                     + "will escort them to an isolation room.","2nd High "
                     + "Reading", JOptionPane.INFORMATION_MESSAGE,highTempIcon);
    }
    //==================End DisplaySecondHighTempInstructions=================//
     //-----------------Start DisplayNormalTempInstructions-----------------//
    public static void  DisplayNormalTempInstructions(ImageIcon wristBandIcon)
    {
         JOptionPane.showMessageDialog(null, "Normal Temperature Instructions\n"
                    + "1. Provide colored armband to individual\n"
                    + "2. Instruct individual to wear armband at all times on"
                    + " campus.    ","WristBand", JOptionPane.PLAIN_MESSAGE,
                    wristBandIcon);
    }
    //==================End DisplayNormalTempInstructions=====================//
    // </editor-fold>
    //END OF MESSAGES==========================================================    
    
//DAILY TRACKER RESULTS FOR COVID-19 POSITIVE CASES---------------------------//
// <editor-fold defaultstate="collapsed" desc="~Daily Tracker POS Cases~">
//-----------------Start StudentFalcultyOtherPositive-----------------//
    public static void StudentFalcultyOtherPositive(String input,
     int studentTracker,int falcultyStaffTracker,int otherTracker,Person person,
     ImageIcon personIcon,ImageIcon maleFemaleIcon,Tracker trackResults,
     FileWriter writer, BufferedWriter buff) throws IOException
    { 
       //Create documentwriter object and variables----------------------------
       DocumentWriter positiveCaseDoc = new DocumentWriter();
       int convertInput = 0;
       boolean loop =  false;   
       //======================================================================
       do
       {
           //Display menu to user
         input = (String)JOptionPane.showInputDialog(null,
         "Is the individual a: \n"       
         + "1. Student\n"
         + "2. Falculty\n"
         + "3. Other", "Title Status", JOptionPane.INFORMATION_MESSAGE,
         personIcon, null, "" );
          //Get input from user
          switch(input){
           
             case "1":
               trackResults.studentTrackerPos ++;
               //GetStudents infromation
              GetStudentInformation(person, positiveCaseDoc, input,writer,buff);
               //Displays instructions for students
               DisplayInstructionsForStudent(maleFemaleIcon);               
               loop = true;               
               break;
             case "2":
               trackResults.falcultyStaffTrackerPos++;
               //GetStudents infromation
              GetTeacherInformation(person, positiveCaseDoc, input,writer,buff);
               //Displays instructions for falculty/staff members
                DisplayInstructionsForFalculty(maleFemaleIcon);
                loop = true;
               break;
             case "3":
                trackResults.otherTrackerPos++;
                //GetStudents infromation
               GetOtherInformation(person, positiveCaseDoc, input,writer,buff);
                DisplayInstructionsForOther(maleFemaleIcon);
               loop = true;
               
               break;
             default:
               
                JOptionPane.showMessageDialog(null,"Invalid Selection! "
                           + "Try again...");
               break;         
           }           
        }while(loop == false);      
    }
    //END OF DAILY TRACKER RESULTS FOR COVID-19 POSITIVE CASES=================/
    // </editor-fold>
    //==================End StudentFalcultyOtherPositive======================//
  // <editor-fold defaultstate="collapsed" desc="~Daily Tracker NEG Cases~">  
    //DAILY TRACKER RESULTS FOR COVID-19 NEGATIVE CASES-----------------------//
    //-----------------Start StudentFalcultyOtherNegative-----------------//
    public static void StudentFalcultyOtherNegative(String input,
       int studentTracker,int falcultyStaffTracker,int otherTracker,
       ImageIcon personIcon,ImageIcon maleFemaleIcon,ImageIcon wristBandIcon,
       Tracker trackResults)
    {   
       boolean loop = false;       
       input = "";
       do
       {
           //get input from user
         input = (String)JOptionPane.showInputDialog(null,
           "Is the individual a: \n"       
         + "1. Student\n"
         + "2. Falculty\n"
         + "3. Other", "Title Status", JOptionPane.INFORMATION_MESSAGE,
         personIcon, null, "" );
          
          switch(input){
           
             case "1":
               trackResults.studentTrackerNeg ++;  
               loop = true;
               
               break;
             case "2":
               trackResults.falcultyStaffTrackerNeg++;  
               loop = true;
               
               break;
             case "3":
               trackResults.otherTrackerNeg++;
               loop = true;
               
               break;
             default:
               
                JOptionPane.showMessageDialog(null,"Invalid Selection! "
                           + "Try again...");
               break;           
           }           
        }while(loop == false);       
    }
    // </editor-fold>
    //END OF DAILY TRACKER RESULTS FOR COVID-19 NEGATIVE CASES=================/
    /*Note: These methods display report instructions for individuals who test
      positive*/   
    
     //DISPLAY FINAL INSTRUCTIONS TO USER-------------------------------------//
    // <editor-fold defaultstate="collapsed" desc="~Display Reminder~">
    //STUDENT INSTRUCTIONS
    public static void  DisplayInstructionsForStudent(ImageIcon maleFemaleIcon)
    {
        ImageIcon icon = new ImageIcon("Images/MaleFemaleImageStudent.jpg");
             JOptionPane.showMessageDialog(null,"", "Student Reminder",
                     JOptionPane.PLAIN_MESSAGE, icon);
    }
    //TEACHER INSTRUCTIONS
    public static void  DisplayInstructionsForFalculty(ImageIcon maleFemaleIcon)
    {
        ImageIcon icon = new ImageIcon("Images/MaleFemaleImageFalculty.jpg");
             JOptionPane.showMessageDialog(null,"", "Falculty Reminder",
                     JOptionPane.PLAIN_MESSAGE, icon);
                 
    }
    //OTHER INSTRUCTIONS
    public static void  DisplayInstructionsForOther(ImageIcon maleFemaleIcon)
    {
        ImageIcon icon = new ImageIcon("Images/MaleFemaleImageOther.jpg");
        JOptionPane.showMessageDialog(null,"","Other Reminder",
                     JOptionPane.PLAIN_MESSAGE, icon);
    }
    //END OF DISPLAY FINAL INSTRUCTIONS TO USER------------------------------//
     // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="~Display Current Results~">
    //DISPLAY TOTAL POSITIVE CASES TO USER------------------------------------//
    public static void  TotalPositiveCases(String input, Tracker trackResults,
            ImageIcon resultsIconImage)
    {
        int totalPos = trackResults.studentTrackerPos + 
        trackResults.falcultyStaffTrackerPos + 
        trackResults.otherTrackerPos;
                   
         JOptionPane.showMessageDialog(null,
         "\n\n\nPositive Cases\n*******************************\n"
                 + "Students: " + trackResults.studentTrackerPos +
         "\nFalculty/Staff: " + trackResults.falcultyStaffTrackerPos +
         "\nOther: " + trackResults.otherTrackerPos + 
         "\n\nTotal Cases: " + totalPos,"Current Positive Cases "
          + "Numbers", JOptionPane.PLAIN_MESSAGE, 
         resultsIconImage);         
    }
    //=======================================================================//
   //DISPLAY TOTAL NEGATIVE CASES TO USER-------------------------------------//
    public static void  TotalNegativeCases(String input, Tracker trackResults,
            ImageIcon resultsIconImage)
    {
       int totalNeg = trackResults.studentTrackerNeg + 
       trackResults.falcultyStaffTrackerNeg + trackResults.otherTrackerNeg;
       JOptionPane.showMessageDialog(null,"\n\n\nNegative Cases"
       + "\n********************************\nStudents: " + 
       trackResults.studentTrackerNeg + "\nFalculty/Staff: " +
       trackResults.falcultyStaffTrackerNeg + "\nOther: " +
       trackResults.otherTrackerNeg + "\n\nTotal Cases: " + 
       totalNeg,"Current Negative Cases", JOptionPane.PLAIN_MESSAGE, 
       resultsIconImage);      
    }
    //========================================================================//
    // </editor-fold>     
    
    //ENTER PERSONAL INFORMATION FOR POSITIVE CASE INDIVIDUALS================//    
     // <editor-fold defaultstate="collapsed" desc="~Enter Sensitive Info~">    
    
    /*Note: The methods below are designed to get additional information on
      individuals who test positive or exceed the allowable temperature reading.
      The information will be saved to text document that can be referenced
      later. The text documents will be saved in the folder named 
      PositiveTrackerDocs.
    */
    public static void GetStudentInformation(Person student,
            DocumentWriter positiveCaseDoc, String input,FileWriter writer, 
            BufferedWriter buff) throws IOException
    { 
        //Create array list object
       ArrayList arrayStudent = new ArrayList();
       //Display warning label to user
       ImageIcon warning = new ImageIcon("Images/WarningData.jpg");
       JOptionPane.showMessageDialog(null,"", "Warning Sesitive Data",
               JOptionPane.PLAIN_MESSAGE, warning );
       //Get input from user-------------------------------------------------//
       input = JOptionPane.showInputDialog(null, "Enter students first name: ");
       student.firstName = input;
       input = JOptionPane.showInputDialog(null, "Enter students last name: ");
       student.lastName = input;
       input = JOptionPane.showInputDialog(null, "Enter students age: ");
       student.age = input;
      input = JOptionPane.showInputDialog(null,"Enter students phone number: ");
       student.phoneNumber = input;
       input = JOptionPane.showInputDialog(null, "Enter students ID#: ");
       student.identificationNumber = input;     
       student.status = "Student";
       //Add first/last name and ID# to list
       arrayStudent.add(student.firstName + student.lastName + 
               student.identificationNumber);
       //Write data to document and save to file
       DocumentWriter.WritePositiveCasesInformationToDocument(positiveCaseDoc, 
       student);
    }
    public static void GetTeacherInformation(Person teacher,
            DocumentWriter positiveCaseDoc, String input,FileWriter writer, 
            BufferedWriter buff) throws IOException
    {
        //Create array list object
        ArrayList arrayFalculty = new ArrayList();
        //Display warning label to user        
       ImageIcon warning = new ImageIcon("Images/WarningData.jpg");
       JOptionPane.showMessageDialog(null,"", "Warning Sesitive Data",
               JOptionPane.PLAIN_MESSAGE, warning );
       //Get input from user-------------------------------------------------//
       input = JOptionPane.showInputDialog(null, 
               "Enter Falculty members first name: ");
       teacher.firstName = input;
       input = JOptionPane.showInputDialog(null, 
               "Enter Falculty members last name: ");
       teacher.lastName = input;
       input = JOptionPane.showInputDialog(null, 
               "Enter Falculty members age: ");
       teacher.age = input;
       input = JOptionPane.showInputDialog(null, 
               "Enter Falculty members phone number: ");
       teacher.phoneNumber = input;
       input = JOptionPane.showInputDialog(null, 
               "Enter Falculty members ID#: ");
       teacher.identificationNumber = input;     
       teacher.status = "Falculty";
       //Add first/last name and ID# to list
       arrayFalculty.add(teacher.firstName + teacher.lastName + 
               teacher.identificationNumber);
       //Write data to document and save to file
       DocumentWriter.WritePositiveCasesInformationToDocument(positiveCaseDoc, 
       teacher);
    }
    public static void GetOtherInformation(Person other,
            DocumentWriter positiveCaseDoc, String input,FileWriter writer, 
            BufferedWriter buff) throws IOException
    {
        //Create array list object
        ArrayList arrayOther = new ArrayList();
        //Display warning label to user
       ImageIcon warning = new ImageIcon("Images/WarningData.jpg");
       JOptionPane.showMessageDialog(null,"", "Warning Sesitive Data",
               JOptionPane.PLAIN_MESSAGE, warning );
       //Get input from user-------------------------------------------------//
       input = JOptionPane.showInputDialog(null, "Enter others first name: ");
       other.firstName = input;
       input = JOptionPane.showInputDialog(null, "Enter others last name: ");
       other.lastName = input;
       input = JOptionPane.showInputDialog(null, "Enter others age: ");
       other.age = input;
       input = JOptionPane.showInputDialog(null,"Enter others phone number: ");
       other.phoneNumber = input;
       input = JOptionPane.showInputDialog(null, "Enter others ID#: ");
       other.identificationNumber = input;     
       other.status = "Other";
       //Add first/last name and ID# to list      
       arrayOther.add(other.firstName + other.lastName + 
               other.identificationNumber);
       //Write data to document and save to file
       DocumentWriter.WritePositiveCasesInformationToDocument(positiveCaseDoc, 
       other);
    }
    // </editor-fold>
    //END//ENTER PERSONAL INFORMATION FOR POSITIVE CASE INDIVIDUALS===========//   
    
    private static void AppendDocument(DocumentWriter date, 
            Tracker trackResults) {throw new UnsupportedOperationException
            ("Not supported yet."); 
            //To change body of generated methods, choose Tools | Templates.
    }       
}
//END OF PROGRAM CODE========================================================///