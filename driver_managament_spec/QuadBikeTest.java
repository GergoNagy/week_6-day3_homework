import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike bike;

  @Before
  public void before(){
    bike = new QuadBike(100, 5);
  }

  @Test
  public void driveDistanceReturnTime(){
    assertEquals(1, bike.driveTime(100));
  }
}