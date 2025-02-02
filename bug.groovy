```groovy
def methodWithClosure(closure) {
  println "Executing closure..."
  closure()
}

methodWithClosure { println "Hello from closure!" }

methodWithClosure { 
  println "This closure throws an exception"
  throw new RuntimeException("Something went wrong!")
}
println "This line should not be reached if the exception is not caught"
```