# kotlin-basic

### 1. 변수 선언

--- 
- 모든 변수는 var / val을 붙여 주어야 한다.
  - var(variable) : 일반적인 변수
  - val(value) : 한번 할당되면 변경할 수 없는 변수
- 타입을 명시적으로 작성하지 않아도 타입이 추론된다.
  - 타입을 명시적으로 작성할 수도 있다.
  - Primitive Type과 Reference Type을 구분하지 않아도 된다.
  - ```kotlin 
    var number1 = Long 
    number1 = 1L
    ```

- Null이 들어갈 수 있는 변수는 타입 뒤에 ?를 붙여준다.
  - **아예 다른 타입으로 간주된다.**
  - ```kotlin
    var number3 : Long? = 1_000L
    number3 = null
    ```

- 객체를 인스턴스화 할 때 new 키워드를 사용하지 않는다.
  - ```kotlin
    var person = Person("noah")
    ```


### 2. Null 다루기

--- 

- null 이 들어갈 수 있는 타입은 타입 뒤에 ?를 붙여준다.
  - **아예 다른 타입으로 간주된다.**
    - ```kotlin
      var number : Long? = 1_000L
      number = null
      ```
  - null이 아닌 경우에만 호출되는 Safe Call 연산자를 사용할 수 있다.
    - ```kotlin
      var number : Long? = 1_000L
      number = null
      println(number?.toString())
      ```
  - null인 경우에만 호출되는 Elvis 연산자를 사용할 수 있다.
    - ```kotlin
      var number : Long? = 1_000L
      number = null
      println(number?.toString() ?: "null")
      ```
  - null이 확실히 아니라면 Non-null 단정 기호를 사용할 수 있다.
    - ```kotlin
      var number : Long? = 1_000L
      number = null
      println(number!!.toString())
      ```

