import com.driver.RWOnly;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();
    obj.setName("hello");
    obj.getName();
  }
}