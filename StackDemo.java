import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());


        // LinkedList  as Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast(); // peek
        linkedList.removeLast(); // pop
        linkedList.size();
        linkedList.isEmpty();
        System.out.println(linkedList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(list.size()-1); // peak
        list.remove(list.size()-1); //pop


    }
}
