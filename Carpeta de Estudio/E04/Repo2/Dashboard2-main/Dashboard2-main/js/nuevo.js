let plot = (data) => { 
  const ctx = document.getElementById('myChart');
  const dataset = {
    labels: data.hourly.time, /* ETIQUETA DE DATOS */
    datasets: [{
        label: 'Temperatura semanal', /* ETIQUETA DEL GRÁFICO */
        data: data.hourly.temperature_2m, /* ARREGLO DE DATOS */
        fill: false,
        borderColor: 'rgb(75, 192, 192)',
        tension: 0.1
    }]
};
const config = {
  type: 'line',
  data: dataset,
  options:{

    maintainAspectRatio: false
  }
};
const chart = new Chart(ctx, config)

/*----------------------------*/
} 
let bars = (data) => { 
  const ctx = document.getElementById('myChart2');
  const dataset = {
    labels: data.daily.time, /* ETIQUETA DE DATOS */
    datasets: [{
        label: 'Indice uv', /* ETIQUETA DEL GRÁFICO */
        data: data.daily.uv_index_max, /* ARREGLO DE DATOS */
        fill: false,
        borderColor: 'rgb(75, 192, 192)',
        tension: 0.1
    }]
};
const config = {
  type: 'bar',
  data: dataset,
  options:{
  maintainAspectRatio: false
}
};
const chart = new Chart(ctx, config)

/*----------------------------*/
} 


let load = (data) => {

        let timezone = data["timezone"]
        let timezoneHTML = document.getElementById("timezone")
  
        let gtm = data["timezone_abbreviation"]
        let gtmHTML = document.getElementById("gtm")

  
        let elevacion = data["elevation"]
        let elevacionHTML = document.getElementById("elevation")
  
        let latitud = data["latitude"]
        let latitudHTML = document.getElementById("latitud")
  
        let logitud = data["longitude"]
        let logitudHTML = document.getElementById("longitud")
  
        timezoneHTML.textContent = timezone
        elevacionHTML.textContent = elevacion                                                                                                                                                              
        latitudHTML.textContent = latitud
        gtmHTML.textContent = "GTM"+gtm
        logitudHTML.textContent = logitud
        plot(data);
        bars(data);
  
  };

/* se esta usando proxy remoto, para ver la tabla solicitar en; https://cors-anywhere.herokuapp.com/corsdemo*/ 
let loadInocar = () => {

  let URL_proxy = "https://cors-anywhere.herokuapp.com/"; // Coloque el URL de acuerdo con la opción de proxy
  let URL = URL_proxy + "https://www.inocar.mil.ec/mareas/consultan.php";
  fetch(URL)
    .then(response => response.text())
    .then(data => {
      const parser = new DOMParser();
      const xml = parser.parseFromString(data, "text/html");
      //console.log(xml);
      let contenedorMareas = xml.getElementsByTagName('div')[0];
      let contenedorHTML = document.getElementById("table-container");
      contenedorHTML.innerHTML = contenedorMareas.innerHTML;
    })
    .catch(console.error);

}

(
    function () {
      let meteo = localStorage.getItem('meteo');
      if(meteo == null) {
        let URL = 'https://api.open-meteo.com/v1/forecast?latitude=-2.14&longitude=-79.95&hourly=temperature_2m&daily=uv_index_max&timezone=auto';
      
        fetch(URL)
        .then(response => response.json())
        .then(data => {
            load(data)
    
            /* GUARDAR DATA EN LA MEMORIA */
            localStorage.setItem("meteo", JSON.stringify(data))
    
        })
        .catch(console.error);
    
      } else {
    
          /* CARGAR DATA DESDE LA MEMORIA */
          load(JSON.parse(meteo))
    
      }
      loadInocar();
    }
  )();