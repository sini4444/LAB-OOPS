import java.util.*;
public class DequeExamples{
public static void main(String[] args)
{
Deque<String> deque= new LinkedList<String>();
deque.add("Element 1 (Tail)");
deque.addFirst("Element 2 (Head)");
deque.addLast("Element 3 (Tail)");
deque.push("Element 4 (Head)");
deque.offer("Element 5 (Tail)");
System.out.println(deque + "\n");
System.out.println("Deque after removing"
+"first and last:"
+deque);
}
}
