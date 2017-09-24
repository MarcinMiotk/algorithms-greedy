https://www.hackerrank.com/challenges/maximum-perimeter-triangle


Trójkąt o maksymalnym możliwym obwodzie.
Jeśli jest wiele trójkątów o max. obwodzie, wybieram ten, który ma najdłuższy jakiś bok.
Jeśli jest takich wiele, to wybieram ten który ma najdłuższy minimalny bok.

Przykład
========

5
1 1 1 3 3

Output: 1 3 3

(1,1,1)
(1,3,3)

==================
Tworzę wszystkie kombinacje 3 elementowe bez powtórzeń ze zbioru 5 elementowego.

0,1,2,3,4
1,1,1,3,3

0,1,2
0,1,3
0,1,4
0,2,3
0,2,4
0,3,4
1,2,3
1,2,4
1,3,4
2,3,4


5! / 3!*2! = 1*2*3*4*5 / 1*2*3 *1*2 = 4*5 /1*2 =2*5 = 10


10! / 3! 7!
    =   8*9*10 / 1*2*3 = 
    

48*49*50/6 =   