<?php
$con=mysqli_connect('localhost','root','');
if (!$con)
  {
  die('Could not connect: ' . mysqli_error());
  }
   mysqli_select_db($con,"book");

if(isset($_POST['submit']))
{
    $name=@$_POST["name"];
    $email=@$_POST["email"];
	$message=@$_POST["message"];
    
	mysqli_query($con,"INSERT INTO support (name,email,message) VALUES('$name','$email','$message')");	
	
	
	header('Location: '.$_SERVER['PHP_SELF']);   
}
	
	
mysqli_close($con);

?> 




<!doctype html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Quicksand|Asap:700' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="stty2.css" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="sty2.css">

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
<title>About Us</title>
</head>

<body>
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






<section class="contactcharacter" id="about" style="margin-top:90px;">
  <div class="contentwrapper" id="contact">
    
    <div class="character">
      <div class="body"></div>
      <div class="arm"></div>
      <div class="head">
        <div class="eyes"></div>
      </div>
      <div class="mug">
        <div class="steam"></div>
        <div class="steam"></div>
        <div class="steam"></div>
      </div>
      <div class="contactme">
        <div class="arrow"></div>
      </div>
      <div class="thoughts">
        
        <div class="abouttype">
          <p>My name is Harsh Chhabra. I am ...</p>
          <div class="imacontainer"><span class="ima"></span></div>
          <p>Contact me if you have any problem.</p>

          <span class="imawhat">Always there to Help You</span>
        </div>

        <div class="bubble"></div>
        <div class="bubble"></div>
        <div class="bubble"></div>

      </div>
    </div>
  </div>
  
  <div class="contact">
    <span class="closer"></span>
    <form method="post" action="">
      <input class="input name"  name="name" type="text" value="" placeholder="name" required>
      <input class="input email" name="email" type="email" value="" placeholder="email" required>
      <textarea class="input message" name="message" placeholder="my awesome message!" required></textarea>
      <input name="submit" type="submit" value="submit" class="submit" onChange="alert()">        
    </form>
  </div>
  
</section>
<script>

    var cnt=0, texts=[];
var $fclick = false;


$(".imawhat").each(function() {
  texts[cnt++]=$(this).text();
});

function fadeText() {
  if (cnt>=texts.length) { cnt=0; }
  $('.ima').html(texts[cnt++]);
  $('.ima')
    .fadeIn('fast').animate({opacity: 1.0}, 5000).fadeOut('fast',
     function() {
       return fadeText();
     }
  );
}

function toggleForm() {
	
  if ($fclick === true) {
    $(".contact, .head, .arm").toggleClass("active inactive");
  } else {
    $(".contact, .head, .arm").addClass("active");
    $fclick = true;
  }
  
  
}

$(".contactme, .arrow, .closer, .submit").on("click", toggleForm);

fadeText();
</script>
</body>
</html>
