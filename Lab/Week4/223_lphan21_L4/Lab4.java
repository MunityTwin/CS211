public class Lab4 {
    public float[] average(int[][] data) {
        float[] result = new float[data[0].length];
        
        // Iterate through the array
        for (int i = 0; i < data[0].length; ++i) {
            int sum = 0;
            for (int j = 0; j < data.length; ++j) {
                sum += data[j][i];
            }
            result[i] = sum / (float)data.length;
        }

        return result;
    }
}
