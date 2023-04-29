

class MonthClass extends Object implements Comparable<MonthClass>
{
  private String dateString;
  private int dateInt;
  private String firstHalf;
  private String secondHalf;
  private int daysInMonth;

  // static member variable:  
  // initially, we have 0 Tiles, but this will change
  private static int tileCount = 0;

  public MonthClass(String dateString, int dateInt, String firstHalf, String secondHalf, int daysInMonth)
  {
    this.dateString = dateString;
    this.dateInt = dateInt;
    this.firstHalf = firstHalf;
    this.secondHalf = secondHalf;
    this.daysInMonth = daysInMonth;
    tileCount++;  // count each Tile we instantiate
  }

  public int getDaysInMonthFromMonthClass()
  {
    return daysInMonth;
  }
  public String getSecondHalf()
  {
    return secondHalf;
  }
  public String getFirstHalf()
  {
    return firstHalf;
  }
  public String getStringMonth()
  {
    return dateString;
  }

  public int getIntMonth()
  {
    return dateInt;
  }

  public static int getTileCount()
  {
    return tileCount;
  }


}