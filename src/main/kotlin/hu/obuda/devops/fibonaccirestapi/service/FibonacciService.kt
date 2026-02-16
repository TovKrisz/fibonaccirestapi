package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return if (n == 0) 0
        else return if (n == 1) 1
        else{
            var a = 0
            var b =  1
            repeat(n - 1){
                val next = a + b
                a = b
                b = next
            }

            return b
        }

    }
}