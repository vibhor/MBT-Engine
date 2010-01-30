/**
 * Created by IntelliJ IDEA.
 * User: Document
 * Date: 30 Jan, 2010
 * Time: 3:48:42 PM
 * To change this template use File | Settings | File Templates.
 */

class Message
{
    private byte id;
    private byte from, to;

    Message(byte id, byte from, byte to)
    {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    byte getID()
    {
        return id;
    }

    byte getFrom()
    {
        return from;
    }

    byte getTo()
    {
        return to;
    }

    void setID(byte id)
    {
        this.id = id;
    }

    void setFrom(byte from)
    {
        this.from = from;
    }

    void setTo(byte to)
    {
        this.to = to;
    }

    void display()
    {
        System.out.println("[Message ID: " + id + " | From: " + from + " | To: " + to + "]");
    }
}