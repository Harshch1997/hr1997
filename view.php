<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Books View</title>
<link rel="stylesheet" href="stty4.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/lumen/bootstrap.min.css">
<link rel="stylesheet" href="https://daneden.github.io/animate.css/animate.min.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="stty2.css" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="stty45.css">
</head>

<body style="background-color:rgba(248,104,106,1.00)">
<script>
$.fn.pageMe = function(opts){
    var $this = this,
        defaults = {
            perPage: 7,
            showPrevNext: false,
            hidePageNumbers: false
        },
        settings = $.extend(defaults, opts);
    
    var listElement = $this;
    var perPage = settings.perPage; 
    var children = listElement.children();
    var pager = $('.pager');
    
    if (typeof settings.childSelector!="undefined") {
        children = listElement.find(settings.childSelector);
    }
    
    if (typeof settings.pagerSelector!="undefined") {
        pager = $(settings.pagerSelector);
    }
    
    var numItems = children.size();
    var numPages = Math.ceil(numItems/perPage);

    pager.data("curr",0);
    
    if (settings.showPrevNext){
        $('<li><a href="#" class="prev_link">«</a></li>').appendTo(pager);
    }
    
    var curr = 0;
    while(numPages > curr && (settings.hidePageNumbers==false)){
        $('<li><a href="#" class="page_link">'+(curr+1)+'</a></li>').appendTo(pager);
        curr++;
    }
    
    if (settings.showPrevNext){
        $('<li><a href="#" class="next_link">»</a></li>').appendTo(pager);
    }
    
    pager.find('.page_link:first').addClass('active');
    pager.find('.prev_link').hide();
    if (numPages<=1) {
        pager.find('.next_link').hide();
    }
      pager.children().eq(1).addClass("active");
    
    children.hide();
    children.slice(0, perPage).show();
    
    pager.find('li .page_link').click(function(){
        var clickedPage = $(this).html().valueOf()-1;
        goTo(clickedPage,perPage);
        return false;
    });
    pager.find('li .prev_link').click(function(){
        previous();
        return false;
    });
    pager.find('li .next_link').click(function(){
        next();
        return false;
    });
    
    function previous(){
        var goToPage = parseInt(pager.data("curr")) - 1;
        goTo(goToPage);
    }
     
    function next(){
        goToPage = parseInt(pager.data("curr")) + 1;
        goTo(goToPage);
    }
    
    function goTo(page){
        var startAt = page * perPage,
            endOn = startAt + perPage;
        
        children.css('display','none').slice(startAt, endOn).show();
        
        if (page>=1) {
            pager.find('.prev_link').show();
        }
        else {
            pager.find('.prev_link').hide();
        }
        
        if (page<(numPages-1)) {
            pager.find('.next_link').show();
        }
        else {
            pager.find('.next_link').hide();
        }
        
        pager.data("curr",page);
      	pager.children().removeClass("active");
        pager.children().eq(page+1).addClass("active");
    
    }
};

$(document).ready(function(){
    
  $('#myTable').pageMe({pagerSelector:'#myPager',showPrevNext:true,hidePageNumbers:false,perPage:4});
    
});
</script>
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








