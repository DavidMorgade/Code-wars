/*Introduction

There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
Task

Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1

The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1

The other letters don't have power and are only victims.
Example

AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
 */

public class AlphabetWar {

  public static String alphabetWar(String fight) {
    int rightScore = 0;
    int leftScore = 0;
    for (int i = 0; i < fight.length(); i++) {
      if (fight.charAt(i) == 'w') {
        leftScore += 4;
      }
      if (fight.charAt(i) == 'p') {
        leftScore += 3;
      }
      if (fight.charAt(i) == 'b') {
        leftScore += 2;
      }
      if (fight.charAt(i) == 's') {
        leftScore += 1;
      }
      if (fight.charAt(i) == 'm') {
        rightScore += 4;
      }
      if (fight.charAt(i) == 'q') {
        rightScore += 3;
      }
      if (fight.charAt(i) == 'd') {
        rightScore += 2;
      }
      if (fight.charAt(i) == 'z') {
        rightScore += 1;
      }
    }
    if (rightScore > leftScore) {
      return "Right side wins!";
    } else if (leftScore > rightScore) {
      return "Left side wins!";
    } else {
      return "Let's fight again!";
    }
  }

  public static boolean isEqual(int a, int b) {
    return a > b;
  }
}
