package employee;

import java.util.List;

public interface EmplyeeRepository {


   List<Employee> findAll ();
   List<Employee> sortByAge ();
   List<Employee> sortBySalary ();


}
