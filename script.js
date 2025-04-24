document.addEventListener("DOMContentLoaded", () => {
    // Efeito hover para os cartões de alunos
    const studentCards = document.querySelectorAll(".student-card");
    studentCards.forEach(card => {
        card.addEventListener("mouseenter", () => {
            card.style.transform = "scale(1.1)";
            card.style.transition = "transform 0.3s, box-shadow 0.3s";
            card.style.boxShadow = "0 8px 15px rgba(0, 0, 0, 0.3)";
        });

        card.addEventListener("mouseleave", () => {
            card.style.transform = "scale(1)";
            card.style.boxShadow = "0 4px 6px rgba(0, 0, 0, 0.1)";
        });
    });

    // Efeito hover para os links na página de perfil
    const profileLinks = document.querySelectorAll(".links a");
    profileLinks.forEach(link => {
        link.addEventListener("mouseenter", () => {
            link.style.textDecoration = "underline";
            link.style.color = "#4500b5";
        });

        link.addEventListener("mouseleave", () => {
            link.style.textDecoration = "none";
            link.style.color = "#6200ea";
        });
    });
});