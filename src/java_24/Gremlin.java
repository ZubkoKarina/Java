
package java_24;

public class Gremlin{
    static int gremlinCount = 0;
    private int guid;
    
    public Gremlin(){
        gremlinCount++;
    }
    
    static int getGremlinCount(){
        return gremlinCount;
    }
    
    public int getGuid(){
        return guid;
    }
    
    public void setGuid(int newGuid) {
        if (newGuid > 999_999 & newGuid < 10_000_000) {
            guid = newGuid;
        }
    }
}