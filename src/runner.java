//Задача 1
//Напишите метод для поиска числа в заранее отсортированном по убыванию списке
// различных целых чисел.
//
//Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
//
//Используйте в качестве образца задачу 2 из классной работы.

import java.util.ArrayList;
import java.util.List;

public class runner {

  public static void main(String[] args) {
    List<Integer> test = new ArrayList<>();
    test.add(9);
    test.add(7);
    test.add(5);
    test.add(3);
    test.add(1);

    int target = 1;

    int index = findIndexOf(test, target);

    System.out.println(index);
  }

  private static int findIndexOf(List<Integer> ListOfData, int target) {
    return -1;
  }
}
