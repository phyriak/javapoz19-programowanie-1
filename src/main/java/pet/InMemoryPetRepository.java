package pet;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryPetRepository implements PetRepository {


    private List<Pet> pets;

    InMemoryPetRepository(List<Pet> pets) {
        this.pets = pets;
    }

    public InMemoryPetRepository() {
        this.pets = new ArrayList<>();
        init();
    }


    @Override
    public List<Pet> findAll() {

        return new ArrayList<>(pets);
    }

    @Override
    public List<Pet> findByBreed(String breed) {

        return pets.stream()
                .filter(pet -> pet.getBreed().equals(breed))
                .collect(Collectors.toList());
    }

    @Override
    public List<Pet> findbyLocaction(String location) {
        return pets.stream()
                .filter(pet -> pet.getLocation().equals(location))
                .collect(Collectors.toList());

    }

    @Override
    public Map<String, List<Pet>> groupByBreed() {
        return pets.stream()
                .collect(Collectors.groupingBy(pet -> pet.getBreed()));
    }

    @Override
    public List<Pet> sortByAge () {
        return pets.stream()

                .sorted((a, b) -> {
                    int aAge = a.getAge();
                    int bAge = b.getAge();

                    if ((aAge > bAge)) {
                        return 1;
                    } else if (aAge < bAge) {
                        return -1;
                    } else {
                        return 0;
                    }
                })


                .collect(Collectors.toList());

    }






    private void init() {
        pets.add(new Pet("Frieda",3,"Scottish Terrier","Lisco, Alabama"));
        pets.add(new Pet("Gina",3,"Scottish Terrier","Camas, Pennsylvania"));
        pets.add(new Pet("Collins",4,"French Bulldog","Lisco, Alabama"));
        pets.add(new Pet("Melissa",2, "Boxer","Camas, Pennsylvania"));
        pets.add(new Pet("Jeanine",5,"French Bulldog","Lisco, Alabama"));
        pets.add(new Pet("Elvia",3,"French Bulldog","Innsbrook, Illinois"));
    }
}

