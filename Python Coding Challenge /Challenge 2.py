#Create a length converter function.

centimeter = 1580

#Convert centimeter to meter
def converter(centimeters):
    meters = centimeters / 100
    return meters

#invoke the function
meter = converter(centimeter)

#Print result
print(f"{centimeter}cm = {meter}m")
