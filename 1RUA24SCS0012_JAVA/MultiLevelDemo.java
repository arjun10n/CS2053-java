class Person {
void showPerson() {
System.out.println("I am a Person.");
}
}
class Employee extends Person {
void showEmployee() {
System.out.println("I am an Employee.");
}
}
class Manager extends Employee {
void showManager() {
System.out.println("I am a Manager.");
}
}
public class MultiLevelDemo {
public static void main(String[] args) {
Manager m = new Manager();
m.showPerson(); // From Person
m.showEmployee(); // From Employee
m.showManager(); // From Manager
}
}