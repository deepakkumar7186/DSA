class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;       // starting altitude
        int maxAltitude = 0;    // track the highest altitude
        
        for (int g : gain) {
            altitude += g;              // update current altitude
            maxAltitude = Math.max(maxAltitude, altitude); // update max
        }
        
        return maxAltitude;
    }
}