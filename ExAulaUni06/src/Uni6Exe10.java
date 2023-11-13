import java.util.Scanner;

public class Uni6Exe10 {
  private Scanner scanner = new Scanner(System.in);

  private Uni6Exe10() {
    // final int arraySize = 50;
    // int array[] = new int[arraySize];
    int array[] = { 200, 300, 400, 500, 600 };
    int arrayElementQuantity = array.length;
    int option;

    do {
      showOptions();
      option = scanner.nextInt();
      System.out.println("--------------");
      switch (option) {
        case 1: // Include // B
          arrayElementQuantity = arrayInclude(array, arrayElementQuantity);
          break;
        case 2: // Search
          arraySearch(array, arrayElementQuantity);
          break;
        case 3: // Change
          arrayChange(array, arrayElementQuantity);
          break;
        case 4: // Exclude
          arrayElementQuantity = arrayExclude(array, arrayElementQuantity);
          break;
        case 5: // Show // A
          arrayShow(array, arrayElementQuantity);
          break;
        case 6: // Sort
          arraySort(array);
          break;
        case 7: // Invert
          arrayInvert(array, arrayElementQuantity);
          break;
        case 8: // Exit
          arrayExit();
          break;

        default:
          System.out.println("Menu option WRONG!");
          break;
      }
      System.out.println("--------------");
    } while (option != 8);
  }

  private void showOptions() {
    System.out.println("Select one of the above options: ");
    System.out.println("1 - Include value in array.");
    System.out.println("2 - Search value in array.");
    System.out.println("3 - Change value in array index.");
    System.out.println("4 - Exclude valeu in array index.");
    System.out.println("5 - Show all values in array.");
    System.out.println("6 - Sort array.");
    System.out.println("7 - Invert array.");
    System.out.println("8 - Exit menu.");
    System.out.print("Option: ");
  }

  private int arrayInclude(int array[], int arrayElementQuantity) {
    if (arrayElementQuantity < array.length) {
      System.out.print("Insert the new value: ");
      array[arrayElementQuantity] = scanner.nextInt();
      arrayElementQuantity++;
    } else {
      System.out.println("Array full");
    }

    return arrayElementQuantity;
  }

  private void arraySearch(int array[], int arrayElementQuantity) {
    System.out.println("Write the value to search:");
    int valueToSearch = scanner.nextInt();
    int indexFounded = iteratingArray(array, arrayElementQuantity, valueToSearch);

    if (indexFounded != -1) {
      System.out.println("Value founded! Index of element: " + indexFounded + 1);
    } else {
      System.out.println("Value not founded!");
    }
  }

  private void arrayChange(int array[], int arrayElementQuantity) {
    System.out.println("Write the value to search:");
    int valueToSearch = scanner.nextInt();
    int indexFounded = iteratingArray(array, arrayElementQuantity, valueToSearch);

    if (indexFounded != -1) {
      System.out.println("New value: ");
      array[indexFounded] = scanner.nextInt();
    } else {
      System.out.println("Value not exist.");
    }

  }

  private int arrayExclude(int array[], int arrayElementQuantity) {
    System.out.println("Write the value to delete:");
    int valueToDelete = scanner.nextInt();
    int indexFounded = iteratingArray(array, arrayElementQuantity, valueToDelete);

    if (indexFounded != -1) {
      for (int i = indexFounded; i < arrayElementQuantity; i++) {
        array[i] = array[i + 1];
      }
      arrayElementQuantity--;
    } else {
      System.out.println("Value not founded");
    }
    return arrayElementQuantity;
  }

  private void arrayShow(int array[], int arrayElementQuantity) {
    if (arrayElementQuantity == 0)
      System.out.println("Array empty");

    for (int i = 0; i < arrayElementQuantity; i++) {
      System.out.println("Array index: " + (i + 1) + ". Valeu: " + array[i]);
    }
  }

  private void arraySort(int array[]) {

  }

  private void arrayInvert(int array[], int arrayElementQuantity) {
    int auxArray[] = new int[arrayElementQuantity];
    int auxArrayIndex = 0;

    for (int i = arrayElementQuantity - 1; i >= 0; i--) {
      auxArray[auxArrayIndex] = array[i];
      auxArrayIndex++;
    }

    for (int i = 0; i < arrayElementQuantity; i++) {
      array[i] = auxArray[i];
    }

  }

  private void arrayExit() {
    System.out.println("Bye bye");
  }

  private int iteratingArray(int[] array, int arrayElementQuantity, int valueToSearch) {
    int indexFounded = -1;
    for (int i = 0; i < arrayElementQuantity; i++) {
      if (array[i] == valueToSearch) {
        indexFounded = i;
      }
    }
    return indexFounded;
  }

  public static void main(String[] args) {
    new Uni6Exe10();
  }

}