package lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {


    @Test
    public void addShouldAddElementToList() {

        //given
        MyLinkedList myLinkedList = new MyLinkedList();

        //when
        myLinkedList.add(5);


        //then
        Assert.assertEquals(1, myLinkedList.size());


    }


    @Test
    public void shouldAddElementToNonList() {


        //given
        MyLinkedList myLinkedList = new MyLinkedList();

        //when
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        myLinkedList.add(5);
        //then
        Assert.assertEquals(5, myLinkedList.size());

    }

    @Test
    public void getShouldReturnMiddleElement() {
        //given
        MyLinkedList myLinkedList = new MyLinkedList();


        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);


        //when

        Integer result = myLinkedList.get(3);

        //then
        Assert.assertEquals((Integer) 30, result);

    }


    @Test
    public void getShouldReturnFirstElement() {
//TODO dopisac testy

    }

    @Test
    public void getShouldReturnLastElement() {
//TODO dopisac testy

    }

    @Test
    public void removeShouldRemoveMiddleElement() {

        MyLinkedList myLinkedList = new MyLinkedList();


        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);

        myLinkedList.add(30);
        myLinkedList.add(40);


        myLinkedList.remove(4);


        Assert.assertEquals(4, myLinkedList.size());
        Assert.assertEquals((Integer) 0, myLinkedList.get(0));
        Assert.assertEquals((Integer) 10, myLinkedList.get(1));
        Assert.assertEquals((Integer) 20, myLinkedList.get(2));
        Assert.assertEquals((Integer) 30, myLinkedList.get(3));


    }

    @Test
    public void addShouldAddMiddleElement() {

        MyLinkedList myLinkedList = new MyLinkedList();


        myLinkedList.add(0);
        myLinkedList.add(10);

        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);


        myLinkedList.add(2, 20);


        Assert.assertEquals(6, myLinkedList.size());
        Assert.assertEquals((Integer) 0, myLinkedList.get(0));
        Assert.assertEquals((Integer) 10, myLinkedList.get(1));
        Assert.assertEquals((Integer) 20, myLinkedList.get(2));
        Assert.assertEquals((Integer) 30, myLinkedList.get(3));
        Assert.assertEquals((Integer) 40, myLinkedList.get(4));
        Assert.assertEquals((Integer) 50, myLinkedList.get(5));


    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void get_ElementOutOfListShouldThrowExceptionWhenAddingOnWrongIndex() {
        // given
        MyLinkedList myLinkedList = new MyLinkedList();


        myLinkedList.add(0);
        myLinkedList.add(10);

        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);
        //when

        myLinkedList.get(56);


    }
}