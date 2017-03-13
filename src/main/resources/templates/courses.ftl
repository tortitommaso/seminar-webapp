<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Course</title>
      <link rel="stylesheet" href="/css/bootstrap.min.css" />
      <link rel="stylesheet" href="/css/site.css" />
   </head>
   <body>
      <div class="container">
         <#if errors?keys?has_content>
         <div class="alert alert-danger">
            <strong>Error!</strong>
            <#list errors?keys as key> 
            ${errors[key]} 
            <br>
            </#list> 					  
         </div>
         </#if>
         <form id="contact" action="/course/create" method="post">
            <h3>Course Form</h3>
            <fieldset>
               <label class="control-label" for="courseName">Course name:</label>   
               <input placeholder="Course name" type="text" tabindex="1" name="courseName" autofocus>
            </fieldset>
            <fieldset>
               <label class="control-label" for="totalSeats">Total Seats:</label>   
               <input placeholder="Total Seats" type="number" tabindex="2" name="totalSeats">
            </fieldset>
            <fieldset>
               <button name="submit" type="submit" id="contact-submit">Submit</button>
            </fieldset>
         </form>
      </div>
      <div class="row">
         <ul class="list-group">
            <#list courseNames as courseNames>
            <li class="list-group-item">${courseNames}</li>
            </#list>      		      	
         </ul>
      </div>
   </body>
</html>

