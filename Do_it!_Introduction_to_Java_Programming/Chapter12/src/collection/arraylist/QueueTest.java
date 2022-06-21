package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    // 큐의 맨 뒤에 추가
    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    // 큐의 맨 앞에서 꺼내기
    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비어있습니다");
            return null;
        }
        return(arrayQueue.remove(0));
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
