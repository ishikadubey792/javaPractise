import java.util.* ;
import java.io.*; 
public class Deque 
{
    // Initialize your data structure.
    int[] dq;
    int front, rear;
    int size;
    public Deque(int n) 
    {
        // Write your code here.
        size = n;
        dq = new int[size];
        front = rear = -1;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        // Write your code here.
        if(isFull()){
            // deque is full
            return false;
        }
        if(isEmpty()==true){
            // when deque is empty
            front=rear=0;
        } else {
            // deque is not empty
            if(front==0){
                front = size-1;
            }else{
                --front;
            }
        }
        // insert the element at the front of deQue
        dq[front] = x;

        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        // Write your code here.
        if(isFull()){
            // deque is full
            return false;
        }
        if(isEmpty()){
            front = rear = 0;
        }else{
            if(rear==size-1){
                rear = 0;
            }else{
                rear = rear + 1;
            }
        }
           // Insert the element at the end of deque.
           dq[rear] = x;

           return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        int item = dq[front];

        if(front==rear){
            front = rear = -1;
        }else {
               if(front == size-1){
               front = 0;
            } else{
                front = front + 1;
            }
        }
        return item;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        int item = dq[rear];

        if(front==rear){
            front = rear = -1;
        }else {
               if(rear == 0){
               rear = size-1;
            } else{
                rear = rear - 1;
            }
        }
        return item;
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        return dq[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        // Write your code here. 
        if(isEmpty()){
            return -1;
        }
        return dq[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
         if (front == -1)
         {
            return true;
         }
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
        if ((front == 0 && rear == size - 1) || (front == rear + 1))
        {
            return true;
        }
        return false;
    }
}
