const button = document.querySelector("#btnres");
const total = document.querySelector("#total");
const cat = document.querySelector("#categoria");
const canti = document.querySelector("#cantidad");
button.onclick = () => {
  if (cat.value == "Estudiante") {
    total.value = "Total a pagar:$" + canti.value * 200 * 0.2;
  } else if (cat.value == "Trainee") {
    total.value = "Total a pagar:$" + canti.value * 200 * 0.5;
  } else {
    total.value = "Total a pagar:$" + canti.value * 200 * 0.85;
  }
};
