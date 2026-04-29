import java.util.TreeSet;

public class LaunchTreeSet
{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(); // stores data in sorted order and internally uses Binary tree data structure as
        // it follows inOrder traversal as there are three type of traversals RULE LVR left value Right in the tree and LNR
        ts.add(100);
        ts.add(80);
        ts.add(90);
        ts.add(70);
        ts.add(60);
        ts.add(40);
        ts.add(10);
        ts.add(20);
        ts.add(123);
        System.out.println(ts);

        System.out.println(ts.ceiling(50)); //60  // ceiling gives the element nearest to the element we are searching
        // if it is found then it will return that value else greater nearest to that element
        System.out.println(ts.higher(60)); // 70 // it will not check anything it wil just give the higher value

        System.out.println(ts.floor(60)); //60 // floor gives the element nearest to the element we are searching
        // if it is found then it will return that value else lower nearest to that element
        System.out.println(ts.lower(60)); // 40 //it will not check anything it wil just give the lower value

        System.out.println(ts.headSet(60)); // it will print elements before the 60 and skip the headset element
        System.out.println(ts.tailSet(60)); // it will start from the fromElement till the end
    }
}
