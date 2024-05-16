"""
Create a class called Human
Add an attribute leg_count with the value of 4
Add another attribute can_walk with value of True

Optionally you can instantiate the class and prints out the leg_count and can_walk attributes
"""

#Create a class called Human
class Human:

    def __init__(self):
        # Add an attribute leg_count with the value of 4
        self.leg_count = 4
        # Add another attribute can_walk with value of True
        self.can_walk = True

#Optionally you can instantiate the class and prints out the leg_count and can_walk attributes
human = Human()
print("Leg count: ", human.leg_count)
print("Can walk: ", human.can_walk)
