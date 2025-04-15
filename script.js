// Animação simples ao carregar a página
window.onload = function() {
    const componentes = document.querySelectorAll('.componente');
    
    // Animação de entrada
    componentes.forEach((componente, index) => {
        componente.style.opacity = 0; // Inicializa a opacidade 
        componente.style.transform = 'translateY(20px)'; // Move o componente para baixo
        setTimeout(() => {
            componente.style.transition = 'opacity 0.5s, transform 0.5s'; // Define a transição
            componente.style.opacity = 1; // Define a opacidade para 1
            componente.style.transform = 'translateY(0)'; // Move o componente para sua posição original
        }, index * 200); // Delay para cada componente

        // Animação ao passar o mouse
        componente.addEventListener('mouseenter', () => {
            componente.style.transform = 'scale(1.05)'; // Aumenta o tamanho do componente
            componente.style.boxShadow = '0 4px 15px rgba(0, 0, 0, 0.2)'; // Aumenta a sombra
        });

        componente.addEventListener('mouseleave', () => {
            componente.style.transform = 'scale(1)'; // Retorna ao tamanho original
            componente.style.boxShadow = '0 2px 5px rgba(0, 0, 0, 0.1)'; // Retorna à sombra original
        });
    });
};