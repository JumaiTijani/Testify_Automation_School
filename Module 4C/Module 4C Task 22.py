"""
Create a class called Hunt
Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
Create a method get_weapon() that returns "Not Available" in the Hunt class
Instantiate an object of the Hunt class
Print the value of get_weapon() from the object instance
"""

#Create a class called Hunt
class Hunt:
    # Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
    __weapon = "Assault Rifle"
    #Create a method get_weapon() that returns "Not Available" in the Hunt class
    def get_weapon(self):
        return "Not Available"

hunt = Hunt()
print("Assault Rifle:", hunt.get_weapon())

