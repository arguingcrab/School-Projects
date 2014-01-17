/**
  ROSTER DISPLAY
**/
function changeRoster(id){
  var lolteam=document.getElementById("lolTeam");
  var scteam=document.getElementById("scTeam");
  var mineteam=document.getElementById("mineTeam");
  var highlight =document.getElementById("highlightteam");
  var image =document.getElementById("imgChange");
  var name =document.getElementById("playerName");
  var description =document.getElementById("playerInfo");
  var teamNum = "team"+id;
  removeHighlight();
  
  switch(id){  
    case 1:      
      image.src = "assets/rosterselect_r.png";
      name.innerHTML = 'League of Legends Roster';
      description.innerHTML = 
      'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt'+
      'ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip';
      lolteam.style.display='block'; 
      scteam.style.display='none'; 
      mineteam.style.display='none';  
      highlight.style.display = 'inline';
      highlight.style.left='203px';  
      highlight.style.top='0';  
      document.getElementById(teamNum).style.opacity='1';
      break;
    case 2:
      image.src = "assets/rosterselect_r.png";
      name.innerHTML = 'StarCraft 2 Roster';
      description.innerHTML = 
      'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt'+
      'ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip';
      lolteam.style.display='none'; 
      scteam.style.display='block'; 
      mineteam.style.display='none'; 
      highlight.style.display = 'inline';
      highlight.style.left='403px';  
      highlight.style.top='0';  
      document.getElementById(teamNum).style.opacity='1'; 
      break;
    case 3:
      image.src = "assets/rosterselect_r.png";
      name.innerHTML = 'Minecraft Roster';
      description.innerHTML = 
      'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt'+
      'ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip';
      lolteam.style.display='none'; 
      scteam.style.display='none'; 
      mineteam.style.display='block';  
      highlight.style.display = 'inline';
      highlight.style.left='602px';  
      highlight.style.top='0';  
      document.getElementById(teamNum).style.opacity='1';
      break;
    default:
      break;
  }
}

/**
  REMOVE HIGHLIGHTS
**/
function removeHighlight(){
  var highlightteam =document.getElementById("highlightteam");
  var highlightlol =document.getElementById("highlightlol");
  var highlightsc =document.getElementById("highlightsc");
  var highlightmine =document.getElementById("highlightmine");
  highlightteam.style.display = 'none';
  highlightlol.style.display = 'none';
  highlightsc.style.display = 'none';
  highlightmine.style.display = 'none';
  
  for (var i=1; i<9; i++){  
    lolNumber="lol"+i;
    lol=document.getElementById(lolNumber);
    lol.style.opacity='0.3';
  }
  
  for (var i=1; i<4; i++){  
    teamNumber="team"+i;
    team=document.getElementById(teamNumber);
    team.style.opacity='0.3';
  }
  
  for (var i=1; i<9; i++){  
    scNumber="sc"+i;
    sc=document.getElementById(scNumber);
    sc.style.opacity='0.3';
  }
  
  for (var i=1; i<9; i++){  
    mineNumber="lol"+i;
    mine=document.getElementById(mineNumber);
    mine.style.opacity='0.3';
  }
}
/**
  LEAGUE
**/
function lolchangeImage(id) {
  var image =document.getElementById("imgChange");
  var name =document.getElementById("playerName");
  var description =document.getElementById("playerInfo");
  var highlight =document.getElementById("highlightlol");
  var lolNum = "lol"+id;
  
  removeHighlight();
  
  switch(id){  
    case 1:
      window.scrollTo(0,180);
      image.src = "assets/lol_ed_bg.png";
      highlight.style.display = 'inline';
      highlight.style.left='0';
      name.innerHTML = 'Edward "edsun" C';
      description.innerHTML =
      'Role: Feeder <br />'+
      'Unknown <br /><br /><br />' +
      'Edward "edsun" C Likes power walking in the moonlight while drinking goat milk.';
      document.getElementById(lolNum).style.opacity='1';
      break;
    case 2:
      window.scrollTo(0,180);
      image.src = "assets/lol_md_bg.png";
      highlight.style.display = 'inline';
      highlight.style.left='124px';
      name.innerHTML = 'Manjodh "Eripious" Dhaliwal';
      description.innerHTML = 
      'Role: Support <br />'+
      '18 Year Old Male <br /><br /><br />' +
      'Manjodh "Eripious" Dhaliwal Likes long walks on the beach while eating peanut butter.';
      document.getElementById(lolNum).style.opacity='1';
      break;
    case 3:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='248px';
      name.innerHTML = 'Ino "imamazin" Bro';
      description.innerHTML = 
      'Role: Marksman <br />'+
      '19 Year Old Male <br /><br /><br />' +
      'Ino "imamazin" Bro Likes to jog in the park while drinking lemonade.';
      document.getElementById(lolNum).style.opacity='1';
      break;
    case 4:    
      window.scrollTo(0,180);     
      image.src = "assets/player4.png";
      highlight.style.display = 'inline';
      highlight.style.left='372px';
      name.innerHTML = 'Nicol "NeverDieElder5" Bolas';
      description.innerHTML = 
      'Sub: Fighter <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Nicol "iswearimnotevil" Bolas Likes to read romance novels while sipping on his apple juice with a bendy straw.'; 
      document.getElementById(lolNum).style.opacity='1';
      
      break;
    case 5:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';  
      highlight.style.left='496px';
      name.innerHTML = 'Ron "imamazin" Tron';
      description.innerHTML = 
      'Role: Mage <br />'+
      '21 Year Old Male <br /><br /><br />' +
      'Ron "imamazin" Tron Likes to read the daily news while exercising on a fitness ball.';
      document.getElementById(lolNum).style.opacity='1';  
      break;
    case 6:
      window.scrollTo(0,180);
      image.src = "assets/player6.png";
      highlight.style.display = 'inline';
      highlight.style.left='620px';
      name.innerHTML = 'Jace "jcbel" Beleren';
      description.innerHTML = 
      'Sub: Mage <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Jace "jcbel" Beleren" Likes to run really fast after midnight until he passes out on the streets.';
      document.getElementById(lolNum).style.opacity='1';
      break;
    case 7:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='744px';
      name.innerHTML = 'Janik "bipNbop" Fey';
      description.innerHTML = 
      'Role: Fighter <br />'+
      '20 Year Old Male <br /><br /><br />' +
      'Janik "bipNbop" Fey Likes long walks in the graveyard while setting up a picnic to eat apple cinnamon pancakes with pickles on the side.';
      document.getElementById(lolNum).style.opacity='1';
      break;
    case 8:
      window.scrollTo(0,180);
      image.src = "assets/player8.png";
      highlight.style.display = 'inline';
      highlight.style.left='868px';
      name.innerHTML = 'Karn "xXsilver_golemXx" Liberated';
      description.innerHTML = 
      'Sub: Tank <br />'+
      '28 Year Old Male <br /><br /><br />' +
      'Karn "xXsilver_golemXx" Liberated Likes to ruin everyones day by releasing the Mirari and letting it terrorize citizens of neighbouring city-states.';
      document.getElementById(lolNum).style.opacity='1';  
      break;
    default:
      break;
  }
}

