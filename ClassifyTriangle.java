// Triangle Classification Solution?
//
//
// Modified from
// Classifiy triangles -- by Jeff Offutt
// http://www.cs.uiuc.edu/class/sp06/cs498dm/trityp.java
//
// Can be run as::
//    (inside of java)
//    ClassifyTriangle.triangle(side1,side2,side3)
//    where side1,side2,side3 are all of type int
//
//    (command line)
//    > java ClassifyTrianlge side1 side2 side3
//    where side1,side2,side3 are the lengths of the three sides

class ClassifyTriangle {

  //===========================================================================
  // main() will convert the command line argumnets into integers and classify
  // the triangle
  public static void main (String[] args) {
    try {
      System.out.println(
        triangle(
          Integer.parseInt(args[0]),
          Integer.parseInt(args[1]),
          Integer.parseInt(args[2])
      ));
    } catch (java.lang.ArrayIndexOutOfBoundsException exception) {
      System.out.println(triTypes[3]);
    }
  }

  //===========================================================================
  // An array to store the possible output values
  private static String[] triTypes = {
    "scalene",              // [0]
    "isosceles",            // [1]
    "equilateral",          // [2]
    "not a valid triangle"  // [3]
  };

  //===========================================================================
  // The main triangle classification method
  //  triOut is converted into a String for the output from the routine:
  //  triangle = "scalene"                if triangle is scalene
  //  triangle = "isosceles"              if triangle is isosceles
  //  triangle = "equilateral"            if triangle is equilateral
  //  triangle = "not a valid triangle"   if not a triangle
  static public String triangle (int Side1, int Side2, int Side3) {
    int triOut = -1;

    // After a quick confirmation that it's a legal
    // triangle, detect any sides of equal length
    if (Side1 < 1 || Side2 <= 1 || Side3 <= 0) {
       triOut = 3;
       return (triTypes[triOut]);
    }

    if (Side1 == Side2)
      triOut = triOut + 1;
    if (Side1 == Side3)
      triOut = triOut + 2;
    if (Side2 == Side3)
      triOut = triOut + 3;

    if (triOut == -1) {
      // Confirm it's a legal triangle before declaring
      // it to be scalene

      if (Side1 <= Side3-Side2 || Side2 <= Side1-Side3 ||
          Side3 <= Side2-Side1)
        triOut = 3;
      else
        triOut = 0;

      return (triTypes[triOut]);
    }

    /* Confirm it's a legal triangle before declaring  */
    /* it to be isosceles or equilateral  */

    if (triOut > 2)
      triOut = 2;
    else if (triOut == 0 && Side1+Side2 > Side3)
      triOut = 1;
    else if (triOut == 1 & Side1 > Side2-Side3)
      triOut = 1;
    else if (triOut == 2 & Side2 > Side1-Side3)
      triOut = 1;
    else
      triOut = 3;

    return (triTypes[triOut]);
  }

}