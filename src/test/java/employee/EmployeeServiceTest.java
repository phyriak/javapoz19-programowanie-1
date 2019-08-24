package employee;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class EmployeeServiceTest {

    @Test

    public void findAllShouldReturnGivenEmplyees() {
        //given
        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 23, 5000),
                new Employee("name-2", 63, 1000),
                new Employee("name-3", 34, 2000)


        );
        EmployeeService employeeService = new EmployeeService(new InMemoryEmplyeeRepository(employees));


        //when wywołujemy akcje

        List<Employee> result = employeeService.findAll();


        //then asercje sprawdzają
        Assert.assertEquals(employees, result);


    }

    @Test

    public void sortByAgeShouldReturnSortedList() {
        //given

        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 23, 5000),
                new Employee("name-2", 63, 1000),
                new Employee("name-3", 34, 2000)


        );
//then

        EmployeeService employeeService = new EmployeeService(new InMemoryEmplyeeRepository(employees));
        List<Employee> result = employeeService.sortByAge();

        Assert.assertEquals(employees.get(1),result.get(2));
        Assert.assertEquals(employees.get(0),result.get(0));
        Assert.assertEquals(employees.get(2),result.get(1));






    }

    @Test

    public void sortBySalaryShouldReturnSortedList() {
        //given

        List<Employee> employees = Arrays.asList(
                new Employee("name-1", 23, 5000),
                new Employee("name-2", 63, 1000),
                new Employee("name-3", 34, 2000)


        );
//then

        EmployeeService employeeService = new EmployeeService(new InMemoryEmplyeeRepository(employees));
        List<Employee> result = employeeService.sortBySalary();

        Assert.assertEquals(employees.get(0),result.get(0));
        Assert.assertEquals(employees.get(2),result.get(1));
        Assert.assertEquals(employees.get(1),result.get(2));






    }


    @Test
    public void groupByAgeSegmentShouldReturnMapWithAgeSegmentAsKeyAndListOfEmplyeesAsValue(){
        //given

        EmployeeService employeeService=new EmployeeService(new InMemoryEmplyeeRepository());

        //when
        Map<String, List<Employee>> result = employeeService.groupByAgeSegment();

        //then
        System.out.println();



    }


    @Test
    public void getAvgSalaryOfAgeSegmentShouldReturnAverageOfSalaryForEmployeesInAgeSegment() {
    //given


    List <Employee> employees=Arrays.asList(


            new Employee("name-1",31,2500),
            new Employee("name-2",33,5000),
            new Employee("name-3",36,2500)
    );

     EmployeeService employeeService=new EmployeeService((new InMemoryEmplyeeRepository(employees)));
    //when

    Double result =employeeService.getAvgSalaryOfAgeSegment(32);



    //then
    Assert.assertEquals(3750.0,result,0.1);

}


@Test
public void getAvgSalaryOfAgeSegment_ShouldReturnZeroWhenEmployeesForGivenAgeSegmentAreNotExist(){
        List <Employee> employees=Arrays.asList(


        new Employee("name-1",31,2500),
        new Employee("name-2",33,5000),
        new Employee("name-3",36,2500)
);

    EmployeeService employeeService=new EmployeeService((new InMemoryEmplyeeRepository(employees)));
    //when

    Double result =employeeService.getAvgSalaryOfAgeSegment(50);



    //then
    Assert.assertEquals(0.0,result,0.1);

}



}