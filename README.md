# Lab_02
<p>Made by:<a href="https://github.com/Mkultr730">Martin Molinares</a> and <a href="https://github.com/wgarcia1309">Willian Garcia</a></p>
<b><h1>LABORATORIO FINAL</h1></b>
<p><b>TEMA:</b>Cadenas de caracteres, Arreglos de Datos (uni y bidimensionales),Subprogramas (Funciones y Subrutinas) y Recursividad.</p>
<p><b>Materia:</b> Algoritmia y programación II</p>
<p><b>Profesora:</b> Rocio Ramos Rodríguez</p>
<p><b>Monitores:</b> Ángel Cotes y Jeffrey Saavedra</p>
<p><b>Curso:</b>IST2089</p>
Se le ha solicitado implementar un buscador-traductor-encriptador, combinando los
procesos explicados a continuación, de tal forma que:
<ul>
<li>Cuando el usuario digite una cadena de caracteres (máximo cuatro palabra), busque una a una en él diccionario.</li>
<li>Si la cadena se encuentra, debe ser encriptada utilizando el método Vigenére, en caso contrario informarle al usuario que no es válida la cadena para ser utilizada como clave.</li>
<li>Cada pareja debe diseñar su propia tabla para el método de encriptación Vigenére y debe investigar otro método de encriptación que debe utilizar antes del método propuesto. Utilizar su ingenio y creatividad,
<li>Una vez encriptada la clave(Creo que aqui es mensaje), esta debe ser traducida a lenguaje binario y ser
mostrada al usuario.</li>
<li>Debe existir la opción de realizar el des-encriptado, desde la cadena en
lenguaje binario.</li>
</ul>
<b><h3>MÉTODO DE ENCRIPTACIÓN Vigenére</h3></b>
<p>El cifrado de Vigenére, va tomando diferentes valores en función de la clave elegida. El cifrado de Vigenère utiliza una clave externa para realizar las sustituciones, con lo que este mismo algoritmo puede dar diferentes criptogramas para el mismo texto claro en
función de la clave a utilizar. Ejemplo:</p>
<b>Texto claro:</b> s e g u r i d a d<br></br>
<b>Clave de cifrado:</b> a b c<br></br>
<p>Para llevar a cabo el cifrado se divide el texto claro en grupos de tantas letras como tenga la clave, y a continuación se hace corresponder con las letras de la clave de cifrado:</p>
<b>Texto claro:</b> s e g u r i d a d<br></br>
<b>Clave:</b> a b c a b c a b c <br></br>
<p>A cada letra del texto claro le corresponde la que está dada por la posición que ocupa en el alfabeto la letra clave que le corresponde. Así, cuando la clave sea la letra «a», se avanzará una posición, si la clave es «b» serán dos, y si fuera «e» serán 5.</p>
<p>En el ejemplo, en primer lugar se transforma la letra «s» del texto claro según su clave «a», es decir, una letra en el alfabeto, el resultado será «t». En el segundo caso, la letra «e» según la clave «b» dará una «g», porque se avanza dos posiciones. </p>
<b>Texto claro:</b> s e g u r i d a d<br></br>
<b>Clave:</b> a b e a b e a b e<br></br>
<b>Criptograma:</b> t g l v t n e c i<br></br>
<b>Resultado final:</b> t g l v t n e c i<br></br>
<p>Ahora a comprobar cómo, cambiando la clave de cifrado y con el mismo texto claro, se obtiene un criptograma totalmente diferente:</p>
<b>Clave:</b> bebe<br></br>
<b>Texto claro:</b> s e g u r i d a d – – –<br></br>
<b>Criptograma:</b> u j i z t n f f f – – –<br></br>
<b>Resultado final:</b>u j i z t n f f f<br></br>
<p>Para poder realizar el descifrado la única condición es conocer la clave que se ha utilizado en el proceso, y hacer los pasos a la inversa. Partiendo del criptograma, tendremos que dividir en grupos según la clave y, en esta ocasión, restar posiciones en vez de sumar.</p>
<p>Este método es algo más seguro que los vistos con anterioridad, debido principalmente a que el criptograma varía según una clave externa, no conocida en principio por un hipotético atacante. Sin embargo se ha demostrado que no resulta difícil romper este cifrado utilizando técnicas de criptoanálisis basadas en la incidencia de coincidencias en el criptograma.</p>
<b><h3>DICCIONARIO</h3></b>
<p>Debe poder traducir de inglés/español y de español/inglés, teniendo en cuenta lo siguiente:</p>
<ul>
<li>Crear dos arrays unidimensionales de String para a almacenar máximo 100
palabras.</li>
<li><p>Si la cadena se encuentra, debe ser encriptada utilizando el método Vigenére, en caso contrario informarle al usuario que no es válida la cadena para ser utilizada como clave.</p></li>
<li>Crear un método (subrutina) para añadir una entrada al diccionario</li>
<li>Una vez encriptada la clave(Creo que aqui es mensaje), esta debe ser traducida a lenguaje binario y ser
mostrada al usuario.</li>
<li>Crear String traduce_to_Ingles(String e) y String traduce_to_Español(String in) devuelve la palabra traducida.</li>
<li>Utilizar una constante para indicar el límite por defecto de la capacidad del diccionario.</li>
<li>Si el usuario intenta añadir una palabra que ya está en el diccionario o si ya está lleno el array, se debe de informar al usuario de que la palabra no ha podido ser añadida.</li>
<li>En el inicio del programa, el usuario debe poder elegir entre usar el límite por defecto de capacidad del diccionario o bien establecer mediante teclado dicho límite.</li>
<li>El usuario debe poder introducir varias palabras separadas por comas y el programa debe traducir todas ellas.</li>
<li>Opcional: En caso de que el usuario indique que quiere traducir una palabra
XXX y dicha palabra no tenga traducción, el programa deberá mostrarle un
mensaje del tipo "Usted quiso decir XXY" donde XXY es una palabra de la
misma longitud que XXX y con una única letras diferente, en caso de exista una
que reúna tales requisitos.</li>
</ul>
<b><h3>CÓDIGO BINARIO:</h3></b>
<p>El código binario es el sistema de representación de textos, o procesadores de instrucciones de ordenador utilizando el sistema binario (sistema numérico de dos dígitos, o bit: el "0" y el "1"). En informática y telecomunicaciones, el código binario se utiliza con variados métodos de codificación de datos, tales como cadenas de caracteres, o cadenas de bits. Estos métodos pueden ser de ancho fijo o ancho variable.</p>
<p>En un código binario de ancho fijo, cada letra, dígito, u otros símbolos, están representados por una cadena de bits de la misma longitud, como un número binario que, por lo general, aparece en las tablas en notación octal, decimal o hexadecimal.</p>
<b><h3>Código ASCII:</h3></b>
<p>El código ASCII (acrónimo inglés de American Standard Code for Information
Interchange) es un código de caracteres basado en el alfabeto latino tal como se usa en inglés moderno y en otras lenguas occidentales. Para la traducción a código Binario se debe consultar la tabla de conversiones de los caracteres y símbolos.</p>
