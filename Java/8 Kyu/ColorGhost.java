/*
Color Ghost
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
*/



public class Ghost {
  
  private String color;
  
  public Ghost() {
    this.color = this.randomColor();
  }
  
  private String randomColor() {
    int randomNumber = getRandomNumber(1, 5);
    switch(randomNumber) {
        case 1:
          return "white";
        case 2:
          return "yellow";
        case 3:
          return "purple";
        case 4:
          return "red";
        default:
          return "none";
    }
  }
  
  private int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
  
  public String getColor() {
    return this.color;
  }
}
