# Notes

## Strings
```java
String s = "hello bye";
System.out.println(s.charAt(0));
int length = s.length();
String hello = s.substring(0, 5);
String bye = s.substring(6);
String[] words = s.split();
```

## Interning
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

// Stack
// -----
//   |__|
// s3|5k|
// s2|4k|
// s1|4k|

// Heap
// -----
// Intern Pool
// 4k "hello"

// 5k "hello"

// 1. For comparison, use s1.equals(s3) instad of s1 == s3
// 2. Immutability - reference is mutable, instance is not - leads to poor performance
String s = "";
for(int i = 1; i <= 100; i++){
    s += i;
}
// Not O(N), but O(N^2) !!!
```

## String Builder
```java
StringBuilder sb = new StringBuilder("hello");
System.out.println(sb.charAt(0));
sb.setCharAt(0, 'j'); // jello
sb.insert(2, 'g'); // jegllo
sb.deleteCharAt(2); // jello
sb.append(" yummy"); // jello yummy
sb.length();
```

## ArrayList
```java
ArrayList<Integer> list = new ArrayList<>();
list.size();
list.add(10);
list.add(20);
list.add(30);
list.add(1, 100);
list.get(0);
list.set(1, 1000);
list.remove(1);

for(int a: list){
    System.out.println(a);
}
```
