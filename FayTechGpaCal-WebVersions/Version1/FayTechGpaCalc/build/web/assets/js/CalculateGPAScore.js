/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function Calculate(){
           
          var points = 0;
          var credits = 0;    
          var totalGpa = 0;
          //Get all letter values from sdelected index
          var letter1 =  document.getElementById("row1Letter");
          var letter1Value = parseInt(letter1.options[letter1.selectedIndex].value); 
          var letter2 =  document.getElementById("row2Letter");
          var letter2Value = parseInt(letter2.options[letter2.selectedIndex].value); 
          var letter3 =  document.getElementById("row3Letter");
          var letter3Value = parseInt(letter3.options[letter3.selectedIndex].value); 
          var letter4 =  document.getElementById("row4Letter");
          var letter4Value = parseInt(letter4.options[letter4.selectedIndex].value); 
          var letter5 =  document.getElementById("row5Letter");
          var letter5Value = parseInt(letter5.options[letter5.selectedIndex].value); 
          var letter6 =  document.getElementById("row6Letter");
          var letter6Value = parseInt(letter6.options[letter6.selectedIndex].value); 
          var letter7 =  document.getElementById("row7Letter");
          var letter7Value = parseInt(letter7.options[letter7.selectedIndex].value); 
          var letter8 =  document.getElementById("row8Letter");
          var letter8Value = parseInt(letter8.options[letter8.selectedIndex].value); 
          
          //Get all credit values from sdelected index
          var cred1 =  document.getElementById("row1Credits");
          var cred1Value = parseInt(cred1.options[cred1.selectedIndex].value); 
          var cred2 =  document.getElementById("row2Credits");
          var cred2Value = parseInt(cred2.options[cred2.selectedIndex].value); 
          var cred3 =  document.getElementById("row3Credits");
          var cred3Value = parseInt(cred3.options[cred3.selectedIndex].value); 
          var cred4 =  document.getElementById("row4Credits");
          var cred4Value = parseInt(cred4.options[cred4.selectedIndex].value);
          var cred5 =  document.getElementById("row5Credits");
          var cred5Value = parseInt(cred5.options[cred5.selectedIndex].value); 
          var cred6 =  document.getElementById("row6Credits");
          var cred6Value = parseInt(cred6.options[cred6.selectedIndex].value); 
          var cred7 =  document.getElementById("row7Credits");
          var cred7Value = parseInt(cred7.options[cred7.selectedIndex].value); 
          var cred8 =  document.getElementById("row8Credits");
          var cred8Value = parseInt(cred8.options[cred8.selectedIndex].value);
           
          //console.log(letter1Value);  
          //console.log(cred1Value);           
          //console.log(letter1Value); 
          //Add credit values together
          credits  += cred1Value + cred2Value + cred3Value + cred4Value + cred5Value + cred6Value + cred7Value + cred8Value;
          //console.log(credits); 
          //Determine point value by multiplying letter value by credit value and add the values to variable points 
          points += letter1Value  * cred1Value;
          points += letter2Value  * cred2Value;
          points += letter3Value  * cred3Value;
          points += letter4Value  * cred4Value;
          points += letter5Value  * cred5Value;
          points += letter6Value  * cred6Value;
          points += letter7Value  * cred7Value;
          points += letter8Value  * cred8Value;
          
          //Calculate total GPA
          totalGpa = points/credits;
          
          //console.log(totalGpa); 
          //Get GPA input tag element ID
          const gpaID = document.getElementById("gpaScore");
          
          //Set placeholder for GPA input tag to totalGpa
          gpaID.setAttribute("placeholder", totalGpa.toFixed(2));
              
          }   

