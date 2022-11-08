# Python Object Oriented Programming by Joe Marini course example
# Using instance methods and attributes


class Book:
    # the "init" function is called when the instance is
    # created and ready to be initialized
    def __init__(self, title, author, pages, price):
        self.title = title
        # TODO: add properties
        self.autor = author
        self.pages = pages
        self.price = price
        
    # TODO: create instance methods
    def setdiscount(self, amount):
        self._discount = amount     
    
    def getprice(self):
        if hasattr(self, "_discount"):
            return self.price - (self.price * self._discount)
        else:
            return self.price
         
# TODO: create some book instances
b1 = Book("War and Peace", "Tolsty", 1225, 39.95)
b2 = Book("The Catcher in the Rye", "Django", 234, 29.95)

# TODO: print the price of book1    
print(b1.getprice())
    
# TODO: try setting the discount
print(b2.getprice())
b2.setdiscount(0.25)
print(b2.getprice())

# TODO: properties with double underscores are hidden by the interpreter
