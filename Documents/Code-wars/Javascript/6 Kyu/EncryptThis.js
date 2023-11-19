/*
Acknowledgments:

I thank yvonne-liu for the idea and for the example tests :)
Description:

Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

    Your message is a string containing space separated words.
    You need to encrypt each word in the message using the following rules:
        The first letter must be converted to its ASCII code.
        The second letter must be switched with the last letter
    Keepin' it simple: There are no special characters in the input.

Examples:

encryptThis("Hello") === "72olle"
encryptThis("good") === "103doo"
encryptThis("hello world") === "104olle 119drlo"

*/

function switchCharacters(str, index1, index2) {
  // Convert the string into an array of characters
  let charArray = str.split("");

  // Swap the characters at index1 and index2
  [charArray[index1], charArray[index2]] = [
    charArray[index2],
    charArray[index1],
  ];

  // Convert the array back to a string and return it
  return charArray.join("");
}

var encryptThis = function (text) {
  return text
    .split(" ")
    .map(
      (word) =>
        word.charCodeAt(0) +
        switchCharacters(word.substring(1), 0, word.substring(1).length - 1)
    )
    .join(" ");
};
