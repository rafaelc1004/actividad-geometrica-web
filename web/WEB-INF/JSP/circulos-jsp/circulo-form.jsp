<%-- 
    Document   : circulo-form
    Created on : 1 may 2022, 18:27:27
    Author     : Rafaelito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
        <title>Formulario Circulo</title>
        
        <style>
            .mensajeError {
                color: red;
                font-size: 11px;
            }
            .error {
                border-color: red;
            }
        </style>
        
    </head>
    <body>
        <div class="row justify-content-center">
            <div class="card-title col-7">
                <h4 class="card-title text-center">Calculo Geometrico de Circulo</h4>
            </div>
            <form method="post" action="Controlador" id="formulario">
                <div class="row justify-content-center" >
                    <div class="card col-6">
                        <div class="card-body">
                            <select class="form-select" aria-label="operacion" name="operacion" id="operacion"  required onchange="onLimpiarEstilos('apellidoMaterno')">
                                <option>Operacion a Realizar</option>
                                <option value="area">Calcular Area de Circulo</option>
                                <option value="perimetro">Calcular Perimetro de Circulo</option>
                                <opcion value="radio">Calcular Radio de Circulo</opcion>
                            </select>
                            <div id="errorOperacion" class="mensajeError"></div>

                            <div class="mb-3">
                                <label for="base" class="form-label">Diametro de Rectangulo:</label>
                                <input type="text" class="form-control" id="diametro" name="diametro" placeholder="ingrese diametro de rectangulo" required>
                            </div>
                            <div class="d-grid gap-2">
                                <button class="btn btn-primary center" type="submit" value="circulo" name="figura" >Circulo</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <script>
            const formulario = document.getElementById("formulario");
            
            const operacion = document.getElementById("operacion");
            
            const errorOperacion = decument.getElementById("errorOperacion");
            
            formulario.addEventListener("submit", (ev) =>{
                
                valorOperacion = operacion.value;
                
                if(valorOperacion == null || valorOperacion == ""){
                    ev.preventDefault();
                    errorNombres.innerText = "No ha seleccionado una operacion a realizar";
                    operacion.className ="error form-select";
                }
                
                if(valorOperacion != "" && valorOperacion != null){
                    errorOperacion.innerText = "";
                    operacion.className ="error form-select";
                 
                }
                
            });
            
            function onCleanStyle(inputName){
                if(inputName =="operacion"){
                    errorOperacion.innerText="";
                    operacion.className = "form-select";
                }
            }
            
            
        </script>
    </body>
</html>
