### if문, if-else문

```java
// if문
if (조건식) {
	수행문;
}

// if-else문
if (조건식) {
	수행문;
}
else {
	수행문;
}
```

### if-else if-else문

```java
if (조건식) {
	수행문;
}
else if (조건식) {
	수행문;
}
else {
	수행문;
}
```

### switch-case문

조건이 하나의 변수나 상수로 구분될 경우 사용

```java
switch(조건) {
	case 값1: 수행문;
		break;
	case 값2: 수행문;
		break;
	case 값3: 수행문;
		break;
	default: 수행문; // 생략 가능
}

// case 동시 사용 가능
switch(조건) {
	case 값1: case 값2: case 값3: 수행문;
		break;
	case 값4: case 값5: 수행문;
		break;
}
```
