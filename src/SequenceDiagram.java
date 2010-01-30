import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by IntelliJ IDEA.
 * User: Document
 * Date: 30 Jan, 2010
 * Time: 2:24:26 PM
 * To change this template use File | Settings | File Templates.
 */

public class SequenceDiagram implements Diagram
{
    protected LinkedList seq;

    SequenceDiagram()
    {

    }
    
    SequenceDiagram(String inputFile)
    {
        seq = new LinkedList();

        read(inputFile);        
    }

    public void read(String inputFile)
    {

    }

    public void display()
    {
        ListIterator itr = seq.listIterator();
        Node nodeRef;
        Message msgRef;
        CombinedFragment fragRef;

        while(itr.hasNext())
        {
            nodeRef = (Node) itr.next();

            switch(nodeRef.getType())
            {
                case Node.RETURN_MESSAGE:        // return message
                    System.out.println("Return Message");
                    msgRef = (Message) nodeRef.getFrag();
                    msgRef.display();
                    break;

                case Node.SINGLE_MESSAGE:         // single message
                    System.out.println("Single Message");
                    msgRef = (Message) nodeRef.getFrag();
                    msgRef.display();
                    break;

                case Node.LOOP:         // loop combined fragment
                    System.out.println("LOOP");
                    fragRef = (CombinedFragment) nodeRef.getFrag();
                    fragRef.display();
                    break;

                case Node.ALT:         // alt combined fragment
                    System.out.println("ALT");
                    fragRef = (CombinedFragment) nodeRef.getFrag();
                    fragRef.display();
                    break;

                case Node.OPT:        // opt combined fragment
                    System.out.println("OPT");
                    fragRef = (CombinedFragment) nodeRef.getFrag();
                    fragRef.display();
                    break;

                case Node.BREAK:        // break combined fragment
                    System.out.println("BREAK");
                    fragRef = (CombinedFragment) nodeRef.getFrag();
                    fragRef.display();
                    break;
            }
        }
    }
}
