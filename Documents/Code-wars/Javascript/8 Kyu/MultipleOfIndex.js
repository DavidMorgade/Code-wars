function multipleOfIndex(array) {
    return array.filter((el,i)=>el%i===0||el===0&&i===0)
}