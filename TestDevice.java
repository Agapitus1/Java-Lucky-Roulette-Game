class TestDevice
{
    //Attributes
    Device dev1, dev2;
    
    //Constructor
    TestDevice()
    {
        // Load 2 Device objects
        dev1 = new Device("Apple", 900);
        dev1.activate();
        
        dev2 = new Device("Samsung", 700);
        dev2.activate();
    }
}