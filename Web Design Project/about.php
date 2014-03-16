<!DOCTYPE HTML>
<html>
  <head>
    <title>RRC Elite - About</title>
    <link rel="stylesheet" type="text/css" href="rrc.css">
    <link href='http://fonts.googleapis.com/css?family=Orbitron:400,500' rel='stylesheet' type='text/css'>
    <meta name="description" content="RRC Elite Gaming Homepage">
    <meta name="keywords" content="HTML,CSS,JavaScript">
    <meta name="author" content="Zen Lu">
    <meta charset="UTF-8">
    <script type="text/javascript" src="about.js"></script>    
  </head>
  <body>
    <nav id="topnav">   
      <a href="index.php">Home</a>
      <a href="news.php">News</a>
      <span><a href="about.php">About</a></span>
      <a href="roster.php">Roster</a>
      <a href="contact.php">Contact</a>
      <form method="post" action="search.php" id="search">
        <input name="q" type="text" size="40" placeholder="Search..." />
      </form>      
    </nav>
    <div id="content">      
      <div id="top">
        <a href="index.php"><img src="assets/logob.png" alt="rrc_logo" />
        <h3>RRC</h3></a>        
      </div>
      <div id="about"> 
        <!-- Slider -->
        <div id="aboutslider">   
            <div class="desc">
              <h1 id="infoTitle">Example About</h1>
              <p id="infoText">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt 
              ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip 
              ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
              Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
              </p>
            </div>
            <img id="imgChange" src="assets/aboutselect.png" alt="Bob_pic" />
        </div>        
        <!-- End Slider -->  
      </div>
      <div id="clear" />
      <div id="footer">
        <div id="f2">
          <nav id="botnav">
            <h3>Sitemap</h3>
            <a href="#">Home</a><br />
            <a href="#">News</a><br />
            <a href="#">About</a><br />
            <a href="#">Roster</a><br />
            <a href="#">Community</a><br />
            <a href="#">Partners</a><br />
            <a href="#">Contact</a>
          </nav>
        </div>
        
        <div id="f3">
          <h3>Social Media</h3>          
          <a href="#"><img src="assets/u2besm.png" alt="rrc_logo" /></a><br />
          <a href="#"><img src="assets/fbsm.png" alt="rrc_logo" /></a><br />
          <a href="#"><img src="assets/Twittersm.png" alt="rrc_logo" /></a>
        </div>
        
        <div id="f4">
          <h3>About</h3>          
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
          </p>
        </div>
        
        <div id="f1">
          <img src="assets/logogb.png" alt="rrc_logo" />   
          <div id="clear" />        
          <p>RRC Elite &copy; 2013</p><br /><p>Site by Zen Lu</p>        
        </div>
      </div>
    </div>
  </body>
</html>