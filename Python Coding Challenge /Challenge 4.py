#Print a table containing multiplication tables.

def multiplication_table():
    number = 7
    for i in range(1, 15):
        print(f"{number} x {i} = {number * i}")

# Call the function to print the table
multiplication_table()