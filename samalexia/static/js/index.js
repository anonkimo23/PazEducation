//header
window.onload = function() {
    const tagPreescolar = document.querySelector('.tag-preescolar');

    tagPreescolar.style.animation = 'slideInLeftStraight 1s ease-out forwards';
};
//menu
function toggleMenu() {
    const menuCircular = document.querySelector('.menu-circular');
    const menu = document.querySelector('.menu');
    menuCircular.classList.toggle('active');
    menu.classList.toggle('active');


    if (menuCircular.classList.contains('active')) {
        menuCircular.style.opacity = '1'; 
    } else {
        menuCircular.style.opacity = '1';
        }
    }
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