package Questons;
import java.util.ArrayList; 

class MyPriorityQueue { 

  ArrayList<Integer> storage; 

  MyPriorityQueue() { 

    storage = new ArrayList<Integer>(); 

  } 

  void insert(int value) { 

    storage.add(value); 

    int N = storage.size(); 

    for (int i = (N - 1) / 2; i >= 0; i--) { 

      heapify(storage, storage.size(), i); 

    } 

  } 

  int removeRoot() { 

    int MAXvalue = storage.get(storage.size() - 1); 

    int ROOT = storage.get(0); 

    storage.set(0, MAXvalue); 

    storage.remove(storage.size() - 1); 

    heapify(storage, storage.size(), 0); 

    return ROOT; 

  } 

  void heapify(ArrayList<Integer> arr, int N, int parentIndex) { 

    int leftChild = 2 * parentIndex + 1; 

    int rightChild = 2 * parentIndex + 2; 

    int largestKaIndex = parentIndex; 

    if (leftChild < N && arr.get(leftChild) > arr.get(parentIndex)) { 

      largestKaIndex = leftChild; 

    } 

    if (rightChild < N && arr.get(rightChild) > arr.get(largestKaIndex)) { 

      largestKaIndex = rightChild; 

    } 

    if (largestKaIndex == parentIndex) { 

      // do nothing 

      // Parent is the Largest 

      return; 

    } else { 

      // Parent is not the Largest 

      int temp = arr.get(parentIndex); 

      arr.set(parentIndex, arr.get(largestKaIndex)); 

      arr.set(largestKaIndex, temp); 

      // recursive call to check the Max-Heap Relation 

      heapify(arr, N, largestKaIndex); 

    } 

  } 

} 

class PriorityQueue { 

  public static void main(String[] args) { 

    MyPriorityQueue pq = new MyPriorityQueue(); 

    pq.insert(10); 

    pq.insert(20); 

    pq.insert(30);

    pq.insert(40); 

    pq.insert(50); 

    System.out.println(pq.storage); 

    System.out.println(pq.removeRoot()); 

    System.out.println(pq.removeRoot()); 

    System.out.println(pq.removeRoot()); 

    System.out.println(pq.removeRoot()); 

    System.out.println(pq.removeRoot()); 

  } 

} 