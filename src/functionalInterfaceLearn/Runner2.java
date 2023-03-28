package functionalInterfaceLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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


//        System.out.println("Employees over 30: ");
//        System.out.println("normal loop version_____________");
//        for (Employee2 employee2 : employees) {
//            if (employee2.getAge() > 30) {
//                System.out.println(employee2.getName());
//            }
//        }
//        System.out.println("lambda version: ------------");
//        employees.forEach(employee2 -> {
//            if(employee2.getAge()>30){
//                System.out.println(employee2.getName());
//            }
//        });
//        System.out.println("Employees<=30----------------");
//        employees.forEach(employee2 -> {
//            if(employee2.getAge()<=30){
//                System.out.println(employee2.getName() + ":" + employee2.getAge());
//            }
//        });
//
//        printEmployeesByAge(employees,"Employee over 30", employee2 -> employee2.getAge() > 30);
//        printEmployeesByAge(employees,"\n Employee less or equal then 30", employee2 -> employee2.getAge() <= 30);
//        printEmployeesByAge(employees, "\n employees younger then 25 ", new Predicate<Employee2>() {
//            @Override
//            public boolean test(Employee2 employee2) {
//                return employee2.getAge()<25;
//            }
//        });
//
//        IntPredicate greaterThen15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//        System.out.println("chaining IntPredicates " + greaterThen15.and(lessThan100).test(12));
//        System.out.println(greaterThen15.test(10));
//        int a = 20;
//        System.out.println(greaterThen15.test(a + 5));
//
//        //supplier interface:
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = ()-> random.nextInt(2000) - 1000;
//        for(int i = 0;i < 10; i++){
//            System.out.println(randomSupplier.get());
//        }
//
//        employees.forEach(employee2 -> {
//            String lastName = employee2.getName().substring(employee2.getName().indexOf(' ') + 1);
//            System.out.println("Last name is: " + lastName);
//        });
//    }
        Function<Employee2, String> getLastName = (Employee2 employee2) -> {
            return employee2.getName().substring(employee2.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(2));
//        System.out.println(lastName);

        Function<Employee2, String> getFirstName = (Employee2 employee2) -> {
            return employee2.getName().substring(0, employee2.getName().indexOf(' '));
        };
        String firstName = getFirstName.apply(employees.get(2));
//        System.out.println(firstName);
//        use getName method:
        Random random1 = new Random();
        for(Employee2 employee2: employees){
            if(random1.nextBoolean()){
                System.out.println("first Name: " + getName(getFirstName,employee2));
            }else{
                System.out.println("last name: " + getName(getLastName,employee2));
            }
        }


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
    private static String getName(Function<Employee2,String> getName, Employee2 employee2){
        return getName.apply(employee2);
    }
}




