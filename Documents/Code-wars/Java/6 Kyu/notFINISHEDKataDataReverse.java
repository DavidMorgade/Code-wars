/*
 * A stream of data is received and needs to be reversed.

Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:

11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)

should become:

10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)

The total number of bits will always be a multiple of 8.

The data is given in an array as such:

[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

Note: In the C and NASM languages you are given the third parameter which is the number of segment blocks.

 */

// PENDING TO FINISH

public class notFINISHEDKataDataReverse {

  public static int[] DataReverse(int[] data) {
    int[] solution = new int[data.length];
    boolean isFit = solution.length % 8 != 0;
    while (isFit) {
      for (int i = data.length - 1, j = 0; i >= 0; i--, j++) {
        solution[j] = data[i];
      }
      if (data.length > solution.length) {
        isFit = true;
      } else {
        isFit = false;
        System.out.println("a");
      }
    }

    for (int i = 0; i < solution.length; i++) {
      System.out.println(solution[i]);
    }
    return solution;
  }
}
