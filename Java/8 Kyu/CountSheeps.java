public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int count = 0;
    for(int i = 0; i < arrayOfSheeps.length; i++) {
      if(arrayOfSheeps[i]) count++;
    }
    return count;
  }
}
