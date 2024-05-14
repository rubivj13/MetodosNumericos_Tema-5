<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> Tema 5: Métodos de interpolación </i> </b> </font> </h1>

<h4> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i>Integrantes </i> </b> </font> </h4>

<li>Rubi Veloz Jimenez</li>

--------------------------------------------------------------------------------------------------------------------------------------

<h3 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  Indice </font> </h3>

<header> <font color = "red" size="+1" font face = "aharoni">
    <nav class = "navegacion">
      <ul class = "Indice">
        <li> <a href = "#Descripción"> Descripción </a> <br> </li>
        <li> <a href = "#Temario"> Temario </a> <br> </li>
        <li> <a href = "#Métodos"> Métodos </a> <br> </li>
          <ul class = "subindice">
              <li> <a href="# Método de Interpolacion de Lagrange "> Método de Interpolacion de Lagrange </a> <br> </li>
              <li> <a href="# Método de Interpolacion de Newton "> Método de Interpolacion de Newton </a> <br> </li>
              <li> <a href="# Método de Interpolacion de Regresión"> Método de Interpolacion de Regresión </a> <br> </li> 
              <li> <a href="# Método de Interpolacion de Correlación "> Método de Interpolacion de Correlación </a> <br> </li> 
            <li> <a href="# Método de Interpolacion de Mínimos cuadrados "> Método de Interpolacion de Mínimos cuadrados </a> <br> </li> 
            <li> <a href="# Método de Interpolacion Lineal "> Método de Interpolacion Lineal </a> <br> </li> 
          </ul>
      </ul>
    </nav>
</font> </header>

--------------------------------------------------------------------------------------------------------------------------------------


<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción"> Descripción</a> </font> </h3>

En este documento podremos observar el funcionamiento de diversos métodos, los cuales son:

  1. Método de Interpolacion de Lagrange
  2. Método de Interpolacion de Newton
  3. Método de Interpolación de Regresión
  4. Método de Interpolación de Correlación
  5. Método de Interpolación de Mínimos cuadrados
  6. Método de Interpolación Lineal

En cada una de las carpetas podremos encontrar lo que son los códigos de cada método y en cada carpeta podremos encontrar cinco programas los cuales estan desarrollados en el lenguaje de programación Java, en los cuales estarán documentados para un mayor entendimiento del programa.

--------------------------------------------------------------------------------------------------------------------------------------

<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Temario"> Temario</a> </font> </h3>

--------------------------------------------------------------------------------------------------------------------------------------

<h1 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos"> Métodos</a> </font> </h1>


<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Interpolacion de Lagrange ">  Método de Interpolación de Lagrange </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

El método de interpolación de Lagrange es una técnica para encontrar un polinomio que pase exactamente por un conjunto dado de puntos. Se basa en construir un polinomio que sea una combinación lineal de "polinomios base" de Lagrange diseñada específicamente para pasar por cada punto. Este método es útil para aproximar una función desconocida dada una serie de puntos discretos, aunque puede volverse costoso computacionalmente con un gran número de puntos.

<h4> <font font face = "arial">Pseudocódigo </h4>

    Función Lagrange_Interpolation(datos_x, datos_y, x):
    n = longitud(datos_x)
    resultado = 0
    Para cada i en rango(0, n):
        término = datos_y[i]
        Para cada j en rango(0, n):
            Si j != i:
                término = término * (x - datos_x[j]) / (datos_x[i] - datos_x[j])
        resultado = resultado + término
    devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Interpolación_de_lagrange;
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
    
        // Método para calcular el polinomio de Lagrange
        public static double interpolate(double[] x, double[] y, double target) {
            double result = 0;
            for (int i = 0; i < x.length; i++) {
                double term = y[i];
                for (int j = 0; j < x.length; j++) {
                    if (j != i) {
                        term *= (target - x[j]) / (x[i] - x[j]);
                    }
                }
                result += term;
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Ejemplo de puntos de datos
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Valor a interpolar
            double target = 2.5;
    
            // Calcular el valor interpolado
            double interpolatedValue = interpolate(x, y, target);
    
            System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-05-11 123510](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/601488b7-3bd5-439c-a7eb-0863605903bf)
