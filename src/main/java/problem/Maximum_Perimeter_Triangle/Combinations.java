package problem.Maximum_Perimeter_Triangle;

import java.lang.reflect.Array;
import java.util.function.Consumer;

class Combinations {


    public static Combinations combinationsWithoutRepetitions(int elementsToChooseFrom, int elementsChoosen) {
        if(elementsToChooseFrom<elementsChoosen) {
            throw new IllegalArgumentException("elementsToChooseFrom must be greater or equal to elementsChoosen");
        }
        return new Combinations(elementsToChooseFrom, elementsChoosen);
    }

    final int elementsToChooseFrom;
    final int elementsChoosen;

    public Combinations(int elementsToChooseFrom, int elementsChoosen) {
        this.elementsToChooseFrom = elementsToChooseFrom;
        this.elementsChoosen = elementsChoosen;
    }

    private boolean rotate(int[] indexes, int max) {
        return ArrayRotation.rotate(indexes, max);
    }

    public void forEach(Consumer<int[]> consumer) {
        final int[] indexes = new int[elementsChoosen];
        final int maxEdge = elementsToChooseFrom;
        for(int i=0; i<indexes.length; i++) {
            indexes[i] = i;
        }
        boolean keepWorking = true;
        do {
            consumer.accept(indexes);
            keepWorking = rotate(indexes, maxEdge-1);
        } while(keepWorking);
    }
}
