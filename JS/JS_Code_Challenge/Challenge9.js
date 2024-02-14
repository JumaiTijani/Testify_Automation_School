//Return the number of vowels in a String
//function

function getVowels(Aflatoxicosis) {
    let Vowels = 'aeiouAEIOU';
    let vowelsCount = 0;
    for (let i = 0; i < Aflatoxicosis.length; i++) {
        if (Vowels.indexOf(Aflatoxicosis[i]) !== -1) {
            vowelsCount = vowelsCount + 1;
        }
    }
    return vowelsCount;
}
console.log(getVowels("Aflatoxicosis"));
