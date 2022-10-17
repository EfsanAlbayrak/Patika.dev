public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;


    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){
        double tax=0;
        if (salary<=1000){
            return tax;
        }
        else{
            tax= (salary*3)/100;
            return tax;
        }
    }

    double bonus(double workHours){
        double bonus=0;
        if(workHours>40){
           bonus = (workHours-40)*30;
           return bonus;
        }else{
            return bonus;
        }
    }

    double raiseSalary(double salary, int hireYear){
        int currentYear =2021;
        double raiseSalary;
        if(currentYear-hireYear<10){
            raiseSalary=(salary*5)/100;
            return raiseSalary;
        }
        else if(9<currentYear-hireYear && currentYear-hireYear<20){
            raiseSalary=(salary*10)/100;
            return raiseSalary;
        }
        else{
            raiseSalary=(salary*15)/100;
            return raiseSalary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", salary=" + this.salary +
                ", workHours=" + this.workHours +
                ", hireYear=" + this.hireYear +
                ", totalSalary=" + (this.salary+bonus(this.workHours)) +
                ", withTaxAndBonusSalary=" + (salary+bonus(this.workHours)+raiseSalary(this.salary,this.hireYear)-tax(this.salary)) +
                '}';
    }
}
