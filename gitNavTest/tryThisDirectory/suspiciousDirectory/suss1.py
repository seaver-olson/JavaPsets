def explodeBomb():
    print("KABOOM")

var = O

myList = []

myList.append(var)

for idx, elem in enumerate(myList):
    if idx == elem:
        explodeBomb()
    else:
        print("You're safe.")
