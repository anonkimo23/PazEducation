
// Esperar a que la página cargue completamente para ejecutar las animaciones LINEA DE HEADER
window.onload = function() {
    // Agregar la clase de animación para que el logo y el texto se deslicen hacia abajo
    document.querySelector('.header-content').classList.add('slide-down');
    document.querySelector('.header-logo').classList.add('slide-down');
};

//container
document.addEventListener("DOMContentLoaded", function() {
    const contentBoxes = document.querySelectorAll('.content-box');
    const imageCollages = document.querySelectorAll('.image-collage');
    const paragraphs = document.querySelectorAll('p');

    const options = {
        root: null, 
        rootMargin: "0px",
        threshold: 0.5 
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {

                entry.target.classList.add('visible');
            } else {

                entry.target.classList.remove('visible');
            }
        });
    }, options);

    contentBoxes.forEach(box => observer.observe(box));
    imageCollages.forEach(collage => observer.observe(collage));
    paragraphs.forEach(paragraph => observer.observe(paragraph));
});
