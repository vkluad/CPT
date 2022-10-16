package KI_35.Kudenchuk.Lab7;

public class BasketDriver {
    public static void main(String[] args)
    {
        Basket <? super Fruit> basket = new Basket<>();
        basket.AddData(new Pears("Green", 9));
        basket.AddData(new Apples("Red" , 5));
        basket.AddData(new Apples("Green" , 8));
        basket.AddData(new Pears("Yellow" ,10));
        Fruit res = basket.findMax();
        System.out.println();
        System.out.print("The greatest amount of something: \n");
        res.print();
    }
}
