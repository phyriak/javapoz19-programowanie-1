package pl.sdaacademy.javapoz19programowanie1;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, Nation.PL);
        Author author2 = new Author("Adam", "Mickiewicz", 1798, Nation.PL);


        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setBirthyear(1947);
        author.setNation(Nation.USA);


        List<Author> authors = Arrays.asList(author, author1, author2, new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));

        showByNation(authors, Nation.PL);
        showModernAuthors(authors, Nation.PL, 1900);
        showByNationAndBirthYear(authors, Nation.PL, 1900);
        System.out.println("");
        System.out.println(groupByNation(authors));
    }

    public static void showByNation(List<Author> authors, Nation nation) {
        for (Author author : authors) {
            if (author.getNation().equals(nation)) {
                System.out.println(author);
            }
        }
    }

    public static void showModernAuthors(List<Author> authors, Nation nation, int birthYear) {

        for (Author author : authors) {

            if (author.getBirthyear() > birthYear) {
                System.out.println(author);
            }

        }
    }

    public static void showByNationAndBirthYear(List<Author> authors, Nation nation, int birthYear) {

        for (Author author : authors) {
            if (author.getNation().equals(nation) && author.getBirthyear() > birthYear) {
                System.out.println(author);
            }

        }


    }

    private static Map<Nation, List<Author>> groupByNation(List<Author> authors) {

        Map<Nation, List<Author>> map = new HashMap<>();

        for (Author author : authors) {
            map.putIfAbsent(author.getNation(), new ArrayList<>());

            map.get(author.getNation()).add(author);


        }
        return map;
    }


}


