<?php
$con=mysqli_connect('localhost','root','');
if (!$con)
  {
  die('Could not connect: ' . mysqli_error());
  }
   mysqli_select_db($con,"book");
if(isset($_POST['Update']))
{
    $category=@$_POST["category"];
    $Bookid=@$_POST['Bookid'];
	$Name = @$_POST['Name'];
    $Authorname=@$_POST['Authorname'];
    $language=@$_POST['language'];
    $Cost=@$_POST['Cost'];
    $edition=@$_POST['edition'];
	$Description=@$_POST['Description'];
	
	
	
	mysqli_query($con,"UPDATE book SET category='$category',Name='$Name',Authorname='$Authorname',language='$language',Cost='$Cost',edition='$edition',Description='$Description' WHERE Bookid='$Bookid'");
}
mysqli_close($con);
?> 




<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">


		<!-- Website CSS style -->
		<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="sttyl.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="stty2.css" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Update Form</title>
	</head>
	<body style="background-color:black;">
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
          <li><a href="view2.php">View</a></li>
            <li><a href="Issue.php">Issue</a></li>
            <li><a href="Return.php">Return</a></li>
          </ul>
        </li>
        <li><a href="About us.php">About us</a></li>
      
      </ul>
      
    </div>
  

	</div>
</div>

    
    
    <div style=" background-image:url(lib57.jpg); margin-top:-10px;">
    
		<div class="container">
			<div class="row main" >
				<div class="main-login main-center">
				<h2>Books Update Form</h2>
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

						<div class="form-group">
							<label for="Name of Book" class="cols-sm-2 control-label">Name of Book</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" name="Name" placeholder="Enter Book name" class="form-control" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="Authhorname" class="cols-sm-2 control-label">Authhor's name:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="text" name="Authorname" placeholder="Enter Author's name" class="form-control" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="Language" class="cols-sm-2 control-label">Select Language </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<select name="language" class="form-control">
				<option> --select--</option>
				<option>English</option>
				<option>Hindi</option>
			</select>
								</div>
							</div>
						</div>

						<div class="form-group">
						   <label for="Cost" class="cols-sm-2 control-label"> Cost</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
							<input type="number" name="Cost" placeholder="Enter Cost" class="form-control" required>
								</div>
							</div>
						</div>
                        
                        <div class="form-group">
							<label for="Edition" class="cols-sm-2 control-label">Edition</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
									<input type="text" name="edition" placeholder="Enter edition" class="form-control" required>
								</div>
							</div>
						</div>
                        
                        <div class="form-group">
							<label for="Description" class="cols-sm-2 control-label">Description</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
									<textarea  name="Description" rows="3" cols="20"placeholder="Enter Description" class="form-control" required></textarea>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<input type="submit"  class="btn btn-primary btn-lg btn-block login-button" name="Update" value="Update Book">
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
	</body>
</html>