import java.util.NoSuchElementException;

public class CardStack {

    private Card[] stack;
    private int front;
    private int back;

    public CardStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void add(Card player)
    {
        if (back == stack.length) //resizes array when full
        {
            Card[] newArray = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[back] = player;
        back++;
    }

    public void remove()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }


        back--;
        Card removedCard = stack[back];
        stack[back] = null;

    }

    public Card peek()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        return stack[back];
    }

    public int size() {
        return back - front;
    }

    public void printStack()
    {
        if (size() == 0)
        {
            System.out.println("Stack empty.");
            return;
        }
        for (int i = front; i < back; i++)
        {
            System.out.println(stack[i]);
        }
    }
}
