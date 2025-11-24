public // NthFromEnd.java
import java.util.*;

public class NthFromEnd {
    public static <T> T nthFromEnd(LinkedList<T> list, int nFromEnd) {
        if (nFromEnd <= 0) throw new IllegalArgumentException();
        Iterator<T> it = list.iterator();
        // advance lead by nFromEnd
        Deque<T> q = new ArrayDeque<>();
        while (it.hasNext()) {
            q.addLast(it.next());
            if (q.size() > nFromEnd) q.removeFirst();
        }
        if (q.size() < nFromEnd) throw new NoSuchElementException();
        return q.peekFirst();
    }
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>(List.of("A","B","C","D","E"));
        System.out.println(nthFromEnd(l,2)); // D
    }
}
 {
    
}
