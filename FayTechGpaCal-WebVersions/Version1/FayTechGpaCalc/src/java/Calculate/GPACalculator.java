package Calculate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oreng
 */
public class GPACalculator {
    
    private double credits = 0.0;
    private double points = 0.0;
     
    public double GetGPA(){
        return this.credits;
    }
    public void SetGPA(double cred){
        this.credits = cred;
    }
}
