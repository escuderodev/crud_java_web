const formulario = document.querySelector(".form");
const Inome = document.getElementById("nome");
const Itelefone = document.getElementById("telefone");
const Iendereco = document.getElementById("endereco");
const Irestricao = document.getElementById("restricao");

formulario.addEventListener('submit', function(event) {
    event.preventDefault();

    const dados = {
        nome: Inome.value,
        telefone: Itelefone.value,
        endereco: Iendereco.value,
        restricao: Irestricao.value
    };

    console.log(dados);
})