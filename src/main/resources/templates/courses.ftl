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
	         </div>
         </#if>
         <h2>Courses</h2>         
         <form class="form-horizontal" action="/course/create" method="post">
	        <#if errors['courseName-error']?? > 
				<div class="form-group has-error has-feedback">
				  <label class="col-sm-2 control-label" for="courseName">Name:</label>
				  <div class="col-sm-10">
					  <input type="text" class="form-control" name="courseName" aria-describedby="courseNameStatus">
					  <span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
					  <span id="courseNameStatus" class="sr-only">(error)</span>
					  ${errors['courseName-error']}
				  </div>
				</div>        
         	<#else>
	            <div class="form-group has-feedback">
	               <label class="col-sm-2 control-label" for="courseName">Name:</label>
	               <div class="col-sm-10">
	                  <input type="text" class="form-control" name="courseName">
	               </div>
	            </div>
            </#if>         
	        <#if errors['location-error']?? > 
				<div class="form-group has-error has-feedback">
				  <label class="col-sm-2 control-label" for="location">Location:</label>
				  <div class="col-sm-10">
					  <input type="text" class="form-control" name="location" aria-describedby="locationStatus">
					  <span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
					  <span id="locationStatus" class="sr-only">(error)</span>
					  ${errors['location-error']}
				  </div>
				</div>        
         	<#else>
	            <div class="form-group has-feedback">
	               <label class="col-sm-2 control-label" for="location">Location:</label>
	               <div class="col-sm-10">
	                  <input type="text" class="form-control" name="location">
	               </div>
	            </div>
            </#if>                 
            
	        <#if errors['totalSeats-error']?? > 
	            <div class="form-group has-error has-feedback">
	               <label class="col-sm-2 control-label" for="totalSeats">totalSeats:</label>
	               <div class="col-sm-10">
	                  <input type="text" class="form-control" name="totalSeats" aria-describedby="totalSeatsStatus">
					  <span class="glyphicon glyphicon-remove form-control-feedback" aria-hidden="true"></span>
					  <span id="totalSeatsStatus" class="sr-only">(error)</span>
					  ${errors['totalSeats-error']}
	               </div>
	            </div>	        
         	<#else>
	            <div class="form-group has-feedback">
	               <label class="col-sm-2 control-label" for="totalSeats">totalSeats:</label>
	               <div class="col-sm-10">
	                  <input type="text" class="form-control" name="totalSeats">
	               </div>
	            </div>
            </#if>         
            
            <button type="submit" class="btn btn-default">Create</button>
         </form>
         <div class="row">
			<table class="table table-striped">
			   <thead><tr><th>#</th><th>Course Name</th><th>Total Seats</th><th>Location</th> </tr></thead>
			   <tbody>
               <#list courses as element>
				<tr><td>${element?index}</td><td>${element.name}</td><td>${element.totalSeats}</td><td>${element.location}</td></tr>               
               </#list>          	
			   </tbody>
			</table>         
         </div>
      </div>
   </body>
</html>

