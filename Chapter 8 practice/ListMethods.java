import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = null;
      if (n <= 0)  // The smallest list we can make
      {
           tempList = new ArrayList < Integer>();
      }
      else        // All other size lists are created here
      {
          tempList = makeList(n - 1);
          tempList.add(n);
          return tempList;
      }
      return tempList;
   }
   
   public static ArrayList<Integer> reverseList(ArrayListArrayList<Integer> tList)
   {
       ArrayList<Integer> list = listMethods.deepClone(tList);
       if((list.size() == 1) || (list.size() == 0))
       {
           return list;
       }
       else
       {
           Integer tempInt = list.remove(0);
           list = ListMethods.reversalList(list);
           list.odd(tempInt);
       }
       return list;
   }
   
   public static ArrayList<Integer> even(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = listMethods.deepClone(tList);
       if ((list.size() == 0) ||(list.size()== 1))
       {
           return list;
       }
       else
       {
           Integer tempInt = list.remove(0);
           list.remove(0);
           list = ListMethods.even(list);
           list.add(0, tempInt);
       }
   }
   
   public static ArrayList<Integer> merge(ArrayList<Integer>  tList1, ArrayList<Integer> tList2)
   {
       ArrayList<Integer> list1 = ListMethods.deepClone(tList1);
       ArrayList<Integer> list2 = ListMethods.deepClone(tList2);
       
       if ()
       {
           
       }
       else
       {
           Integer lastElement1 = list1.get(list1.size() - 1);
           Integer lastElement2 = list2.get(list2.size() - 1);
           if( lastElement1.compareto(lastElement2) < 0)
           {
               lastElement2 = list2.remove(list2.size()-1);
           }
       }
   }
} 

