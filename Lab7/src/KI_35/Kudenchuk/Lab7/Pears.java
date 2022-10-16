package KI_35.Kudenchuk.Lab7;


class Pears implements Fruit
{
    private String pearsColor;
    private final int pearsAmount;


    public Pears(String pColor, int pAmount)
    {
        pearsColor = pColor;
        pearsAmount = pAmount;
    }

    public String getPearsColor()
    {
        return pearsColor;
    }

    public void setPearsColor(String color)
    {
        pearsColor = color;
    }

    public int getAmount()
    {
        return pearsAmount;
    }

    public int compareTo(Fruit p)
    {
        Integer s = pearsAmount;
        return s.compareTo(p.getAmount());
    }

    public void print()
    {
        System.out.print("Pears are: " + pearsColor + ", Amount of pears: " + pearsAmount + ";\n");
    }
}

