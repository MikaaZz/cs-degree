public class Constructor {
 private Constructor() { // Constructor, same name as the class
  int number = 17;
  int array[] = { 10, 20, 30 };

  testLecture(number, array);
  System.out.println(array[0]);
 }

 private void testLecture(int number, int array[]) {
  System.out.println(number);
  array[0] = 50;
  number = 2;
 }

 public static void main(String[] args) {
  new Constructor();
 }
}
