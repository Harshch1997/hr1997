<?php
$con=mysqli_connect('localhost','root','');
if (!$con)
  {
  die('Could not connect: ' . mysqli_error());
  }
   mysqli_select_db($con,"book");
if(isset($_POST['Add']))
{
    $category=@$_POST["category"];
    $Bookid=@$_POST['Bookid'];
	$Name = @$_POST['Name'];
    $Authorname=@$_POST['Authorname'];
    $language=@$_POST['language'];
    $Cost=@$_POST['Cost'];
    $edition=@$_POST['edition'];
	$Description= @$_POST['Description'];
	mysqli_query($con,"INSERT INTO book (category,Bookid,Name,Authorname,language,Cost,edition,Description) VALUES('$category','$Bookid','$Name','$Authorname','$language','$Cost','$edition','$Description')");
}
mysqli_close($con);
?> 






<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="sttttt45.css" />
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

<body >
<div style=" background-image:url(lib69.jpg)">
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

<script>
(function(e,t,n,r){function o(t,n){this.$element=e(t);this.settings=e.extend({},s,n);this.init()}var i="floatlabel",s={slideInput:true,labelStartTop:"20px",labelEndTop:"10px",transitionDuration:.3,transitionEasing:"ease-in-out",labelClass:"",typeMatches:/text|password|email|number|search|url/};o.prototype={init:function(){var e=this;var n={"-webkit-transition":"all "+this.settings.transitionDuration+"s "+this.settings.transitionEasing,"-moz-transition":"all "+this.settings.transitionDuration+"s "+this.settings.transitionEasing,"-o-transition":"all "+this.settings.transitionDuration+"s "+this.settings.transitionEasing,"-ms-transition":"all "+this.settings.transitionDuration+"s "+this.settings.transitionEasing,transition:"all "+this.settings.transitionDuration+"s "+this.settings.transitionEasing};if(this.$element.prop("tagName").toUpperCase()!=="INPUT"){return}if(!this.settings.typeMatches.test(this.$element.attr("type"))){return}var r=this.$element.attr("id");if(!r){r=Math.floor(Math.random()*100)+1;this.$element.attr("id",r)}var i=this.$element.attr("placeholder");var s=this.$element.data("label");var o=this.$element.data("class");if(!o){o=""}if(!i||i===""){i="You forgot to add placeholder attribute!"}if(!s||s===""){s=i}this.inputPaddingTop=parseFloat(this.$element.css("padding-top"))+10;this.$element.wrap('<div class="floatlabel-wrapper" style="position:relative"></div>');this.$element.before('<label for="'+r+'" class="label-floatlabel '+this.settings.labelClass+" "+o+'">'+s+"</label>");this.$label=this.$element.prev("label");this.$label.css({position:"absolute",top:this.settings.labelStartTop,left:this.$element.css("padding-left"),display:"none","-moz-opacity":"0","-khtml-opacity":"0","-webkit-opacity":"0",opacity:"0"});if(!this.settings.slideInput){this.$element.css({"padding-top":this.inputPaddingTop})}this.$element.on("keyup blur change",function(t){e.checkValue(t)});t.setTimeout(function(){e.$label.css(n);e.$element.css(n)},100);this.checkValue()},checkValue:function(e){if(e){var t=e.keyCode||e.which;if(t===9){return}}var n=this.$element.data("flout");if(this.$element.val()!==""){this.$element.data("flout","1")}if(this.$element.val()===""){this.$element.data("flout","0")}if(this.$element.data("flout")==="1"&&n!=="1"){this.showLabel()}if(this.$element.data("flout")==="0"&&n!=="0"){this.hideLabel()}},showLabel:function(){var e=this;e.$label.css({display:"block"});t.setTimeout(function(){e.$label.css({top:e.settings.labelEndTop,"-moz-opacity":"1","-khtml-opacity":"1","-webkit-opacity":"1",opacity:"1"});if(e.settings.slideInput){e.$element.css({"padding-top":e.inputPaddingTop})}},50)},hideLabel:function(){var e=this;e.$label.css({top:e.settings.labelStartTop,"-moz-opacity":"0","-khtml-opacity":"0","-webkit-opacity":"0",opacity:"0"});if(e.settings.slideInput){e.$element.css({"padding-top":parseFloat(e.inputPaddingTop)-10})}t.setTimeout(function(){e.$label.css({display:"none"})},e.settings.transitionDuration*1e3)}};e.fn[i]=function(t){return this.each(function(){if(!e.data(this,"plugin_"+i)){e.data(this,"plugin_"+i,new o(this,t))}})}})(jQuery,window,document)

$(document).ready(function(){
  //Floatlabel
  $('input').floatlabel();
  $('a, button').click(function(e){
    e.preventDefault();
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






<div class="container auth" style="margin-top:100px;">
<h1 class="text-center">Book Insert Form </h1>
    <div id="big-form" class="well auth-box">
      <form>
        <fieldset>
          <!-- Text input-->
          <div class="form-group">
            <label class=" control-label" for="Category">Category</label>  
            <div class="">
              <select name="category"  class="form-control input-md" >
				<option> --select--</option>
				<option>Sci-Fic</option>
                <option>Comic</option>
				<option>Novel</option>
				<option>Biography</option>
				<option>Computer</option>
			</select>  
            </div>
          </div>

          <div class="form-group">
            <label class=" control-label" for="Book Id">Book Id</label>
            <div class="">
              <input type="text" name="Bookid" placeholder="Enter Book id" class="form-control input-md" required />
            </div>
          </div>

          <!-- Select Basic -->
          <div class="form-group">
            <label class=" control-label" for="Name of Book">Name of Book</label>
            <div class="">
              <input type="text" name="Name" placeholder="Enter Book name" class="form-control input-md" required>
            </div>
          </div>

          <!-- Multiple Radios -->
          <div class="form-group">
            <label class=" control-label" for="Authhorname">Authhor's name:</label>
            <div class="">
                  <input type="text" name="Authorname" placeholder="Enter Author's name" class="form-control" required>
                  
              </div>
              </div>

          <!-- Button -->
          <div class="form-group">
            <label class=" control-label" for="Language">Select Language</label>
            <div class="">
              <select name="language" class="form-control">
				<option> --select--</option>
				<option>English</option>
				<option>Hindi</option>
			</select>
            </div>
          </div>
          <div class="form-group">
            <label class=" control-label" for="Cost">Cost</label>
            <div class="">
              <input type="number" name="Cost" placeholder="Enter Cost" class="form-control" required>
            </div>
          </div>


          <!-- Button (Double) -->
          <div class="form-group">
            <label class=" control-label" for="Edition">Edition</label>
            <div class="">
              <input type="number" name="edition" placeholder="Enter edition" class="form-control" required>
              
            </div>
          </div>

          <!-- File Button --> 
          <div class="form-group">
            <label class=" control-label" for="Description">Description</label>
            <div class="">
              <textarea  name="Description" rows="3" cols="20"placeholder="Enter Description" class="form-control" required></textarea>
            </div>
          </div>

          

                <div class="form-group ">            
              <input type="submit"  class="btn btn-primary btn-lg btn-block login-button" name="Add" value="Add Book">
            </div>
          

        </fieldset>
      </form>
    </div>
  </div>
  </div>
</body>
</html>