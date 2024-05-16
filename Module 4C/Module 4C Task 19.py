"""
Create a class called Human
Add an attribute leg_count with the value of 4
Add another attribute can_walk with the value of True
Create a method called get_description, the method should print "This is human"
Create another method that return the leg count, the name of the method is your choice

Optionally you can instantiate the class and invoke the method get_description() and invoke your method that returns leg count.
"""


#Create a class called Human
class Human:
    def __init__(self):
        # Add an attribute leg_count with the value of 4
        self.leg_count = 4
        # Add another attribute can_walk with value of True
        self.can_walk = True

    def get_description(self):
        print("This is human")

    def get_leg_count(self):
        return self.leg_count

#intantiate the class
human = Human()

#invoke the method get_description()
human.get_description()

#invoke your method that returns leg count
print("Leg count:", human.get_leg_count())