public class Time
{
  // TODO: Part A - put your attributes here
  private int hours;
  private int minutes;
  private int seconds;


  // TODO: Part B - create your non-default constructor
  public Time(int hours, int minutes, int seconds) {
    if (hours >= 0 && hours <= 23) {
      this.hours = hours;
    } else {
      this.hours = 0;
    }

    if (minutes >= 0 && minutes <= 59) {
      this.minutes = minutes;
    } else {
      this.minutes = 0;
    }

    if (seconds >= 0 && minutes <= 59) {
      this.seconds = seconds;
    } else {
      this.seconds = 0;
    }
  }
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */


  // TODO: Part C - create your default constructor
  public Time() {
    hours = 0;
    minutes = 0;
    seconds = 0;
  }


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: adds a 0 infront if it is less than 10
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
  }

  // TODO: Part F - write the tick method
  public void tick()
  {
    seconds+=1;
    if (seconds >= 60) {
      seconds-=60;
      minutes+=1;
    }

    if (minutes >= 60) {
      minutes-=60;
      hours+=1;
    }

    if (hours >= 24) {
      hours = 0;
    }

  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {
    this.hours += offset.hours;  
    this.minutes += offset.minutes; 
    this.seconds += offset.seconds; 

    this.minutes+=(this.seconds/60);
    this.seconds = this.seconds % 60;
    this.hours+=(this.minutes/60);
    this.minutes = this.minutes % 60;;
    this.hours = this.hours % 24;
  }
}
