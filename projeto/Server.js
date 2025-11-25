// Server.js – Controle de Slides

// Elementos
const slides = document.querySelectorAll('.slide');
const btnAnterior = document.getElementById('btnAnterior');
const btnProximo = document.getElementById('btnProximo');
const slideAtualEl = document.getElementById('slideAtual');
const totalSlidesEl = document.getElementById('totalSlides');
const progressoEl = document.getElementById('progresso');

// Estado
let slideAtual = 0;
const totalSlides = slides.length;

// Atualizar total de slides
totalSlidesEl.textContent = totalSlides;

// Função para mostrar slide
function mostrarSlide(n) {
    // Remover classe active de todos
    slides.forEach(slide => {
        slide.classList.remove('active', 'prev');
    });

    // Garantir que n está dentro dos limites
    if (n >= totalSlides) {
        slideAtual = totalSlides - 1;
    } else if (n < 0) {
        slideAtual = 0;
    } else {
        slideAtual = n;
    }

    // Adicionar classe active no slide atual
    slides[slideAtual].classList.add('active');

    // Atualizar indicador
    slideAtualEl.textContent = slideAtual + 1;

    // Atualizar barra de progresso
    const progresso = ((slideAtual + 1) / totalSlides) * 100;
    progressoEl.style.width = progresso + '%';

    // Controlar botões
    btnAnterior.disabled = slideAtual === 0;
    btnProximo.disabled = slideAtual === totalSlides - 1;
}

// Avançar slide
function proximoSlide() {
    if (slideAtual < totalSlides - 1) {
        mostrarSlide(slideAtual + 1);
    }
}

// Voltar slide
function slideAnterior() {
    if (slideAtual > 0) {
        mostrarSlide(slideAtual - 1);
    }
}

// Event Listeners
btnProximo.addEventListener('click', proximoSlide);
btnAnterior.addEventListener('click', slideAnterior);

// Navegação por teclado
document.addEventListener('keydown', (e) => {
    if (e.key === 'ArrowRight') {
        proximoSlide();
    } else if (e.key === 'ArrowLeft') {
        slideAnterior();
    }
});

// Inicializar
mostrarSlide(0);
