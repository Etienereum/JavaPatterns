import java.util.Observable;

interface Observer 
{
    public void update (Observable obj, Object arg);
}