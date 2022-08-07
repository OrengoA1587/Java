package covid19tempcheck_orengoanthony;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orengoa0459
 */
public class Tracker {   

    public int studentTrackerPos;
    public int falcultyStaffTrackerPos;
    public int otherTrackerPos;
    public int studentTrackerNeg;
    public int falcultyStaffTrackerNeg;
    public int otherTrackerNeg;    
    
    public Tracker()
    {
        //Positive Tracker fields
        studentTrackerPos = 0;
        falcultyStaffTrackerPos = 0;
        otherTrackerPos = 0;
        //Negative Tracker fields
        studentTrackerNeg = 0;
        falcultyStaffTrackerNeg = 0;
        otherTrackerNeg = 0;
    }
}
