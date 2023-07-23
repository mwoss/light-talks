package sealed

import java.io.File

// * Restricted class hierarchies
// * Subclasses are known at compile time
// * New subclasses cannot appear after compile time
// * Limited set that is known when this class is compiled.


sealed class Tree {
    class Leaf(val value: Int) : Tree()
    class Node(val children: List<Tree>) : Tree()
    object Empty : Tree()
}


sealed interface Error

sealed class IOError(): Error {
    class FileReadError(val file: File): IOError()
    class DatabaseError(val source: String): IOError()
}
object RuntimeError : Error
