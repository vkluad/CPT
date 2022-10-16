package KI_35.Kudenchuk.Lab6;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author EOM Stuff
 * @version 1.0
 */
class CalcException extends ArithmeticException
{
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}

