class Demo
{public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int week=5;
		switch(week)
			{
			case 1:
			System.out.println(week+"对应的是星期一。");
				break;
			case 2:
			System.out.println(week+"对应的是星期二。");
				break;
			case 3:
			System.out.println(week+"对应的是星期三。");
				break;
			case 4:
			System.out.println(week+"对应的是星期四。");
				break;
			case 5:
			System.out.println(week+"对应的是星期五。");
				break;
			case 6:
			System.out.println(week+"对应的是星期六。");
				break;
			case 7:
			System.out.println(week+"对应的是星期天。");
				break;
			default:
			System.out.println(week+"没有对应的星期!");
				break;
			}
	}
}