/**
  SC2
**/

function scchangeImage(id) {
  var image =document.getElementById("imgChange");
  var name =document.getElementById("playerName");
  var description =document.getElementById("playerInfo");
  var highlight =document.getElementById("highlightsc");
  var scNum = "sc"+id;
  
  removeHighlight();
  
  switch(id){  
    case 1:
      window.scrollTo(0,180);
      image.src = "assets/player2.png";
      highlight.style.display = 'inline';
      highlight.style.left='0';
      name.innerHTML = 'Billy "JingleJangle" Bob';
      description.innerHTML =
      'Favourite Race: Terran <br />'+
      '18 Year Old Male <br /><br /><br />' +
      'Billy "JingleJangle" Bob Likes power walking in the moonlight while drinking goat milk.';
      document.getElementById(scNum).style.opacity='1';
      break;
    case 2:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='124px';
      name.innerHTML = 'Ihlay "qtpa2t" Caris';
      description.innerHTML = 
      'Role: Support <br />'+
      '17 Year Old Male <br /><br /><br />' +
      'Ihlay "qtpa2t" Caris Likes long walks on the beach while eating peanut butter.';
      document.getElementById(scNum).style.opacity='1';
      break;
    case 3:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='248px';
      name.innerHTML = 'Ino "imamazin" Bro';
      description.innerHTML = 
      'Role: Marksman <br />'+
      '19 Year Old Male <br /><br /><br />' +
      'Ino "imamazin" Bro Likes to jog in the park while drinking lemonade.';
      document.getElementById(scNum).style.opacity='1';
      break;
    case 4:    
      window.scrollTo(0,180);     
      image.src = "assets/player4.png";
      highlight.style.display = 'inline';
      highlight.style.left='372px';
      name.innerHTML = 'Nicol "NeverDieElder5" Bolas';
      description.innerHTML = 
      'Sub: Fighter <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Nicol "iswearimnotevil" Bolas Likes to read romance novels while sipping on his apple juice with a bendy straw.'; 
      document.getElementById(scNum).style.opacity='1';
      
      break;
    case 5:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';  
      highlight.style.left='496px';
      name.innerHTML = 'Ron "imamazin" Tron';
      description.innerHTML = 
      'Role: Mage <br />'+
      '21 Year Old Male <br /><br /><br />' +
      'Ron "imamazin" Tron Likes to read the daily news while exercising on a fitness ball.';
      document.getElementById(scNum).style.opacity='1';  
      break;
    case 6:
      window.scrollTo(0,180);
      image.src = "assets/player6.png";
      highlight.style.display = 'inline';
      highlight.style.left='620px';
      name.innerHTML = 'Jace "jcbel" Beleren';
      description.innerHTML = 
      'Sub: Mage <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Jace "jcbel" Beleren" Likes to run really fast after midnight until he passes out on the streets.';
      document.getElementById(scNum).style.opacity='1';
      break;
    case 7:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='744px';
      name.innerHTML = 'Janik "bipNbop" Fey';
      description.innerHTML = 
      'Role: Fighter <br />'+
      '20 Year Old Male <br /><br /><br />' +
      'Janik "bipNbop" Fey Likes long walks in the graveyard while setting up a picnic to eat apple cinnamon pancakes with pickles on the side.';
      document.getElementById(scNum).style.opacity='1';
      break;
    case 8:
      window.scrollTo(0,180);
      image.src = "assets/player8.png";
      highlight.style.display = 'inline';
      highlight.style.left='868px';
      name.innerHTML = 'Karn "xXsilver_golemXx" Liberated';
      description.innerHTML = 
      'Sub: Tank <br />'+
      '28 Year Old Male <br /><br /><br />' +
      'Karn "xXsilver_golemXx" Liberated Likes to ruin everyones day by releasing the Mirari and letting it terrorize citizens of neighbouring city-states.';
      document.getElementById(scNum).style.opacity='1';  
      break;
    default:
      break;
  }
}

