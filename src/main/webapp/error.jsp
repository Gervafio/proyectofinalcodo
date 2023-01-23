<%@ page contentType="text/html" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Comprar Tickets</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="./css/style.css" />
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">
        <img src="./assets/media/codoacodo.png" alt="Logo" height="60" class="d-inline-block align-text-end" />
        Conf Bs As
      </a>

      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
        aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">La conferencia</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Los oradores</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Fecha y Lugar</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#orador">Conviértete en orador</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-success" href="./tickets.html">Comprar tickets</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="container text-center">
    <div class="row justify-content-center">
      <div class="col-2">
        <div class="card border-primary mb-3" id="tarj">
          <div class="card-body">
            <h5 class="card-title">Estudiante</h5>
            <p class="card-text">
              Tienen un descuento
            </p>
            <h5 class="card-title">80%</h5>
            <p class="text-muted">
              *Presentar documentación
            </p>
          </div>
        </div>
      </div>

      <div class="col-2">
        <div class="card border-success mb-3" id="tarj">
          <div class="card-body">
            <h5 class="card-title">Trainee</h5>
            <p class="card-text">
              Tienen un descuento
            </p>
            <h5 class="card-title">50%</h5>
            <p class="text-muted">
              *Presentar documentación
            </p>
          </div>
        </div>
      </div>

      <div class="col-2">
        <div class="card border-warning mb-3" id="tarj">
          <div class="card-body">
            <h5 class="card-title">Junior</h5>
            <p class="card-text">
              Tienen un descuento
            </p>
            <h5 class="card-title">15%</h5>
            <p class="text-muted">
              *Presentar documentación
            </p>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="titulo">
    <div>
      VENTA
    </div>
    <div>
      <h2>VALOR DE TICKET $200</h2>
    </div>
  </div>

  <h2>Algo anda mal</h2>
  <p>Intente nuevamente</p>
  <a href="index.html" class="btn btn-primary" id="btnres">Atrás</a>




  <footer>
    <nav class="navbar navbar-expand-lg navbar-dark" id="footerbg">
      <div class="container-fluid">
        <div class="collapse navbar-collapse" id="menufooter">
          <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="#">Preguntas frecuentes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=" #">Contáctanos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Prensa</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Conferencias</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Términos y condiciones</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Privacidad</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Estudiantes</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </footer>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
    crossorigin="anonymous"></script>
  <script src="./script.js"></script>
</body>