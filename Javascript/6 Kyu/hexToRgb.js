function hexStringToRGB(hexString) {
  const hexArray = splitEveryTwo(hexString);
  const rgbArr = hexArray.map(el => parseInt(el, 16));
  return {
    r: rgbArr[0],
    g: rgbArr[1],
    b: rgbArr[2]
  }
}
function splitEveryTwo(str) { const result = [];
  for(let i = 1; i < str.length; i+=2) {
    result.push(str.substring(i, i + 2));
  }
  return result;
}
