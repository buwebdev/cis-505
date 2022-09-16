class Fan
{
 public static final int SLOW=1,STOPPED=0,MEDIUM=2,FAST=3;
 boolean f_on;
 int speed;
 String color;
 double radius;
 Fan()
 {
  f_on=false;
  speed=STOPPED;
  color="WHITE";
  radius=6;
 }
 Fan(int speed,double radius,String color,boolean f_on)
 {
  this.f_on=f_on;
  this.speed=speed;
  this.color=color;
  this.radius=radius;
 } 
 void Showdata()
 {
  if(f_on==true)
  {
   System.out.println("Fan is on \n the speed is ="+speed+"\n the color is ="+color+"\n the radius is ="+radius);
  }
  else
  {
   System.out.println("Fan is off \n the color of fan is ="+color+"\n the radius of fan is ="+radius);
  }
 }
 public static void main(String [] args)
{
 Fan objt = new Fan();
 Fan objt1 = new Fan(MEDIUM,8,"bLUE",true);
 objt.Showdata();
 objt1.Showdata();
}
}
