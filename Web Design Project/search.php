<?php
  require 'connect.php';
  $item = $_POST['q'];
	$sql 	= "SELECT * FROM rrcelite_news WHERE title LIKE '%$item%' OR content LIKE '%$item%'";
	$result = $db->query($sql);
  $num_rows = $result->num_rows;
  
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
      <span><a href="news.php">News</a></span>
      <a href="about.php">About</a>
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
      <div id="search_list">
        <h2>Search Results</h2>
        <?php if ($num_rows > "0"){
        while ($row = $result->fetch_assoc()): ?>
          <a href="content.php?id= <?= $row['id'] ?> ">
            <div class="news_items">
              <h2>&nbsp;<?= $row['title'] ?></h2>
              <p class="elip"> 
                <?= $row['content'] ?>
              </p>
            </div>
          </a>
        <?php endwhile; 
          } else {
        ?>
        <h4>No Results Found.</h4>
        <?php } ?>
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