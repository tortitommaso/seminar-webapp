<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Course</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
   </head>
   <body>
      <div class="container">
      <div class="row">
         <div class="col-md-12">
            <div class="panel panel-info">
               <div class="panel-heading">Course creation form</div>
               <div class="panel-body">
               <#if errors?keys?has_content>
					<div class="alert alert-danger">
					  <strong>Error!</strong>
					</div>               
               </#if>
                  <form role="form" method="POST" action="/course/create">
                     <div class="form-group">
                        <label class="control-label" for="courseName">Name</label>
                        <input type="text" required class="form-control" name="courseName" placeholder="Enter course name">
                            <#list errors?keys as key> 
        						${errors[key]} 
   							</#list> 
                        <label class="control-label" for="totalSeats">Total Seats</label>
                        <input type="number" min="1" max="200" class="form-control" name="totalSeats" placeholder="Enter total seats">
                     </div>
                     <button type="submit" class="btn btn-default">Create</button>
                  </form>
               </div>
            </div>
         </div>   
      </div>
      <div class="row">
		 <ul class="list-group">
	      	<#list courseNames as courseNames>
			  <li class="list-group-item">${courseNames}</li>
			</#list>      		      	
		</ul>         
      </div>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
   </body>
</html>

