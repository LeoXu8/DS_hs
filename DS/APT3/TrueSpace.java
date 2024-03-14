
public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long totalSpaceUsed = 0;

        for (int fileSize : sizes) {
            int clustersNeeded = (fileSize + clusterSize - 1) / clusterSize;
            
            totalSpaceUsed += (long) clustersNeeded * clusterSize;
        }

        return totalSpaceUsed;
    }

}

