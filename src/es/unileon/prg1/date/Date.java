package programacion;

public class Date {
	int day;
	int month;
	int year;
	
	public Date() {
		day = 1;
		month = 1;
		year = 1;
	}
	
	public boolean isSameYear1(int year) {
		return(this.year==year);
	}
	public boolean isSameMonth1(int month) {
		return(this.month==month);
	}
	public boolean isSameDay1(int day) {
		return(this.day==day);
	}
	public boolean isSame1(int year,int month,int day) {
		return((this.year==year)&&(this.month==month)&&(this.day==day));
	}

	public int isSameYear(int year) {
		if(this.year==year)
		return 1;
		else
		return 0;
	}
	
	public int isSameMonth(int month) {
		if(this.month==month)
		return 1;
		else
		return 0;
	}
	
	public int isSameDay(int day) {
		if(this.day==day)
		return 1;
		else
		return 0;
	}
	
	public int isSame(int year, int month, int day) {
		if((this.year==year)&&(this.month==month)&&(this.day==day))
		return 1;
		else
		return 0;
	}
	
	public void NameMonth(int Month) {
		switch(month)
		{
		case 1: System.out.println("January");
			break;
		case 2: System.out.println("February");
			break;
		case 3: System.out.println("March");
			break;
		case 4: System.out.println("April");
			break;
		case 5: System.out.println("May");
			break;
		case 6: System.out.println("June");
			break;
		case 7: System.out.println("July");
			break;
		case 8: System.out.println("August");
			break;
		case 9: System.out.println("September");
			break;
		case 10: System.out.println("October");
			break;
		case 11: System.out.println("November");
			break;
		case 12: System.out.println("December");
			break;
		
		default:System.out.println("Error");
		}
	}
	
	public boolean CheckDay(int month, int day) {
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
			if((day<1)||(day>31)) {
				return false;
			}
			else { 
				return true;
			}
		}
		if((month==4)||(month==6)||(month==9)||(month==11)) {
			if((day<1)||(day>30)) {
				return false;
			}
			else { 
				return true;
			}
		}
		if((month==2)) {
			if((day<1)||(day>28)) {
				return false;
			}
			else { 
				return true;
			}
		}
		return true;	
		}

	public void NameSeason(int day, int month) {
			if (((day>=21)&&(month>=3))&&((day<21)&&(month<=6)))
			System.out.println("String");
			if (((day>=21)&&(month>=6))&&((day<23)&&(month<=9)))
			System.out.println("Summer");
			if (((day>=23)&&(month>=9))&&((day<21)&&(month<=12)))
			System.out.println("Autumn");
			if (((day>=21)&&(month>=12))&&((day<21)&&(month<=3)))
			System.out.println("Winter");
		}
		
	public void MonthLeft(int month) {
			int left;
			left=12-month;
			System.out.println("Quedan:"+ left + "meses.");
		}
	@SuppressWarnings("unused")	
	public void PrintDate() {
			int days=0;
			int months=0;
			
			int years=0;
		do{
			days=(int)Math.random()*31+1;
			months=(int)Math.random()*12+1;
			years=(int)Math.random()*2018+1;
		} 
			while (CheckDay(days,months)==false);
			System.out.println("La fecha es:"+ days + months);
		}
		
	public void DayLeft(int day, int month) {
			
			if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
				
				for(int i=day+1;i<=31;i++) {
				
				System.out.println(i + "del" + month);
				}
			}
			
			if((month==4)||(month==6)||(month==9)||(month==11)) {
				for(int i=day+1;i<30;i++) {
					
				System.out.println(i + "del" + month);
				}
			}
			
			if((month==2)) {
				for(int i=day+1;i<28;i++) {
				
				System.out.println(i + "del" + month);
				}
			}
		}
	
	public void SameOfDays(int month) {
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
			System.out.println("Los meses son: enero, marzo, mayo, julio, agosto, octubre, diciembre");
		}
		if((month==4)||(month==6)||(month==9)||(month==11)) {
			System.out.println("Los meses son: abril, junio, septiembre, noviembre");
		}
		if((month==2)) {
			System.out.println("El mes es : febrero");
		}
	}
		
	public void CountDays (int day, int month) {
		int dias=0;
		if(month==1) {
			dias=day;
		}
		if(month==2) {
			dias=31+day;
		}
		if(month==3) {
			dias=31+28+day;
		}
		if(month==4) {
			dias=31+28+31+day;
		}
		if(month==5) {
			dias=31+28+31+30+day;
		}
		if(month==6) {
			dias=31+28+31+30+31+day;
		}
		if(month==7) {
			dias=31+28+31+30+31+30+day;
		}
		if(month==8) {
			dias=31+28+31+30+31+30+31+day;
		}
		if(month==9) {
			dias=31+28+31+30+31+30+31+31+day;
		}
		if(month==10) {
			dias=31+28+31+30+31+30+31+31+30+day;
		}
		if(month==11) {
			dias=31+28+31+30+31+30+31+31+30+31+day;
		}
		if(month==12) {
			dias=31+28+31+30+31+30+31+31+30+31+30+day;
		}
		System.out.println("Los dias son:" + dias);
		
	}
		

	public void NumberOfAttempts(int day, int month){
		int days;
		int months;
		int count=0;
		days=0;
		months=0;
		
		while((days!=day)||(months!=month)) {
			while(CheckDay(day,months)==true) {
				days=(int)Math.random()*31+1;
				months=(int)Math.random()*12+1;
				count++;
			}
			count++;
		}
		System.out.println("Los intentos son:"+ count);
	}


	public void NumberOfAttemts2(int day, int month) {
		int days;
		int months;
		int count=0;
		days=0;
		months=0;
		
		do {
			while(CheckDay(days,months)==false) {
				days=(int)Math.random()*31+1;
				months=(int)Math.random()*12+1;
				count++;
			}
			count++;
		}
		while ((days!=day)||(months!=month));
		System.out.println("Los intentos son:"+ count);
	}
		
		
	
	public void NameOfWeek(int day, int month,int FirstDay) {
	int days=0;
	
	switch(month) {
	case 1: 
		days=day;
		
	break;
	case 2:
		days=day+31;
	
	break;
	case 3:
		days=day + 31 + 28;
		
	break;
	case 4:
		days=day + 31 + 28 + 31;
		
	break;
	case 5:
		days= day + 31 + 28 + 31 + 30; 
		
	break;
	case 6:
		days=day +31+28+31+30+31;
		
	break;
	case 7:
		days=day +31+28+31+30+31+30;
		
	break;
	case 8:
		days=day +31+28+31+30+31+30+31;
		
	break;
	case 9:
		days=day +31+28+31+30+31+30+31+31;
	
	break;
	case 10:
		days=day +31+28+31+30+31+30+31+31+30;
		
	break;
	case 11:
		days=day +31+28+31+30+31+30+31+31+30+31;
		
	break;
	case 12:
		days=day +31+28+31+30+31+30+31+31+30+31+30;
		
	break;

	}
	days=days%7;
	days=(days-FirstDay)%7;
	switch(days)
	{
	
		
	case 0:
		System.out.println("Lunes");
		break;
	case 1:
		System.out.println("Martes");
		break;
	case 2:
		System.out.println("Miercoles");
		break;
	case 3:
		System.out.println("Jueves");
		break;
	case 4:
		System.out.println("Viernes");
		break;
	case 5:
		System.out.println("Sabado");
		break;
	case 6:
		System.out.println("Domingo");
		break;
	
	}
	
	
	}
		
		
	
	
	
	
	
	
		
		
		public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

