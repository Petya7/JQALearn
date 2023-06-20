package Homework5;

public class Arr {
    public static void main(String[] args) {
        Person[] humans = new Person[10];
        humans[0] = new Person("Georgi", 31, true);
        humans[1] = new Person("Daniel", 32, true);
        humans[2] = new Student("Petar", 29, true, 5);
        humans[3] = new Student("Maria", 28, false, 6);
        humans[4] = new Employee("Lili", 25, false, 1000.00,8);
        humans[5] = new Employee("Natalia", 26, false, 2000.00,8);



        for (Person human : humans) {
            if (human instanceof Student) {
                Student s = (Student)human;
                s.showStudentInfo();
            } else if (human instanceof Employee) {
                Employee e = (Employee)human;
                e.showEmployeeInfo();
                e.overtime(2);
            } else {
                human.showPersonInfo();
            }
        }

    }
}






