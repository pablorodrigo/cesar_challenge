package challenge_05
import java.util.*


/**
 * 5. Remove duplicates on email thread:
When different email clients are used on a same thread, the discussion get messy because old messages are included again and get duplicated.
Given a email thread (represented by a singly unsorted linked list of messages), write a function that remove duplicated messages from it.
 */

data class Node(val id: Int, val value: String)

fun main() {

    // queue of messages
    val head: Queue<Node> =
        LinkedList(
            listOf(
                Node(1, "msg-1"),
                Node(2, "msg-2"),
                Node(3, "msg-3"),
                Node(4, "msg-2"),
                Node(5, "msg-4"),
                Node(6, "msg-2"),
                Node(7, "msg-1"),
                Node(8, "msg-1"),
                Node(9, "msg-5")
            )
        )


    val deleteDuplicateMsg = head.distinctBy { it.value }.joinToString { node -> node.value }

    println(deleteDuplicateMsg) // msg-1, msg-2, msg-3, msg-4, msg-5

}
