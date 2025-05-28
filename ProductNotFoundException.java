public class ProductNotFoundException extends Exception
{
    @Override
    public String getMessage() 
    {
        return "Error: The requested product was not found!";
    }
}
