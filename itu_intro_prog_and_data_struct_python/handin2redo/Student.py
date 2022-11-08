class Student:

    def __init__(self, name, age):
        self.name = name
        self.age = age
        

def getName(self):
    return self.name

def getAge(self):
    return self.age

# def toString(self):
#     self.name = name
#     self.age = age
#     print("The name of the student is " + name + ". The student is " + age + " years old.")
    
def setName(self.,x):
    self.name = x
    
def setAge(self, x):
    if( x <=15 or x > 98):
        self.age = x
        if (x <= 15):
            print("The University does not accept students below 16")
        elif(x > 98):
            print("The university does not accept students that are older than 99")  
        
        
def main():
    stud1 = Student("Alex", 32)
    
    print(getAge(stud1))
    print(getName(stud1))
    
    # toString(stud1)
    
   setName(stud1,"Filip")

    print(stud1.getName)

    stud1.setAge(35)
    
    print(stud1.getAge)
   
    stud1.setAge(11)
   
    print(stud1.getAge)
   
    stud1.setAge(125)
   
    print(stud1.getAge)
    

if __name__ == '__main__':
    main()