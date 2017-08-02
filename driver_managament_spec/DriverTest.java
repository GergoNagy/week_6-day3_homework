import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;

public class DriverTest {

  Driver driver;
  QuadBike bike;

  @Before
  public void before(){
    bike = new QuadBike(100, 5);
    driver = new Driver("Bob", bike);
  }

  @Test
  public void hasName(){
    assertEquals("Bob", driver.getName());
  }

  @Test
  public void hasQuadBike(){
    QuadBike drive = (QuadBike) driver.getDrive();
    assertEquals(100, drive.averageSpeed());
  }

  @Test
  public void  hasDriveTime(){
    // QuadBike bike = (QuadBike) driver.getDrive();
    assertEquals(10, bike.driveTime(100));
  }

}