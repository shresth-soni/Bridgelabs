// ListReverse.java
import java.util.*;

public class ListReverse {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> out = new ArrayList<>(list.size());
        for (int i = list.size()-1; i >= 0; --i) out.add(list.get(i));
        return out;
    }
    // For LinkedList efficient two-pointer in-place:
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int n = list.size();
        ListIterator<T> f = list.listIterator();
        ListIterator<T> b = list.listIterator(n);
        for (int i = 0; i < n/2; ++i) {
            T front = f.next();
            T back = b.previous();
            f.set(back);
            b.set(front);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(reverseList(a)); // [5,4,3,2,1]
        LinkedList<Integer> l = new LinkedList<>(List.of(1,2,3,4,5));
        reverseLinkedList(l);
        System.out.println(l); // [5,4,3,2,1]
    }
}
