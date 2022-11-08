public class Student 
{

//Fields//

private String name;
private int age;

//Constructors//

public Student(String studName, int studAge)
{
  name = studName;
  age = studAge;
}


//Methods//
public String getName()
{
return name;
}

public int getAge()
{
return age;
}

public String toString()
{
return("The name of the student is " + name +". The student is " + age + " years old.");
}

public void setName(String name2)
{
name = name2;
}

public void setAge(int age2)
 {
 if (age2 < 16) {
  System.out.println("The university does not accept students below 16");
  }
else if (99 < age2) {
    System.out.println("The university does not accept students that are older than 99");
}
    else {
     age = age2;
      }
  }

}



