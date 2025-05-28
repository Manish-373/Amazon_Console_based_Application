public class ProductIdException extends Exception
{
    @Override
    public String getMessage() {
        return "Error: Product ID is invalid!";
    }
}
