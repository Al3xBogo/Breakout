============================================
BREAKOUT - Final Project
CPS 150 - Introduction to Programming
============================================

TEAM MEMBERS:
  1. Alexander Bogomolov - bogomolova1@udayton.edu
  2. Fernando Montoya - montoyaf1@udayton.edu
  3. John Turri - turrij1@udayton.edu

--------------------------------------------
ENHANCED FEATURES IMPLEMENTED:
  1. E7 - High Score Persistence
     Creates a highScore.txt file in the project root directory if it does not yet exist.
      The program tracks high score during the game, then once the game ends writes it to the file.

  2. E6 - Pause Functionality
     Listens for "escape" keypress and toggles pausing.
     Pauses timer and draws "pause" symbol overlay while paused.
     Resumes timer while un-paused.

  3. [Feature ID & Name, e.g., E5 - Start Screen]
     Brief description of how it works.

--------------------------------------------
CONTRIBUTIONS:
  Alex:     Created repository on GitHub for working on the game at https://github.com/Al3xBogo/Breakout
            Implemented Paddle motion and collisions
            Fixed ball interactions with bricks
            Added play/pause interactions
            Implemented persistent high score functionality
            Implemented game sounds
            Implemented score reset functionality
            Added pause before new ball

  [Name 2]: Implemented Ball class, wall and paddle
            collisions, and increasing difficulty.

  [Name 3]: Implemented brick collisions, win/lose
            conditions, HUD, game-over screen, and README.

--------------------------------------------
KNOWN BUGS:
  - [Describe any bugs you are aware of but could not fix]
  - [e.g., "Occasionally the ball can clip the corner of a
     brick and bounce in an unexpected direction."]

--------------------------------------------
COMPILATION & RUNNING:
  1. Compile: javac *.java
  2. Run:     java Breakout

--------------------------------------------
REFERENCES:
  - [List any tutorials, videos, or documentation you used]
  - [e.g., "Java Swing documentation: docs.oracle.com/..."]
  - Java Read Files Tutorial: https://www.w3schools.com/java/java_files_read.asp
  - Java Write Files Tutorial: https://www.w3schools.com/java/java_files_write.asp
  - Playing Sound in Java: https://www3.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
  - 400+ Sounds Pack: https://ci.itch.io/400-sounds-pack
  - Stackoverflow - Java unreported exception: https://stackoverflow.com/questions/2091589/java-unreported-exception
  - Stackoverflow - AudioSystem successfully plays Clip, but only once - LineUnavailableException: https://stackoverflow.com/questions/66443421/audiosystem-successfully-plays-clip-but-only-once-lineunavailableexception

============================================
