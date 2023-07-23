package context

class TransactionScope {
    context(TransactionScope) fun connect() {}
}

fun tx(scope: context(TransactionScope) () -> Unit) {}


fun main() {
    tx {
        connect()
    }

    // Below code won't compile, we cannot use connect outside of context scope
    //val transaction = TransactionScope()
    //transaction.connect()
}
