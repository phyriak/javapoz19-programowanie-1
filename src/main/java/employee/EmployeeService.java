package employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    private  EmplyeeRepository employeeInterface;

    public EmployeeService(EmplyeeRepository emplyeeInterface) {
        this.employeeInterface = emplyeeInterface;
    }



    public List<Employee> findAll() {


        return employeeInterface.findAll();
    }

    public List<Employee> sortByAge() {


        return employeeInterface.sortByAge();
    }

    public List<Employee> sortBySalary() {


        return employeeInterface.sortByAge();
    }

    public Map<String, List <Employee>> groupByAgeSegment(){

        List<Employee> employees = findAll();

        return  employees.stream()
                .collect(Collectors.groupingBy(employee -> calculateAgeSegment(employee.getAge())));




    }

    public Double getAvgSalaryOfAgeSegment (Integer age){
        Map<String,List<Employee>>groups=groupByAgeSegment();
        String ageSegment=calculateAgeSegment(age);

        List<Employee> employees = groups.get(ageSegment);


        return (employees !=null ? employees:new ArrayList<Employee>())
                .stream()
                .mapToInt(employee -> employee.getSalary())
                .average()
                .orElse(0.0);

    }


   private String calculateAgeSegment(Integer value){

        Integer left=value-value %5;
        Integer right=left+5;
        return left+"-"+right;

   }
    }

