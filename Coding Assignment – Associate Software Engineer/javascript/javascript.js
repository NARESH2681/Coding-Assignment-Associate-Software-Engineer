function reverseWords(sentence) {
  const words = sentence.split(' ');
  const reversedWords = [];
  for (const word of words) {
    reversedWords.push(word.split('').reverse().join(''));
  }
  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);

function sortDescending(arr) {
  arr.sort(function(a, b) {
    return b - a;
  });
}

const numbers = [5, 2, 9, 1, 5, 6];
sortDescending(numbers);
console.log(numbers);
