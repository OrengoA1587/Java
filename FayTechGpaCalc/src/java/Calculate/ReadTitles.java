package Calculate;

public class ReadTitles {
    // String used for SQL Code to link database info
    String sqlAll;
    // User Element Selection
    int p = 0;
    
    public void ReadTitles(int p){
        this.p = p;
        // If-ElseIf-Else statements for SQL statements thorughout program.
        if(p == 1){
            sqlAll = "adminID";
        }
        else if(p == 2){
            sqlAll = "userID";
        }
        else if(p == 3){
            sqlAll = "firstName";
        }
         
    }
    // Return String
    public String getSQLTitles(){
        return sqlAll;
    }
}

