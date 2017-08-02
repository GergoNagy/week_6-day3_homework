import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;

public class DriverTest {

  Driver driver;
  Driveable bike;

  @Before
  public void before(){
    bike = new QuadBike(100, 5);
    driver = new Driver("Bob", bike);
  }

  @Test
  public void hasName(){
    assertEquals("Bob", driver.getName());
  }
}