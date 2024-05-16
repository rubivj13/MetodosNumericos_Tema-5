# Métodos numéricos -> Tema 5: Métodos de interpolación.

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> SALUDO </i> </b> </font> </h1>

¡Hola a todos! Soy Rubí Veloz Jiménez, estudiante de Ingeniería en Sistemas Computacionales. En esta ocasión, les presento un problemario relacionado con la materia de Métodos de interpolación (método interpolación lineal, método interpolación cuadrática, método  interpolación de Lagrange, método interpolación de Newton, método de correlación y  método de regreción).

# <h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  ÍNDICE </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#Descripción del Problemario"> Descripción del Problemario. </a> <br> </li>
                        <li> <a href="#Sobre la materia"> Sobre la materia. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Competencia de la Asignatura"> Competencia de la Asignatura. </a> </li>
                                <li> <a href="#Competencia del tema"> Competencia del tema. </a> </li>
                                <li> <a href="#Temario"> Temario. </a> </li>  
                            </ul>
                      <li> <a href="#Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Método interpolación lineal"> Método interpolación lineal. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónIL"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoIL"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoIL"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónIL"> Implementación. </a> </li>  
                                    </ul>
                                <li> <a href="#Método interpolación cuadrática"> Método interpolación cuadrática. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónIC"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoIC"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoIC"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónIC"> Implementación. </a> </li>  
                                    </ul>
                                <li> <a href="#Método interpolación de Lagrange"> Método interpolación de Lagrange. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónILa"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoILa"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoILa"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónILa"> Implementación. </a> </li>  
                                    </ul>
                                <li> <a href="#Método interpolación de Newton"> Método interpolación de Newton. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónIN"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoIN"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoIN"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónIN"> Implementación. </a> </li>  
                                    </ul>
                                <li> <a href="#Método de correlación"> Método de correlación. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónC"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoC"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoC"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónC"> Implementación. </a> </li>  
                                    </ul>
                                <li> <a href="#Método de regreción"> Método de regreción. </a> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#DescripciónR"> Descripción. </a> </li>
                                        <li> <a href="#AlgoritmoR"> Algoritmo. </a> </li> 
                                        <li> <a href="#PseudocódigoR"> Pseudocódigo. </a> </li>
                                        <li> <a href="#ImplementaciónR"> Implementación. </a> </li>  
                                    </ul>
                            </ul>
                    </ul>
                </nav>
            </font> </header>

--------------------------------------------------------------------------------------------------------------------------------------

# <h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos seis métodos de interpolación. Estos métodos son:

1. **Método de interpolación lineal**:
   - Estima la ubicación de un punto dentro de un intervalo numérico.
   - Supone que los valores extremos del intervalo están unidos por una recta.
   - Es la forma más simple de interpolación.
   - Se utiliza para estimar valores intermedios entre dos puntos conocidos.

2. **Método de interpolación cuadrática**:
   - Utiliza una función cuadrática o parábola para realizar la interpolación.
   - Es más preciso que la interpolación lineal.
   - Utiliza un polinomio de segundo grado en lugar de uno de primer grado.

3. **Método de interpolación de Lagrange**:
   - Utiliza un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar.
   - Es útil para situaciones que requieran un número bajo de puntos para interpolar.
   - El grado del polinomio es igual al número de puntos menos uno.

4. **Método de interpolación de Newton**:
   - Utiliza un polinomio para interpolar un conjunto de puntos.
   - Es útil para situaciones que requieran un número alto de puntos para interpolar.
   - A medida que crece el número de puntos, también lo hace el grado del polinomio.

5. **Método de correlación**:
   - Se utiliza para medir y comprender el grado de correlación entre dos variables.
   - Se utiliza para analizar cómo varía una variable cuando la otra presenta modificaciones.
   - Permite identificar patrones y tendencias en un conjunto de datos.

6. **Método de regresión**:
   - Permite examinar la relación entre dos o más variables.
   - Identifica cuáles son las variables que tienen mayor impacto en un tema de interés.
   - Se utiliza para predecir el valor de una variable dependiente a partir de una o más variables independientes.

********************************************************************************************************************************************************************************************************************

# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura"> Competencia de la Asignatura </a> </h3>

...
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Competencia del tema"> Competencia del tema </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Temario"> Temario  </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio. </a> </font> </h2>

# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación lineal"> 1. Método interpolación lineal </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIL"> Descripción. </a> </h4>

