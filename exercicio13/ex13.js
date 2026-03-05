function isPrimo(n) {
    if (n <= 1) return false;

    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true
}



for (let i = 1; i <= 8; i++) {
    console.log(`O numero ${i} é primo? ${isPrimo(i)}`)
}


// const numeroEscolhido = 7
//  console.log(`O numero ${numeroEscolhido} é primo? ${isPrimo(numeroEscolhido)}`)
