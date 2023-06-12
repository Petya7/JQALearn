package Homework5;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 20, true, 5 );
        student.showStudentInfo();


        Employee employee = new Employee("Petya", 30,false,1000.00, 8);
        employee.showEmployeeInfo();
        employee.overtime(2);

    }
}
