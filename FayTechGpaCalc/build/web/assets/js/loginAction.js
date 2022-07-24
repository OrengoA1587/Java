/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var attempt = 3;

function validate(){
    window.location = "studentDashboard.html";
    var username = document.getElementByID("username");
    var password = document.getElementByID("password");
    if ( username === "Formget" && password === "123"){
        alert ("Login successfully");
        window.location = "studentDashboard.html";
         
        return false;
    }
    else{
        attempt --;// Decrementing by one.
        alert("You have left "+attempt+" attempt;");
        // Disabling fields after 3 attempts.
    }
    if( attempt == 0){
        document.getElementById("username").disabled = true;
        document.getElementById("password").disabled = true;
        document.getElementById("submit").disabled = true;
    return false;
    }
}
