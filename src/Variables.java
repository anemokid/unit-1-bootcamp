/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {

    // testing method 1
    isOdd(2);
    isOdd(33);

  }

  /**
   *  1 : isOdd():
   * - return type : boolean
   * - type it takes in: integer
   * - method signature: public boolean isOdd( int numberChecked){};
   */
  public static boolean isOdd(int numberChecked){

    if( (numberChecked % 2) == 1 ){
      return true;
    }
    return false;
  }

  /**
   * 2 : printHelloWorld():
   * - return type: void ( because System.out.println , will print to to the console)
   * - type it takes in: empty args because you can print HelloWorld to
   *   the console without specifying a return type + specifying the arguments.
   * - method signature: public void printHelloWorld(){};
   */

  /**
   * 3 : greatestCommonFactor():
   * - return type: an integer
   * - types it should take in : two integer values - > in order to find the greatest common factor
   *   you need multiple numbers
   * - method signature: public static int greatestCommonFactor( int number1, int number 2){};
   */

}
