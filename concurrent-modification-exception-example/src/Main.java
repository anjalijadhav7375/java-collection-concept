import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**Structural modification of HashMap --> This means new node creation or deletion of node or rehashing
initially, modCount=0
when entries are added to the map then modCount increases as its structure is modified.
3 put --> modCount=3
If we want to remove any entry from the map then modCount will reduce.
This modCount variable is used by Iterator to iterate over the map entries.*/

public class Main {
    public static void main(String[] args) {

        Map<String,Long> phoneBook = new HashMap<>();

        phoneBook.put("Ajay",8975700041L);
        phoneBook.put("Anjali",9175683761L);
        phoneBook.put("Usha",963856162L);

        Iterator<String> stringIterator = phoneBook.keySet().iterator();
        while (stringIterator.hasNext()){
            String name = stringIterator.next();

            if (name.equals("Ajay")){
                //phoneBook.put("Papa",9767654176L);
                // New node addition --> We are trying to change modCount value --> modCount=4
                phoneBook.remove("Ajay");
            }
            System.out.println(stringIterator.next());
        }
    }
}