El **Método de interpolación lineal** es un procedimiento muy utilizado para estimar los valores que toma una función en un intervalo del cual conocemos sus valores en los extremos.

- Este método consiste en estimar la ubicación de un punto dentro de un intervalo numérico, suponiendo que los valores extremos de dicho intervalo están unidos por una recta.
- Conocida la ecuación de esta recta, es posible ubicar el punto desconocido.
- La interpolación lineal es rápida y sencilla, pero en ciertos casos no muy precisa.
- Se tienen dos puntos de coordenadas [xo, f (xo)] y [x1, f (x1)] entre los cuales está el punto [x, g (x)], cuyas coordenadas se desea conocer.
- El primer paso consiste en unir los puntos conocidos mediante un segmento de recta, sobre el cual se encuentran las coordenadas del punto a calcular.
- Como se puede ver, se forman dos triángulos rectángulos: ABC y APD, que además tienen un ángulo agudo en común, por lo que son triángulos semejantes, a los que se puede aplicar el teorema de Thales.
- De allí se procede a despejar g (x): Llamando: f1(x1) = y1 ; fo(xo) = yo ; g (x) = y. La ecuación de arriba se transforma en: y = yo + ((y1 - yo)/(x1 - xo)) * (x - xo).
- Cuando se aproxima una función con este método, la cota de error viene dada por el valor absoluto de la diferencia entre la función f (x) y la recta interpoladora g (x): Error = │f (x) − g (x) │.

Formúla


![Captura de pantalla 2024-05-15 170129](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/345e786b-affa-45ea-ac2b-b383d36a40ce)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIL"> Algoritmo. </a> </h4>

1. **Determinar el punto incógnita P (x,y)**: Este es el punto que queremos estimar.

2. **Establecer los dos puntos que limitan el intervalo donde se encuentra el valor a calcular**, es decir, los puntos (x₀, y₀) y (x₁, y₁): Estos son los dos puntos conocidos que se utilizan para la interpolación.

3. **Sustituir todos los valores en la ecuación**: La ecuación de interpolación lineal es f_1(x) = f(x_0) + ((f(x_1) - f(x_0))/(x_1 - x_0))* (x - x_0). Sustituye los valores de x₀, y₀, x₁, y₁ y x en esta ecuación.

![Captura de pantalla 2024-05-15 170129](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/3c39c286-c5fa-42fb-a46a-af76b2ef1d86)


4. **Calcular el resultado**: Realiza los cálculos necesarios para obtener el valor de y.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIL"> Pseudocódigo. </a> </h4>


    Función Interpolacion_Lineal(x0, y0, x1, y1, x):
        pendiente = (y1 - y0) / (x1 - x0)
        resultado = y0 + pendiente * (x - x0)
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIL"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_Lineal;
    
    public class Ejercicio1 {
    
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {6, 7, 8, 9, 10}; // Valores de x
            double[] y = {2.5, 3.7, 1.5, 2.6, 7.8}; // Valores de y
    
            // Punto de interpolación
            double xInterpolation = 2.5;
    
            // Realizar la interpolación lineal
            double yInterpolated = linearInterpolation(x, y, xInterpolation);
    
            // Imprimir el resultado
            System.out.println("El valor interpolado en x=" + xInterpolation + " es: " + yInterpolated);
        }
    
        public static double linearInterpolation(double[] x, double[] y, double xInterpolation) {
            int n = x.length;
    
            // Encontrar el índice i tal que x[i] <= xInterpolation < x[i+1]
            int i = 0;
            while (i < n - 1 && x[i] < xInterpolation) {
                i++;
            }
    
            // Calcular la pendiente (m) y el intercepto (b) de la recta entre (x[i], y[i]) y (x[i+1], y[i+1])
            double m = (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
            double b = y[i] - m * x[i];
    
            // Calcular el valor interpolado
            return m * xInterpolation + b;
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-15 171250](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/b6d99ed5-f4c6-4616-80ab-14370665dbe6)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_Lineal"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_Lineal </font> </a>














# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación cuadrática"> 2. Método interpolación cuadrática </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIC"> Descripción. </a> </h4>

La **interpolación cuadrática** es un método que se utiliza para encontrar una función polinómica de segundo grado (un polinomio cuadrático) que pasa por un conjunto dado de puntos. Este método es útil cuando los datos siguen una tendencia cuadrática.

La fórmula general para un polinomio cuadrático es:

![Captura de pantalla 2024-05-15 172627](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/d36d6bb4-2f25-4e62-a080-5ad9aed39bc7)


Donde (x_0), (x_1) y (x_2) son los puntos conocidos, y (a), (b) y (c) son coeficientes que se calculan a partir de los valores de la función en esos puntos:

![Captura de pantalla 2024-05-15 172757](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/cc0b2531-2d96-4f17-9809-bace2f5b1f6a)



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIC"> Algoritmo. </a> </h4>

1. **Determinar los tres puntos conocidos (x₀, y₀), (x₁, y₁) y (x₂, y₂)**: Estos son los tres puntos que se utilizan para la interpolación.

2. **Calcular los coeficientes a, b y c**:

![Captura de pantalla 2024-05-15 172757](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/cc0b2531-2d96-4f17-9809-bace2f5b1f6a)


3. **Sustituir todos los valores en la ecuación**: La ecuación de interpolación cuadrática es f_1(x) = f(x_0) + ((f(x_1) - f(x_0))/(x_1 - x_0))* (x - x_0). Sustituye los valores de x₀, y₀, x₁, y₁, x₂, y₂ y x en esta ecuación.

![Captura de pantalla 2024-05-15 172627](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/d36d6bb4-2f25-4e62-a080-5ad9aed39bc7)


4. **Calcular el resultado**: Realiza los cálculos necesarios para obtener el valor de y.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIC"> Pseudocódigo. </a> </h4>

    
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


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIC"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_Mínimos_Cuadrados;
    
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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 210034](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/cc68126e-25d4-4d2a-8d36-a7de9e39543e)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_M%C3%ADnimos_Cuadrados"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_M%C3%ADnimos_Cuadrados </font> </a>














# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación de Lagrange"> 3. Método interpolación de Lagrange </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónILa"> Descripción. </a> </h4>

El **Método de interpolación de Lagrange** es un método numérico que se utiliza para aproximar funciones. Este método hace uso de un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar.

- Este método fue publicado por Joseph-Louis de Lagrange en 1795, aunque fue descubierto por Edward Waring en 1779 y redescubierto por Leonhard Euler en 1783.
- La interpolación de Lagrange es útil cuando la función a aproximar es suave, incluso fuera de los valores dados o conocidos¹.
- El polinomio que aproxima a la función \(f(x)\) es un polinomio \(P(x)\) de grado \(n-1\), construido mediante la combinación lineal de \(n\) polinomios \(L_i(x)\) de grado \(n-1\).
- Estos son los polinomios de Lagrange, que se expresan de la siguiente manera: 

![Captura de pantalla 2024-05-15 174153](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/31c19746-5625-423c-97ef-b204e4ad4dcc)


    
- Los valores de \(y_i\) representan las ordenadas correspondientes a las abscisas \(x_i\) donde la función \(f(x)\) es conocida, es decir: \(y_i = f(x_i)\).
- Los polinomios de Lagrange son exactamente iguales a la unidad cuando se les evalúa en la abscisa correspondiente a su índice, es decir: \(L_i(x_i) = 1\).
- Se anulan en las abscisas de los puntos de interpolación con índice diferente al del mismo polinomio: \(L_i(x_j) = 0\), con \(i \neq j\)¹.
- Tomando otros valores de abscisas diferentes a los puntos de interpolación, los polinomios de Lagrange adquieren valores comprendidos entre \(-1\) y \(+1\).
- Para obtener los polinomios de Lagrange solo se requiere conocer las abscisas de los puntos a interpolar.


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoILa"> Algoritmo. </a> </h4>

1. **Determinar los puntos conocidos (x₀, y₀), (x₁, y₁), ..., (xₙ, yₙ)**: Estos son los puntos que se utilizan para la interpolación.

2. **Calcular los polinomios de Lagrange Lᵢ(x) para i = 0, 1, ..., n**:
   - Cada polinomio Lᵢ(x) se calcula como el producto de los términos \((x - xⱼ)/(xᵢ - xⱼ)\) para todo j ≠ i. Es decir:

![Captura de pantalla 2024-05-15 174515](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/63fe0292-9b46-4325-93ea-0307d6e7d8a6)



3. **Construir el polinomio de interpolación P(x)**: El polinomio de interpolación se obtiene como la suma de los productos de los polinomios de Lagrange Lᵢ(x) y los valores correspondientes de la función yᵢ. Es decir:

