# language: es
# Autor: Emmanuel Lopera

Característica: Registro
  Como usuario,
  quiero registrarme en la pagina
  para verificar que se crea el registro correctamente.

  @registro
  Escenario: Tratar de diligenciar registro exitosamente
    Dado que el usuario final accedio al sitio web del registro
    Cuando el usuario se registra en la página
    Entonces el usuario verifica que no se puede completar el registro