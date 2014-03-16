<?php
  require 'connect.php';
  //news items for current table - current table max 12
	$sql 	= "SELECT * FROM rrcelite_news ORDER BY updated_at DESC LIMIT 2";
	$result = $db->query($sql);
  $news_id = array();
  $news_title = array();
  $news_img = array();
  
  while ($row = $result->fetch_assoc()):
    array_push($news_id, $row['id']);
    array_push($news_title, $row['title']);
  endwhile;
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
      <span><a href="index.php">Home</a></span>
      <a href="news.php">News</a>
      <a href="about.php">About</a>
      <a href="roster.php">Roster</a>
      <a href="contact.php">Contact</a>
      <form method="post" action="search.php" id="search">
        <input name="q" type="text" size="40" placeholder="Search..." />
      </form>      
    </nav>
    <div id="content">      
      <!-- Top area with logo -->
      <div id="top">
        <a href="index.php"><img src="assets/logob.png" alt="rrc_logo" />
        <h3>RRC</h3></a>        
      </div>      
      <!-- News Items - 
          Needs revamping to show picture that is saved onto db
          Loads most recent item
      -->
      <div id="news">              
        <table>
          <tr>
            <td colspan=2 rowspan=2><a id ="topnews" href="content.php?id= <?= $news_id[0] ?> "><img src="assets/86943.jpg" alt="rrc_logo" /></a></td>
            <td><a href="content.php?id= <?= $news_id[1] ?> "><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
          </tr>
          <tr>
            <td><a href="content.php?id= <?= $news_id[2] ?> "><img src="assets/drow.jpg" alt="rrc_logo" /></a></td>
          </tr>   
          <tr>
            <td><a href="#"><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/drow.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
          </tr> 
          <tr>
            <td><a href="#"><img src="assets/drow.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/drow.jpg" alt="rrc_logo" /></a></td>
          </tr>  
          <tr>
            <td><a href="#"><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/drow.jpg" alt="rrc_logo" /></a></td>
            <td><a href="#"><img src="assets/chandra.jpg" alt="rrc_logo" /></a></td>
          </tr>           
        </table>      
      </div>
      
      <!-- Sidebar items -->
      <div id="sidebartop">
        <h3>Upcoming Events</h3>
        <ul>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
        </ul>
      </div>      
      <div id="sidebarmiddle">
        <h3>Recent Events</h3>  
        <ul>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
          <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </a></li>
        </ul>
      </div>
      <div id="sidebarbottom">
        <h3>Sponsors</h3>   
        <a href="#"><img src="assets/logob.png" alt="rrc_logo" /></a>
        <a href="#"><img src="assets/logob.png" alt="rrc_logo" /></a>
        <a href="#"><img src="assets/logob.png" alt="rrc_logo" /></a>
      </div>      
      <!-- for float clears -->
      <div id="clear" />      
      <!-- Footer Items/sections-->
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