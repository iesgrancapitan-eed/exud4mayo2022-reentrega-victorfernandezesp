package com.vfe.eed.examen.OptimizacionYDocumentacion;
/**
 * <p>Clase Perro, la cual tiene nombre, edad y GUAUUUUUUUUUU como variable estática</p>
 * <p> Como comportamiento puede ladrar </p>
 * <p> Deriva de la clase Mascota </p>
 * @author Victor Fernandez
 *
 */
public class Perro extends Mascota {
  /**
   * El perro ladra
   */
  private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
  /**
   * Edad del perro
   */
  private int age;
  /**
   * Crea otro perro
   * @param name nombre del perro
   * @param age edad del perro
   * @throws EdadErroneaException lanzada en el caso de que la edad sea negativa
   */
  public Perro(String name, int age) throws EdadErroneaException {
    super();
    setAge(age);
    this.name = name;
  }
  /**
   * Pone la edad al perro
   * @param age edad del perro
   * @throws EdadErroneaException lanzada en el caso de que la edad sea negativa
   */
  
  public void setAge(int age) throws EdadErroneaException {
    if (age < 0)
      throw new EdadErroneaException("La edad no puede ser negativa");
    this.age = age;
  }
  /**
   * Recibe la edad del perro
   * @return edad del perro
   */
  public int getAge() {
    return this.age;
  }
  /**
   * El perro ladre
   * @return ladrido del perro
   */
  public String ladrar() {
    return GUAUUUUUUUUUU;
  }

}
