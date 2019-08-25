package lists;

public class MyLinkedList {

    private MyLinkedListItem head;
    private int size;

    public MyLinkedList() {

        this.head = null;
        this.size = 0;
    }

    public void add(Integer value) {
        MyLinkedListItem myLinkedListItem = new MyLinkedListItem(value);


        if (this.head == null) {
            this.head = myLinkedListItem;
        } else {
            MyLinkedListItem lastItem = getLastItem();
            lastItem.nextItem = myLinkedListItem;
        }
        size++;


    }
    //TODO obsluga pustej listy
    //TODO obsluga blednego indexu(ArrayIndexOutOfBound)

    public int size() {
        return size;
    }

    public Integer get (int index){

        MyLinkedListItem tmpItem=head;
        for (int i = 1; i <index ; i++) {
          tmpItem=tmpItem.nextItem;
        }
        return tmpItem.value;
    }

    private MyLinkedListItem getLastItem() {

        MyLinkedListItem tmpItem = this.head;
        while (tmpItem.nextItem != null) {
            tmpItem = tmpItem.nextItem;


        }
        return tmpItem;

    }

    static class MyLinkedListItem {

        private Integer value;
        private MyLinkedListItem nextItem;


        private MyLinkedListItem(Integer value) {
            this.value = value;
        }
    }
}
