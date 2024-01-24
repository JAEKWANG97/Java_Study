# ch15 컬렉션 구조

## 15.1 컬렉션 프레임 워크

자바는 널리 알려져 있는 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 관련된 인터페이스와 클래스들을 java.util 패키지에 포함시켜 놓았다.
이들을 총칭해서 컬렉션 프레임 워크라고 부른다. 

컬렉션 프레임 워크는 몇 가지 인터페이스를 통해서 다양한 컬렉션 클래스를 이용할 수 있도록 설계되었다.

주요 인터페이스로는 ```List, Set, Map``` 이 있다.

인터페이스 분류

### Collection 

- ```List```
  - 순서를 유지하고 저장
  - 중복 저장 기능
  - 구현 클래스 : Arraylist, Vector, LinkedList
- ```Set```
  - 순서를 유지하지 않고 저장
  - 중복 저장 안됨
  - 구현 클래스 : HashSet, TreeSet

### ```Map```
- 키와 값으로 구성된 엔트리 저장
- 키는 중복 저장 안됨


## 15.2 List 컬렉션

- ```List``` 
  - List 컬렉션은 객체를 ```index```로 관리하기 때문에 객체를 저장하면 ```index```가 부여되고 객체를 검색, 삭제할 수 있는 기능을 제공한다.
  - List 컬렉션에는 ```ArrayList, Vector, LinkedList``` 등이 있는데, 공통적으로 사용되는 List 인터페이스 메소드는 다음과 같다.
  - 기능
    - ***객체 추가***
      - ```boolean add(E e)``` 
        - 주어진 객체를 맨 끝에 추가
      - ```void add(int index, E element)```
        - 주어진 인덱스에 객체를 추가
      - ```set(int index, E element)```
        - 주어진 인덱스의 객체를 새로운 객체로 바꿈
    - ***객체 검색***
      - ```boolean contains(Object o)```
        - 주어진 객체가 저장되어 있는지 여부
      - ```E get(int index)```
        - 주어진 인덱스에 저장된 객체를 리턴
      - ```isEmpty()```
        - 컬렉션이 비어 있는지 조사
      - ```int size()```
        - 저장되어 있는 전체 객체 수를 리턴
    - ***객체 삭제***
      - ```void clear()```
        - 저장된 모든 객체를 삭제
      - ```E remove(int index)```
        - 주어진 인데스에 저장된 객체를 삭제
      - ```boolean remove(Object o)```
        - 주어진 객체를 삭제

### ArrayList
- Array에 객체를 추가하면 내부 배열에 객체가 생성됨
- 일반 배열과의 차이점은 ArrayList는 제한 없이 객체를 추가할 수 있다는 점
- List 컬렉션은 객체 자체를 저장하는 것이 아님. 객체의 번지를 저장함

```
List<E> list = new ArrayList<E>(); //E에 지정된 타입의 객체만 저장
List<E> list = new ArrayList<>(); //E에 지정된 타입의 객체만 저장
List list = new ArrayList(); //모든 타입의 객체를 저장
```
- 타입 파라미터 E에는 ArrayList에 저장하고 싶은 객체 타입을 지정하면 됨
- 객체를 추가하면 인덱스 0번 부터 차례대로 저장됨
- 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스 부터 마지막 인덱스까지 모두 앞으로 1씩 당겨짐
- 따라서 빈번하게 삭제와 삽입이 있다면 ArrayList는 비추

### Vector
- Vector는 ArrayList와 동일한 내부 구조를 가지고 있다.
- 차이점은 Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Vector() 메소드를 실행할 수 없다는 것.

```
List<E> list = new Vector<E>();
List<E> list = new Vector<>();
List list = new Vector();
```

### LinkedList

- LinkedList는 ArrayList와 사용 방법은 동일, 내부 구조는 완전히 다름
- 인접 객체를 체인 처럼 연결해서 관리함
- 삽입 또는 삭제 시 앞 뒤 링크만 변경하면 되므로 빈번한 객체 삭제와 삽입이 일어나는 곳에서 좋음
```
List<E> list = new LinkedList<E>();
List<E> list = new LinkedList<>();
List list = new LinkedList();
```

