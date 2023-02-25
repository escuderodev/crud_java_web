<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java JSP</title>
    <style>
        .form_container {
            padding: 1rem;
            border: 1px solid black;
            width: 500px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
        }

        input {
            margin-bottom: 1rem;
            padding: .5rem 1rem;
            width: 80%;
        }

        button {
            padding: .7rem 1rem;
            font-weight: bold;
            background: red;
            color: white;
            border: none;
            border-radius: 5px;
            width: 100px;
            cursor: pointer;

        }
    </style>
</head>
<body>
    <form action="index.jsp" method="post" class="form_container">
        <h1>Cadastro de Cliente</h1>
        <div>
            <input type="text" name="nome" id="nome" placeholder="Nome" required><br>
        </div>
        <div>
            <input type="text" name="telefone" id="telefone" placeholder="Telefone" required>
        </div>
        <div>
            <input type="text" name="endereco" id="endereco" placeholder="Endereco" required>
        </div>
        <div>
            <input type="text" name="restricao" id="restricao" placeholder="Restricao" required>
        </div>
        <button type="submit">Cadastrar</button>
    </form>

    <%
    String nome = request.getParameter("nome");
    String telefone = request.getParameter("telefone");
    String endereco = request.getParameter("endereco");
    String restricao = request.getParameter("restricao");
    out.print("Nome: " + nome + " - Telefone: " + telefone + " - Endereco: " + endereco + " - Restricao: " + restricao);
    %>
</body>
</html>