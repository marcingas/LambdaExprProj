package functionalInterfaceLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Runner2 {
    public static void main(String[] args) {

        Employee2 john = new Employee2("John Nic", 31);
        Employee2 nick = new Employee2("Nick Dalton", 20);
        Employee2 jo = new Employee2("Jo Hoffer", 22);
        Employee2 snow = new Employee2("Snow Dean", 27);
        Employee2 jol = new Employee2("Jol Nic", 31);
        Employee2 nickole = new Employee2("Nickole Dalton", 20);
        Employee2 jonaat = new Employee2("Jonaat Hoffer", 32);
        Employee2 snowmen = new Employee2("Snowmen Dean", 37);
        List<Employee2> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jo);
        employees.add(nick);
        employees.add(jol);
        employees.add(nickole);
        employees.add(jonaat);
        employees.add(snowmen);

        System.out.println("Employees over 30: ");
        System.out.println("normal loop version_____________");
        for (Employee2 employee2 : employees) {
            if (employee2.getAge() > 30) {
                System.out.println(employee2.getName());
            }
        }
        System.out.println("lambda version: ------------");
        employees.forEach(employee2 -> {
            if(employee2.getAge()>30){
                System.out.println(employee2.getName());
            }
        });
        System.out.println("Employees<=30----------------");
        employees.forEach(employee2 -> {
            if(employee2.getAge()<=30){
                System.out.println(employee2.getName() + ":" + employee2.getAge());
            }
        });

        printEmployeesByAge(employees,"Employee over 30", employee2 -> employee2.getAge() > 30);
        printEmployeesByAge(employees,"Employee less or equal then 30", employee2 -> employee2.getAge() <= 30);


    }
    private static void printEmployeesByAge(List<Employee2>employees, String ageText, Predicate<Employee2>ageCondition){
        System.out.println(ageText);
        System.out.println("========================");
       for (Employee2 employee2 : employees){
           if(ageCondition.test(employee2)){
               System.out.println(employee2.getName() + " : " + employee2.getAge());
           }
       }
    }
}
