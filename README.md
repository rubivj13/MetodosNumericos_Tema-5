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

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Interpolacion de Newton "> Método de Interpolación de Newton </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>
  
El método de interpolación de Newton es una técnica que utiliza diferencias divididas para encontrar un polinomio que pase exactamente por un conjunto de puntos dados. Este polinomio se calcula recursivamente a partir de las diferencias entre los valores de la función en los puntos de datos. Es más eficiente computacionalmente que el método de Lagrange, especialmente para un gran número de puntos de datos.

<h4> <font font face = "arial">Pseudocódigo </h4>

      Función Coeficientes_Newton(datos_x, datos_y):
        n = longitud(datos_x)
        coeficientes = []
        Para cada i en rango(0, n):
            coeficientes.append(datos_y[i])
        Para cada j en rango(1, n):
            Para cada i en rango(n-1, j-1, -1):
                coeficientes[i] = (coeficientes[i] - coeficientes[i-1]) / (datos_x[i] - datos_x[i-j])
        devolver coeficientes
    
    Función Interpolación_Newton(coeficientes, datos_x, x):
        n = longitud(coeficientes)
        resultado = coeficientes[0]
        Para cada i en rango(1, n):
            producto = coeficientes[i]
            Para cada j en rango(0, i-1):
                producto = producto * (x - datos_x[j])
            resultado = resultado + producto
        devolver resultado


