/**
 * Created by IntelliJ IDEA.
 * User: Document
 * Date: 30 Jan, 2010
 * Time: 3:48:11 PM
 * To change this template use File | Settings | File Templates.
 */

class Node<T>
{
    // constants
    public static final byte RETURN_MESSAGE = 0;
    public static final byte SINGLE_MESSAGE = 1;
    public static final byte LOOP = 2;
    public static final byte ALT = 3;
    public static final byte OPT = 4;
    public static final byte BREAK = 5;

    private byte type;
    private T frag;

    Node(byte type, T frag)
    {
        this.type = type;
        this.frag = frag;
    }

    byte getType()
    {
        return type;
    }

    void setType(byte type)
    {
        this.type = type;
    }

    T getFrag()
    {
        return frag;
    }

    void setFrag(T frag)
    {
        this.frag = frag;
    }
}
