#Create a function that filters out negative numbers.

numbers = [-12, 15, -3, 8, -1, 0, 4, -8, 0.8]

def filter(numbers):
    positive_numbers = [num for num in numbers if num >= 0]
    return positive_numbers

filtered_numbers = filter(numbers)
print("Filtered list:", filtered_numbers)