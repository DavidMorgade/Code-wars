const toUnderScore = (name) => {
  const nameSplitted = name.split(/([0-9A-Z]+)/).filter(Boolean);
  console.log(nameSplitted);
  return '';
};
toUnderScore('ThisIsAUnitTest');
