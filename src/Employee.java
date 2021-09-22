class employ{
    String name;
    int year;
    int salary;
    String address;
}
public class Employee {
    public static void main(String[] args) {
        employ one = new employ();
        employ two = new employ();

        one.name ="Robert";
        one.year = 2001;
        one.salary = 100000;
        one.address = "Kurla";

        two.name ="mahesh";
        two.year = 2002;
        two.salary = 100000;
        two.address = "Bandra";

        System.out.println("Name\t Year of joining \t Salary \t Address");
        System.out.println("-------------------------------------------------");
        System.out.println(one.name+"\t\t"+one.year+"\t\t\t"+one.salary+"\t\t"+one.address);
        System.out.println(two.name+"\t\t"+two.year+"\t\t\t"+two.salary+"\t\t"+two.address);

    }
}

