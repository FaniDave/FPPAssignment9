package Day9.Assignment;

public class ImplementationOfQueueInArray {

    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {   //[56, 45, 90]
        int elementToBeViewed = arr[++front];
        front--;
        return elementToBeViewed;
    }

    public void enqueue(int obj) {
         if(rear >= arr.length) {
             System.out.println("Array is full");
             return;
         }
         arr[rear++] = obj;
    }

    public int dequeue() {
          int elementToBeRemoved = arr[++front];
          front--;
          resize();
         return elementToBeRemoved;
    }

    public boolean isEmpty() {
         return (front == -1);
    }

    public int size() {
        return rear;
    }

    public void printAll () {
         for(int i = 0; i < rear; i++) {
             System.out.println(arr[i]);
         }
    }

    private void resize() {
        int [] temp = new int[arr.length - 1];
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            temp[index++] = arr[i];
        }
        arr = temp;
    }

    //main method
    public static void main(String[] args) {
        ImplementationOfQueueInArray i = new ImplementationOfQueueInArray();
         i.enqueue(5);
         i.enqueue(3);
         i.enqueue(78);
         i.enqueue(33);

         i.printAll();

        System.out.println("*".repeat(50));

         int x = i.dequeue();
         System.out.println(x);

        System.out.println("*".repeat(50));

         i.printAll();
    }
}
