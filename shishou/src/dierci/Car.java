package dierci;

import java.util.*;

 class Car {
	private String name;
	private int speed;
	private double nowCorner;
	public Car (String name,int speed,double nowCorner)
	{
		super();
		this.name = name;
		this.speed = speed;
		this.nowCorner = nowCorner;	
	}

	public String toString()
	{
		return "Car [nowCorner = " + nowCorner + ",name =" +name +", speed =" +speed +"]";
		
	}
	 
	public String getname()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getSpeed()
	{
		return speed;
	}
	public double getNowCorner()
	{
		return nowCorner;
	}
	public void setNowCorner(double nowConer)
	{
		this.nowCorner = nowConer;
	}
	
	public void stop()
	{
		changeSpeed(0);
	}
	public void changeSpeed(int NowSpeed)
	{
		speed = NowSpeed;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Car d = new Car(s.nextLine(),s.nextInt(),s.nextDouble());
		System.out.println(d.toString());
		System.out.println("�ı��ٶ�");
		d.changeSpeed(s.nextInt());
		System.out.println("֮���״̬Ϊ��");
		System.out.println(d.toString());
		d.stop();
		System.out.println("ͣ��");
		System.out.println(d.speed);
		s.close();
	}
}

