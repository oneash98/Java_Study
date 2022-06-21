package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("a"));
        hashSet.add(new String("b"));
        hashSet.add(new String("b"));

        System.out.println(hashSet);
    }
}
