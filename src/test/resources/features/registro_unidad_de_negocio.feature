#language: es
#Author:


@EjecucionCompleta
Característica: Registrar una unidad de negocio
  Como usuario de la página Serenity Demo
  Requiero registrar una unidad de negocio
  Para poder programar reuniones

  @InicioSesionIncorrecto
  Escenario: inicio de sesion con credenciales incorrectas
    Dado que entro a la pagina de Serenity Demo
    Cuando inicio sesion con el usuario y clave incorrectas
      | usuario | clave |
      | Manuel  | 12345 |
    Entonces no se inicia sesion y aparece el mensaje "Invalid username or password!"


  @RegistrarUnidadDeNegocio
  Escenario: Registrar una unidad de negocio
    Dado que ingreso al sistema
      | usuario | clave    |
      | admin   | serenity |
    Cuando registra una nueva Unidad de negocio
      | nombre                    |telefono|
      | Desarrollo Corporativo 02 |  44475 |
    Y programa una reunion
      | nombre     | unidad                    |
      | reunion001 | Desarrollo Corporativo 02 |
    Entonces la reunion se programa correctamente


