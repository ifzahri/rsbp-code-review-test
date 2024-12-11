def fibonacci(n):
    if n <= 1:
        return n
    else:
        return(fibonacci(n-1) + fibonacci(n-2))

print("Fibonacci numbers up to 10,000 in Python:")
for i in range(10000):
    if fibonacci(i) < 10000:
        print(fibonacci(i))