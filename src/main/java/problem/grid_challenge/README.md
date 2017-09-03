https://www.hackerrank.com/challenges/grid-challenge


1. Zmieniam litery na liczby.
Mam na przykład

4   8   3   1
7   4   5   2
4   5   6   7
8   9   5   2

2. Sortuję pierwszy wiersz


1   3   4   8

7   4   5   2
4   5   6   7
8   9   5   2

2. Sortuję drugi wiersz

1   3   4   8
2   3   5   7      

4   5   6   7
8   9   5   2

Rozwiązanie: NIE SPELNIA WARUNKU, bo liczba 7 jest mniejsza od 8.
Można więc przerwać dalsze liczenie.


Pytanie - czy trzeba koniecznie sortować cały wiersz, żeby dokonać porównania?

1   3   4   8
1   3   5   7      

Po pierwsze, wystarczyło sprawdzić, czy wartość minimalna w kolejnym wierszu jest >= od wartości minimalnej
w wierszu wyżej. Następnie wartość maksymalna w kolejnym wierszy powinna być >= od wartości maksymalnej
w wierszy wyżej. Można więc narysować histogram każdego wiersza


Numer           Wystąpień w [0]         Wystąpień w [1]
0               0                       0
1               1                       0
2               0                       1
3               1                       1
4               1                       0
5               0                       1
6               0                       0
7               0                       1
8               1                       0
9               0                       0
10              0                       0


Następnie robię sumowanie


Im niżej schodzę tym bardziej dodaję sumę ...


Numer           Wystąpień w [0]         Wystąpień w [1]
0               0                       0
1               1                       0
2               1                       1
3               2                       2
4               3                       2
5               3                       3
6               3                       3
7               3                       4
8               4                       4
9               4                       4
10              4                       4




Zaczynam od Wystąpień w [1]. Gdy gdzieś w [1] jest liczba większa na tym samym indeksie co w [0], to wtedy
grid NIE MA rozwiązania.








Mam

4   1   0   2   3
5   6   7   8   9
14  11  12  10  13
19  17  15  16  18
23  24  22  20  21

Tworzę mapę     [0]         [1]         [2]         [3]         [4]
0                1          0
1                2          0
2                3          0
3                4          0
4                5          0
5                5          1
6                5          2
7                5          3
8                5          4
9                5          5
10               5          5             1                    
11               5          5             2
12               5          5             3
13               5          5             4
14               5          5             5
