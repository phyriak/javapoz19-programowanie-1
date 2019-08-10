package pl.sdaacademy.javapoz19programowanie1.user;

import org.junit.Assert;
import org.junit.Test;
import user.Gender;
import user.User;
import user.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceTest {

    @Test
    public void findByGenderShouldReturnFilteredList(){
        UserService userService = new UserService();

        List<User> list = userService.findByGender(Gender.female);

        Assert.assertEquals("Lista powinna zawierac 3 elementy",3,list.size());

        Assert.assertTrue("Wszystkie elementy powinny miec wartosc female",list.stream()
                .map(user -> user.getGender())
                .allMatch(gender->gender.equals(Gender.female)));


    }

    @Test
    public void mapToNamesShouldReturnListWithNames(){
        UserService userService = new UserService();

        List<String> names = userService.mapToNames();
        Assert.assertEquals(Arrays.asList("Bird Ramsey"
                ,"Lillian Burgess"
                ,"Kristie Cole"
                ,"Leonor Cross"
                ,"Marsh Mccall"),names);
    }

    @Test
    public void sortByAgeShouldReturnSortByAgeListOfUsers(){

        UserService userService = new UserService();

        List<User> users = userService.sortByAge();

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void sortByBalanceShouldReturnSortByBalanceOfUsers(){
        UserService userService = new UserService();
        List<User> users = userService.sortByBalance();
        users.forEach(user -> System.out.println(user));


    }

    @Test
    public void avgBallanceShouldReturnAvgValue() {

        UserService userService=new UserService();
        double avgBallance = userService.avgBallance();


        Assert.assertEquals(290318.2,avgBallance, 0.1);
        //System.out.println(avgBallance);


    }

    @Test
    public void findWithHihestBalanceShouldReturnUserWithHihestBalance () {

        UserService userService=new UserService();
        User withHihestBalance = userService.findWithHihestBalance();
        Assert.assertEquals(Long.valueOf(394645), withHihestBalance.getBalance());

    }
}
