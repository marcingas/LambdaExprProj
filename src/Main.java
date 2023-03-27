import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John Nic", 30);
        Employee nick = new Employee("Nick Dalton", 20);
        Employee jo = new Employee("Jo Hoffer", 22);
        Employee snow = new Employee("Snow Dean", 27);
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jo);
        employees.add(nick);
        employees.add(snow);

        employees.forEach(employee -> {
            System.out.println(employee.getAge());
            System.out.println(employee.getName());
        });

//        for(Employee employee : employees){
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//
//        }
//        System.out.println("Normal loop-----");
//        for(int i = 0; i<employees.size();i++){
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(()-> System.out.println(employee.getAge())).start();
//        }
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
            System.out.println("i in the lambda expr = " + i);
            String result = s1.toUpperCase()+ s2.toUpperCase();
            return result;
        };
        System.out.println("The Another class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }
    public void printValue(){
        int number = 25;
        Runnable runnable = ()->{
            try{
                Thread.sleep(5000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("The value is " + number);
        };
        new Thread(runnable).start();
    }
}
