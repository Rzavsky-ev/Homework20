public class Main {
    public static void main(String[] args) {
        EmployeeBookMap map = new EmployeeBookMap();

        map.addEmployee("Иванов Иван");
        map.addEmployee("Петров Петр");
        map.addEmployee("Васильев Василий");
        System.out.println(map.toString());

        map.removeEmployee("Петров Петр");
        System.out.println(map.toString());
    }
}