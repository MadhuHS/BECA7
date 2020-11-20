package com.jspiders.pkg1;

public class Sample 
{
    public    int    v1 = 100;
    protected double v2 = 4.12;
              long   v3 = 3910930139022l;
    private   String v4 = "java";
    
    public void view()
    {
    	System.out.println("public-view() of Sample class");
    }
    
    protected void view2()
    {
    	System.out.println("protected-view2() of Sample class");
    }
    
    void view3()
    {
    	System.out.println("pkg-level-view3() of Sample class");
    }
    
    private void view4()
    {
    	System.out.println("private-view4() of Sample class");
    }
}