<div class="container" style="margin-top:20px;">
<div class="row">
<div id="user" class="col-md-12" >
  <div class="panel panel-primary panel-table animated slideInDown">
   <div class="panel-heading " style="padding:5px;">
        <div class="row">
        
        <div  style="margin-left:1px; align-content:center; text-align:center;">
            <h1  style=" text-align:center">Books list</h1>
        </div>
        </div>
    </div>
   <div class="panel-body">
     <div class="tab-content">
      <div role="tabpanel" class="tab-pane active" id="list">
       <table class="table table-striped table-bordered table-list">
        <thead>
         <tr>
              <th>category</th>
      <th>Bookid</th>
      <th>Name </th>
      <th>Authorname </th>
      <th>language </th>
      <th>Cost</th>
      <th>edition </th>
      <th>Description </th>
            </tr> 
         </thead>
        <tbody id="myTable">
             <?php
   $dbhost = 'localhost';
   $dbuser = 'root';
   $dbpass = '';
   
   $conn = mysqli_connect($dbhost, $dbuser, $dbpass);
   
   if(! $conn ) 
   {
      die('Could not connect: ');
   }
   
   $sql = 'SELECT * FROM book';
   mysqli_select_db($conn,'book');
   $retval = mysqli_query($conn,$sql);
   
   if(! $retval ) 
   {
      die('Could not get data: ');
   }
   
   while($row = mysqli_fetch_array($retval, MYSQLI_ASSOC)) {
      echo "<tr><td>{$row['category']} </td>".
         "<td> {$row['Bookid']}</td>".
         "<td>  {$row['Name']} </td> ".
		 "<td>  {$row['Authorname']} </td> ".
		 "<td>  {$row['language']} </td> ".
		 "<td>  {$row['Cost']} </td> ".
		 "<td>  {$row['edition']} </td> ".
		 "<td>  {$row['Description']} </td> ".
         "</tr>";
   }
   
   mysqli_close($conn);
?>
          </tbody>
        </table>
      </div><!-- END id="list" -->
        
      <div role="tabpanel" class="tab-pane " id="thumb">
        <div class="row">
        <div class="col-md-12">
        
        <div class="ok">
         <div class="col-md-3">
         <div class="panel panel-default panel-thumb">
  			<div class="panel-heading">
    			<h3 class="panel-title">Djelal Eddine</h3>
  			</div>
  			<div class="panel-body avatar-card">
   			 <img src="https://pbs.twimg.com/profile_images/746779035720683521/AyHWtpGY_400x400.jpg">
 			</div>
            <div class="panel-footer">
               <a href="#" class="btn btn-primary" title="Edit"    ><i class="fa fa-pencil"></i></a>
               <a href="#" class="btn btn-warning" title="ban"	 ><i class="fa fa-ban"   ></i></a>
               <a href="#" class="btn btn-danger"  title="delete"  ><i class="fa fa-trash" ></i></a>
            </div>
         </div>
		 </div>
       </div>
      	
        <div class="ban">
         <div class="col-md-3">
         <div class="panel panel-default panel-thumb">
  			<div class="panel-heading">
    			<h3 class="panel-title">Moh Aymen</h3>
  			</div>
  			<div class="panel-body avatar-card">
   			 <img src="https://pbs.twimg.com/profile_images/3511252200/f97a40336742d17609e0b0ca17e301b8_400x400.jpeg">
 			</div>
            <div class="panel-footer">
               <a href="#" class="btn btn-primary" title="Edit"    ><i class="fa fa-pencil">		</i></a>
               <a href="#" class="btn btn-warning" title="ban"	 ><i class="fa fa-ban"   >admitted</i></a>
               <a href="#" class="btn btn-danger"  title="delete"  ><i class="fa fa-trash" >		</i></a>
            </div>
         </div>
		 </div>
       </div>
        
        <div class="new">
         <div class="col-md-3">
         <div class="panel panel-default panel-thumb">
  			<div class="panel-heading">
    			<h3 class="panel-title">Dia ElHak</h3>
  			</div>
  			<div class="panel-body avatar-card">
   			 <img src="https://pbs.twimg.com/profile_images/3023221270/fcb34337f850c1037af9840ebe510d36_400x400.jpeg">
 			</div>
            <div class="panel-footer">
               <a href="#" class="btn btn-primary" title="Edit"    ><i class="fa fa-pencil"	  >		</i></a>
        	   <a href="#" class="btn btn-success" title="validate"><i class="fa fa-check-square">validate</i></a>
               <a href="#" class="btn btn-warning" title="ban"	 ><i class="fa fa-ban"		 >		</i></a>
               <a href="#" class="btn btn-danger"  title="delete"  ><i class="fa fa-trash"	   >		</i></a>
            </div>
         </div>
		 </div>
       </div>
       
       </div>
      </div>
      </div><!-- END id="thumb" -->
       
     </div><!-- END tab-content --> 
    </div>
   
   
  </div><!--END panel-table-->
</div>
</div>
</div>
</body>
</html>