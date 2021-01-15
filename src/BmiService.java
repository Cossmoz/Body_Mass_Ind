public class BmiService {
    public float calculate (float weight, float height) {
        float bodyMassIndex = (float) (weight / Math.pow(height, 2));
        return bodyMassIndex;
    }
}
