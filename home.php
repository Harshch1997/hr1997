<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Home Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="stty2.css" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style2.css">

</head>

<body style=" background-color:#FFDEAD; background-image: url(lib2.jpg);background-position: center bottom ;background-size:cover; background-repeat:no-repeat;">
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
            <li><a href="Issue..php">Issue</a></li>
            <li><a href="Return.php">Return</a></li>
          </ul>
        </li>
        <li><a href="About us.php">About us</a></li>
        
      </ul>
      
    </div>
  

	</div>
</div>
<div class="container">
        <div class="panel" style="margin-top:-5px; background-color:#FFDEAD; height:150%; padding:2px;">
                <div class="panel-heading">
                 
                    <div class="text-center" style="margin-top:2px;">
                   
                        <div class="row">
                        <img class="pull-left" style="width:30%;height:120px;"alt="Image" src="images.png">
                           <marquee loop="1"  scrolldelay="5" scrollamount="25" behavior="slide"> <h1 style="color: #0000ff" align="center">WELCOME TO OUR HOME PAGE</h1></marquee>
                          
                    
                        
                <a href="#" >
                    <img style="width:100%;height:500px;"alt="Image" src="lib45.jpg">
                </a>
               <p style="font-size:18px; font-family: Constantia, 'Lucida Bright', 'DejaVu Serif', Georgia, serif; font-style: italic; font-weight:bold;"> A library is a collection of sources of information and similar resources, made accessible to a defined community for reference or borrowing. It provides physical or digital access to material, and may be a physical building or room, or a virtual space, or both. A library's collection can include books, periodicals, newspapers, manuscripts, films, maps, prints, documents, microform, CDs, cassettes, videotapes, DVDs, Blu-ray Discs, e-books, audiobooks, databases, and other formats. Libraries range in size from a few shelves of books to several million items. In Latin and Greek, the idea of a bookcase is represented by Bibliotheca and Bibliothēkē (Greek: βιβλιοθήκη): derivatives of these mean library in many modern languages, e.g. French bibliothèque.
The first libraries consisted of archives of the earliest form of writing—the clay tablets in cuneiform script discovered in Sumer, some dating back to 2600 BC. Private or personal libraries made up of written books appeared in classical Greece in the 5th century BC. In the 6th century, at the very close of the Classical period, the great libraries of the Mediterranean world remained those of Constantinople and Alexandria.
A library is organized for use and maintained by a public body, an institution, a corporation, or a private individual. Public and institutional collections and services may be intended for use by people who choose not to—or cannot afford to—purchase an extensive collection themselves, who need material no individual can reasonably be expected to have, or who require professional assistance with their research. In addition to providing materials, libraries also provide the services of librarians who are experts at finding and organizing information and at interpreting information needs. Libraries often provide quiet areas for studying, and they also often offer common areas to facilitate group study and collaboration. Libraries often provide public facilities for access to their electronic resources and the Internet. Modern libraries are increasingly being redefined as places to get unrestricted access to information in many formats and from many sources. They are extending services beyond the physical walls of a building, by providing material accessible by electronic means, and by providing the assistance of librarians in navigating and analyzing very large amounts of information with a variety of digital tools. <a href="https://en.wikipedia.org/wiki/Library">Read more</a></p>
                    </div>
                    </div>
                </div>
                
            
        </div>
    </div>
		







</body>
</html>
