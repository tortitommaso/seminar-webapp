

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
         <h2>Courses</h2>
         <form class="form-horizontal" action="/course/create" method="post">
            <div class="form-group has-feedback">
               <label class="col-sm-2 control-label" for="courseName">Name:</label>
               <div class="col-sm-10">
                  <input type="text" class="form-control" name="courseName">
               </div>
            </div>
            <div class="form-group has-feedback">
               <label class="col-sm-2 control-label" for="totalSeats">totalSeats:</label>
               <div class="col-sm-10">
                  <input type="number" class="form-control" name="totalSeats">
               </div>
            </div>
            <button type="submit" class="btn btn-default">Create</button>
         </form>
         <div class="row">
            <ul class="list-group">
               <#list courseNames as courseNames>
               <li class="list-group-item">${courseNames}</li>
               </#list>      		      	
            </ul>
         </div>
      </div>
   </body>
</html>

