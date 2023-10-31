public class App {
    public static void main(String[] args) throws Exception {
        int array[] = new int[3];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
};