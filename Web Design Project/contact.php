<?php
  require 'connect.php';
  
?>
<!DOCTYPE HTML>
<html>
  <head>
    <title>RRC Elite - Home</title>
    <link rel="stylesheet" type="text/css" href="rrc.css">
    <link href='http://fonts.googleapis.com/css?family=Orbitron:400,500' rel='stylesheet' type='text/css'>
    <meta name="description" content="RRC Elite Gaming Homepage">
    <meta name="keywords" content="HTML,CSS,JavaScript">
    <meta name="author" content="Zen Lu">
    <meta charset="UTF-8">
  </head>
  <body>
    <nav id="topnav">   
      <a href="index.php">Home</a>
      <a href="news.php">News</a>
      <a href="about.php">About</a>
      <a href="roster.php">Roster</a>
      <span><a href="contact.php">Contact</a></span>
      <form method="post" action="search.php" id="search">
        <input name="q" type="text" size="40" placeholder="Search..." />
      </form>      
    </nav>
    <div id="content">      
      <div id="top">
        <a href="index.php"><img src="assets/logob.png" alt="rrc_logo" />
        <h3>RRC</h3></a>        
      </div>
      <div id="contact">
      <form name="input" action="mailto:example@example.com?subject=RRCElite Contact Form" method="post" ENCTYPE="text/plain">
          <fieldset>
            <legend><h3>Contact RRCElite:</h3></legend>
            <b>Name:</b><br /><input type="text" name="name" size="50"><br /><br />       
            <b>Email:</b> <br /><input type="text" name="email" size="50"><br /><br />
            <b>Subject:</b> <br /><input type="text" name="subject" size="50"><br /><br />
            <b>Body:</b> <br /><textarea name="content" rows="10" cols="50" ></textarea>
            <br /><br />
            <input type="submit" value="Submit">
          </fieldset>
        </form>  
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