```groovy
def methodWithClosure(closure) {
  println "Executing closure..."
  try {
    closure()
  } catch (RuntimeException e) {
    println "Caught an exception in the closure: "+ e.message
  }
}

methodWithClosure { println "Hello from closure!" }

methodWithClosure { 
  println "This closure throws an exception"
  throw new RuntimeException("Something went wrong!")
}
println "This line will be reached even if an exception occurred"
```