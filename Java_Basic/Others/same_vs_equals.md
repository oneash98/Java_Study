## same vs equals

### same

same: `==`

메모리의 주소값을 비교. 물리적 동일성

```java
public class MyClass {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he";
        String s3 = "llo";
        String s4 = s2 + s3;
        String s5 = "hello";

        System.out.println(s1 == s4); // false
        System.out.println(s1 == s5); // true
    }
}
```
s4는 두 문자열을 합치면서 새로운 주소값을 할당받기 때문에 s1과 비교하면 false.

s5는 s1이 참조하고 있는 "hello"의 주소값을 똑같이 참조하므로 true.

<br/>

### equals

논리적 동일성.

```java
s1.equals(s4); // true 
s1.equals(s5); // true
```