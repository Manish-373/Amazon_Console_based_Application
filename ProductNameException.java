public class ProductNameException  extends Exception
{
    @Override
    public String getMessage() 
    {
        return "Error: Invalid product name provided!";
    }
}