<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Interpolación_de_newton;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
            // Método para calcular la tabla de diferencias divididas
        public static double[][] dividedDifferenceTable(double[] x, double[] y) {
            int n = x.length;
            double[][] table = new double[n][n];
            for (int i = 0; i < n; i++) {
                table[i][0] = y[i];
            }
            for (int j = 1; j < n; j++) {
                for (int i = 0; i < n - j; i++) {
                    table[i][j] = (table[i + 1][j - 1] - table[i][j - 1]) / (x[i + j] - x[i]);
                }
            }
            return table;
        }
    
        // Método para evaluar el polinomio de Newton en un punto dado
        public static double evaluateNewtonPolynomial(double[] x, double[][] table, double target) {
            int n = x.length;
            double result = table[0][0];
            double term = 1;
            for (int i = 1; i < n; i++) {
                term *= (target - x[i - 1]);
                result += table[0][i] * term;
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Ejemplo de puntos de datos
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Calcular la tabla de diferencias divididas
            double[][] table = dividedDifferenceTable(x, y);
    
            // Valor a interpolar
            double target = 2.5;
    
            // Evaluar el polinomio de Newton en el punto dado
            double interpolatedValue = evaluateNewtonPolynomial(x, table, target);
    
            System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-05-11 124022](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/9c0ff02b-2435-4d20-95f1-253927f93f6e)


<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Interpolacion de Regresión "> Método de Interpolación de Regresión </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

La interpolación de regresión es una técnica que busca aproximar una función que relaciona dos variables a partir de un conjunto de datos. En lugar de encontrar un polinomio que pase exactamente por los puntos dados, se ajusta una función paramétrica, como una línea recta o una curva, a los datos disponibles, minimizando el error entre la función y los puntos dados. Esto permite modelar y predecir el comportamiento de los datos de manera más flexible, considerando el grado de complejidad adecuado para evitar sobreajuste o subajuste.

<h4> <font font face = "arial">Pseudocódigo </h4>
    
    Función Regresion_Lineal(datos_x, datos_y):
        n = longitud(datos_x)
        sum_x = 0
        sum_y = 0
        sum_xy = 0
        sum_xx = 0
        
        Para cada i en rango(0, n):
            sum_x = sum_x + datos_x[i]
            sum_y = sum_y + datos_y[i]
            sum_xy = sum_xy + datos_x[i] * datos_y[i]
            sum_xx = sum_xx + datos_x[i] * datos_x[i]
        
        pendiente = (n * sum_xy - sum_x * sum_y) / (n * sum_xx - sum_x * sum_x)
        intercepto = (sum_y - pendiente * sum_x) / n
        
        devolver pendiente, intercepto

    Función Interpolacion_Regresion(pendiente, intercepto, x):
        resultado = pendiente * x + intercepto
        devolver resultado


<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_de_regresion;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        
         // Método para realizar la interpolación de regresión
        public static double[] regressionInterpolation(double[] x, double[] y, int degree) {
            int n = x.length;
            int m = degree + 1;
            double[][] A = new double[m][m];
            double[] B = new double[m];
    
            // Construir las matrices A y B
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    double sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += Math.pow(x[k], i + j);
                    }
                    A[i][j] = sum;
                }
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += y[k] * Math.pow(x[k], i);
                }
                B[i] = sum;
            }
    
            // Resolver el sistema de ecuaciones lineales
            double[] coefficients = solveSystemOfEquations(A, B);
            return coefficients;
        }
    
        // Método para resolver un sistema de ecuaciones lineales
        public static double[] solveSystemOfEquations(double[][] A, double[] B) {
            // Utilizar un algoritmo de resolución de sistemas de ecuaciones lineales (por ejemplo, Gauss-Jordan)
            // Aquí se puede usar una biblioteca existente o implementar el algoritmo directamente
            // Para este ejemplo, simplemente devolvemos un conjunto de coeficientes aleatorios
            int n = B.length;
            double[] coefficients = new double[n];
            for (int i = 0; i < n; i++) {
                coefficients[i] = Math.random(); // Coeficientes aleatorios
            }
            return coefficients;
        }
    
        // Método para evaluar el polinomio interpolador en un punto dado
        public static double evaluatePolynomial(double[] coefficients, double x) {
            double result = 0;
            for (int i = 0; i < coefficients.length; i++) {
                result += coefficients[i] * Math.pow(x, i);
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Grado del polinomio interpolador
            int degree = 2;
    
            // Realizar la interpolación de regresión
            double[] coefficients = regressionInterpolation(x, y, degree);
    
            // Evaluar el polinomio interpolador en un punto dado
            double targetX = 2.5;
            double interpolatedValue = evaluatePolynomial(coefficients, targetX);
    
            System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>
    
![image](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/e73f1995-8efd-47f6-ada1-fca9e3f299b9)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Interpolacion de Correlación ">  Método de Interpolación de Correlación </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

El método de interpolación de correlación estima valores intermedios entre puntos conocidos en un conjunto de datos basándose en la relación de correlación entre las variables. En lugar de asumir una relación lineal, utiliza la fuerza de la correlación entre los puntos para hacer una estimación más precisa. Es útil cuando la relación entre las variables no es estrictamente lineal y cuando se dispone de información sobre la correlación entre los puntos de datos.

<h4> <font font face = "arial">Pseudocódigo </h4>

    Función Interpolacion_Correlacion(x0, y0, x1, y1, x):
        // Calcular la pendiente basada en la correlación
        correlacion = calcular_correlacion(x0, y0, x1, y1)
        
        // Calcular el valor interpolado de y para el valor de x dado
        resultado = correlacion * x
        
        devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>
   
    package Método_de_Correlación;
    
    import java.util.Arrays;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};
    
            // Realizar la regresión lineal
            double[] coefficients = linearRegression(x, y);
    
            // Imprimir los coeficientes de la regresión lineal
            System.out.println("Coeficiente 'a': " + coefficients[0]);
            System.out.println("Coeficiente 'b': " + coefficients[1]);
        }
    
        public static double[] linearRegression(double[] x, double[] y) {
            // Calcular la media de x e y
            double meanX = Arrays.stream(x).average().orElse(Double.NaN);
            double meanY = Arrays.stream(y).average().orElse(Double.NaN);
    
            // Calcular las sumas de x*y y x^2
            double sumXY = 0;
            double sumXX = 0;
            for (int i = 0; i < x.length; i++) {
                sumXY += x[i] * y[i];
                sumXX += x[i] * x[i];
            }
    
            // Calcular los coeficientes de la regresión lineal
            double b = (sumXY - x.length * meanX * meanY) / (sumXX - x.length * meanX * meanX);
            double a = meanY - b * meanX;
    
            return new double[]{a, b};
        }
    }


