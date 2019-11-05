

const Http = new XMLHttpRequest();
const url='https://jsonplaceholder.typicode.com/pets/mod';
Http.open("PUT", url);
Http.send();
