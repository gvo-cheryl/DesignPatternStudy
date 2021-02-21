<style>div { text-align: center; }</style>

## Design Pattern Study
디자인패턴에 대해 공부하며 연관된 기초지식들을 함께 정리한다.

<br/>


### GoF 디자인 패턴
- GoF(Gang of Four)라 불리는 사람들 
  - 에리히감마, 리차드헬름, 랄프존슨, 존 블리시디스
  - 소프트웨어 개발 여역에서 디자인 패턴을 구체화하고 체계화한 사람들
  - 23가지 디자인 패턴을 정리하고 각각의 디자인 패턴을 생성, 구조, 행위 3가지로 분류
- GoF 디자인 패턴의 분류<br>
<div><img width="750" alt="GoF" src="https://user-images.githubusercontent.com/67686761/108626218-67c5de00-7492-11eb-9bf8-fa32b7c68e7b.png"></div>

1. 생성(Creational)패턴
    - 객체 생성에 관련된 패턴
    - 객체의 생성과 조합을 캡슐화해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 받지 않도록 유연성 제공
2. 구조(Structural)패턴
    - 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
    - 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나 객체들을 서로 묶어 새로운 기능을 제공하는 패턴
3. 행위(Behavioral)패턴
    - 객체나 클래스 사이의 알고리즘이나 책임분배에 관련된 패턴
    - 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지, 또 그렇게 하면서도 객체 사이의 결합도를 최소화하는 것에 중점을 둔다.



## 생성 패턴
1. Abstract Factory Pattern [[참고자료]](https://gmlwjd9405.github.io/2018/08/08/abstract-factory-pattern.html)
- 구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴
  - 즉, 관련성 있는 여러 종류의 객체를 일관된 방식으로 생성하는 경우에 유용하다.
  - 싱글턴 패턴, 팩토리 메서드 패턴을 사용한다.
 
> ### 예제 만들기
> 1) 엘리베이터 부품을 여러 업체에서 사용할 때 같은 동작을 지원하도록 한다. 
> 2) 추상 클래스로 Motor, Door를 정의한다. 제조 업체가 다른 경우 구체적인 제어방식은 다르지만 엘리베이터 입장에서 모터를 구동해 이동시킨다는 면에서 동일하다.
> 3) Motor클래스는 이동하기 전에 문을 닫아야 하고, Door 객체의 getDoorStatus() 메서드를 호출하기 위해 연관관계가 필요하다. 


2. Factory Methods Pattern
- 객체 생성 처리를 서브 클래스로 분리하여 캡슐화함으로써 객체 생성의 변화에 대비할 수 있다. 
![image](https://user-images.githubusercontent.com/67686761/108626507-da838900-7493-11eb-8aee-2efc418b0687.png)





## 행위 패턴 
1. Template Method Pattern
- 어떤 작업을 처리하는 일부분을 서브클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정단계에서 수행하는 내역을 바꾸는 패턴
  - 즉, 전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화할 때 유용
  - 다른 관점에서 보면, 동일한 기능을 상위 클래스에서 정의하면서 확장/변화가 필요한 부분만 서브클래스에서 구현할 수 있도록 한다.
  - 전체적인 알고리즘은 상위클래스에서 구현하면서 다른 부분은 하위클래스에서 구현할 수 있도록 전체적인 알고리즘 코드를 재사용하는데 유용하다.
<br>
<div><img width="476" align="center" alt="TemplateMethods" src="https://user-images.githubusercontent.com/67686761/108629456-4d483080-74a3-11eb-90c0-4021355e9df5.png"></div>


2. Strategy Pattern
>  * 추상클래스와 인터페이스 [[간단정리]](https://pro-growth.tistory.com/213)
>  * strategy pattern [[참고자료]](https://gmlwjd9405.github.io/2018/07/06/strategy-pattern.html)
