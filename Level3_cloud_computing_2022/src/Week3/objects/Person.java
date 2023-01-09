
 package week3_objects;



public class Person
{
  //attributes
  String name;
  int age;
  char gender;
  static int counter=0;
  // constructor
  public Person()
  {
      System.out.println("New object person");
      counter++;
      System.out.println("counter"+counter);
  }
  public void setName(String n)
  {
  this.name=n;
  }
  public void setAge(int A)
  {
      this.age=A;
  }
  public void setGender(char G)
  {
      this.gender=G;
  }
  public String getName()
  {
  return this.name;
  }
  public void showInf()
  {
  System.out.println("Name:"+this.name+
          "age:"+ this.age+
          "gender:"+ this.gender);
  }
}

