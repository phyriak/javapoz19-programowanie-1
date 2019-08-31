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



    // TODO - obsluga pustej listy
    // TODO - obluga blednego indexu (ArrayIndexOutOfBoundException)
    public Integer get(int index) {
        return getElement(index).value;
    }

    private MyLinkedListItem getElement(int index) {
//1.Obsługa błednego indexu
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        MyLinkedListItem tmpItem = head;
        for (int i = 0; i < index; i++) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    public void remove(int index) {
        // bedzie trzeba uzyc metody getElement

        // 1. pobieramy poprzednik elementu index
        MyLinkedListItem previous = getElement(index - 1);

        // 2. pobieramy element do usunieca
        MyLinkedListItem toRemove = getElement(index);

        // 3. zmieniamy nextValue w poprzedniku na nextValue elementu ktory usuwamy
        previous.nextItem = toRemove.nextItem;
//        previous.nextItem = previous.nextItem.nextItem;

        // 4. w usuwanym elemencie null'ujemy nextValue
        toRemove.nextItem = null;

        size--;
    }

    // TODO - na 31.08 zadanie domowe
    public void add(int index, Integer value) {

        //1.Tworzymy nowe pudełeczko
        MyLinkedListItem toAdd = new MyLinkedListItem(value);
        //2 Pobieramy strzałke z poprzedniego pudełeczka do nastęnego
        MyLinkedListItem previous = getElement(index - 1);
        //3. Przypisujemy tą strzałkę nowemu pudełku tak aby był powiązany z nastepnym
        toAdd.nextItem = previous.nextItem;
        //4. Nadajemy nową strzałkę poprzedającemu pudełku, która wskazuje na nowy dodany obiekt
        previous.nextItem = toAdd;
        //5.Zwiększamy tablice
        size++;
    }

    public int size() {
        return size;
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