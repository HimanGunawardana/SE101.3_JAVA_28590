package com.mycompany.p02part1;
public class Item
{
    public int location;
    public String description;
    
    public Item(int location,String desc)
    {
        this.location=location;
        this.description=desc;
    }
    public void getter()
    {
        System.out.println("Location:"+location);
        System.out.println("description"+description);
    }
}
