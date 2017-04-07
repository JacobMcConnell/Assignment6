package ca.mcgill.ecse202.a6;
import java.lang.System;
public class Time implements Comparable<Time>, Cloneable {
long ElapsedTime;

public Time()  {
ElapsedTime=System.currentTimeMillis()/1000;
}

public Time(int hour, int minute, int seconds){
 ElapsedTime=hour*3600+minute*60+seconds;
}

public Time( long ElapsedTime) {
  this.ElapsedTime=ElapsedTime;
}

public long getHour() {
  return (ElapsedTime/3600)% 24;
}

public long getMinute() {
  return (ElapsedTime/(60))%60;
}

public long getSecond() {
  return ElapsedTime%60;
}

public long getSeconds(){
  return ElapsedTime;
}

@Override
public String toString(){
  return this.getHour()+" hours "+this.getMinute()+ " minutes "+ this.getSecond()+ " seconds";
}

@Override
public int compareTo(Time t) {
  return (int) (this.ElapsedTime-t.ElapsedTime);
  
}

@Override 
public Object clone() {
  try {
    return super.clone();
  }
  
  catch (CloneNotSupportedException ex){
   return null;
  }
  
}



}
