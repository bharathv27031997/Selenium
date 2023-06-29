package _Session.Emply;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Employee implements Comparable<Employee> {

    String  name;
    int salary;


    public Employee(String name, int salary) {

        super();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary>=o.salary)
            return 1;
        else
            return -1;
    }
    public void showData()
    {
        System.out.println("Name="+name+" and Salary="+salary);
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


 }
