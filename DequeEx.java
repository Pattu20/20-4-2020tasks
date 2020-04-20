import  java.util.*;
public class Deue{
public static void main(String args[]){
Deque dq = new ArrayDeque<>();
dq.add("btech1"); // FIFO
dq.add("btech2");
dq.add("btech3");
dq.add("be1");
dq.add("be2");
dq.add("be3");
dq.add("mca1");
dq.add("mca1");
dq.add("mca2");
System.out.println(dq);
System.out.println(dq.peek());
}
}