

import java.util.ArrayList;
import java.util.Collections;  // NEW (needed for .sort)

class Dates
{
  private ArrayList<MonthClass> dates;

  public Dates()
  {
    dates = new ArrayList<MonthClass>();
  }

  public void addMonthClass(MonthClass t)
  {
    dates.add(t);
  }
  public String toString()
  {
    String s = "";
    for(MonthClass t : dates)
    {
      s += t.getStringMonth() + " "; 
    }
    return s; 
  }


  public void CompareIntMonth(int x)
  {
    int e = 0;
    for (MonthClass t: dates)
    {
      e = t.getIntMonth();
      if (e == x){
        System.out.println("We are here on " + t.getStringMonth());
      }
    }
  }

  public String getStringMonthfromIntInput(int x)
  {
    int e = 0;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getIntMonth();
      if (e == x){
        f = t.getStringMonth();
      }
    } 
    return (f);
  
  }

  public void CompareStringMonth(String x)
  {
    String d = "";
    for (MonthClass t: dates)
    {
      d = t.getStringMonth();
      if (d.equals(x)){
        System.out.println(t.getFirstHalf());
      }
    }
  }
  public int getDaysInMonth(String x)
  {

    int h = 0;
    String d = "";
    for (MonthClass t: dates)
    {
      d = t.getStringMonth();
      if (d.equals(x)){
       h = t.getDaysInMonthFromMonthClass();
     }
    }
    return (h);

  }
  public int getDaysInMonthInt(int x)
  {

    int h = 0;
    int d;
    for (MonthClass t: dates)
    {
     d = t.getIntMonth();
      if (d == x){
        h = t.getDaysInMonthFromMonthClass();
     }
  }
   return (h);

  }

  public String getZodiacForJanuary(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 19)
        {
          f = t.getFirstHalf();

        } 
        else 
        {
          f = t.getSecondHalf();

        }
      }
    }
    return (f);
  }
  public String getZodiacForFebruary(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 18)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForMarch(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day >= 21)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForApril(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 19)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForMay(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 20)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForJune(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 20)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForJuly(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 22)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForAugust(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 22)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForSeptember(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 22)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForOctober(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 23)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForNovember(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 22)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }
  public String getZodiacForDecember(int day, String month)
  {
    String e = null;
    String f = null;
    for (MonthClass t: dates)
    {
      e = t.getStringMonth();
      if (e.equals(month)){
        if (day <= 21)
        {
          f = t.getFirstHalf();
        } 
        else 
        {
          f = t.getSecondHalf();
        }
      }
    }
    return (f);
  }


  // NEW: instead of writing our own sort method,
  // since Tile implements Comparable<Tile>, we
  // can use the built-in Collections.sort and 
  // .reverse methods to sort the tiles ArrayList
  // in reverse-order, using the Tile.compareTo(Tile)
  // method that we defined.
  public void sortHighToLow()
  {
    Collections.sort(tiles);
    Collections.reverse(tiles);
  }
}