<?php
$con=mysqli_connect('localhost','root','');
if (!$con)
  {
  die('Could not connect: ' . mysqli_error());
  }
   mysqli_select_db($con,"book");
if(isset($_POST['delete']))
{
    $category=@$_POST['category'];
    $Bookid=@$_POST['Bookid'];
	mysqli_query($con,"delete from book WHERE category='$category' and Bookid='$Bookid'");
}
mysqli_close($con);
?> 





<html>
<head>
<meta charset="utf-8">
<title>Add Books</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="stty2.css" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="sttyl.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>


</head>

<body style="background: linear-gradient(to left, #3a6186 , #89253e);">
<script>
    $(function(){
    $(".dropdown").hover(            
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeIn("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            },
            function() {
                $('.dropdown-menu', this).stop( true, true ).fadeOut("fast");
                $(this).toggleClass('open');
                $('b', this).toggleClass("caret caret-up");                
            });
    });
    
</script>

<div class="container" style="margin-top:-40px; ">
	<div class="row">
       
  
    <!-- Brand and toggle get grouped for better mobile display -->

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="navbar navbar-default navbar-fixed-top">
      <ul class="nav navbar-nav">
        <li><a href="Home.php">Home</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">Book<b class="caret"></b></a>
          <ul class="dropdown-menu">
          <li><a href="view.php">View</a></li>
            <li><a href="Add.php">Add</a></li>
            <li><a href="Update.php">Update</a></li>
            <li><a href="Delete.php">Delete</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">Issue/Return<b class="caret"></b></a>
          <ul class="dropdown-menu">
          <li><a href="view2">View</a></li>
            <li><a href="Issue">Issue</a></li>
            <li><a href="Return">Return</a></li>
          </ul>
        </li>
        <li><a href="About us.php">About us</a></li>
        
      </ul>
      
    </div>
  

	</div>
</div>





<div class="container">
			<div class="row main" >
	
    

<div class="main-login main-center" style="background: linear-gradient(to left, #3a6186 , #89253e);">
				<h2>Books delete Form</h2>
					<form class="" method="post" action="">
						
						<div class="form-group">
							<label for="Category" class="cols-sm-2 control-label"> select Book Category</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
									<select name="category"  class="form-control" >
				<option> --select--</option>
				<option>Sci-Fic</option>
                <option>Comic</option>
				<option>Novel</option>
				<option>Biography</option>
				<option>Computer</option>
			</select>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="Book Id" class="cols-sm-2 control-label">Book Id</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
									<input type="text" name="Bookid" placeholder="Enter Book id" class="form-control" required />
								</div>
							</div>
						</div>

						<div class="form-group ">
							<input type="submit"  class="btn btn-primary btn-lg btn-block login-button" name="Delete" value="Delete">
						</div>
						
					</form>
				</div>
			</div>
		</div>
        </div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</fieldset>
</form>
	</div>
</div>
</div>
</body>
</html>