![Captura de pantalla 2024-05-15 174605](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/11fef0a9-85a2-4333-a5f8-8315ac939fb4)



4. **Evaluar el polinomio de interpolación P(x) en el punto de interés**.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoILa"> Pseudocódigo. </a> </h4>

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


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónILa"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_lagrange;

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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 123510](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/601488b7-3bd5-439c-a7eb-0863605903bf)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_lagrange"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_lagrange </font> </a>

















# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación de Newton"> 4. Método interpolación de Newton </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIN"> Descripción. </a> </h4>

El **Método de interpolación de Newton** es un método numérico que se utiliza para aproximar funciones. Este método hace uso de un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar:

- Este método fue publicado por Sir Isaac Newton y es útil para situaciones que requieran un número bajo de puntos para interpolar, ya que a medida que crece el número de puntos, también lo hace el grado del polinomio.
- Aunque solo existe un único polinomio que interpola una serie de puntos, existen diferentes formas de calcularlo.
- Existen ciertas ventajas en el uso de este polinomio respecto al polinomio interpolador de Lagrange. Por ejemplo, si fuese necesario añadir algún nuevo punto o nodo a la función, tan solo habría que calcular este último punto, dada la relación de recurrencia existen.
- El polinomio que aproxima a la función \(f(x)\) es un polinomio \(P(x)\) de grado \(n-1\), construido mediante la combinación lineal de \(n\) polinomios \(N_i(x)\) de grado \(n-1\).
- Estos son los polinomios de Newton, que se expresan de la siguiente manera:

![Captura de pantalla 2024-05-15 175844](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/a54b90d0-d339-401d-9268-8ee33bcb9494)


- Los valores de \(y_i\) representan las ordenadas correspondientes a las abscisas \(x_i\) donde la función \(f(x)\) es conocida, es decir: \(y_i = f(x_i)\).
- Los polinomios de Newton son exactamente iguales a la unidad cuando se les evalúa en la abscisa correspondiente a su índice, es decir: \(N_i(x_i) = 1\).
- Se anulan en las abscisas de los puntos de interpolación con índice diferente al del mismo polinomio: \(N_i(x_j) = 0\), con \(i \neq j\).
- Tomando otros valores de abscisas diferentes a los puntos de interpolación, los polinomios de Newton adquieren valores comprendidos entre \(-1\) y \(+1\).
- Para obtener los polinomios de Newton solo se requiere conocer las abscisas de los puntos a interpolar.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIN"> Algoritmo. </a> </h4>

1. **Determinar los puntos conocidos (x₀, y₀), (x₁, y₁), ..., (xₙ, yₙ)**: Estos son los puntos que se utilizan para la interpolación.

2. **Calcular las diferencias divididas de Newton**: Estas diferencias se obtienen mediante la fórmula:

![Captura de pantalla 2024-05-15 180144](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/a022b590-18ca-4636-9c10-591ba0c8a732)



3. **Construir el polinomio de interpolación P(x)**: El polinomio de interpolación se obtiene como la suma de los productos de los polinomios de Newton y los valores correspondientes de la función. Es decir:

![Captura de pantalla 2024-05-15 180222](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/30de0b57-d8d1-4d57-80f1-3d60b27f6e92)



4. **Evaluar el polinomio de interpolación P(x) en el punto de interés**.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIN"> Pseudocódigo. </a> </h4>

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



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIN"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_newton;
    
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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 124022](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/9c0ff02b-2435-4d20-95f1-253927f93f6e)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_newton"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_newton </font> </a>



















# <h3 align = "center"> <font font face = "forte"> <a name="Método de correlación"> 5. Método de correlación </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónC"> Descripción. </a> </h4>
    
El **Método de correlación** es una herramienta estadística que se utiliza para medir y comprender el grado de correlación entre dos variables.

- Este método se utiliza para analizar cómo varía una variable cuando la otra presenta modificaciones.
- La correlación es una medida estadística que indica el grado de relación entre dos variables.
- En concreto, la correlación lineal sirve para determinar cuánto de correlacionadas linealmente están dos variables distintas.
- Dos variables están relacionadas cuando al variar los valores de una variable también cambian los valores de la otra variable.
- Por ejemplo, si al aumentar la variable A también aumenta la variable B, existe una correlación entre las variables A y B.
- Según cómo sea la relación que hay entre dos variables aleatorias, se distinguen los siguientes tipos de correlación lineal:
    - Correlación directa (o correlación positiva): una variable aumenta cuando la otra también aumenta.
    - Correlación inversa (o correlación negativa): cuando una variable aumenta la otra disminuye, y al revés, si una variable disminuye la otra aumenta.
    - Correlación nula (sin correlación): no existe ninguna relación entre las dos variables.
