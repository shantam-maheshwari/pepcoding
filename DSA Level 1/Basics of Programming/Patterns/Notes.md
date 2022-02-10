# Notes

## Triangular, Diamond, Hourglass
* use variables for number of spaces and stars in each row
    * e.g leftSpaceLength, middleSpaceLength, starLength, etc.
* in case of symmetric shapes, use 2 for loops
```java
int leftSpaceLength = ...;
int starLength = ...;
for(int i = 1; i <= n; i++){
    for (int j = 1; j <= spaceLength; j++) {
        pattern += "\t";
    }
    for (int j = 1; j <= starLength; j++) {
        pattern += "*\t";
    }
    pattern += "\n";
    if(i <= n/2){
        starLength--;
        spaceLength += 2;
    } else{
        starLength++;
        spaceLength -= 2;
    }
}
```

## Rectangular with diagnols
* use i == j, i + j == n + 1, etc.
```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if (i == j || i + j == n + 1) {
            pattern += "*\t";
        } else {
            pattern += "\t";
        }
    }
    pattern += "\n";
}
```

## 029-pattern-13.java
```java
// C(i, j+1) = C(i, j) * (i-j)/(j+1)
for (int i = 0; i < n; i++) {
    int C_ij = 1;
    for (int j = 0; j <= i; j++) {
        System.out.print(C_ij + "\t");
        C_ij = C_ij * (i - j) / (j + 1);
    }
    System.out.println();
}
```
