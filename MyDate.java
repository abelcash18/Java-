public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public int getday() {
        return day;
    }
    
    public int getmonth() {
        return month;
    }
    
    public int getyear() {
        return year;
    }
    
    public int setday(int day) {
        this.day = day;
        return day;
    }
    
    public int setmonth(int month) {
        this.month = month;
        return month;
    }
    
    public int setyear(int year) {
        this.year = year;   
        return year;
    }
    
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setday(25);
        date.setmonth(5);
        date.setyear(2026);
               
      //String sday =null
      // if (date.getmonth()> 9)
      // Sday "/" + date.getmonth();
      // else
        // sday = "/0" + date.getmonth()




        System.out.println("Start Day: " + date.getday() + "/0" + date.getmonth() + "/" + date.getyear());
    }
}
