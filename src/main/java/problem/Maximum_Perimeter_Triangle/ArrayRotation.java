package problem.Maximum_Perimeter_Triangle;

class ArrayRotation {

    static boolean rotate(int[] indexes, int max) {
        int end = indexes.length-1;
        do {
            if(indexes[end]<max) {
                indexes[end]++;

                boolean keepRotating = false;

                for(int afterRotated = end+1; afterRotated<indexes.length; afterRotated++) {
                    indexes[afterRotated] = indexes[afterRotated-1]+1;
                    if(indexes[afterRotated]>max) {
                        end--;
                        keepRotating = true;
                    }
                }

                if(!keepRotating) {
                    break;
                }
            } else {
                end--;
            }
        } while(end>=0);
        if(end<0) {
            return false;
        } else {
            return true;
        }
    }
}
