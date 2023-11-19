public class Multiplication{
  public static int [][] multiplicationTable(int n){
    int[][] result = new int[n][n];
    int multiplier = 1;
    for(int i = 0; i<n; i++) {
      for(int j = 0; j < n; j++) {
        result[i][j] = (j + 1) * multiplier;
      }
      multiplier++;    
    }
    return result;
  }

}