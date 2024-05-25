#Return the number of vowels in a string.


word = "amoxicillin"

def count_vowels(word):
    vowels = 'aeiou'
    count = 0
    for char in word:
        if char in vowels:
            count += 1
    return count


vowel_count = count_vowels(word)
print("Vowel Counts in", word, "is",vowel_count)

