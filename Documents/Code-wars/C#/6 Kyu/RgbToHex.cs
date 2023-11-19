/*
DESCRIPTION:
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
*/


using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Hello World");
	}
	public static string Rgb(int r, int g, int b) 
	{
		r = Math.Clamp(r, 0, 255);
		g = Math.Clamp(g, 0, 255);
		b = Math.Clamp(b, 0, 255);
		string rHex = r.ToString("X2"); 
		string gHex = g.ToString("X2");
		string bHex = b.ToString("X2");

		string hexColor = rHex + gHex + bHex;

		return hexColor;
	}
}
