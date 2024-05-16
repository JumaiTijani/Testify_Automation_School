"""
Declare a dictionary with any key-value pair of items/elements
Print the dictionary in console
Update the dictionary with two different key-value pair items
Print the dictionary in console again

Note: you can experiment with the other list functions too in the task
"""

#Declare a dictionary with any key-value pair of items/elements
cars = {
    "Truck": "Toyota Tundra",
    "SUV": "BMW Alphina",
    "Sedan": "Honda Amaze"
}

#Print the dictionary in console
print(cars)

#Update the dictionary with two different key-value pair items
cars.update({"convertible": "Porsche Boxster", "minivan": "Toyota Sienna"})
#Print the dictionary in console again
print("Update: ", cars)

#To remove the last item in the dictionary
cars.popitem()
print("Cars pop: ", cars)

#To return the values as a list
car_values = cars.values()
print("Car Values: ", car_values)

#To returns the keys as a list
car_keys = cars.keys()
print("Car Key: ", car_keys)