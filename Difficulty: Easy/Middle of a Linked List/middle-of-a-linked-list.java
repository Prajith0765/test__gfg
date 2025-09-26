/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int i = 0;
        temp = head;
        while(i < length/2){
            temp = temp.next;
            i++;
        }
        
        return temp.data;
    }
}