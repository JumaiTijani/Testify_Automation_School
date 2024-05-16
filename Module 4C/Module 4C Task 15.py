"""
Declare a list with any value and number of item/element
Print the list in console
Sort the list
Print the list in console again

Note: you can experiment with the other list functions too in the task.
"""

#Declare a list with any value and number of item/element
fruits = ['mango', 'lime', 'passion fruit', 'apple', 'sour sap', 'orange', 'watermelon']
#Print the list in console
print(fruits)

#Sort the list(to sort in ascending order)
fruits.sort()
#Print the list in console again
print('Sorted list: ', fruits)

#Sort the list(to sort in descending order)
fruits.sort(reverse=True)
#Print the list in console again
print('Sorted list(descending): ', fruits)

#add new item to the end of the list
fruits.append('pineapples')
print('Append: ', fruits)

#add new item to a specified position on the list
fruits.insert(2, 'banana')
print('Insert: ', fruits)

#remove an item from a specified position on the list
fruits.pop(3)
print('Pop: ', fruits)

#reverse the order of a list
fruits.reverse()
print('Reverse: ', fruits)