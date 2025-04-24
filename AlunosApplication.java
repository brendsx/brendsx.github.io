const profiles = {
    anaCecilia: {
        name: "Ana Cecilia",
        description: "Estudante de Mídia e Tecnologia na UFSB. Apaixonada por design e inovação.",
        social: {
            instagram: "https://instagram.com/ana_cecilia",
            portfolio: "https://portfolio.com/ana_cecilia"
        },
        image: "imgs/ana_cecilia_primeira.jpeg"
    },
    anaClara: {
        name: "Ana Clara",
        description: "Estudante de Mídia e Tecnologia na UFSB. Focada em desenvolvimento de software.",
        social: {
            instagram: "https://instagram.com/ana_clara",
            portfolio: "https://portfolio.com/ana_clara"
        },
        image: "imgs/ana_clara_primeira.jpeg"
    },
    brenda: {
        name: "Brenda",
        description: "Estudante de Mídia e Tecnologia na UFSB. Entusiasta de mídias digitais.",
        social: {
            instagram: "https://instagram.com/brenda",
            portfolio: "https://portfolio.com/brenda"
        },
        image: "imgs/brenda_primeira.jpeg"
    },
    rafael: {
        name: "Rafael",
        description: "Estudante de Mídia e Tecnologia na UFSB. Focado em produção audiovisual.",
        social: {
            instagram: "https://instagram.com/rafael",
            portfolio: "https://portfolio.com/rafael"
        },
        image: "imgs/rafael_primeira.jpeg"
    },
    raissa: {
        name: "Raissa",
        description: "Estudante de Mídia e Tecnologia na UFSB. Apaixonada por comunicação e marketing.",
        social: {
            instagram: "https://instagram.com/raissa",
            portfolio: "https://portfolio.com/raissa"
        },
        image: "imgs/raissa_primeira.jpeg"
    }
};

function showProfile(student) {
    const profile = profiles[student];
    const perfilInfo = document.getElementById('perfil-info');

    if (profile) {
        perfilInfo.innerHTML = `
            <h2>${profile.name}</h2>
            <img src="${profile.image}" alt="${profile.name}" style="width: 100%; border-radius: 10px;">
            <p>${profile.description}</p>
            <p><strong>Redes Sociais:</strong></p>
            <p><a href="${profile.social.instagram}" target="_blank">Instagram</a></p>
            <p><a href="${profile.social.portfolio}" target="_blank">Portfolio</a></p>
        `;
    }
}