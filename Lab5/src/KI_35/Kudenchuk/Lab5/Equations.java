package KI_35.Kudenchuk.Lab5;

/**
 * Class <code>Equations</code> implements method for (x-4)/sin(3x-1) expression
 * calculation
 * @author Kudenchuk Vladyslav
 * @version 1.0
 */
class Equations
{
    public double calculate(double x) throws CalcException
    {
        double y, rad;
        rad = 3 * x * Math.PI / 180.0f - 1.0f;
        try
        {
            y = (x - 4.0f) / Math.sin(3 * x - 1.0f);
            if (Double.isNaN(y) || y==Double.NEGATIVE_INFINITY ||
                    y==Double.POSITIVE_INFINITY || rad==0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            if (rad==0)
                throw new CalcException("Exception reason: division by zero (sin(3 * x - 1) == 0)");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}
