document.addEventListener("DOMContentLoaded", function () {
  // Seleciona todos os elementos da página que possuem a classe 'tab-button'
  const tabButtons = document.querySelectorAll(".tab-button");
  // Define a ação padrão inicial como 'comprar'
  let currentAction = "comprar";
  // Para cada botão de aba encontrado, adiciona um listener para o evento de clique
  tabButtons.forEach((button) => {
    button.addEventListener("click", function () {
      // Ao clicar em um botão, remove a classe 'active' de todos os botões (desativa todos)
      tabButtons.forEach((btn) => btn.classList.remove("active"));
      // Adiciona a classe 'active' apenas ao botão que foi clicado (ativa este botão)
      this.classList.add("active");
      // Atualiza a variável currentAction com o valor do atributo data-action do botão clicado
      currentAction = this.dataset.action;
    });
  });

  // Controle do formulário
  const searchForm = document.getElementById("searchForm");
  if (searchForm) {
    searchForm.addEventListener("submit", function (e) {
      e.preventDefault();

      // Redireciona conforme a ação selecionada
      if (currentAction === "comprar") {
        window.location.href = "imoveis-venda.html";
      } else {
        window.location.href = "imoveis-aluga.html";
      }
    });
  }

  if (document.getElementById("carousel-track")) {
    renderProperties("carousel-track");
  }

  if (document.getElementById("properties-grid")) {
    renderProperties("properties-grid", true);
  }
});

const properties = [
  {
    id: "1",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa1.jpg",
    venda: true,
  },
  {
    id: "2",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa2.jpg",
    venda: true,
  },
  {
    id: "3",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa3.jpg",
    venda: true,
  },
  {
    id: "4",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa4.jpg",
    venda: true,
  },
  {
    id: "5",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa5.png",
    venda: true,
  },
  {
    id: "6",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa6.jpg",
    venda: true,
  },
  {
    id: "7",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa7.jpg",
    venda: false,
  },
  {
    id: "8",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa8.jpg",
    venda: false,
  },
  {
    id: "9",
    title: "Casa no Praia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa9.jpg",
    venda: false,
  },
];

// Função para renderizar os imóveis no contêiner indicado
function renderProperties(containerId, isGrid = false) {
  const container = document.getElementById(containerId);
  if (!container) return; // Sai da função se o contêiner não existir

  container.innerHTML = ""; // Limpa o conteúdo atual do contêiner

  // Para cada imóvel na lista
  properties.forEach((property) => {
    const card = document.createElement("div");
    card.className = isGrid ? "property-card" : "card"; // Define a classe dependendo do layout

    // Define o HTML interno do card do imóvel
    card.innerHTML = `
      <img src="${property.image}" alt="${property.title}" class="${
      isGrid ? "property-image" : "image-card"
    }">
      <div class="${isGrid ? "property-info" : "content-card"}">
        <h3 class="${isGrid ? "property-title" : "title-card"}">${
      property.title
    }</h3>
        <p class="${isGrid ? "property-location" : "location-card"}">${
      property.location
    }</p>
        <p class="${isGrid ? "property-price" : "price-card"}">${
      property.price
    }</p>
      </div>
    `;

    // Ao clicar no card, redireciona para a página de detalhes do imóvel
    card.addEventListener("click", () => {
      window.location.href = `detalhes.html?id=${property.id}`;
    });

    // Adiciona o card ao contêiner
    container.appendChild(card);
  });
}

// Função para controlar o scroll horizontal do carrossel
function scrollCarousel(direction) {
  const container = document.getElementById("carousel-track");
  if (!container) return; // Sai da função se o contêiner não existir

  const scrollAmount = 300; // Define o quanto deve rolar
  container.scrollBy({
    left: scrollAmount * direction, // Rola para a esquerda ou direita
    behavior: "smooth", // Animação suave
  });
}

// Garante que os imóveis sejam renderizados após o DOM carregar
document.addEventListener("DOMContentLoaded", () => {
  if (document.getElementById("carousel-track")) {
    renderProperties("carousel-track");
  }

  if (document.getElementById("properties-grid")) {
    renderProperties("properties-grid", true);
  }
});
