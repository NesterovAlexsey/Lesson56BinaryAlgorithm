//Задача 1
//Напишите метод для поиска числа в заранее отсортированном по убыванию списке
// различных целых чисел.
//
//Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
//
//Используйте в качестве образца задачу 2 из классной работы.

//Plan max:
//+create binary search
//+add method description
//+create unit-tests
//create separate method to split ArrayList and LinkedList

import java.util.ArrayList;
import java.util.List;

public class runner {

  /**
   * Binary method for find target element in a pre-sorted descending list of distinct numbers.
   *
   * @param listOfData - the list in which the value is searched
   * @param target     - value to be found
   * @return - index of the searched component in the list or return -1 if the element is not on the
   * list
   */
  public static int findIndexOf(List<Integer> listOfData, int target) {
    int left = 0;
    int right = listOfData.size() - 1;
    while (left < right) {
      int center = (left + right) / 2;
      if (listOfData.get(center) == target) {
        return center;
      }

      if (listOfData.get(center) < target) {
        right = center;
      } else {
        left = center + 1;
      }
    }

    if (left < listOfData.size() && listOfData.get(left) == target) {
      return left;
    }

    return -1;
  }

  public static int checkListType(List<Integer> listOfData, int target) {
    int result;
    if (listOfData instanceof ArrayList) {
      result = findIndexOf(listOfData, target);
    } else {
      result = listOfData.indexOf(target);
    }
    return result;
  }
}
