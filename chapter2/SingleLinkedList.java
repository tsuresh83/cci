/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author suresh
 */
public class SingleLinkedList {
    int data;
    SingleLinkedList next;
    SingleLinkedList(int data){
        this.data = data;
    }
    SingleLinkedList getNode(){
        return this;
    }
    SingleLinkedList getNext(){
        return this.next;
    }
    void setNext(SingleLinkedList node){
        this.next=node;
    }
    void add(int data){
        SingleLinkedList tmp = this;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        SingleLinkedList nn = new SingleLinkedList(data);
        tmp.next = nn;
       
    }
    int getData(){
        return this.data;
    }
    int delete(int data){
        SingleLinkedList tmp = this;
        int ctr =0;
        while(tmp!=null &&
                tmp.getData()!=data){
            tmp = tmp.getNext();
            ctr++;
        }
        boolean found = false;
        if(tmp!= null && tmp.getData()==data){
            tmp.setNext(tmp.getNext());
            found = true;
        }
        if(found){
            return ctr;
        }else{
            return -1;
        }
    }
    @Override
    public String toString(){
        return ""+this.data;
    }
    public static void main(String[] args){
        int[] test = {2,3,4};
        SingleLinkedList list = new SingleLinkedList(1);
        for(int t : test){
            list.add(t);
        }
        list.printList();
        list.add(5);
        System.out.println(list.delete(0));
        list.printList();
        System.out.println(list.delete(1));
        list.printList();
    }
    void printList(){
         SingleLinkedList tmp = this;
        while(true){
            System.out.println(tmp);
            tmp = tmp.getNext();
            if(tmp == null){
                break;
            }
        }
    }
}


