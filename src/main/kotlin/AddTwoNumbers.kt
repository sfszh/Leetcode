import AddTwoNumbers.ListNode


class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode? {
        var carry: Int = 0
        val dummy = ListNode(0)
        var node: ListNode? = dummy
        var next1: ListNode? = l1
        var next2: ListNode? = l2
        while (next1 != null || next2 != null || carry != 0) {
            val a = next1?.`val` ?: 0
            val b = next2?.`val` ?: 0
            val sum = carry + a + b
            val currentResult = ListNode(sum % 10)
            node?.next = currentResult
            node = currentResult
            carry = sum / 10
            next1 = next1?.next
            next2 = next2?.next
        }
        return dummy.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}


