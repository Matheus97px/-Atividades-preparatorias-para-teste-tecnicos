function inverterNumero(n) {
    let invertido = 0;
    while (n > 0) {
        invertido = invertido * 10 + n % 10;
        n = Math.floor(n / 10);
    }
    return invertido;
}

function isPalindromo(n){
   const invertido = inverterNumero(n);

   if(invertido === n){
       console.log(`o número ${n} é palíndromo: ${invertido} === ${n}`);
 } else {
     console.log(`Não é palíndromo: ${invertido} !== ${n}`);
 }
   
}

isPalindromo(12321);
isPalindromo(123);
