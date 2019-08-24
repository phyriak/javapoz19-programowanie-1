package pet;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PetServiceTest {


    @Test
    public void findAllShouldReturnListOfPets() {

        List<Pet> testPets = new ArrayList<>();

        testPets.add(new Pet("pet-1", 2, "a", "xyz"));
        testPets.add(new Pet("pet-2", 5, "b", "xyz"));


        PetService petService = new PetService(new InMemoryPetRepository(testPets));

        List<Pet> actualList = petService.findAll();
        Assert.assertEquals(
                testPets,
                actualList
        );

    }


    @Test
    public void findByBreedShouldReturnListOfPetsOfBreed(){



        List<Pet>testPets=Arrays.asList(
          new Pet("pet-1",2,"a","xyz"),
          new Pet("pet-1",2,"a","xyz")
        );

        PetService petService = new PetService(new InMemoryPetRepository(testPets));


        List<Pet> result =petService.findByBreed("a");

        Assert.assertEquals(1,result.size());
        Assert.assertEquals(new Pet("pet-1",2,"a","xyz"),result.get(0));
    }


    @Test
    public void findByLocationShouldReturnListOfPetsOfLocation(){



        List<Pet>testPets=Arrays.asList(
                new Pet("pet-1",2,"a","xyz"),
                new Pet("pet-1",2,"a","xyz")
        );

        PetService petService = new PetService(new InMemoryPetRepository(testPets));


        List<Pet> result =petService.findByLocation("xyz");

        Assert.assertEquals(1,result.size());
        Assert.assertEquals(new Pet("pet-1",2,"a","xyz"),result.get(0));
    }



    @Test
    public void sortByAgeShouldsortByAge () {


        List<Pet>testPets=Arrays.asList(
                new Pet("pet-1",7,"a","xyz"),
                new Pet("pet-2",2,"b","xyz"),
                new Pet("pet-3",5,"c","xyz")
        );

        PetService petService = new PetService(new InMemoryPetRepository(testPets));


        List<Pet> pets  = petService.sortByAge();

        Assert.assertEquals(testPets.get(1),pets.get(0));
        Assert.assertEquals(testPets.get(2),pets.get(1));
        Assert.assertEquals(testPets.get(0),pets.get(2));

    }

    @Test
    public void groupByBreedShouldReturnMapWithGroupPets() {

        PetService petService = new PetService(new InMemoryPetRepository());


        Map<String, List<Pet>> map = petService.groupByBread();

        Assert.assertEquals(map.get("Scottish Terrier").size(),3);
        Assert.assertEquals(map.get("French Bulldog").size(),5);
        Assert.assertEquals(map.get("Boxer").size(),3);
        Assert.assertEquals(map.get("Golden Retriver").size(),5);

    }


}
