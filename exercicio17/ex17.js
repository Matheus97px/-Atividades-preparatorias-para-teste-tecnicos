function inverterNumero(n) {
    let invertido = 0;
    while (n > 0) {
        invertido = invertido * 10 + n % 10;
        n = Math.floor(n / 10);
    }
    return invertido;
}

console.log(inverterNumero(123));

function inverterNumero2(n){
    let invertidoString = n.toString().split("").reverse().join("");
    let invertido = parseInt(invertidoString);
    return invertido;
}

console.log(inverterNumero2(123));