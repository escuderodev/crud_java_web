const formulario = document.querySelector(".form");
const Inome = document.getElementById("nome");
const Itelefone = document.getElementById("telefone");
const Iendereco = document.getElementById("endereco");
const Irestricao = document.getElementById("restricao");

function cadastrar() {
    fetch("http://localhost:8080/cliente",
    {
        headers: {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        method: 'POST',
        body: JSON.stringify({
            nome: Inome.value,
            telefone: Itelefone.value,
            endereco: Iendereco.value,
            restricao: Irestricao.value
        })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res) {console.log(res)})
}

function limparCampos() {
    Inome.value = "";
    Itelefone.value = "";
    Iendereco.value = "";
    Irestricao.value = "";
}

formulario.addEventListener('submit', function(event) {
    event.preventDefault();

    cadastrar();
    limparCampos();
});