package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    // 스택의 맨 뒤에 요소 추가
    public void push(String data) {
        arrayStack.add(data);
    }

    // 스택의 맨 뒤 요소 꺼내기
    public String pop() {
        int len = arrayStack.size();
        if(len == 0) {
            System.out.println("스택이 비어있습니다");
            return null;
        }

        return(arrayStack.remove(len - 1));
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
