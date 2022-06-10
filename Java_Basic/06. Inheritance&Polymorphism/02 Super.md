### super 예약어

subclass에서 superclass로 접근할 때 사용.

superclass의 주소(참조값)를 가지고 있는 예약어.

### super로 superclass constuctor 호출

subclass의 생성자 호출 시 superclass의 생성자가 호출되는 이유

→ 컴파일러가 subclass 생성자에 super()를 자동으로 추가

```java
public SubClass() {
	super(); // 상위클래스의 디폴트 생성자 SuperClass() 호출
}
```

superclass에 디폴트 생성자가 없을 경우(parameter를 받는 생성자만 있을 경우), super()로 호출할 디폴트 생성자가 정의되지 않았기 때문에 오류 발생.

→ super()에도 superclass 생성자의 parameter 포함 `super(parameter1, parameter2, ...)`

### super로 superclass의 멤버변수나 메서드 참조

```java
public var methodName() {
	return super.superClassMethod()
}
```

메서드 오버라이딩 시 필요
