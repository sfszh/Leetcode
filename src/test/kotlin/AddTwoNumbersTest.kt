import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AddTwoNumbersTest {

    @BeforeEach
    fun setUp() {
    }

    @Test
    fun addTwoNumbers() {
        val arr1 = arrayOf(9,9,9,9,9,9,9)
        val arr2 = arrayOf(9,9,9,9)
        val in1 = buildNode(arr1)
        val in2 = buildNode(arr2)
        val a = AddTwoNumbers()
        val result = a.addTwoNumbers(in1, in2)
        print(result?.`val`!!)
    }

    fun buildNode(array: Array<Int>): AddTwoNumbers.ListNode {
        val start = AddTwoNumbers.ListNode(0)
        var current = start
        array.forEach {
            current.`val` = it
            val newNode = AddTwoNumbers.ListNode(0)
            current.next = newNode
            current = newNode
        }
        return start
    }
}