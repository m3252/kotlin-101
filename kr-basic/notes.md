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


### 2. Null Safety

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

### 3. Type 변환

--- 

- 자바와 달리 타입변환을 명시해줘야 한다.
  - ```kotlin
    val number1 : Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    
    val number3 = 3
    val result = number1 / number3.toDouble()
    ```
- 자바의 `instansof`와 같은 기능을 하는 `is` 키워드가 있다.
  - ```kotlin
    val number1 : Int? = 3
    if(number1 is Int) {
        println("number1 is Int")
    }
    ```
- 스마트 캐스트인 as 키워드를 지원하지만 생략 가능하다.
  - ```kotlin
    val number1 : Int? = 3
    val number2: Long = number1 as Long
    val number3: Long = number1
    ```    
  - as? 키워드를 사용하면 타입 변환이 불가능한 경우 null을 반환한다.

- Any, Unit, Nothing 
  - Any : 모든 타입의 조상 타입
  - Unit : Java의 void와 같은 타입
  - Nothing : 정상적으로 끝나지 않는 함수를 표시

- String interpolation / String indexing
  - ```kotlin
    val text = "아아아 ${person.name}"
    ```
  - ```kotlin
    val str = 
    """
    ABC
    EDF
    """.trimIndent()
    ```
  - ```kotlin
    println(text[5])
    ```

### 4. 연산자

---
- 단항, 산술, 산술 대입 연산자는 자바와 같다.
- 특정 연산자를 기호에 맞게 사용할 수 있다.
  - compareTo : >
  - plus : + 
    - 객체 연산
  - equals : == 
  - same : ===


### 5. 제어문

--- 

- if문은 자바와 같다.
  - ```kotlin
    if (number > 0) {
        println("1")
    } else if (number < 0) {
        println("2")
    } else {
        println("else")
    }
    ```
  - 단 자바의 statement와는 달리 expression으로 취급되기에 삼항 연산자가 없다. 
    - ```kotlin
      fun getGrade(score: Int): String {
        return if (score >= 90) {
          "A"
        } else if (score >= 80) {
          "B"
        } else if (score >= 70) {
          "C"
        } else if (score >= 60) {
          "D"
        } else {
          "F"
        }
      }
      ```
- switch 대신 when을 사용한다.
  - ```kotlin
    when (number) {
        1 -> println("1")
        2 -> println("2")
        else -> println("else")
    }
    ```
  - ```kotlin
    when (number) {
        in 1..10 -> println("1")
        in 11..20 -> println("2")
        else -> println("else")
    }
    ```
  - ```kotlin
    when (number) {
        is Int -> println("Int")
        is Long -> println("Long")
        else -> println("else")
    }
    ```
  - ```kotlin
    when {
        number > 0 -> println("1")
        number < 0 -> println("2")
        else -> println("else")
    }
    ```
    

### 6. 반복문

--- 
- while, do-while문은 자바와 같다.
  - ```kotlin
    while (number > 0) {
        println(number)
        number--
    }
    ```
  - ```kotlin
    do {
        println(number)
        number--
    } while (number > 0)
    ```
- for문은 표현이 다르다.
  - ```kotlin
    for (i in 1..10) {
        println(i)
    }
    ```
  - ```kotlin
    for (i in 10 downTo 1) {
        println(i)
    }
    ```
  - ```kotlin
    for (i in 1..10 step 2) {
        println(i)
    }
    ```
  - ```kotlin
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    ```
  - ```kotlin
    for (i in 1 until 10) {
        println(i)
    }
    ```