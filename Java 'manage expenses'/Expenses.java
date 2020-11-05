import java.lang.Comparable;
import java.util.ArrayList;

// A class for objects representing each expense
class Expense implements Comparable{
    private String name;
    private int amount=0;
    private int type;
    private int weekDay;
    private int date;
    private String city="";

    public Expense(String name,int amount, int type, int weekDay,int date, String city) {
        this.name=name;
        this.amount = amount;
        this.type=type;
        this.weekDay=weekDay;
        this.date=date;
        this.city=city;
    }

    public String getName() {
        return name;
    }


    public int getAmount() {
        return amount;
    }

    public int getType(){
        return type;
    }

    public int getWeekDay() {
        return weekDay;
    }

    public String getCity() {
        return city;
    }

    public Weekday getDay() {
        if (getWeekDay()==0)
            return Weekday.SATURDAY;
        if (getWeekDay()==1)
            return Weekday.SUNDAY;
        if (getWeekDay()==2)
            return Weekday.MONDAY;
        if (getWeekDay()==3)
            return Weekday.TUESDAY;
        if (getWeekDay()==4)
            return Weekday.WEDNESDAY;
        if (getWeekDay()==5)
            return Weekday.THURSDAY;
        if (getWeekDay()==6)
            return Weekday.FRIDAY;
        else return null;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "I spent " +amount+" shekels on "+getName()+" on the "+getDate()+" of the month"+" in "+getCity();
    }


    @Override
    public int compareTo(Object e) {
        Expense e1=(Expense)e;
        if (this.getAmount()>e1.getAmount())
        return 1;
        else return -1;
    }
}