/**
  mine
**/

function minechangeImage(id) {
  var image =document.getElementById("imgChange");
  var name =document.getElementById("playerName");
  var description =document.getElementById("playerInfo");
  var highlight =document.getElementById("highlightmine");
  var mineNum = "mine"+id;
  
  removeHighlight();
  
  switch(id){  
    case 1:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='0';
      name.innerHTML = 'Billy "JingleJangle" Bob';
      description.innerHTML =
      'Favourite Race: Terran <br />'+
      '18 Year Old Male <br /><br /><br />' +
      'Billy "JingleJangle" Bob Likes power walking in the moonlight while drinking goat milk.';
      document.getElementById(mineNum).style.opacity='1';
      break;
    case 2:
      window.scrollTo(0,180);
      image.src = "assets/player2.png";
      highlight.style.display = 'inline';
      highlight.style.left='124px';
      name.innerHTML = 'Ihlay "qtpa2t" Caris';
      description.innerHTML = 
      'Role: Support <br />'+
      '17 Year Old Male <br /><br /><br />' +
      'Ihlay "qtpa2t" Caris Likes long walks on the beach while eating peanut butter.';
      document.getElementById(mineNum).style.opacity='1';
      break;
    case 3:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='248px';
      name.innerHTML = 'Ino "imamazin" Bro';
      description.innerHTML = 
      'Role: Marksman <br />'+
      '19 Year Old Male <br /><br /><br />' +
      'Ino "imamazin" Bro Likes to jog in the park while drinking lemonade.';
      document.getElementById(mineNum).style.opacity='1';
      break;
    case 4:    
      window.scrollTo(0,180);     
      image.src = "assets/player4.png";
      highlight.style.display = 'inline';
      highlight.style.left='372px';
      name.innerHTML = 'Nicol "NeverDieElder5" Bolas';
      description.innerHTML = 
      'Sub: Fighter <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Nicol "iswearimnotevil" Bolas Likes to read romance novels while sipping on his apple juice with a bendy straw.'; 
      document.getElementById(mineNum).style.opacity='1';
      
      break;
    case 5:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';  
      highlight.style.left='496px';
      name.innerHTML = 'Ron "imamazin" Tron';
      description.innerHTML = 
      'Role: Mage <br />'+
      '21 Year Old Male <br /><br /><br />' +
      'Ron "imamazin" Tron Likes to read the daily news while exercising on a fitness ball.';
      document.getElementById(mineNum).style.opacity='1';  
      break;
    case 6:
      window.scrollTo(0,180);
      image.src = "assets/player6.png";
      highlight.style.display = 'inline';
      highlight.style.left='620px';
      name.innerHTML = 'Jace "jcbel" Beleren';
      description.innerHTML = 
      'Sub: Mage <br />'+
      '16 Year Old Male <br /><br /><br />' +
      'Jace "jcbel" Beleren" Likes to run really fast after midnight until he passes out on the streets.';
      document.getElementById(mineNum).style.opacity='1';
      break;
    case 7:
      window.scrollTo(0,180);
      image.src = "assets/player3.png";
      highlight.style.display = 'inline';
      highlight.style.left='744px';
      name.innerHTML = 'Janik "bipNbop" Fey';
      description.innerHTML = 
      'Role: Fighter <br />'+
      '20 Year Old Male <br /><br /><br />' +
      'Janik "bipNbop" Fey Likes long walks in the graveyard while setting up a picnic to eat apple cinnamon pancakes with pickles on the side.';
      document.getElementById(mineNum).style.opacity='1';
      break;
    case 8:
      window.scrollTo(0,180);
      image.src = "assets/player8.png";
      highlight.style.display = 'inline';
      highlight.style.left='868px';
      name.innerHTML = 'Karn "xXsilver_golemXx" Liberated';
      description.innerHTML = 
      'Sub: Tank <br />'+
      '28 Year Old Male <br /><br /><br />' +
      'Karn "xXsilver_golemXx" Liberated Likes to ruin everyones day by releasing the Mirari and letting it terrorize citizens of neighbouring city-states.';
      document.getElementById(mineNum).style.opacity='1';  
      break;
    default:
      break;
  }
}