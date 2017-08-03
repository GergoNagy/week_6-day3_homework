package driver_management;
import behaviours.*;

public class Driver {
  private String name;
  private Driveable drive;

  public Driver(String name, Driveable drive){
    this.name = name;
    this.drive = drive;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getDrive(){
    return this.drive;
  }

  public int driveTime(int distance){
    return this.drive.driveTime(distance);
  }

}