import com.example.domain.Employee;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(120_345.27);
        System.out.println( emp.getEmpId());
        System.out.println(  emp.getName());
        System.out.println( emp.getSsn());
        System.out.println( emp.getSalary());

    }
}
