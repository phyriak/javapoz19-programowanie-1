package lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {


    @Test
    public void addShouldAddElementToList(){

        //given
        MyLinkedList myLinkedList = new MyLinkedList();

        //when
        myLinkedList.add(5);


        //then
        Assert.assertEquals(1,myLinkedList.size());


    }


    @Test
    public void shouldAddElementToNonList(){


    //given
    MyLinkedList myLinkedList = new MyLinkedList();

    //when
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        myLinkedList.add(5);
    //then
        Assert.assertEquals(5,myLinkedList.size());

}
}