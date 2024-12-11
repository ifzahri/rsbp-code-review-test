function fibonacci(n) {
    if (n <= 1) {
        return n;
    } else {
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}

console.log("Fibonacci numbers up to 10,000 in JavaScript:");
for (let i = 0; i < 10000; i++) {
    if (fibonacci(i) < 10000) {
        console.log(fibonacci(i));
    }
}