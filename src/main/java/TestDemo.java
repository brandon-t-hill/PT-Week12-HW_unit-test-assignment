import java.util.Random;

public class TestDemo {
  public int addPositive(int num1, int num2) {
    if ((num1 > 0) && (num2 > 0)) {
      return num1 + num2;
    }
    else {
      throw new IllegalArgumentException("Both parameters must be positive!");
    }
  }
  
  public int randomNumberSquared() {
    int root = getRandomInt();
    return root * root;
  }
  
  int getRandomInt() {
    Random random = new Random();
    return random.nextInt(10)+1;
  }
}
