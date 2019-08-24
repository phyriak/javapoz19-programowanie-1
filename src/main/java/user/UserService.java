package user;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static user.Gender.female;

public class UserService {


    private List<User> users;



    public UserService() {
        init();

    }

    private void init() {
        this.users = Arrays.asList(
                new User("Lillian Burgess", 31, Gender.female, "$2,499.49"),
                new User("Bird Ramsey", 23, Gender.male, "$3,946.45"),
                new User("Kristie Cole", 34, Gender.female, "$2,820.18"),
                new User("Leonor Cross", 30, Gender.female, "$3,277.32"),
                new User("Marsh Mccall", 28, Gender.male, "$1,972.47")


        );
        //List<User> byGender = findByGender(Gender female);

    }

    public List<User> findByGender(Gender gender) {

        return users.stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());

    }


    public List<String> mapToNames() {
        return users.stream()
                .map(user -> user.getName())
                .collect(Collectors.toList());


    }

    public List<User> sortByAge() {

        return users.stream()
                //.sorted(Comparator.comparing(user -> user.getAge()))
                .sorted((a, b) -> {
                    int aAge = a.getAge();
                    int bAge = b.getAge();

                    if (aAge > bAge) {
                        return 1;
                    } else if (aAge < bAge) {
                        return -1;
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<User> sortByBalance() {

        return users.stream()
                .sorted(Comparator.comparingLong(User::getBalance).reversed())
                /*sorted((a, b) -> {
                    Long aBalance = a.getBalance();
                    Long bBalance = b.getBalance();

                    if ((aBalance > bBalance)) {
                        return 1;
                    } else if (aBalance < bBalance) {
                        return -1;
                    } else {
                        return 0;
                    }
                })

                */
                .collect(Collectors.toList());


    }


    public double avgBallance() {

        return users.stream()
                .mapToLong(user -> user.getBalance())
                .average()
                .orElse(0.0);

    }


    public User findWithHihestBalance(){


        return sortByBalance().stream()
                .findFirst()
                .orElse(null);


    }
}
