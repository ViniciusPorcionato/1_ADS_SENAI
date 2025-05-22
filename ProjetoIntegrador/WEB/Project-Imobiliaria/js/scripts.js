// Tab buttons functionality
const buttons = document.querySelectorAll('.tab-button');
buttons.forEach(btn => {
  btn.addEventListener('click', () => {
    buttons.forEach(b => b.classList.remove('active'));
    btn.classList.add('active');
  });
});

// Carousel functionality
const properties = [
  {
    id: "no-proia",
    title: "Casa no Proia",
    location: "Santos, Praia Grande",
    price: "R$ 1.200.000",
    image: "./assets/images/casa1.jpg"
  },
  {
    id: "praia",
    title: "Casa na Praia",
    location: "São Paulo, Praia Grande",
    price: "R$ 220.000",
    image: "./assets/images/casa2.jpg"
  },
  {
    id: "moderna",
    title: "Casa Moderna",
    location: "Rio de Janeiro, Copacabana",
    price: "R$ 3.500.000",
    image: "./assets/images/casa3.jpg"
  },
  {
    id: "apartamento",
    title: "Apartamento Luxo",
    location: "Belo Horizonte, Centro",
    price: "R$ 850.000",
    image: "./assets/images/casa4.jpg"
  },
  {
    id: "cobertura",
    title: "Cobertura",
    location: "São Paulo, Morumbi",
    price: "R$ 4.200.000",
    image: "./assets/images/casa5.png"
  },
  {
    id: "chacara",
    title: "Chácara",
    location: "Minas Gerais, Serra",
    price: "R$ 1.750.000",
    image: "./assets/images/casa6.jpg"
  },
  {
    id: "campo",
    title: "Casa de Campo",
    location: "São Paulo, Interior",
    price: "R$ 980.000",
    image: "./assets/images/casa7.jpg"
  },
  {
    id: "beira-mar",
    title: "Casa Beira-Mar",
    location: "Santa Catarina, Florianópolis",
    price: "R$ 2.300.000",
    image: "./assets/images/casa8.jpg"
  },
  {
    id: "sobrado",
    title: "Sobrado",
    location: "Rio de Janeiro, Barra da Tijuca",
    price: "R$ 1.900.000",
    image: "./assets/images/casa9.jpg"
  }
];


function renderProperties() {
  const carouselTrack = document.getElementById('carousel-track');
  carouselTrack.innerHTML = '';
  
  properties.forEach(property => {
    const card = document.createElement('div');
    card.className = 'card';
    card.innerHTML = `
      <img class="image-card" src="${property.image}" alt="${property.title}">
      <div class="content-card">
        <h3 class="title-card">${property.title}</h3>
        <p class="location-card">${property.location}</p>
        <p class="price-card">${property.price}</p>
      </div>
    `;
    carouselTrack.appendChild(card);
  });
}

function scrollCarousel(direction) {
  const container = document.getElementById('carousel-track');
  const scrollAmount = 300;
  container.scrollBy({
    left: scrollAmount * direction,
    behavior: 'smooth'
  });
}

// Initialize the carousel when the page loads
document.addEventListener('DOMContentLoaded', renderProperties);