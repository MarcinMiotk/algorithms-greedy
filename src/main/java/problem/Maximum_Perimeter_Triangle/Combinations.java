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

    public void forEach(Consumer<int[]> consumer) {
        if(elementsToChooseFrom==2 && elementsChoosen==2) {
            consumer.accept(new int[] { 0, 1 });
        }
        if(elementsToChooseFrom==3 && elementsChoosen==2) {
            // 0 1 2
            consumer.accept(new int[] { 0, 1 });
            consumer.accept(new int[] { 0, 2 });
            consumer.accept(new int[] { 1, 2 });
        }
        if(elementsToChooseFrom==4 && elementsChoosen==2) {
            // 0 1 2 3
            consumer.accept(new int[] { 0, 1 });
            consumer.accept(new int[] { 0, 2 });
            consumer.accept(new int[] { 0, 3 });
            consumer.accept(new int[] { 1, 2 });
            consumer.accept(new int[] { 1, 3 });
            consumer.accept(new int[] { 2, 3 });
        }

        if(elementsToChooseFrom==4 && elementsChoosen==3) {
            // 0 1 2 3
            consumer.accept(new int[] { 0, 1, 2 });
            consumer.accept(new int[] { 0, 1, 3 });
            consumer.accept(new int[] { 0, 2, 3 });
            consumer.accept(new int[] { 1, 2, 3 });
        }
        if(elementsToChooseFrom==5 && elementsChoosen==3) {
            forEachNew(consumer);
        }
    }


    private boolean isEqual(int[] expected, int[] current) {
        if(expected.length == current.length) {
            for(int e=0; e<expected.length; e++) {
                if(expected[e] != current[e]) {
                    return false;
                }
            }
        }
        return true;
    }


    private boolean rotate(int[] indexes, int max) {
        return ArrayRotation.rotate(indexes, max);
    }

    public void forEachNew(Consumer<int[]> consumer) {
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
