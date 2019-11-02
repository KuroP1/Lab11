public class TestEmployee {
    public static void main(String [] args) {
        Employee emp1 = new Employee();    // call object
        Employee emp2 = new Employee();
        int oldSalary;                     // before sal varible
        // Part 1-2 here 
        emp1.setName("Chan Tai Man");      //call setter
        emp1.setSalary(12000);             //call setter
        emp2.setName("Tam Ping Shing");    //call setter
        emp2.setSalary(13500);             //call setter
        // Part 3 below 
        System.out.println("Before-");     //print before
        System.out.println("Employee 1: name="+emp1.getName() +
            " salary=" + emp1.getSalary());
        System.out.println("Employee 2: name="+emp2.getName() +
            " salary=" + emp2.getSalary());
        //new salary calculation
        emp1.setSalary( (int)(emp1.getSalary()*1.1) );
        emp2.setSalary( (int)(emp2.getSalary()*1.05) );
        System.out.println("After-");      //print after
        System.out.println("Employee 1: name="+emp1.getName() +
            " salary=" + emp1.getSalary());
        System.out.println("Employee 2: name="+emp2.getName() +
            " salary=" + emp2.getSalary());
    }
} 