- El coeficiente de correlación, también llamado coeficiente de correlación lineal o coeficiente de correlación de Pearson, es el valor de la correlación entre dos variables.
- El coeficiente de correlación de dos variables estadísticas es igual al cociente entre la covarianza de las variables y la raíz cuadrada del producto de la varianza de cada variable.
- Por lo tanto, la fórmula para calcular el coeficiente de correlación es la siguiente: 

![Captura de pantalla 2024-05-15 181229](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/b74d926a-0644-4a72-972b-a7d9a3043871)


- Cuando se calcula el coeficiente de correlación sobre una población, el símbolo de la correlación es la letra griega ρ. Pero cuando se está calculando el coeficiente respecto a una muestra suele usarse como símbolo la letra r.
- El valor del índice de correlación puede estar entre -1 y +1, ambos incluidos.
- Ten en cuenta que existen otros tipos de coeficientes de correlación, como por ejemplo el coeficiente de correlación de Spearman o el de Kendall.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoC"> Algoritmo. </a> </h4>

1. **Determinar las dos variables de interés**: Estas son las variables que se desean analizar para entender su relación.

2. **Calcular la media de cada variable**: La media es la suma de todos los valores dividida por el número de valores.

3. **Calcular la covarianza de las variables**: La covarianza es una medida de cómo cambian juntas las dos variables. Se calcula como el promedio de los productos de las diferencias de cada variable y su media. Es decir:

![Captura de pantalla 2024-05-15 181631](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/0db6cdcf-6dd6-47ee-822e-7e4413a70cc4)


4. **Calcular la varianza de cada variable**: La varianza es una medida de la dispersión de los valores de una variable alrededor de la media. Se calcula como el promedio de los cuadrados de las diferencias de cada valor y la media. Es decir:

![Captura de pantalla 2024-05-15 181730](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/59278f35-7947-4dcb-9c20-647dba5a5d23)


5. **Calcular el coeficiente de correlación**: El coeficiente de correlación es una medida normalizada de la relación lineal entre las dos variables. Se calcula como la covarianza dividida por la raíz cuadrada del producto de las varianzas. Es decir:

![Captura de pantalla 2024-05-15 181822](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/873a11c0-cef4-4a1b-a78e-368d1f8004ba)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoC"> Pseudocódigo. </a> </h4>

    Función Interpolacion_Correlacion(x0, y0, x1, y1, x):
        // Calcular la pendiente basada en la correlación
        correlacion = calcular_correlacion(x0, y0, x1, y1)
        
        // Calcular el valor interpolado de y para el valor de x dado
        resultado = correlacion * x
        
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónC"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>
   
    package Método_de_Correlación;
    
    import java.util.Arrays;

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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![image](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/c01089dc-f14b-42b0-a441-8b85f2e70c76)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_Correlaci%C3%B3n"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_Correlaci%C3%B3n </font> </a>
















# <h3 align = "center"> <font font face = "forte"> <a name="Método de regreción"> 6. Método de regreción </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónR"> Descripción. </a> </h4>
    
El **Método de regresión** es un método estadístico que permite examinar la relación entre dos o más variables e identificar cuáles son las que tienen mayor impacto en un tema de interés.

- Este tipo de análisis estadístico permite clasificar matemáticamente a través de diferentes preguntas como: ¿Qué factores importan más? ¿Qué factores se pueden ignorar? ¿Cómo interactúan estos factores entre sí?, y por último, ¿Qué tan seguro te sientes de todos estos factores?.
- El proceso de realizar una regresión permite determinar con confianza cuáles son los factores más importantes, cuáles se pueden ignorar y cómo influyen entre sí.
- Dichos factores se denominan variables las cuales se clasifican en:
    - Variable (s) dependiente (s): Es el factor más importante, el cual se está tratando de entender o predecir.
    - Variable (s) independiente (s): Es el factor que tú crees que puede impactar en tu variable dependiente.
