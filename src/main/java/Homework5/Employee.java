package Homework5;

public class Employee extends Person {
    double daySalary;
    int workingHoursPerDay;

    public Employee(String name, int age, boolean isMan, double newDaySalary, int newWorkingHoursPerDay) {
        super(name,age,isMan);
        this.daySalary = newDaySalary;
        this.workingHoursPerDay = newWorkingHoursPerDay;
    }

    public void overtime(int overWorkingHours) {
        double overtimePay = 1.5;
        double payPerHour = (daySalary / workingHoursPerDay);
        double overtimeCalc = (payPerHour * overWorkingHours) * overtimePay;
        if(super.age < 18) {
            System.out.println("Overtime payment is 0!");
        } else{
            System.out.println("Overtime payment is:" + overtimeCalc);
        }
    }

    public void showEmployeeInfo() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("isMan:" + isMan);
        System.out.println(daySalary);
    }
}
