# Python Object Oriented Programming by Joe Marini course example
# Basic class definitions


# TODO: create a basic class
# class Book():
#     pass

class Book:
    def __init__(self, title):
        self.title = title
        

# TODO: create instances of the class
b1 = Book("Harry Potter")
b2 = Book("Mamamia")

# TODO: print the class and property
print(b1)
print(b1.title)