<?php
// connect to the database
$server = 'localhost';
$user = 'root';
$pass = '';
$db='book';

// connect to the database
$mysqli = new mysqli($server, $user, $pass, $db);


mysqli_report(MYSQLI_REPORT_ERROR);


// creates the new/edit record form
// since this form is used multiple times in this file, I have made it a function that is easily reusable
function renderForm($category='',$Sid='',$Bookid='',$Name='',$Authorname='',$Cost='',$edition='',$Issuedate='',$Returndate='',$Returnstatus='', $error = '', $Issueid = '')
{ ?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>
<?php if ($Issueid != '') { echo "Edit Record"; } else { echo "New Record"; } ?>
</title>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body style=" background-image:url(lib678.jpg)">
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
            <li><a href="edit.php">Return</a></li>
          </ul>
        </li>
        <li><a href="About us.php">About us</a></li>
        
      </ul>
      
    </div>
  

	</div>
</div>

<?php if ($error != '') {
echo "<div style='padding:4px; border:1px solid red; color:red'>" . $error
. "</div>";
} ?>
<?php echo $Issueid; ?>
<div class="container">
			<div class="row main" >
         <div class="main-login main-center" style="background-color: #43210a;">
				<h2>Record Edit Form</h2>
					<form class="" method="post" action="">



<?php if ($Issueid != '') { ?>
<input type="hidden" name="Issueid" value="<?php echo $Issueid; ?>" />
<p>ID: <?php echo $Issueid; ?></p>
<?php } ?>

	<div class="form-group">
							<label for="Category" class="cols-sm-2 control-label"> select Book Category</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<input type="hidden" name="Issueid" value="<?php echo $Category; ?>" />
									
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
							<label for="return status" class="cols-sm-2 control-label">Return status</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
					<select name="Returnstatus" class="form-control" required>
<option>NO</option>
<option>YES</option>
</select> </input>
								</div>
							</div>
						</div>
                        

						<div class="form-group ">
							<input type="submit"  class="btn btn-primary btn-lg btn-block login-button" name="edit" value="edit Record">
						</div>
						

		
					</form>
				</div>
			</div>
		</div>
        </div>
</body>
</html>

<?php }



/*

EDIT RECORD

*/

if (isset($_GET['Issueid']))
{

if (isset($_POST['edit']))
{

if (is_numeric($_POST['Issueid']))
{
$id = $_POST['Issueid'];
$category = htmlentities($_POST['category'], ENT_QUOTES);
$Bookid = htmlentities($_POST['Bookid'], ENT_QUOTES);
$Sid = htmlentities($_POST['Sid'], ENT_QUOTES);
$Name = htmlentities($_POST['Name'], ENT_QUOTES);
$Authorname = htmlentities($_POST['Authorname'], ENT_QUOTES);
$Cost = htmlentities($_POST['Cost'], ENT_QUOTES);
$edition = htmlentities($_POST['edition'], ENT_QUOTES);
$Issuedate= htmlentities($_POST['Issuedate'], ENT_QUOTES);
$Returndate = htmlentities($_POST['Returndate'], ENT_QUOTES);
$Returnstatus = htmlentities($_POST['Returnstatus'], ENT_QUOTES);

if ($category == '' || $Bookid == ''||$Sid== ''||$Name== ''||$Authorname== ''||$Cost== ''||$edition== ''||$Issuedate== ''||$Returndate== ''||$Returnstatus== '')
{

$error = 'ERROR: Please fill in all required fields!';
renderForm($category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus,$error, $Issueid);
}
else
{

if ($stmt = $mysqli->prepare("UPDATE issue SET category = ?,Bookid = ?,Sid = ?,Name = ?,Authorname = ?,Cost = ?,edition = ?,Issuedate = ?,Returndate = ?,Returnstatus = ? WHERE Issueid=?"))
{
$stmt->bind_param("ssi", $category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus,$Issueid);
$stmt->execute();
$stmt->close();
}

else
{
echo "ERROR: could not prepare SQL statement.";
}


header("Location: edit.php");
}
}

else
{
echo "Error!";
}
}

else
{

if (is_numeric($_GET['Issueid']) && $_GET['Issueid'] > 0)
{

$id = $_GET['Issueid'];


if($stmt = $mysqli->prepare("SELECT * FROM issue WHERE Issueid=?"))
{
$stmt->bind_param("i",$Issueid);
$stmt->execute();

$stmt->bind_result($category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus);
$stmt->fetch();

renderForm( $category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus,NULL, $Issueid);

$stmt->close();
}

else
{
echo "Error: could not prepare SQL statement";
}
}

else
{
header("Location: view2.php");
}
}
}



/*

NEW RECORD

*/

else
{

if (isset($_POST['submit']))
{
$category = htmlentities($_POST['category'], ENT_QUOTES);
$Bookid = htmlentities($_POST['Bookid'], ENT_QUOTES);
$Sid = htmlentities($_POST['Sid'], ENT_QUOTES);
$Name = htmlentities($_POST['Name'], ENT_QUOTES);
$Authorname = htmlentities($_POST['Authorname'], ENT_QUOTES);
$Cost = htmlentities($_POST['Cost'], ENT_QUOTES);
$edition = htmlentities($_POST['edition'], ENT_QUOTES);
$Issuedate= htmlentities($_POST['Issuedate'], ENT_QUOTES);
$Returndate = htmlentities($_POST['Returndate'], ENT_QUOTES);
$Returnstatus = htmlentities($_POST['Returnstatus'], ENT_QUOTES);

if ($category == '' || $Bookid == ''||$Sid== ''||$Name== ''||$Authorname== ''||$Cost== ''||$edition== ''||$Issuedate== ''||$Returndate== ''||$Returnstatus== '')
{

$error = 'ERROR: Please fill in all required fields!';
renderForm($category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus);
}
else
{

if ($stmt = $mysqli->prepare("INSERT players (category,Bookid,Sid,Name,Authorname,Cost,edition,Issuedate,Returndate,Returnstatus) VALUES (?, ?, ?, ?, ? ,?, ?, ?, ?, ?)"))
{
$stmt->bind_param("ss", $category,$Bookid,$Sid,$Name,$Authorname,$Cost,$edition,$Issuedate,$Returndate,$Returnstatus);
$stmt->execute();
$stmt->close();
}

else
{
echo "ERROR: Could not prepare SQL statement.";
}

header("Location: disissue.php");
}

}

else
{
renderForm();
}
}
$mysqli->close();