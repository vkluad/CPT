package KI_35.Kudenchuk.Lab7;

import java.util.ArrayList;

class Basket <T extends Fruit>
{
    private final ArrayList<T> arr;
    public Basket()
    {
        arr = new ArrayList<>();
    }
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }
    public void AddData(T fruit)
    {
        arr.add(fruit);
        System.out.print("Fruit added: ");
        fruit.print();
    }
    public void DeleteData(int i)
    {
        arr.remove(i);
    }
}
