import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class findIndexOfTest {

  @Test
  public void expectedNormalConditions() {
    //arrange
    List<Integer> test = new ArrayList<>();
    test.add(9);
    test.add(7);
    test.add(5);
    test.add(3);
    test.add(1);

    int target1 = 1;
    int target2 = 9;

    //act
    int index1 = runner.findIndexOf(test, target1);
    int index2 = runner.findIndexOf(test, target2);

    //assert
    assertEquals(4, index1);
    assertEquals(0, index2);
  }

  @Test
  public void noTargetParameterInList() {
    //arrange
    List<Integer> test = new ArrayList<>();
    test.add(9);
    test.add(5);
    test.add(1);

    int target = 3;

    //act
    int index = runner.findIndexOf(test, target);

    //assert
    assertEquals(-1, index);
  }

  @Test
  public void emptyList() {
    //arrange
    List<Integer> test = new ArrayList<>();

    int target = 2;

    //act
    int index = runner.findIndexOf(test, target);

    //assert
    assertEquals(-1, index);
  }

  @Test
  public void negativeAndZeroTarget() {
    List<Integer> test = new ArrayList<>();
    test.add(9);
    test.add(7);
    test.add(0);
    test.add(-3);
    test.add(-12);

    int target1 = 0;
    int target2 = -12;

    //act
    int index1 = runner.findIndexOf(test, target1);
    int index2 = runner.findIndexOf(test, target2);

    //assert
    assertEquals(2, index1);
    assertEquals(4, index2);
  }
}
