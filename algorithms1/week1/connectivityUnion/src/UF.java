import java.util.ArrayList;

public class UF {

    private ArrayList<Integer> idOfElements;
    UF(int x)
    {
        this.idOfElements = new ArrayList<>(x);
        int i = 0;
        while(i<this.idOfElements.size())
        {
            this.idOfElements.set(i,i);
            i += 1;
        }
    }

    public boolean isConnected(int x, int y )
    {
        if(x < this.idOfElements.size() || y < this.idOfElements.size())
            return this.idOfElements.get(x).equals(this.idOfElements.get(y));
        return true;
    }

    public void union(int x,int y) // slow for huge problems , quickfind
    {
        if(!isConnected(x,y))
        {
            int idY = this.idOfElements.get(y);
            int idX = this.idOfElements.get(x);

            for(int i = 0 ; i < this.idOfElements.size(); i++)
            {
                if(this.idOfElements.get(i).equals(idX))
                {
                    this.idOfElements.set(i,idY);
                }
            }
        }
    }

}
