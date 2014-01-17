<!DOCTYPE HTML>
<html>
  <head>
    <title>RRC Elite - Roster</title>
    <link rel="stylesheet" type="text/css" href="rrc.css">
    <link href='http://fonts.googleapis.com/css?family=Orbitron:400,500' rel='stylesheet' type='text/css'>
    <meta name="description" content="RRC Elite Gaming Homepage">
    <meta name="keywords" content="HTML,CSS,JavaScript">
    <meta name="author" content="Zen Lu">
    <meta charset="UTF-8">
    <script type="text/javascript" src="roster.js"></script>    
  </head>
  <body>
    <nav id="topnav">   
      <a href="index.php">Home</a>
      <a href="news.php">News</a>
      <a href="about.php">About</a>
      <span><a href="roster.php">Roster</a></span>
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
      
      <div id="roster">      
      <!-- Slider -->
        <nav id="team">
          <img id="team1" onclick="changeRoster(1)" src="assets/lol_logo.png" />
          <img id="team2" onclick="changeRoster(2)" src="assets/sc2_logo.png" />
          <img id="team3" onclick="changeRoster(3)" src="assets/mine_logo.png" />
          <img id="highlightteam" style="display:none; position:relative;" alt="" src="assets/team_highlight.png"/> 
        </nav>
        <div id="slider">   
            <div class="desc">
              <h1 id="playerName">Example Game Roster Intro</h1>
              <p id="playerInfo">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt 
              ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip 
              ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
              Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
              </p>
            </div>
            <img id="imgChange" src="assets/rosterselect_r.png" alt="roster_default" />
        </div>        
        <!-- End Slider -->  
        <nav class="members" id="lolTeam" style="display:none;">
          <img id="lol1" onclick="lolchangeImage(1)"src="assets/lol_ed_ico.png" alt="First" />          
          <img id="lol2" onclick="lolchangeImage(2)"src="assets/lol_md_ico.png" alt="Second" />
          <img id="lol3" onclick="lolchangeImage(3)"src="assets/player1click.png" alt="Third" />
          <img id="lol4" onclick="lolchangeImage(4)"src="assets/player4click.png" alt="Forth" />
          <img id="lol5" onclick="lolchangeImage(5)"src="assets/player1click.png" alt="Fifth" />
          <img id="lol6" onclick="lolchangeImage(6)"src="assets/player6click.png" alt="Sixth" />
          <img id="lol7" onclick="lolchangeImage(7)"src="assets/player1click.png" alt="Seventh" />
          <img id="lol8" onclick="lolchangeImage(8)"src="assets/player8click.png" alt="Eighth" />
          <img id="highlightlol" style="display:none; position:relative;" alt="" src="assets/playerchosen.png"/> 
        </nav> 
        
        <nav class="members" id="scTeam" style="display:none;">
          <img id="sc1" onclick="scchangeImage(1)"src="assets/player2click.png" alt="First" />          
          <img id="sc2" onclick="scchangeImage(2)"src="assets/player1click.png" alt="Second" />
          <img id="sc3" onclick="scchangeImage(3)"src="assets/player1click.png" alt="Third" />
          <img id="sc4" onclick="scchangeImage(4)"src="assets/player4click.png" alt="Forth" />
          <img id="sc5" onclick="scchangeImage(5)"src="assets/player1click.png" alt="Fifth" />
          <img id="sc6" onclick="scchangeImage(6)"src="assets/player6click.png" alt="Sixth" />
          <img id="sc7" onclick="scchangeImage(7)"src="assets/player1click.png" alt="Seventh" />
          <img id="sc8" onclick="scchangeImage(8)"src="assets/player8click.png" alt="Eighth" />
          <img id="highlightsc" style="display:none; position:relative;" alt="" src="assets/playerchosen.png"/> 
        </nav> 
        <nav class="members" id="mineTeam" style="display:none;">
          <img id="mine1" onclick="minechangeImage(1)"src="assets/player1click.png" alt="First" />          
          <img id="mine2" onclick="minechangeImage(2)"src="assets/player2click.png" alt="Second" />
          <img id="mine3" onclick="minechangeImage(3)"src="assets/player1click.png" alt="Third" />
          <img id="mine4" onclick="minechangeImage(4)"src="assets/player4click.png" alt="Forth" />
          <img id="mine5" onclick="minechangeImage(5)"src="assets/player1click.png" alt="Fifth" />
          <img id="mine6" onclick="minechangeImage(6)"src="assets/player6click.png" alt="Sixth" />
          <img id="mine7" onclick="minechangeImage(7)"src="assets/player1click.png" alt="Seventh" />
          <img id="mine8" onclick="minechangeImage(8)"src="assets/player8click.png" alt="Eighth" />
          <img id="highlightmine" style="display:none; position:relative;" alt="" src="assets/playerchosen.png"/> 
        </nav>
        
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