package august.ex_24082024.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab243 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(5);
        pq.offer(2);
        pq.add(4);
        pq.offer(6);
        pq.add(1);
        pq.offer(3);

        System.out.println(pq); //if we print like this it will not be sorted but makes sure first element is at first


        System.out.println(pq.peek());

//      When we poll one by one the smallest values are given high priority and removed
        System.out.println(pq.poll()); //This will follow first in first out
        pq.add(1);


        System.out.println();

        //This will show how pq is giving priority
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll() + "\t"); //when we use poll to print the values we will get the sorted values ut queue will be empty
        }




        //Refer ATB notes dox for more ubderstanding


    }

}
