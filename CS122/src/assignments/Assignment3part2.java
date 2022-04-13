package assignments;

public class Assignment3part2 {

	  public static void insertionSort(Comparable[] list)

      {

              for (int index = 1; index < list.length; index++)

              {

                      Comparable key = list[index];

                      int position = index;

                      

                      while (position > 0 && key.compareTo(list[position - 1]) > 0)

                      {

                              list[position] = list[position - 1];

                              position--;

                      }

                      list[position] = key;

              }

      }

}

