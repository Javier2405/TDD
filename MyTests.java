//Victor Javier Aguayo Mendoza
//A01229260

public class MyTests{

    // 1. Unit testing for list size
    //Getting size of list with values
    @Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    //Getting size of empty list
    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    //Getting size of null list
    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;
        list.size();
    }

    // 2. Unit testing for clearing the list
    //Clearing values from empty list
    @Test
    public void clearingEmpty() {
        List<Integer> list = new ArrayList<>();
        list.clear();
        assertEquals(0, list.size());
    }

    //Clearing values from null list
    @Test(expected = NullPointerException.class)
    public void clearingNull() {
        List<Integer> list = null;
        list.clear();
    }

    //Clearing values from list
    @Test
    public void clearingWithValues() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.clear();
        assertEquals(0, list.size());
    }

    //3. Unit testing for adding items
    //Adding items to a list with existing items
    @Test
    public void addingWithValues() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.add(4);
        assertEquals(4, list.size());
    }

    //Adding items to an empty list
    @Test
    public void addingEmpty() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        assertEquals(1, list.size());
    }

    //Adding item to a null list
    @Test(expected = NullPointerException.class)
    public void addingNull() {
        List<Integer> list = null;
        list.add(1);
    }

    //4. Unit testing for check if an item exists
    //Checking items on a list with existing items
    @Test
    public void checkingWithValues() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(list.contains(4));
    }

    //Checking items on an empty list
    @Test
    public void checkingEmpty() {
        List<Integer> list = new ArrayList<>();
        assertEquals(!list.contains(1));
    }

    //Checking item on a null list
    @Test(expected = NullPointerException.class)
    public void checkingNull() {
        List<Integer> list = null;
        list.contains(1);
    }

    //5. Unit testing for getting elements by index
    //Getting item by index on a list with existing items
    @Test
    public void gettingItemWithValues() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1,(int) list.get(0));
    }

    //Getting item by index on an empty list
    @Test(expected = IndexOutOfBoundsException.class)
    public void gettingItemEmpty() {
        List<Integer> list = new ArrayList<>();
        list.get(0)
    }

    //Getting item by index on a null list
    @Test(expected = NullPointerException.class)
    public void gettingItemNull() {
        List<Integer> list = null;
        list.get(0);
    }

    //6. Unit testing for searching index of object
    //Getting index of object on a list with existing items
    @Test
    public void gettingIndWithValues() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(0,list.indexOf(1));
    }

    //Getting index of object on an empty list
    @Test
    public void gettingIndEmpty() {
        List<Integer> list = new ArrayList<>();
        assertEquals(-1,list.indexOf(1));
    }

    //Getting index of object on a null list
    @Test(expected = NullPointerException.class)
    public void gettingIndNull() {
        List<Integer> list = null;
        list.indexOf(1);
    }

    //7. Unit testing for removing by index
    //Removing item by index on a list with existing items
    @Test
    public void removeWithValues() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        assertEquals(2,(int) list.get(0));
    }

    //Removing item by index on an empty list
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeEmpty() {
        List<Integer> list = new ArrayList<>();
        list.remove(0);
    }

    //Removing item by index on a null list
    @Test(expected = NullPointerException.class)
    public void removeNull() {
        List<Integer> list = null;
        list.remove(0);
    }
}