## 15.3 Set 컬렉션

- Set 컬렉션은 저장 순서가 유지되지 않음
- 객체를 중복해서 저장할 수 없음
- ```Hashset , LinkedHashSet, TreeSet``` 등이 있음
- 공통 메서드
  - ```boolean add(E e)```
    - 주어진 객체를 성공적으로 저장하면 true를 리턴하고 중복 객체면 false를 리턴
  - ```boolean contains(Object o```
    - 주어진 객ㄱ체가 저장되어 있는지 여부
  - ```isEmpty```
    - 컬렉션이 비어 있는지 조사
  - ```iterator<E> iterator()```
    - 저장된 객체를 한 번씩 가져오는 반복자 리턴
  - ```int size```
    - 저장되어 있는 전체 객체 수 리턴
  - ```void clear()```
    - 저장된 모든 객체를 삭제
  - ```boolean remove(Object o)```
    - 주어진 객체를 삭제

### HashSet

- set 컬렉션 중 가장 많이 사용되는 것이 HashSet임
```
Set<E> set = new HashSet<E>();
Set<E> set = new HashSet<>();
Set set = new HashSet();
```
- 타입 파라미터 E 에는 저장하고 싶은 객체 타입을 지정하면 됨
- Set에 지정한 객체 타입과 동일하다면 HashSet<> 과 같이 객체 타입을 생략 가능

- Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없기 때문에 iterator를 활용하여 찾는 방벙이 있음
```
Iterator<E> iterator = set.iterator();
```

- iterator의 메소드
  - boolean hasNext()
    - 가져올 객체가 있으면 true를 리턴, 없으면 false를 리턴
  - E next()
    - 컬렉션에서 하나의 객체를 가져옴
  - void remove()
    - next()로 가져온 객체를 set컬렉션에서 제거

```
while(iterator.hasNext()){
  E e = iterator.next();
  }
```

### 15.4 Map 컬렉션
- Map 컬력션은 key와 Value로 구성된 Entry객체를 저장한다.
- Key는 중복 저장 x 
- Value는 중복 저장 o
- 기존에 저장된 키와 동일한 키로 값을 저장 -> 새로운 값으로 대치

- 메소드
  - ```V put(K key, V value)``` 주어진 키와 값을 추가, 저장이 되면 값을 리턴
  - ```boolean containsKey(Oobject Key)``` 주어진 키가 있는지 여부
  - ```boolean containsValue(Oobject value)``` 주어진 값이 있는지 여부
  - ```Set<Map.Entry<K,V>> entrySet()``` 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
  - ```V get(Object key)``` 주어진 키와 값을 리턴
  - ```boolean isEmpty``` 컬렉션이 비어 있는지 여부
  - ```Set<K> keySet()``` 모든 키를 Set 객체에 담아서 리턴
  - ```int size()``` 저장된 키의 총 수를 리턴
  - ```Collection<V> values()``` 저장된 모든 값 Collection에 담아서 리턴
  - ```void clear()``` 모든 Map.Entry(키와 값)을 삭제
  - ```V remove(Object key)``` 주어진 키와 일치하는 Map.Entry 삭제, 삭제가 되면 값을 리턴

### HashMap

- ```HashMap```은 키로 사용할 객체가 hashCode() 메소드의 리턴값이 같고 equals() 메소드가 true를 리턴할 경우, 동일 키로 보고 중복 저장을 허용하지 않는다.

```
Map<K, V>map = new HashMap<K, V>();
```


15.5 검색 기능을 강화시킨 컬렉션

컬렉션 프레임 워크는 검색 기능을 강화시킨 TreeSet과 TreeMap을 제공한다. 이름에서 알 수 있듯이 TreeSet은 Set컬렉션이고, TreeMap은 Map 컬렉션이다.

TreeSet은 이진 트리를 기반으로 한 Set 컬렉션이다. 이진 트리는 여러개의 노드가 트리