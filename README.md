# Why MultiThread?
대기시간이 발생했을 때 기다리는 동안 다른 일을 처리하여  
처리 속도를 높이기 위함  
(단, CPU Core가 적으면 Thread를 그만큼 만들 수 없다.)

## Thread Pool
동적으로 Program에 접속한 사람 수 만큼 Thread를 생성한다면,
Memory를 다 소비할 정도로 만들어버린다. 따라서, Thread Pool을 이용해서 Thread 최대 생성 개수를 지정해줄 수 있다.

# MultiThread Singleton

하나의 인스턴스만 존재해야 할 경우 singleton pattern을 사용한다. 그러나, `Multi Thread` 환경에서 Singleton 객체에 접근 시 초기화 관련하여 문제가 있다.  
- Singleton 객체를 생성하는 로직을 Thread-Safe 하게 적용하는 방법  
1.  synchronized 를 추가해준다. (but, 동기화 오버헤드가 심해짐, 속도가 100배정도 느려진다.)
2.  Enum Class로 정의해준다.
3.  LazyHolder (synchronized 도 필요없고, 자바 버전도 상관없다)  
  객체가 필요할 때로 초기화를 미루는 것이다.
```
public class Singleton {

private Singleton() {}

public static Singleton getInstance() {

// LazyHolder.INSTANCE를 참조하는 순간 초기화 진행
// Class를 로딩하고 초기화하는 시점은 Thread-safe를 보장한다.
return LazyHolder.INSTANCE;

}

private static class LazyHolder {

private static final Singleton INSTANCE = new Singleton();

	}
}
```
# Thread Safe
쉽게말해, 여러 Thread가 동시에 실행되어도 안전하다는 말이다.  
[Mutex : http://egloos.zum.com/js7309/v/11085573]  
ThreadSafe.java를 실행해보니 아래와 같이 섞여서 출력된다.  
Why? 내부적으로 처리속도가 빠른데 SimpleDateFormat을   
동시에 사용하려고 했기때문이다.  
```
ThreadA : 2019.06.09
threadB : 2019.06.25
threadB : 2019.06.25
ThreadA : 2019.06.09
threadB : 2019.06.25
ThreadA : 2019.06.09
threadB : 2019.06.25
ThreadA : 2019.06.09
ThreadA : 2019.06.09
..
```

## Thread Safety 하게 처리해주기
1. synchronized  
여러 개의 Thread가 한 개의 자원을 사용하고자 할 때,  
현재 Data를 사용하고 있는 해당 Thread를 제외하고 나머지  
Thread들은 Data에 접근 할 수 없도록 한다.  
- ThreadSafe.java 의 주석처리 된 synchronized 코드를 확인해보자.