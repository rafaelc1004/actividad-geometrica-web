<%-- 
    Document   : index
    Created on : 30 abr 2022, 23:41:47
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
        <title>Calculo Geometrico</title>

        <style>
            .between{
                margin-left:30px;
            }

            .topMargin{
                margin-top:50px;
            }
            .botton{
                margin-bottom: 10px;
            }

            .center {
                display: flex;
                align-items: center;
                justify-content: center;

            }

            .alinear{
                text-align: left;

            }

        </style>
    </head>
    <body>
        <div class="row justify-content-center topMargin text-center">
            <div class="card col-4">
                <h4 class="card-title ">Calculo Geometrico</h4>
            </div>
            <form method="get" action="Controlador">
            <div class="row justify-content-center topMargin">
                
                    <div class="card col-lg-4 col-md-5 col-sm-5 col-xs-5 col-5">
                        <div class="card-body">
                            <h5 class="card-title">Calculos de Circulos</h5>
                            <p class="card-text alinear">- Calculo de area circulo<br>- Calculo Perimetro circulo</p>
                            <div class="d-grid gap-2">
                                <button class="btn btn-primary center" type="submit" value="circulo" name="figura">Circulo</button>
                            </div>
                        </div>
                    </div>

                    <div class="card col-lg-4 col-md-5 col-sm-5 col-xs-5 col-5 between" >
                        <div class="card-body">
                            <h5 class="card-title">Calculos de Rectangulo</h5>
                            <p class="card-text alinear">- Calculo de area rectangulo<br>- Calculo Perimetro rectangulo</p>
                            <div class="d-grid gap-2">
                                <button class="btn btn-primary center" type="submit" value="rectangulo" name="figura">Rectangulo</button>
                            </div>
                        </div>
                    </div>
               
            </div>
            </form>
        </div>
    </body>
</html>
