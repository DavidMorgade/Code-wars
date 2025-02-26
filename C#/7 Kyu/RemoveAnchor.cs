/*
Complete the function/method so that it returns the url with anything after the anchor (#) removed.

Examples
"www.codewars.com#about" --> "www.codewars.com"
"www.codewars.com?page=1" -->"www.codewars.com?page=1"
*/


public static class Kata
{
  public static string RemoveUrlAnchor(string url)
  {
    string newUrl = "";
    foreach(char c in url)
    {
      if(c == '#') return newUrl;
      newUrl += c;      
    }
    return url;
  }
}
