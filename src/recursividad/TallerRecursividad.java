package recursividad;

import java.util.ArrayList;

public class TallerRecursividad {

	public static void main(String[] args) {
	}

//    1)Cantidad de cifras de un número:
//    Hallar la cantidad de cifras de un número entero. Parámetro: n (número entero)
//
//    public static int determinarCifrasEntero(int numero) {
//        if (numero < 10) {
//            return 1;
//        } else {
//            return determinarCifrasEntero(numero / 10) + 1;
//
//        }
//    }
// *****************************************************************************************************************************************************    
//    2) Contar ceros arreglo
//       Contar la cantidad de ceros que se encuentran dentro de un arreglo unidimensional de enteros. Parámetros: int arreglo[], int n 
//
//    public static int hallarCeros(int[] arreglo, int ind) {
//        if(ind >= arreglo.length) return 0;
//        int esCero = 0;
//        if (arreglo[ind] == 0) {
//            esCero = 1;
//        }
//        return esCero + hallarCeros(arreglo, ind + 1);
//    }
// *****************************************************************************************************************************************************   
//    3)Número menor arreglo
//    El recorrido del arreglo se realiza de inicio a fin. El criterio de parada es cuando inicio y fin son iguales.
//
//    private static int numeroMenor(int[] arreglo, int i, int nMenor) {
//        if (i == arreglo.length - 1) {
//            return nMenor;
//        } else {
//
//            if (arreglo[i] < nMenor) {
//                nMenor = arreglo[i];
//            }
//            return numeroMenor(arreglo, (i + 1), nMenor);
//        }
//    }
// *****************************************************************************************************************************************************    
//    4)Suma de cifras
//    Sume las cifras de un número. Parámetros: int n
//
//    public static int sumarDigitos(int n) {
//        if (n < 10) {
//            return n;
//        } else {
//            return sumarDigitos(n / 10) + sumarDigitos(n % 10);
//        }
//    }
// *****************************************************************************************************************************************************   
//      5) Número de apariciones
//      Recorra el arreglo desde la primera posición hasta la última
//      posición y retorne el número de veces que se repite el elemento.  
//      Parámetros: vector[] (arreglo en el cual se encuentran los elementos), 
//      inicio (es el inicio del vector), fin (es el fin del vector), elem (es el número a buscar dentro del arreglo)
//      
//      public static int contarApariciones(int[] arreglo, int inicio, int fin, int numeroABuscar) {
//        int apariciones = 0;
//        if (inicio < fin) {
//            if (numeroABuscar == arreglo[inicio]) {
//                //return apariciones + contarApariciones(arreglo, inicio+1, fin, numeroABuscar);
//                apariciones += 1;
//            }
//            return apariciones + contarApariciones(arreglo, inicio + 1, fin, numeroABuscar);
//        }
//        return apariciones;
//      }
//
// *****************************************************************************************************************************************************    
//    6) Recorrer un array de forma recursiva
//    public static void recorrerArrayRecursivamente(int[] numero, int indice) {
//        int numAux;
//        if (indice <= numero.length - 1) {
//            numAux = numero[indice];
//            System.out.println(numAux);
//            recorrerArrayRecursivamente(numero, indice + 1);
//        }
//    }
// *****************************************************************************************************************************************************    
//    7) Recorrer un array de forma recursiva
//    public static int numeroPar(int array[], int i) {
//        int num = array[i];
//        int tamanioArray = array.length - 1;
//        
//        if(i < tamanioArray){
//            if (num % 2 == 0) {
//                return num;
//            }
//        }
//        return  numeroPar(array, i + 1);
//    }
// *****************************************************************************************************************************************************    
//    8) Recorrer una matriz de forma recursiva
//    public static void recorrerMatriz(int[][] matriz, int i, int j) {
//        if (matriz != null) {
//            if (i < matriz.length) {
//                if (j < matriz[i].length - 1) {
//                    System.out.println(matriz[i][j]);
//                    recorrerMatriz(matriz, i, j + 1);
//                } else {
//                    System.out.println(matriz[i][j]);
//                    recorrerMatriz(matriz, i + 1, 0);
//                }
//            }
//        }
//    }
// *****************************************************************************************************************************************************   
//    9)Sumar la diagonal de una matriz de forma recursiva.
//   
// *****************************************************************************************************************************************************    
//     10) Invertir una palabra de forma recursiva
//     public static void invertirPalabraRecursiva(String palabra, int index) {
//       if (index < palabra.length()) {
//           invertirPalabraRecursiva(palabra, index + 1);
//           System.out.println(palabra.charAt(index));
//        }
//     }
// *****************************************************************************************************************************************************    
//     11) Programar un algoritmo recursivo que permita sumar los elementos de una matriz. 
//     El recorrido tiene que ser retrocediendo en columnas y avanzando en las filas.
//     Parámetros( matriz, i, j).
//       public static int sumarMatriz(int[][] matriz, int i, int j) {
//        if (matriz != null) {
//            if (i < matriz.length) {
//                if (j == 0) {
//                    return matriz[i][0] + sumarMatriz(matriz, i + 1, matriz[i].length - 1);
//                } else if (j > 0) {
//                    return matriz[i][j] + sumarMatriz(matriz, i, j - 1);
//                    }
//                }
//            }
//            return 0;
//        }
// *****************************************************************************************************************************************************    
//        12) Programar un algoritmo recursivo que permita calcular y retornar cualquier potencia para cualquier número. Por ejemplo base = 2 potencia = 3 
//        public static int calcularPotencia(int base, int exponente) {
//        if (exponente == 0) {
//            return 1;
//        } else if (exponente < 0) { //calculamos las potencias con exponente negativo
//            return calcularPotencia(base, exponente + 1) / base;
//        } else {
//            return base * calcularPotencia(base, exponente - 1);
//        }
//    }  
// *****************************************************************************************************************************************************  
//        13) Programar un algoritmo recursivo que permita sumar la diagonal principal de una matriz. Filas y columnas avanzando.
//        Parámetros( matriz, i, j)
//        public static int sumaDiagonalMatriz(int[][] matriz, int i, int j) {
//		if (i < matriz.length && j < matriz.length) {
//			if (i == j) {
//				return matriz[i][j] + sumaDiagonalMatriz(matriz, i + 1, j + 1);
//			}
//		}
//		return 0;
//	}
//               
// *****************************************************************************************************************************************************
//      15) Hallar recursivamente el promedio de los elementos de la diagonal de una matriz cuadrada.
//
//      public static double promedioMatriz(int matriz[][], int i, int j, int suma) {
//          double promedio;
//           if (i < matriz.length) {
//               suma += matriz[i][j];
//
//               promedio = promedioMatriz(matriz, i + 1, j + 1, suma);
//               } else {
//                   promedio = suma / i;
//               }
//         return promedio;
//       }
// *****************************************************************************************************************************************************    
//          16)Determinar si una matriz es o no simétrica (es cuadrada y sus elementos por encima de la diagonal 
//          son iguales a los elementos de por debajo en forma de espejo)
//          public static boolean isSimetrica(int[][] matriz, int i, int j) {
//		if (i < matriz.length) { // Mira si no se ha salido de los límites
//			if (i == matriz.length - 1 && j == matriz[i].length - 1) {
//				// Esta condición se puso con el objetivo de retornar verdadero
//				// si y solo si i y j llegan hasta la última posición
//				// con esto concluimos que se recorrió toda la matriz sin
//				// que la condición de que el valor en ij = ji.
//				return true;
//			}
//			if (j < matriz[i].length) {
//				if (matriz[i][j] == matriz[j][i]) {
//					// preguntamos que los valores sean el mismo
//					// y si se cumple, revisamos en la siguiente columna
//					// de lo contrario, se termina este if y sale hasta
//					// la línea de retornar falso
//					return isSimetrica(matriz, i, j + 1);
//				}
//			} else { // cuando termine la columna, siga en la siguiente e inicie desde
//						// desde la columna 0
//				return isSimetrica(matriz, i + 1, 0);
//			}
//		}
//		return false;
//	}
// *****************************************************************************************************************************************************          
//          17) Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea mayor.
//         public static int sumaFilaMayor(int matriz[][], int i, int j, int sumaAnterior, int sumaActual, int filaMayor) {
//            if (i > matriz.length - 1) {
//
//            } else if (j > matriz[0].length - 1) {
//                if (sumaAnterior < sumaActual) {
//                    return sumaFilaMayor(matriz, i + 1, 0, sumaActual, 0, i);
//                } else {
//                    return sumaFilaMayor(matriz, i + 1, 0, sumaAnterior, 0, filaMayor);
//                }
//
//            } else {
//                sumaActual += matriz[i][j];
//                return sumaFilaMayor(matriz, i, j + 1, sumaAnterior, sumaActual, filaMayor);
//            }
//            return filaMayor;
//        }

//        18) Escribir una función que reciba 2 enteros n y b y devuelva true si n es 
//        potencia de b. Ej. 16 es potencia de 2, 64 es potencia de 4, 50 no es potencia de 10.
//        public static boolean isPotencia(double n, double b, double aux) {
//            if (aux <= 1) {
//                return false;
//            } else {
//                isPotencia(n, b,aux / n ) ;
//            if (b / aux == n && aux / (aux / n) == n && aux % n == 0) {
//                    return true;
//                }
//
//                return false;
//            }
//        }
// *****************************************************************************************************************************************************    
//    19) Determinar si un número es primo
//    private static String isPrimo(int numero, int i, int aux) {
//
//        if (aux == numero) {
//            aux++;
//        }
//
//        if (i == 10) {
//            return "si es primo";
//        }
//        if (numero % aux == 0) {
//            return "No es primo";
//        }
//        ++i; ++aux;
//        return isPrimo(numero, i, aux);
//    }
// *****************************************************************************************************************************************************  
//      21) Ordenar un array de forma ascendente recursivamente.          
//      public static int arrayAscendente(int i, int array[]) {
//          int resultado = 0;
//
//          if (i == array.length) {
//              return 1;
//          } else {
//              resultado = array[i];
//              System.out.print(resultado + " ");
//              arrayAscendente(i + 1, array);
//          }
//         return resultado;
//
//      }
// *****************************************************************************************************************************************************
//        22)Devolver solamente las consonantes de una cadena de caracteres. Ej. Datos = dts
//         
//        static String mensaje = "hola";
//        public static ArrayList<Character> bucarConsonante(int i, ArrayList<Character> consonantes){
//            if(i == mensaje.length()){
//               return consonantes;
//            }else{
//                Character letra = mensaje.charAt(i);
//                if (esConsonante(letra)) {
//                    consonantes.add(letra);
//                    bucarConsonante(i+1, consonantes);
//                } else {
//                    bucarConsonante(i+1, consonantes);
//                }
//            }
//                return consonantes;
//            }
//        public static boolean esConsonante(char letra) {
//            return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
//        }
// *****************************************************************************************************************************************************

//      24)Escriba un método que retorne la matriz transpuesta de una matriz de tamaño mxn. La transpuesta de una matriz consiste en intercambiar las filas por las columnas. 
//      public static int[][] transpuesta(int[][]matriz, int[][]copiaMatriz, int i, int j){
//          int filas = matriz.length;
//          int columnas = matriz[i].length;
//          
//          if(j >= columnas){
//              j=0;
//              i++;
//          }
//          
//          if(i >= filas){
//              return copiaMatriz;
//          }
//          
//          
//          copiaMatriz[j][i]=matriz[i][j];
//          return transpuesta(matriz, copiaMatriz, i, j+1);
//          
//      }  
// *****************************************************************************************************************************************************
//    28)Escriba un método recursivo que retorne la norma de un vector (a) de tamaño n. 
//    La norma de un vector se calcula sacando la raíz cuadrada a la sumatoria de cada uno de sus elementos al cuadrado.
//     public static double sacarRaiz(int[] vector, double suma, int i){
//         return Math.sqrt(sacarSuma(vector, suma, i));
//     }
//     
//     public static double sacarSuma(int[] vector, double suma, int i) {
//        if(i<vector.length){
//            return(sacarSuma(vector, suma+Math.pow(vector[i], 2), i));
//        }
//        return suma;
//    }

}
