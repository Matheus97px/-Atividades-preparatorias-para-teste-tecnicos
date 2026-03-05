function contadorCaracteres(texto, caracter) {
    let contador = 0;
    for (let i = 0; i < texto.length; i++) {
        if (texto[i] === caracter) {
            contador++;
        }
    }
  console.log(`o texto ${texto} possui ${contador} ${caracter}`);
}



contadorCaracteres('banana', 'a');
contadorCaracteres('banana', 'b');
contadorCaracteres('banana', 'n');