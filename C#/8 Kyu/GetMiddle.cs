using System;
					
public class Program
{
	public static void Main()
	{
		double[] prueba = {4.5, 2.2, 5.5};
		
		int result = Gimme(prueba);
		

	}
	
	public static int Gimme(double[] inputArray)
	{
		double min = inputArray[0];
		double max = inputArray[0];
		foreach(double num in inputArray) {
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}


		int resultIndex = 0;
		for(int i = 0; i < inputArray.Length; i++) {
			if(!inputArray[i].Equals(min) && !inputArray[i].Equals(max)) {
				resultIndex = i;
			}
		}
		Console.WriteLine(resultIndex);
		return resultIndex;
	}
}
