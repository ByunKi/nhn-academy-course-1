# Primitive data types

## Summary

- Representation of numbers in Java: the primitive numeric data types int, long, short, byte, float, double
- Set of values that can be represented, and operations on such primitive numeric data types
- Difference between the assignment for primitive data types and the assignment of references to objects
- Operators obtained by composition and expressions with side-effect
- Definition of constants
- Precision in the representation
- Conversion of strings in numbers and viceversa; input and output of numeric values
- Compatibility among primitive numeric data types; type conversions (cast)
- Other primitive data types in Java: char and boolean

## Data Type의 수학적 정의 (Data types in mathematics)

- Java에서 표현 될 수 있는 데이터의 성질과 데이터를 조작하는 연산을 효과적으로 설명하기 위해 Data type 개념을 사용한다.

- Data type의 수학적인 특징
  1. Domain
     - 1개 이상의 값을 가짐
     - 1개 이상의 규칙을 가지고 있으며, 이러한 규칙으로 값을 추가할 수 있어야함.
  2. Domain에 대한 연산의 집합
  3. 수학적인 상수 (Literals)의 집합

_이러한 특성화를 통해서 우리는 표현하려는 값(Data, Domain?)과 이를 조작하는 작업(Operation, Method)을 정확한 방식으로 식별할 수 있습니다._

## Java의 Primitive Data types

- 숫자 정보를 처리하기 위한 Data types

  - 총 6개의 Data types

  1. Domain: 컴퓨터 메모리에 저장될 수 있는 가능한 값의 집합
  2. Domain에 대한 연산의 집합: 기본 연산을 수행할 수 있게 해주는 Java의 연산자
  3. 수학적인 상수 (Literals)의 집합: primitive Data type의 값을 정의하는 언어 기호

- primitive type 변수와 객체(Object) type에 대한 변수
  - 객체(Object) type의 변수 값은 객체에 대한 참조(객체가 저장되어있는 메모리 주소값)입니다.
    - 객체 type은 레퍼런스 type 으로도 불린다.
  - primitive type의 변수 값은 그 자체의 값을 저장합니다.

```java
public class Account {
  public int bal;
  public Account(int x) {
    bal = x;
  }
}

...
Account r1, r2;
r1 = new Account(100);
r2 = r1;
r2.bal = 234;
System.out.println(r1.bal); // prints 234
```

객체 type의 변수에 저장

![U4-2](./images/4장/Unit4-2.png)

```java
int c1, c2;
c1 = 100;
c2 = c1;
c2 = 234;
System.out.println(c1); // prints 100
```

primitive type의 변수에 값을 저장

![U4-3](./images/4장/Unit4-3.png)

이러한 두 방식의 변수의 값을 저장하는 차이로 인하여 메서드(Method) 단위에서 값을 수정할 때, 방식이 달라진다.
primitive type의 경우에는 Actual parameter에 변수의 값을 복사하여 매개변수를 저장한다.
객체 type의 경우에는 변수의 저장된 객체의 메모리 주소값을 Actual parameter의 값으로 전달한다.

![U4-1](./images/4장/Unit4-1.png)

![]()
![]()
![]()
![]()
![]()

- 문자 정보를 처리하기 위한 Data types
- boolean Data types

## Wrapper Class

![U4-4](./images/4장/Unit4-4.png)

- Java는 primitive type에 대한 Wrapper class를 사전에 정의하였다.
- primitive type과 이름이 동일(유사?)하지만 대문자로 시작한다.
