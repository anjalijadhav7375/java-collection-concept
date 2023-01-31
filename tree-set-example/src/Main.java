import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

                Set<String> booksToRead = new TreeSet<>();

                booksToRead.add("Rich Dad Poor Dad");
                booksToRead.add("7 habits of highly effective people");
                booksToRead.add("Coffee can investing");

                System.out.println(booksToRead.contains("Test Book"));
                System.out.println(booksToRead.size());
                booksToRead.forEach(name -> System.out.println("Name of book: " + name) );

//        Iterator<String > stringIterator = booksToRead.iterator();
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }
//   for (Object name : booksToRead.toArray()){
//       System.out.println(name.toString());
//   }
            }

        }
}