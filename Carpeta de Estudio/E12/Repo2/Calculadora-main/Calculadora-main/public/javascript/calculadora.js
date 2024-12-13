let funcionPredeterminada = () =>{
    const formulario = document.getElementById("formulario")
    formulario.addEventListener("submit", (evento) => {
        evento.preventDefault();
        let valorPorHora = parseFloat(document.getElementById("valorPorHora").value)

        let interfazHoras = parseFloat(document.getElementById("interfazHoras").value)
        let interfazHTML = parseFloat(document.getElementById("interfazHTML").value)
        let interfazJS = parseFloat(document.getElementById("interfazJS").value)
        let interfazTest = parseFloat(document.getElementById("interfazTest").value)

        let checkOscuro = document.getElementById("modoOscuro").checked
        let estilo = document.getElementById("estilo").value

        let resultado = valorPorHora * (interfazHoras+interfazHTML+interfazJS+interfazTest)

        if(checkOscuro){
            resultado += 0.5 * (interfazHoras + interfazHTML)
        }

        if(estilo === "premium"){
            resultado += 20
        }

        document.getElementById("valorTotal").value = resultado
    })
}

funcionPredeterminada()