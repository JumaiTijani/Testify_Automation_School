"""
Create a class called Utilities
Create a static method called print_name which accepts a parameter, and prints out the parameter.
Invoke the static method print_name()

You can use any of the two methods to create your static methods.
"""
#Create a class called Utilities
class Utilities:
    #Create a static method called print_name which accepts a parameter, and prints out the parameter.
    @staticmethod
    def print_name(name):
        print(name)

#Invoke the static method print_name()
Utilities.print_name("Name: " + "Ariel")