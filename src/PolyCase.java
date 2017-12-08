
import java.util.ArrayList;

public class PolyCase {

    public static void main(String[] args) {

        Employee jack = new Employee("jack");
        Employee doel = new Programmer();
        doel.setNama("Doel");
        Employee udin = new Developer();
        udin.setNama("Udin");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(doel);
        employees.add(udin);

        for (Employee employee : employees) {
            if (employee instanceof Developer) { // apakah ada employee yg berprofesi sbg defeloper. kalo ada

                Programmer p = (Programmer) employee;
                System.out.println("Programmer : " + p.getNama());

            } else { // kalo gak 
                System.out.println("Employee : " + employee.getNama());
            }
        }

        // TODO code application logic here
    }

}
