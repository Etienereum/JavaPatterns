public class CollectionOfNames implements Container 
{      
    public String name[] = 
    {
        "Ashwani Rajput", 
        "Soono Jaiswal",
        "Rishi Kumar",
        "Rahul Mehta",
        "Hemant Mishra"
    };
    public Iterator getIterator() 
    {  
        return new CollectionofNamesIterate() ;  
    }  
        
    private class CollectionofNamesIterate implements Iterator
    {
        int i;
        
        public boolean hasNext()
        {  
            if (i<name.length)
            {  
                return true;  
            }  
            return false;  
        }  
              
        public Object next() 
        {  
            if(this.hasNext())
            {  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  
 