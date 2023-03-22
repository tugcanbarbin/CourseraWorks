import java.util.ArrayList;

public class UFQuickUnion {
    private ArrayList<Integer> idOfElements;
    UFQuickUnion(int x)
    {
        this.idOfElements = new ArrayList<>(x);
        int i = 0;
        while(i<this.idOfElements.size())
        {
            this.idOfElements.set(i,i);
            i += 1;
        }
    }

    private int root(int i)
    {
        while(i != this.idOfElements.get(i)) i = this.idOfElements.get(i);
        return i;
    }
    public boolean isConnected(int x, int y )
    {
        return root(x) == root(y);
    }

    public void union(int x,int y)
    {
        int i = root(x);
        int j = root(y);
        this.idOfElements.set(i,j);
    }

}

