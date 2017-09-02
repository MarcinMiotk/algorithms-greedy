https://www.hackerrank.com/challenges/luck-balance


1. Sumuję wszystkie L, które mają importance=0.
2. Chcę mieć pozostałe L posortowane, ale nie znam długości tablicy.
   Wybrałem PriorityQueue, bo ma O(1) przy pobieraniu kolejnych najmniejszych
   wartosci.
3. Ustalam ide L nalezy odjąć - będzie to ilość pobrań z kolejki w celu odjęcia wartości L od sumy MAX.
4. Pozostałe elementy z kolejki dodaję do sumy.

