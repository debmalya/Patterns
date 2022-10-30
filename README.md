# Patterns

## Star Figure

* [Star Figure](src/main/java/patterns/StarFigure.java)

This one I first saw in [Stepik](https://stepik.org/lesson/43241/step/1?adaptive=true&unit=21305).
Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements, by filling it with "." symbols (each element of the matrix is a string containing a single symbol). Then fill the middle row of the matrix, the middle column, and the main and the secondary diagonals with the "*" symbols. As a result, all "*"s in the array must form the star figure. Output this matrix; elements of the array should be space separated.

Sample Input:
5

Sample Output:

```
* . * . *
. * * * .
* * * * *
. * * * .
* . * . *
```


Sample Input:
15

Sample Output:

```
* . . . . . . * . . . . . . * 
. * . . . . . * . . . . . * . 
. . * . . . . * . . . . * . . 
. . . * . . . * . . . * . . . 
. . . . * . . * . . * . . . . 
. . . . . * . * . * . . . . . 
. . . . . . * * * . . . . . . 
* * * * * * * * * * * * * * * 
. . . . . . * * * . . . . . . 
. . . . . * . * . * . . . . . 
. . . . * . . * . . * . . . . 
. . . * . . . * . . . * . . . 
. . * . . . . * . . . . * . . 
. * . . . . . * . . . . . * . 
* . . . . . . * . . . . . . * 
```