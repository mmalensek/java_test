public class mergeSortedList {

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null&& list2 != null){
            return list2;
        }
        if(list1 != null && list2 == null){
            return list1;
        }

        ListNode A = list1;
        ListNode B = list2;
        ListNode noviList;
        ListNode VRNI;

        if(A.val < B.val){
            noviList = A;
            VRNI = noviList;
            A = A.next;

        }else{
            noviList = B;
            VRNI = noviList;
            B = B.next;
        }

        while(A != null || B != null){
            if(A == null){
                noviList.next = B;
                noviList = noviList.next;
                B = B.next;
            }else if(B == null){
                noviList.next = A;
                noviList = noviList.next;
                A = A.next;
            }else{
                if(A.val < B.val){
                    noviList.next = A;
                    noviList = noviList.next;
                    A = A.next;
                }else{
                    noviList.next = B;
                    noviList = noviList.next;
                    B = B.next;
                }
            }
        }

        return VRNI;
    }

}
