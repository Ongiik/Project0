//Benen Kim
//CS1400
//Assignment 5
//11/17/2021
public class Person {
    //Instance variables
    String name;
    String favoriteFood;
    int age;
    //Constructor
    public Person(String n, String food, int a)
    {
       this.name = n;
       this.favoriteFood = food;
       this.age = a;    
    }
    //Copy Constructor
    public Person(Person obj)
    {
        this.name = obj.name;
        this.favoriteFood = obj.favoriteFood;
        this.age = obj.age;
    }
    //Setters
    public void setName(String n)
    {
        this.name = n;
    }
    public void setFavoriteFood(String food)
    {
        this.name = food;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    //Getters
    public String getName()
    {
        return name;
    }
    public String getFavoriteFood()
    {
        return favoriteFood;
    }
    public int getAge()
    {
        return age;
    }
    //equals method
    public boolean equals(Person per)
    {
        if(!name.equals(per.name))
            return false;
        if(!favoriteFood.equals(per.favoriteFood))
            return false;
        if(age != per.age)
            return false;
        return true;
    }
    //toString method
    public String toString()
    {
        String sentence = "Name: " + name + ", Favorite Food: " 
                        + favoriteFood + ", Age: " + age;
        return sentence;
    }
}
