# Loop statements

## Summary

- Repetition of statements
- The while statement
- Input loop
- Loop schemes
- The for statement
- The do statement
- Nested loops
- Flow control statements

## Statements in Java

- Java의 구문/명령문에는 다양한 형태가 존재합니다.
  - Simple Statement: Invocations etc...
  - Composite Statement: Conditional Statement, Block of Statements

## 구문/명령문의 반복 (Repetition of statements)

- 문제를 해결하면서 특정한 구문/명령문이 반복되면서 사용되는 경우와, 변수에 할당된 값이 변경되어야 하는 경우가 발생한다.
- Java에서는 2가지 형태의 반복을 제공한다.
  1. Use of Loop Statements
  2. Use of Recursive Methods

_지금은 Loop에 대하여 알아보고 추후에 Recursion에 대하여 학습할 예정이다._

## 유한 루프와 무한 루프 (Definite and indefinite loops)

- Java 에서는 반복의 횟수가 결정되는 방식에 따른 2가지의 방법을 구분하여 제공합니다.
  1. 유한루프 (Definite, Finite Loop): 반복이 시작되기 전에, 반복 횟수가 지정되는 경우를 뜻한다.
  2. 무한루프 (Indefinite, Infinite Loop): 반복이 시작되기 전에 반복 횟수를 알 수 없지만, Loop에서 발생하는 상황에 따라서 반복 횟수가 결정됩니다.

_다른 프로그래밍 언어와 마찬기지로 `while`문을 가지고 2가지의 방법을 전부 구현할 수 있다._

## while 문 (The while loop)

```java
while(condition)
    statement
```

1. condition에는 boolean 타입의 값을 표현하는 Expression이 사용 될 수 있습니다.
2. statement에는 Statement block이나 single Statement가 작성될 수 있습니다.

_condition의 값이 `true`라면 반복이 지속되고 `false`라면 반복이 중지됩니다._

```java
int i = 0;
while (i < 100) {
  System.out.print("*");
  i++;
}
```

## Loop 디자인의 특징적인 요소 (Characteristic elements in the design of a loop)

```java
initialization
while (condition) {
  operation
  next step
}
```

1. initialization: Loop를 실행하기 전에, 루프에서 사용하는 변수들을 정의합니다.
2. condition: 각 반복을 수행하기 위해서 반복 시작전에 사용되는 Expression, 이 Expression의 진리값으로 반복 여부를 결정함.
3. operation of the loop: 반복문을 수행하면서 실질적으로 반복이 진행되는 부분
4. next step: 다음 단계의 반복을 수행하기 위해서 제어를 위해서 정의된 변수의 값을 증감하는 부분

# for 문 (The for loop)

```java
for (initialization; condition; update)
statement
```

1. initializaion 부분에서 제어 변수의 초기화를 진행한다.
2. condㅑtion에서 반복을 결정하는 진리값을 얻을 수 있다. 이전과 마찬가지로 `true`면 반복을 진행하고 `false`면 반복을 중지한다.
   - 만약 condition이 존재하지 않는다면, 항상 `true` 값을 가지게 되고 이는 무한루프로 볼 수 있다.
3. 마지막인 update 부분에서 제어변수에 대한 증감을 수행한다. 각 루프에 맞는 증감을 수행할 수 있어야 할 것이다.

<br>

- 각 부분의 의도와 표현하고자 하는 의미에 맞게 제어 변수를 참조하여 for문을 정상적으로 사용할 것!
  - 굳이 무한루프를 만들기 위해서 condition 부분을 기술하지 않는 것이 아닌 while문 등 다른 방법을 강구할 것
- loop body에서 제어 변수를 수정하는 것을 권장하지 않음.
- 일반적으로 initialization과 update는 side-effect가 있는 expression이 될 수 있다.
- 이를 통해 여러 variable을 initialize나 update 할 수 있지만 권장 하지 않는다.

## do-while 문 (The do loop)

- do 루프는 while문과 형식과 반복의 방식이 유사하지만, 각 반복이 끝나고 나서 조건을 확인한다는 점에서 확연한 차이가 존재합니다.

```java
do
  statement
while (condition);
```

1. 구문/명령문이 우선 수행됩니다.
2. 그 다음 condition의 값에 따른 반복을 수행합니다.

```java
int i = 0;
do {
  System.out.print("*");
  i++;
} while (i < 100);
```

- do 다음의 Statement를 Block으로 지정하여 구분하거나 들여 쓰기를 통해서 다른 개발자가 코드를 구분하기 편하게 가독성이 좋게 만들어 주는 것을 추천한다.
- 어떠한 값을 입력 받고 그 입력에 대한 유효성을 검사하는데 매우 유용하다.

## 중첩된 반복문 (Nested loops)

- loop의 body에도 loop를 추가할 수 있다. 이를 두고 중첩된 반복문(nested loop)라고 부른다.

```java
EXAMPLE: Print out the multiplication table
  public class MultiplicationTable {
    static final int NMAX = 10;
    public static void main(String[] args) {
      int row, column;

      for (row = 1; row <= NMAX; row++) {
        for (column = 1; column <= NMAX; column++)
          System.out.print(row * column + " ");
        System.out.println();
        }
      }
    }
```

```java
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 ...................30
.                       .
.                       .
.                       .
.                       .
.                       .
10 20 30 ..............100
```

## Flow control Statements

- Flow control은 다음에 실행 할 Statement를 결정하는 역할을 수행한다.
- 실행 흐름을 중단시키고 프로그램 내에서 존재하는 다른 명령문으로 이동하거나 흐름을 종료시키는 Jump Statements을 말한다.

- Jump Statements

  1. break
  2. continue
  3. return (메서드/함수에서 사용됨.)

- 일반적으로 사용되지는 않고 특정한 상황에 마주했을때 사용해야 하는 Statemtn이다.
- `return` 키워드르 사용하면, 현재 Call stack에서 활성화 중인 메서드를 종료하여 Flow control을 수행할 수 있다.

```java
double a;
for (int i = 0; i < 10; i++) {
  a = Double.parseDouble(
        JOptionPane.showInputDialog("Input a nonnegative real"));
  if (a >= 0)
    System.out.println(Math.sqrt(a));
  else {
    System.out.println("Error");
    break;
  }
}
```

- break
  - 현재 실행중인 반복을 종료

```java
while (condition) {
  statements-1
  if (break-condition) break;
  statements-2
}
```

- continue
  - 현재 실행중인 Statement를 중지하고 반복문의 처음으로 돌아감
  - 반복될 때마다 특정 condition의 값을 확인해야 한다는 점이 단점으로 작용한다.
  - 주로 for 문에서 많이 사용됨.

```java
for (int i = 0; i <= 100; i++) {
  if (i % 2 == 0)
    continue;
  System.out.println(i);
}
```
