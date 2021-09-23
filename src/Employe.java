class employ{
    String name;
    int year;
    int salary;
    String address;
}
public class Employe {
    public static void main(String[] args) {
        employ E1 = new employ();
        employ E2 = new employ();

        E1.name ="Robert";
        E1.year = 2001;
        E1.salary = 100000;
        E1.address = "Kurla";

        E2.name ="Mahesh";
        E2.year = 2002;
        E2.salary = 100000;
        E2.address = "Bandra";

        System.out.println("Name\t Year of joining \t Salary \t Address");
        System.out.println("-------------------------------------------------");
        System.out.println(E1.name+"\t\t"+E1.year+"\t\t\t"+E1.salary+"\t\t"+E1.address);
        System.out.println(E2.name+"\t\t"+E2.year+"\t\t\t"+E2.salary+"\t\t"+E2.address);

    }
}