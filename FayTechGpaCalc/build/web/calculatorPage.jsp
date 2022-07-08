<%-- 
    Document   : calculatorPage
    Created on : Jul 2, 2022, 10:02:42 AM
    Author     : oreng
--%>

 <%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Calculate.GPACalculator"%>
 
<!DOCTYPE html>
<html>
    <head>
        <title>ManagementSystems</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="refresh" content="60; URL=calculatorPage.jsp">

        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" type="text/css" href="assets2/calculatorPage.css">

 
         
    </head>
     
    <body>
    
    <div id="wrapper">
    <nav class="navbar navbar-light navbar-expand-lg navigation-clean">
        <div class="container"><a class="navbar-brand" href="index.jsp">FTCC Home</a><button data-bs-toggle="collapse" class="navbar-toggler" data-bs-target="#navcol-1"><span class="visually-hidden">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navcol-1">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link active" href="https://faytechcc.blackboard.com/">Blackboard</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Self Service</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Third Item</a></li>
                     
                </ul>
            </div>
        </div>
    </nav>
 
    <div class="container p-8 my-8 borderd container-xl">
        <div class="row">
            <div class="col-md-12 text-center">
                       <form class="form-control-gpa " id="wrapper" action="GPASubmitAction.jsp" method="post" >
                             
                           <fieldset>
                                <legend class="form-header ">Enter Classes</legend>
                            </fieldset>
                           <fieldset>
                                <legend class="form-header2">Grade &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Credits</legend>
                            </fieldset>
                            <div class="d-lg-flex justify-content-lg-start align-items-lg-center"><label class="form-label">Class 1</label>
                                <select class="form-select" id="row1Letter" name="row1Letter">
                                    <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row1Credits" name="row1Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 2</label>
                                <select class="form-select" id="row2Letter" name="row2Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row2Credits" name="row2Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 3</label>
                                 <select class="form-select" id="row3Letter" name="row3Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row3Credits" name="row3Credits">
                                     <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 4</label>
                                 <select class="form-select" id="row4Letter" name="row4Letter" >
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row4Credits" name="row4Credits" >
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 5</label>
                                 <select class="form-select" id="row5Letter" name="row5Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row5Credits" name="row5Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 6</label>
                                 <select class="form-select" id="row6Letter" name="row6Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row6Credits" name="row6Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center"><label class="form-label">Class 7</label>
                                 <select class="form-select" id="row7Letter" name="row7Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row7Credits" name="row7Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                            <div class="d-lg-flex align-items-lg-center" ><label class="form-label">Class 8</label>
                                 <select class="form-select" id="row8Letter" name="row8Letter">
                                     <optgroup label="Letter Grade">
                                        <option value="0" selected=""></option>
                                        <option value="4">A</option>
                                        <option value="3">B</option>
                                        <option value="2">C</option>
                                        <option value="1">D</option>
                                        <option value="0">F</option>
                                    </optgroup>
                                </select><select class="form-select2"id="row8Credits" name="row8Credits">
                                    <optgroup label="Credits">
                                        <option value="0" selected="">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>                        
                                    </optgroup>
                                </select></div>
                           <div class="d-lg-flex align-items-lg-center "><button class="submit-btn" type="submit">Calculate</button>
                               <label class="form-label">Current GPA</label>
                               
            
                               <input class="gpa-input" type="text" name="gpaScore" value="${sum}">
                            </div>
                             
                            <div class="table-explanantion">
                            <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>Grade</th>
                                        <th>Grade Points</th>
                                        <th>Explanation</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>A</td>
                                        <td>4</td>
                                        <td>Excellent</td>
                                    </tr>
                                    <tr>
                                        <td>B</td>
                                        <td>3</td>
                                        <td>Very Good</td>
                                    </tr>
                                    <tr>
                                        <td>C</td>
                                        <td>2</td>
                                        <td>Satisfactory</td>
                                    </tr>
                                    <tr>
                                        <td>D</td>
                                        <td>1</td>
                                        <td>Poor</td>
                                    </tr>
                                    <tr>
                                        <td>F</td>
                                        <td>0</td>
                                        <td>Failing</td>
                                    </tr>
                                    <tr></tr>
                                </tbody>
                            </table>
                        </div>
                        </form>
                               </div>
                               </div>
                               </div>
    </div>
                                 
               
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>

