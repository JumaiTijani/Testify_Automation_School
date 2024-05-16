"""
Create a class called Human
Initialize the class
"""

#Create a class called Human
class Human:
    gender = "Female"
    nationality = "Nigerian"

    def get_gender(self):
        return self.gender


female = Human()
print(female.get_gender())