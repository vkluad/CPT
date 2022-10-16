package KI_35.Kudenchuk.Lab7;

class Apples implements Fruit
{
    private String appleColor;
    private int appleAmount;

    public Apples(String pColor, int pAmount)
    {
        appleColor = pColor;
        appleAmount = pAmount;
    }

    public String getColor()
    {
        return appleColor;
    }

    public int getAmount()
    {
        return appleAmount;
    }

    public void setAppleColor(String color)
    {
        appleColor = color;
    }

    public void SetAmount(int n)
    {
        appleAmount = n;
    }

    public int compareTo(Fruit p)
    {
        Integer s = appleAmount;
        return s.compareTo(p.getAmount());
    }
    public void print()
    {
        System.out.print("Apples has color: " + appleColor + ", Amount of apples: " + appleAmount + ";\n");
    }
}