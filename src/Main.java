public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //specify the weight in kilograms
        //specify the height in meters
        float bodyMassIndex = service.calculate(84.7F, 1.72F);
        System.out.format("Индекс массы тела равен " + "%.2f",bodyMassIndex);
    }
}
