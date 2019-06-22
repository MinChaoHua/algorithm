package com.link;
/**
 * 链表的操作
 * */
public class Link {
    public int iData;//key
    public double dData;//item
    public Link next;

    public Link(int id,double dd){
        iData = id;
        dData = dd;
    }

    public void displayLink(){
        System.out.print("{"+iData+","+dData+'}');
    }
}
class LinkList{
    private Link first;
    public LinkList(){//no items
        first = null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int id,double dd){
        Link newLink = new Link(id,dd);//create link
        newLink.next = first;//newlink 的 next 是原来第一个
        first = newLink;
    }
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public Link find(int key){
        Link current = first;
        while (current.iData!=key){
            if(current.next==null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData!=key){
            if(current.next==null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if(current==first){
            first = first.next;
        }else{
            previous.next = current.next;
        }

        return current;
    }

}
class LinkListApp{
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,4.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(88,8.99);
        theList.displayList();
        Link f = theList.find(44);
        if(f!=null){
            System.out.println("Found link with key"+ f.dData);
        }else{
            System.out.println("Can’t find link");
        }
        Link d = theList.delete(44);
        if(d!=null){
            System.out.println("Deleted link with key"+ d.dData);
        }else{
            System.out.println("Can’t find link");
        }
        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
