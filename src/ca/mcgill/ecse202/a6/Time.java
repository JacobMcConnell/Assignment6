package ca.mcgill.ecse202.a6;

// the System library is imported in order to obtain the elapsed time since the unix epoch.
import java.lang.System;

public class Time implements Comparable<Time>, Cloneable {

  private long ElapsedTime;

  /**
   * This is a no arg constructor that creates a Time object and assigns its elapsed time to the
   * time in seconds since the unix epoch.
   */
  public Time() {
    ElapsedTime = System.currentTimeMillis() / 1000;
  }

  /**
   * This is a constructor that creates a Time object and assigns its elapsed time in seconds, using
   * the number of hours, minutes, and seconds passed by the user as arguments.
   * 
   * @param hour: this is the hour of the time object the user wishes to create.
   * @param minute: this is the minute of the time object that the user wishes to create.
   * @param seconds: this is the second of the time object that the user wishes to create.
   */
  public Time(int hour, int minute, int seconds) {
    ElapsedTime = hour * 3600 + minute * 60 + seconds;
  }

  /**
   * This is a constructor that creates a tiem object and assigns its elapsed time in seconds to the
   * elapsed time passed by the user as an argument.
   * 
   * @param ElapsedTime: this is the elapsed time of the time object the user wishes to create.
   */
  public Time(long ElapsedTime) {
    this.ElapsedTime = ElapsedTime;
  }

  /**
   *
   * @return This method returns the number of hours of the time object that invokes this method.
   */
  public long getHour() {
    return (ElapsedTime / 3600) % 24;
  }

  /**
   * @return This method returns the number of minutes of the time object that invokes this method.
   */
  public long getMinute() {
    return (ElapsedTime / (60)) % 60;
  }

  /**
   * @return This method returns the number of seconds of the time object that invokes this method.
   */
  public long getSecond() {
    return ElapsedTime % 60;
  }

  /**
   * @return This method returns the time elapsed of the time object that invokes this method.
   */
  public long getSeconds() {
    return ElapsedTime;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString() This method returns a String description of the time object
   * that invokes it.
   */
  @Override
  public String toString() {
    return this.getHour() + " hours " + this.getMinute() + " minutes " + this.getSecond()
        + " seconds";
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Comparable#compareTo(java.lang.Object) This method allows for two objects to be
   * compared, and this method makes use of the Comparable interface.
   */
  @Override
  public int compareTo(Time t) {
    return (int) (this.ElapsedTime - t.ElapsedTime);

  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#clone() This method allows for a Time object to be cloned, and its
   * implementation allows for the time class to make use of the Cloneable interface.
   */
  @Override
  public Object clone() {
    try {
      return super.clone();
    }

    catch (CloneNotSupportedException ex) {
      System.out.println("This clone attempt failed. Please try again.");
      return null;
    }

  }



}
