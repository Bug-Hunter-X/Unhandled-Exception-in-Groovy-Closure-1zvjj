# Unhandled Exception in Groovy Closure

This example demonstrates a common error in Groovy: an unhandled exception within a closure.  The `methodWithClosure` function executes a provided closure.  If the closure throws an exception, the program crashes without any error handling.  This is often overlooked when using closures extensively.

The solution provides a method to handle potential exceptions within the closure.