## Console Roulette game

This application is multi player casino game for registered players in resource file, loaded when the application starts.
Console is the media to interact with Players, a background thread that exchange data with player and show WIN/LOSE status.
It Also shows the Total Win and Total Bet for a player from last all his game round, initial his win loss data is also loaded from resource file.
A player needs to be registered in resource file name inputfile_1.txt to be eligible to place bets and play.
Game also retrieves players past win and bet status from resource file inputfile2.txt 


## Main application class file name
  RouletteApplication.java

## Resources used for application
1.inputfile_1.txt (keeps registered players name loaded at start)
2.inputfile_2.txt (keeps players past game result which application loads at starts)

## Requirements to build and execute the game:
OS 32/64 bit
JAVA 1.8(jdk1.8.0_91)
Maven 3.0.5
Junit 4.11
Mockito 1.10.19

## To build the application:
 mvn clean install
 mvn verify test

## Test cases
Tests covers almost all expected functionality particularly user input validation/resource loading and code coverage.
There are 19 test cases run when application is build, any changes in application can be easily caught by tests.

## To execute the application:
java -cp console_roulette-1.0-SNAPSHOT.jar test.game.application.RouletteApplication

## Syntax for placing bets at console
<PlayerName> <BetNumber> or EVEN or ODD <BetAmount>

## enjoy the game, sample output below

C:\bea>java -cp console_roulette-1.0-SNAPSHOT.jar test.game.application.RouletteApplication


 Robot dealer is going to spin Roulette in 30 sec, please bet your number now!

Registered players:


Please enter your bet:

jai
james
jai 2 1.0


Please enter your bet:

james EVEN 3.0


Please enter your bet:

Number: 32
Player   Bet  Outcome Winnings
---
jai     2    LOSE       0.0
james  EVEN WIN        6.0

Total Status -------------------

Player   Total Win Total Bet
---
jai     1.0        3.0
james  8.0        4.0


 Robot dealer is going to spin Roulette in 30 sec, please bet your number now!

Registered players:
jai
james