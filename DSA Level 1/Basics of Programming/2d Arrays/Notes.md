# Notes

## 058-matrix-multiplication.java
```java
int[][] C = new int[n1][m2];
for (int i = 0; i < n1; i++) {
    C[i] = new int[m2];
    for (int j = 0; j < m2; j++) {
        C[i][j] = 0;
        for (int k = 0; k < m1; k++) {
            C[i][j] += A[i][k] * B[k][j];
        }
    }
}
```

## 063-ring-rotate.java
