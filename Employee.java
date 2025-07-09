public class Employee{
//instance variables 
    private String name;
    private float salary;

//constructor
    public Employee(String name,float salary){
        this.name= name;
        this.salary=salary;
    }

//getters method 

public String getName(){
    return name;
}

public float getSalary(){
    return salary;
}

//setters method 

public void setName(String name){
    this.name=name;

}
public void setSalary(float salary){
    this.salary = salary;

}

public void display(){
    System.err.println("name is: "+name);
    System.err.println("name is: "+salary);
}


public static void main(String [] args){
    Employee obj = new Employee("ram",5000.0f);

    obj.display();

}


}