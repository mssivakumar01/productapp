/**
 * 
 */
const app = document.getElementById('root');

const container = document.createElement('div');
container.setAttribute('class', 'container');

app.appendChild(container);

var request = new XMLHttpRequest();
request.open('GET', 'https://localhost:8080/api/products', true);
request.onload = function () {

  // Begin accessing JSON data here
  var data = JSON.parse(this.response);
  if (request.status >= 200 && request.status < 400) {
    data.forEach(product => {
      const card = document.createElement('div');
      card.setAttribute('Products', 'product');

      const h1 = document.createElement('name');
      h1.textContent = product.name;

      const p = document.createElement('description');
      product.description = movie.description.substring(0, 300);
      p.textContent = `${product.description}...`;

      container.appendChild(card);
      card.appendChild(h1);
      card.appendChild(p);
    });
  } else {
    const errorMessage = document.createElement('marquee');
    errorMessage.textContent = `Gah, it's not working!`;
    app.appendChild(errorMessage);
  }
}

request.send();