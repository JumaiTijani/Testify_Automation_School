"""
Use for loop to iterate from 0 to 10
For each iteration print out "Number ", i

If the i value is equal to 2 add the continue
If the i value is equal to 8 add the break statement

For instruction 2, to print out Number and i, use the statement in your loop, print("Number", i)
"""
#Use for loop to iterate from 0 to 10
number = 10

#If the i value is equal to 2 add the continue
for i in range(number):
    if i ==2:
        continue

#If the i value is equal to 8 add the break statement
    if i ==8:
        break

#For each iteration print out "Number ", i
    print("Number: ", i)

