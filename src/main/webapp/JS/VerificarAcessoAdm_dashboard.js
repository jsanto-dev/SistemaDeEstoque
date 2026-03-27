function verificarAcessoAdm(event) {
    event.preventDefault();
    const PIN_MESTRE = "1234";
    let tentativa = prompt("Área Restrita: Digite o PIN de Administrador:");
    if (tentativa === PIN_MESTRE) {
        window.location.href = "cadastro.html"; 
    } else if (tentativa !== null) {
        alert("PIN Incorreto! Acesso negado.");
    }
}

