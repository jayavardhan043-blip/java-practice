class Employee {
    private String name;
    private int salary;

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public int getSalary () {
        return salary;
    }
}

 class Main {
    public static void main (String[] args) {
        Employee emp1 = new Employee ();
        emp1.setName ("Jaya vardhan");
        emp1.setSalary (30000);
        System.out.println ("Employee name: " + emp1.getName());
        System.out.println ("Employee salary:" + emp1.getSalary());
    }
}