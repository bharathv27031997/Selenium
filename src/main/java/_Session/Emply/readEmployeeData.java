package _Session.Emply;

import io.cucumber.java.an.E;
import org.junit.Test;

import java.util.*;

public class readEmployeeData {


    @Test
    public   void employeeHashSet() {

        Set<Employee> emp=new HashSet<>();
        emp.add(new Employee("bharath", 100));
        emp.add(new Employee("Venatesh", 200));
        emp.add(new Employee("Bhagyamma", 300));
        emp.add(new Employee("Pavitha", 400));
        emp.add(new Employee("Yashwanth", 500));

        System.out.println("Employee Data using HashSet");

        Iterator<Employee> itr=emp.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.println();
        }
    }

    @Test
    public void employeeYTreeSetInAscedingOrder() {

        Set<Employee> emp = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.compareTo(o1);
            }
        });
        emp.add(new Employee("bharath", 100));
        emp.add(new Employee("Venatesh", 200));
        emp.add(new Employee("Bhagyamma", 300));
        emp.add(new Employee("Pavitha", 400));
        emp.add(new Employee("Yashwanth", 500));

        System.out.println("Employee Data using HashSet");
             System.out.print(emp);
     }

     @Test
    public void treeSetDescedingOrder(){

        Set<Employee> emp=new TreeSet<>();


         emp.add(new Employee("bharath", 100));
         emp.add(new Employee("Venatesh", 200));
         emp.add(new Employee("Bhagyamma", 300));
         emp.add(new Employee("Pavitha", 400));
         emp.add(new Employee("Yashwanth", 500));

         System.out.println("Employee Data using HashSet");
         System.out.print(emp);
          System.out.print(emp.stream().sorted());
     }
 }


