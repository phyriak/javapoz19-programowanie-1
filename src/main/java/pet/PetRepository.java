package pet;


import java.util.List;
import java.util.Map;

public interface PetRepository {

    List<Pet> findAll();

    List<Pet> findByBreed(String breed);

    List<Pet> findbyLocaction(String location);

    List<Pet> sortByAge();

    Map<String, List<Pet>> groupByBreed();
}
