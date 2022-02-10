# Notes

## 003-is-a-number-prime.java
```java
boolean isPrime = true;

if (n == 1) {
    isPrime = false;
} else if (n == 2) {
    // isPrime = true;
} else if (n % 2 == 0) {
    isPrime = false;
} else {
    for (int divisor = 2; divisor * divisor <= n; divisor += 2) {
        if (n % divisor == 0) {
            isPrime = false;
            break;
        }
    }
}
// Learnings:
// use divisor * divisor <= n instead of divisor <= Math.sqrt(n)
// if n > 2 and n not even, then only check odd factors
```

## 004-print-all-primes-till-n.java
```java
// Sieve of Eratosthenes
boolean[] isComposite = new boolean[high + 1];
for (int divisor = 2; divisor * divisor <= high; divisor++) {
    if (isComposite[divisor] == false) {
        for (int i = 2; i * divisor <= high; i++) {
            isComposite[i * divisor] = true;
        }
    }
}
```

## 005-print-fibonacci-numbers-till-n.java
```java
// Fibonacci series: a, b, c, ...
int a = 0;
int b = 1;
for (int i = 1; i <= n; i++) {
    System.out.println(a);
    int c = a + b;
    a = b;
    b = c;
}
```

## 009-rotate-a-number.java
```java
int numberOfDigits = (int) Math.log10(n) + 1;
k %= numberOfDigits;
if (k < 0) {
    k += numberOfDigits;
}

// n = <head...><tail>
for (int i = 0; i < k; i++) {
    int tail = n % 10;
    int head = n / 10;
    int multiplier = (int) Math.pow(10, numberOfDigits - 1);
    n = tail * multiplier + head;
}
```

## 011-gcd-and-lcm.java
```java
int product = num1 * num2;

// Euclid's algorithm
while (num2 != 0) {
    int rem = num1 % num2;
    num1 = num2;
    num2 = rem;
}
int gcd = num1;

int lcm = product / gcd;
```

## 012-prime-factorisation-of-a-number.java
```java
for (int divisor = 2; divisor * divisor <= n; divisor++) {
    while (n % divisor == 0) {
        System.out.print(divisor + " ");
        n /= divisor;
    }
}
if (n != 1) {
    System.out.println(n);
}
// Learnings:
// if n != 1 afterwards, n itself is prime
```

## 014-pythagorean-triplet.java
```java
int max = Math.max(a, Math.max(b, c));
int sumOfSquares = a * a + b * b + c * c;
if (2 * max * max == sumOfSquares) {
    System.out.println(true);
} else {
    System.out.println(false);
}
```

## 015-max-min-2.java
```java
int max1 = A[0];
int max2 = Integer.MIN_VALUE;
int min1 = A[0];
int min2 = Integer.MAX_VALUE;

for (int i = 1; i < n; i++) {
    if (A[i] > max1) {
        max2 = max1;
        max1 = A[i];
    } else if (A[i] > max2) {
        max2 = A[i];
    }
    if (A[i] < min1) {
        min2 = min1;
        min1 = A[i];
    } else if (A[i] < min2) {
        min2 = A[i];
    }
}
System.out.println(max2 + " " + min2);
// Learnings:
// checking A[i] > largest and A[i] < smallest are not sufficient
```
