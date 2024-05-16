"""
Create a test case that compares two strings
Create another test case that compares different numbers

Use any unit testing framework from this week's lessons.
"""


#Create a test case that compares two strings
def test_compare_strings():
    string1 = "Testify"
    string2 = "Testify"

    assert string1 == string2


#Create another test case that compares different numbers
def test_compare_numbers():
    number1 = 42
    number2 = 3

    assert number1 != number2

