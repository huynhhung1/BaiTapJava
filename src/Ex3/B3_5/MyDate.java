package Ex3.B3_5;



public class MyDate {
    private int year;
    private int month;
    private int day;
    private static final String[] MONTHS={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private static final String[] DAYS={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private static final int[] DAYS_IN_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};
    public MyDate(int year, int month, int day)
    {
        setDate(year,month,day);
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if(year<1 || month<1||month>12) return false;
        int maxDays=DAYS_IN_MONTH[month-1];
        if(month==2 && isLeapYear(year)) maxDays=29;
        return day>=1 && day<=maxDays;
    }
    public static int getDayOfWeek(int year, int month, int day) {
        if(month<3)
        {
            month+=12;
            year--;
        }
        int K=year%100;
        int J=year/100;
        int h=(day+(13*(month+1))/5+K+(K/4)+(J/4)+(5*J));
        return (h+5)%7;
    }
    public void setDate(int year,int month,int day) {
        if(!isValidDate(year,month,day))
        {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int year) {
        setDate(year,this.month,this.day);
    }
    public void setMonth(int month) {
        setDate(this.year,month,this.day);
    }
    public void setDay(int day) {
        setDate(this.year,this.month,day);
    }
    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year,month,day)]+" "+MONTHS[month-1]+" "+year;
    }
    public MyDate nextDay()
    {
        if(isValidDate(year,month,day+1))
        {
            day++;
        }
        else if(month==12)
        {
            day=1;
            month=1;
            year++;
        }
        else{
            day=1;
            month++;
        }
        return this;
    }
    public MyDate nextMonth()
    {
        if(month==12)
        {
            month=1;
            year++;
        }
        else{
            month++;
        }
        if(!isValidDate(year,month,day)) day=DAYS_IN_MONTH[month-1];
        return this;
    }
    public MyDate nextYear()
    {
        year++;
        if(!isValidDate(year,month,day)) day=28;
        return this;
    }
    public MyDate previousDay()
    {
        if(day>1)
        {
            day--;
        }
        else if(month==1)
        {
            month=12;
            day=31;
            year--;
        }
        else {
            month--;
            day=DAYS_IN_MONTH[month-1];
            if(month==2 && isLeapYear(year)) day=29;
        }
        return this;
    }
    public MyDate previousMonth()
    {
        if(month==1)
        {
            month=12;
            year--;
        }
        else {
            month--;
        }
        if(!isValidDate(year,month,day)) day=DAYS_IN_MONTH[month-1];
        return this;
    }
    public MyDate previousYear()
    {
        year--;
        if(!isValidDate(year,month,day)) day=28;
        return this;
    }
}
