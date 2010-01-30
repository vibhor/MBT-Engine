/**
 * Created by IntelliJ IDEA.
 * User: Document
 * Date: 30 Jan, 2010
 * Time: 3:49:19 PM
 * To change this template use File | Settings | File Templates.
 */

class CombinedFragment extends SequenceDiagram
{
    private String condition[];
    private int noOfNodes[];

    CombinedFragment(String condition, int noOfNodes)
    {
        this.condition = new String[1];
        this.noOfNodes = new int[1];

        this.condition[0] = condition;
        this.noOfNodes[0] = noOfNodes;
    }

    CombinedFragment(String condition[], int noOfNodes[])
    {
        this.condition = new String[condition.length];
        this.noOfNodes = new int[noOfNodes.length];

        for(int i = 0; i < condition.length; i++)
            this.condition[i] = condition[i];

        for(int i = 0; i < noOfNodes.length; i++)
            this.noOfNodes[i] = noOfNodes[i];
    }

    public void display()
    {
        System.out.println("= = = = = = = = = = = = = = =");
        System.out.println("[CombinedFragment]");

        if(getNoOfPartitions() == 1)
        {
            System.out.println("Condition: " + condition[0]);
        }
        else
        {
            int i;
            for(i = 0; i < condition.length; i++)
            {
                System.out.println("Partition " + (i + 1) + " :: Condition: " + condition[i] + " | No Of Nodes: " + noOfNodes[i]);
            }
            if(getNoOfPartitions() > i)
            {
                System.out.println("Partition " + (i + 1) + " :: No Of Nodes: " + noOfNodes[i]);
            }
        }

        super.display();
        System.out.println("= = = = = = = = = = = = = = =");
    }

    int getNoOfPartitions()
    {
        return noOfNodes.length;
    }

    String getConditionAt(int index) throws ArrayIndexOutOfBoundsException
    {
        try
        {
            return condition[index];
        }
        catch(ArrayIndexOutOfBoundsException exc)
        {
            throw exc;
        }
    }

    int getNoOfNodesAt(int index) throws ArrayIndexOutOfBoundsException
    {
        try
        {
            return noOfNodes[index];
        }
        catch(ArrayIndexOutOfBoundsException exc)
        {
            throw exc;
        }
    }
}

