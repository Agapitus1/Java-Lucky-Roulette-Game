class Device
{
    //Attributes
    String brand;
    double price;
    //Constructor - loads the object
    Device(String theBrand, double thePrice) //2parameters
    {
        brand = theBrand;
        price = thePrice;
    }
    
    void activate()
    {
        System.out.println("Welcome..." + brand);
    }
}