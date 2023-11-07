/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.

The first word within the output should be capitalized only if the original word was capitalized

(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/

using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine(ToCamelCase("apgyjgcunuOpanmbhrhdIkaemakvoc"));
	}
	public static string ToCamelCase(string str) 
	{
		string resultStr = "";
		for(int i = 0; i < str.Length; i++) {
			if(str[i] == '_' || str[i] == '-') {
				resultStr+="";
			}
			else if(i > 0 && (str[i - 1] == '_' || str[i - 1] == '-')) {
				resultStr+=Char.ToUpper(str[i]);
			} else {
				resultStr+=str[i];
			}
		}
		return resultStr;
	}
}
