import java.util.ArrayList;

public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for(int i = 0; i<array.length; i++) {
      if(i == 0 && array[i] == 0) {
        intList.add(0);
      }
      if(i != 0 && array[i] % i == 0) {
        intList.add(array[i]);
      }
    }
    int[] solution = new int[intList.size()];
    for(int i = 0; i<solution.length; i++) {
      System.out.println(intList.get(i));
      solution[i] = intList.get(i);
    }
    return solution;
  }
}