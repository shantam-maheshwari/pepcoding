# Notes

## 040-any-base-to-any-base.java
```java
int valueInDestBase = getValueInBase(getValueIndecimal(n, sourceBase), destBase);

public static int getValueInBase(int n, int b) {
    int valueInBase = 0;
    int powerOf10 = 1;

    while (n != 0) {
        int rem = n % b;
        valueInBase += powerOf10 * rem;
        powerOf10 *= 10;
        n /= b;
    }
    return valueInBase;
}

public static int getValueIndecimal(int n, int b) {
    int valueInDecimal = 0;
    int powerOfBase = 1;

    while (n != 0) {
        int rem = n % 10;
        valueInDecimal += rem * powerOfBase;
        powerOfBase *= b;
        n /= 10;
    }
    return valueInDecimal;
}
```

## 043-any-base-multiplication.java
```java
int product = getProduct(b, n1, n2);

public static int getProduct(int b, int n1, int n2) {
    int sum = 0;
    int powerOf10 = 1;
    while (n2 != 0) {
        int digit = n2 % 10;
        n2 /= 10;
        int productWithSingleDigit = getProductWithSingleDigit(b, n1, digit);
        sum = getSum(b, sum, productWithSingleDigit * powerOf10);
        powerOf10 *= 10;
    }
    return sum;
}

public static int getProductWithSingleDigit(int b, int n1, int d) {
    int product = 0;
    int p;
    int c = 0;
    int powerOf10 = 1;
    while (n1 != 0 || c != 0) {
        int digit = n1 == 0 ? 0 : n1 % 10;
        n1 /= 10;
        p = (digit * d + c) % b;
        c = (digit * d + c) / b;
        product += p * powerOf10;
        powerOf10 *= 10;
    }
    return product;
}

public static int getSum(int b, int n1, int n2) {
    int sum = 0;
    int s;
    int c = 0;
    int powerOf10 = 1;
    while (n1 != 0 || n2 != 0 || c != 0) {
        int d1 = n1 == 0 ? 0 : n1 % 10;
        n1 /= 10;
        int d2 = n2 == 0 ? 0 : n2 % 10;
        n2 /= 10;
        s = (d1 + d2 + c) % b;
        c = (d1 + d2 + c) / b;
        sum += s * powerOf10;
        powerOf10 *= 10;
    }
    return sum;
}
// Learnings:
// while adding products of n1 with digits of n2,
// make sure to shift the products by one position
```

## 052-subarray-problem.java
```java
for (int beg = 0; beg < n; beg++) {
    for (int end = beg; end < n; end++) {
        for (int i = beg; i <= end; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
```

## 054-first-index-and-last-index.java
```java
// Binary Search
int left = 0;
int right = n - 1;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (A[mid] < d) {
        left = mid + 1;
    } else {
        right = mid;
    }
}
// Learnings:
// when updating right = mid, use mid = left + (right - left) / 2
// i.e. choose left middle element in case of even sized subarray A[left:right]

// when updating left = mid, use mid = left + (right - left + 1) / 2
// i.e. choose right middle element in case of even sized subarray A[left:right]
```

## 055-subsets-of-array.java
```java
int powerOf2 = (int) Math.pow(2, n);
for (int i = 0; i < powerOf2; i++) {
    String subset = "";
    int binary = i;
    for (int j = n - 1; j >= 0; j--) {
        if (binary % 2 == 0) {
            // don't include in subset
        } else {
            // include in subset
        }
        binary /= 2;
    }
    System.out.println(subset);
}
```
