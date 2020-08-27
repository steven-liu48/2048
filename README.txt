This 2048 is a command line game.

1) When getting started, You should expect the conditions below:
             
             >>>2048<<<

    Moves made: 0   Maximum: 2

Instructions: A/D/W/S to move Left/Right/Up/Down;
	R to Restart and Q to Quit; Then press ENTER.

     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |2    |
     ––––– ––––– ––––– –––––
    |     |2    |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––

2) According to instructions, you press A/W/D/S to move the grids. 
   The instructions would disappear.

             >>>2048<<<

    Moves made: 2   Maximum: 4

     ––––– ––––– ––––– –––––
    |4    |     |2    |2    |
     ––––– ––––– ––––– –––––
    |2    |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––

You pressed W. Valid.
q


3) If your press q anytime during the game, the output should look like this:

             >>>2048<<<

    Moves made: 1   Maximum: 2

     ––––– ––––– ––––– –––––
    |2    |     |     |2    |
     ––––– ––––– ––––– –––––
    |     |2    |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––

You pressed W. Valid.
q
Quit? (Y/N)
y
You quitted. Your Moves: 1
Game has ended. Thank you!


4) If you press r anytime during the game, the output should look like this:

             >>>2048<<<

    Moves made: 0   Maximum: 2

Instructions: A/D/W/S to move Left/Right/Up/Down;
	R to Restart and Q to Quit; Then press ENTER.

     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |2    |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |2    |
     ––––– ––––– ––––– –––––

r
Restart? (Y/N)
y

   If you press ENTER, a new game will start and it looks like this:

             >>>2048<<<

    Moves made: 0   Maximum: 2

     ––––– ––––– ––––– –––––
    |     |2    |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––
    |2    |     |     |     |
     ––––– ––––– ––––– –––––
    |     |     |     |     |
     ––––– ––––– ––––– –––––

You pressed R to restart. 



5) When you lose, the output should look like this:

             >>>2048<<<

    Moves made: X   Maximum: XXXX

     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––

You pressed W. Valid.
Unfortunately, you lost. Your moves: 5
Game has ended. Thank you!

6) When you win, the output should look like this:

             >>>2048<<<

    Moves made: X   Maximum: 2048

     ––––– ––––– ––––– –––––
    |2048 |XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––

You pressed W. Valid.
You Win! Your moves: 1
Game has ended. Thank you!

7) When trying to swipe to a direction that can't be moved further, expect this:

             >>>2048<<<

    Moves made: 0   Maximum: 9879

     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––

You pressed A. Invalid.

8) When pressing the wrong button, expect this:

             >>>2048<<<

    Moves made: 0   Maximum: 9879

     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––
    |XXXXX|XXXXX|XXXXX|XXXXX|
     ––––– ––––– ––––– –––––

You pressed XXXXX. Invalid.