- En estadística, el análisis de regresión es un proceso en el que se estudia la relación entre dos o más variables.
- En concreto, el análisis de regresión consiste en calcular una ecuación que relacione las variables de estudio de manera matemática.
- El modelo construido en un análisis de regresión se llama modelo de regresión, mientras que la ecuación que relaciona las variables de estudio se dice ecuación de regresión.
- Por ejemplo, si se quiere estudiar la relación entre la inflación de un país con su PIB, se puede llevar a cabo un análisis de regresión para analizar la relación entre las dos variables.
- En este caso, la ecuación obtenida del análisis de regresión sería una recta de regresión.
- Así pues, un análisis de regresión consiste en recopilar una muestra de datos y, a partir de los datos recopilados, se calcula una ecuación que permite relacionar matemáticamente las variables de estudio.
- En los análisis de regresión, es importante distinguir los dos tipos de variables que se pueden incluir en el modelo de regresión:
    - Variable dependiente (o variable respuesta): es el factor que queremos analizar, de modo que se construirá un modelo de regresión para ver cómo varia el valor de esta variable en función del valor de otras variables.
    - Variable independiente (o variable explicativa): es un factor que consideramos que puede influir en la variable que queremos analizar. Es decir, el valor de la variable independiente afecta al valor de la variable dependiente.
- Básicamente, existen tres tipos de análisis de regresión:
    - Análisis de regresión lineal simple: el modelo de regresión tiene una variable independiente y una variable dependiente y se relacionan de manera lineal.
    - Análisis de regresión lineal múltiple: se relacionan linealmente dos o más variables independientes con una variable dependiente.
    - Análisis de regresión no lineal: se modeliza la relación entre la variable independiente y la variable dependiente mediante una función no lineal.
- La regresión lineal es un método estadístico utilizado para modelar la relación entre dos variables mediante la construcción de una ecuación lineal que mejor representa la relación entre las variables.
- La ecuación lineal se utiliza para predecir el valor de la variable dependiente a partir de la variable independiente.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Determinar las dos variables de interés**: Estas son las variables que se desean analizar para entender su relación.

2. **Calcular la media de cada variable**: La media es la suma de todos los valores dividida por el número de valores.

3. **Calcular la covarianza de las variables**: La covarianza es una medida de cómo cambian juntas las dos variables. Se calcula como el promedio de los productos de las diferencias de cada variable y su media. Es decir:

![Captura de pantalla 2024-05-15 183241](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/4c1a7d6b-fa61-43f1-b107-20cbceb2b6d8)



4. **Calcular la varianza de cada variable**: La varianza es una medida de la dispersión de los valores de una variable alrededor de la media. Se calcula como el promedio de los cuadrados de las diferencias de cada valor y la media. Es decir:

![Captura de pantalla 2024-05-15 183316](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/fb8f16df-b07f-4155-982b-b00fd182e64a)



5. **Calcular los coeficientes de la ecuación de regresión**: Los coeficientes son la pendiente y la intersección de la línea de regresión. Se calculan como:
   - Pendiente (b):

![Captura de pantalla 2024-05-15 183403](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/1a0aa4a7-2c4b-4003-9ce7-67bf7f51a6f2)



   - Intersección (a):

![Captura de pantalla 2024-05-15 183439](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/aa72473f-6a17-48f0-90f9-ca192d2efdb4)




6. **Construir la ecuación de regresión**: La ecuación de regresión es una línea que mejor se ajusta a los datos. Se calcula como:

![Captura de pantalla 2024-05-15 183547](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/99cd3c08-80f5-4e4f-baf0-fabb2ed1197e)



7. **Usar la ecuación de regresión para hacer predicciones**: Puedes usar la ecuación de regresión para predecir el valor de la variable dependiente (y) a partir de la variable independiente (x).


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>
    
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


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónR"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Método_de_regresion;
    
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


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![image](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/e73f1995-8efd-47f6-ada1-fca9e3f299b9)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_regresion"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_regresion </font> </a>
















# <h3 align = "center"> <font font face = "forte"> <a name="Referencias"> 4. Referencias. </a> </h3>

    C. Chapra, S. (2006). Métodos numéricos para ingenieros (Quinta ed.). Pablo E. Roig Vázquez.





# <h3 align = "center"> <font font face = "forte">  Despedida </h3>

Me despido con un cordial saludo. Si tienen alguna duda o sugerencia, contactar por redes sociales: facebook, instagram, etc.
