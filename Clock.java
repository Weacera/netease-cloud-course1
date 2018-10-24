package hello;


class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display seconds = new Display(60);
	public Clock(int hour,int minute,int seconds)
	{
		this.hour.value = hour;
		this.minute.value = minute;
		this.seconds.value = seconds;
		
		
	}
	public void tick()
	{
		if(minute.value==0) {
			
		
		seconds.increase();
		if(seconds.getValue() ==0)
		{
			minute.increase();
		}

		}
		
		
		else
		{
			seconds.increase();
			if(seconds.getValue() ==0)
			{
				minute.increase();
			}

			if(minute.getValue() ==0)
			{
				hour.increase();
			}
		}
			
	}
	public String toString()
	{
		String time = "";
		String time1 = "";
		String time2="";
		String time3 ="";
		if(hour.getValue()<10)
		{
			time1 ="0"+hour.getValue();
		}
		else
			time1+=hour.getValue();
		if(minute.getValue()<10)
		{
			time2 ="0"+minute.getValue();
		}
		else
			time2+=hour.getValue();
		if(seconds.getValue()<10)
		{
			time3 ="0"+seconds.getValue();
		}
		else
			time3+=seconds.getValue();
		time = time1+":"+time2+":"+time3;
		return time;
	}
//	public void start()
//	{
//		while(true)
//		{
//			seconds.increase();
//			if(seconds.getValue() ==0)
//			{
//				minute.increase();
//			}
//			if(minute.getValue() ==0)
//			{
//				hour.increase();
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
	}
