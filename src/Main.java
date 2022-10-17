public class Main {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ahmet Çakar",2000,45,1985);
        Employee e2 = new Employee("Efşan Albayrak",900,30,2015);

        //Sample employee e1
        System.out.println(e1.toString());
        System.out.println("Bonus: " + e1.bonus(e1.workHours));
        System.out.println("Tax: " + e1.tax(e1.salary));
        System.out.println("Raise Salary: " + e1.raiseSalary(e1.salary,e1.hireYear));

        System.out.println();

        //Sample employee e2
        System.out.println(e2.toString());
        System.out.println("Bonus: " + e2.bonus(e2.workHours));
        System.out.println("Tax: " + e2.tax(e2.salary));
        System.out.println("Raise Salary: " + e2.raiseSalary(e2.salary,e2.hireYear));

    }
}