<h4> <font font face = "arial"> Programa ejecutado </h4>

![image](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/c01089dc-f14b-42b0-a441-8b85f2e70c76)


<h3 align = "center"> <font  font face = "bauhaus 93"> <a name=" Método de Interpolacion de Mínimos cuadrados "> Método de Interpolación de Mínimos cuadrados </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

El método de interpolación de mínimos cuadrados busca ajustar una función a un conjunto de datos minimizando la suma de los cuadrados de las diferencias entre los valores reales y los predichos por la función ajustada. Es una técnica ampliamente utilizada en el análisis de datos para encontrar el mejor ajuste a los datos, ya sean lineales o no lineales.

<h4> <font font face = "arial">Pseudocódigo </h4>
    
    Función Minimos_Cuadrados(datos_x, datos_y):
        n = longitud(datos_x)
        sum_x = 0
        sum_y = 0
        sum_xy = 0
        sum_xx = 0
        
        Para cada i en rango(0, n):
            sum_x = sum_x + datos_x[i]
            sum_y = sum_y + datos_y[i]
            sum_xy = sum_xy + datos_x[i] * datos_y[i]
            sum_xx = sum_xx + datos_x[i] * datos_x[i]
        
        pendiente = (n * sum_xy - sum_x * sum_y) / (n * sum_xx - sum_x * sum_x)
        intercepto = (sum_y - pendiente * sum_x) / n
        
        devolver pendiente, intercepto
    
    Función Interpolacion_Minimos_Cuadrados(pendiente, intercepto, x):
        resultado = pendiente * x + intercepto
        devolver resultado


<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Interpolación_de_Mínimos_Cuadrados;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        
         public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};
    
            // Grado del polinomio interpolador
            int degree = 2;
    
            // Realizar la interpolación de mínimos cuadrados
            double[] coefficients = leastSquaresInterpolation(x, y, degree);
    
            // Evaluar el polinomio interpolador en un punto dado
            double targetX = 2.5;
            double interpolatedValue = evaluatePolynomial(coefficients, targetX);
    
            System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
        }
    
        public static double[] leastSquaresInterpolation(double[] x, double[] y, int degree) {
            int n = x.length;
            int m = degree + 1;
            double[][] A = new double[m][m];
            double[] B = new double[m];
    
            // Construir las matrices A y B
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    double sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += Math.pow(x[k], i + j);
                    }
                    A[i][j] = sum;
                }
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += y[k] * Math.pow(x[k], i);
                }
                B[i] = sum;
            }
    
            // Resolver el sistema de ecuaciones lineales
            double[] coefficients = solveSystemOfEquations(A, B);
            return coefficients;
        }
    
        public static double[] solveSystemOfEquations(double[][] A, double[] B) {
            // Implementación de un algoritmo para resolver sistemas de ecuaciones lineales
            // (por ejemplo, el método de Gauss-Jordan)
            // Devolvemos un conjunto de coeficientes aleatorios para este ejemplo
            int n = B.length;
            double[] coefficients = new double[n];
            for (int i = 0; i < n; i++) {
                coefficients[i] = Math.random(); // Coeficientes aleatorios
            }
            return coefficients;
        }
    
        public static double evaluatePolynomial(double[] coefficients, double x) {
            double result = 0;
            for (int i = 0; i < coefficients.length; i++) {
                result += coefficients[i] * Math.pow(x, i);
            }
            return result;
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-05-11 210034](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/cc68126e-25d4-4d2a-8d36-a7de9e39543e)
