//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
package Ejercicios.SevenEightNine.Cuatro;

public class Main {

    // El problema de utilizar un Vector con la capacidad por defecto para 1000 elementos es que el Vector tiene una capacidad inicial y, si se alcanza su límite, debe redimensionarse,
    // lo que implica crear un nuevo Vector con mayor capacidad y copiar todos los elementos existentes en el nuevo Vector. Esto puede ser ineficiente cuando se agregan muchos elementos,
    // ya que se deben realizar copias y asignaciones adicionales.
    // Los redimensionamientos frecuentes pueden tener un impacto significativo en el rendimiento y la eficiencia del programa. Cada redimensionamiento implica
    // asignación de memoria adicional, copia de elementos y liberación de memoria anterior, lo que puede ser costoso en términos de tiempo y consumo de recursos.
    // Para evitar este problema, es recomendable especificar una capacidad inicial adecuada para el Vector cuando se sabe que se agregarán muchos elementos.
    // Al proporcionar una capacidad inicial suficiente, se puede evitar o minimizar la necesidad de redimensionamientos frecuentes y mejorar el rendimiento general del programa.
    // Para evitar que se duplique el valor del vector con la funcion capacityIncrement podremos incrementar la capacidad asi por ejemplo si el vector de 1000 elementos supera el valor
    // No aumente a 2000elementos sino que aumente a 1100elementos.
}
