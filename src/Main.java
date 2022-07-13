public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("Индекс массы тела равен " + service.calculate(1.86, 70));

    }

}

