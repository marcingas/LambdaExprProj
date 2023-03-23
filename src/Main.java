import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        new Thread(() -> {
//            System.out.println("Printing from runnable");
//            System.out.println("Line 2");
//            System.out.println("Line3");
//        }).start();

//        Employee john = new Employee("John Nic", 30);
//        Employee nick = new Employee("Nick Dalton", 20);
//        Employee jo = new Employee("Jo Hoffer", 22);
//        Employee snow = new Employee("Snow Dean", 27);
//        List<Employee> employees = new ArrayList<>();
//        employees.add(john);
//        employees.add(jo);
//        employees.add(nick);
//        employees.add(snow);
//
//        Collections.sort(employees, (o1,o2) -> o1.getName().compareTo(o2.getName()));
//
//        for(Employee employee: employees){
//            System.out.println(employee.getName());
//        }
//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String uppperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
//        UpperConcat uc = (s1,s2)-> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//        return result;
//        };
//        String sillyString = doStringStuff(uc,employees.get(0).getName(),employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.uppperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface UpperConcat {
    public String uppperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {

        int i = 0;
        UpperConcat uc = (s1,s2)-> {
            System.out.println("The lambda expression class is " + getClass().getSimpleName());
            String result = s1.toUpperCase()+ s2.toUpperCase();
            return result;
        };


        System.out.println("The Another class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
//        System.out.println("The Another class's name is " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String uppperAndConcat(String s1, String s2) {
//                System.out.println("The annanymous class's name is " + getClass().getSimpleName());
//                return s1.toUpperCase()+ s2.toUpperCase();
//            }
//        },"String1","String2");
    }
}
