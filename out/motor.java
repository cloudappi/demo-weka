class motor {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = motor.N4e5156690(i);
    return p;
  }
  static double N4e5156690(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (i[5].equals("YES")) {
    p = motor.N17d101661(i);
    } else if (i[5].equals("NO")) {
    p = motor.N759ebb3d7(i);
    } 
    return p;
  }
  static double N17d101661(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 30099.3) {
    p = motor.N1b9e19162(i);
    } else if (((Double) i[3]).doubleValue() > 30099.3) {
      p = 0;
    } 
    return p;
  }
  static double N1b9e19162(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (i[6].equals("YES")) {
      p = 1;
    } else if (i[6].equals("NO")) {
    p = motor.Nba8a1dc3(i);
    } 
    return p;
  }
  static double Nba8a1dc3(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (i[4].equals("YES")) {
    p = motor.N4f8e5cde4(i);
    } else if (i[4].equals("NO")) {
      p = 1;
    } 
    return p;
  }
  static double N4f8e5cde4(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 13106.6) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 13106.6) {
    p = motor.N504bae785(i);
    } 
    return p;
  }
  static double N504bae785(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (i[7].equals("YES")) {
      p = 0;
    } else if (i[7].equals("NO")) {
    p = motor.N3b764bce6(i);
    } 
    return p;
  }
  static double N3b764bce6(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 18923.0) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 18923.0) {
      p = 1;
    } 
    return p;
  }
  static double N759ebb3d7(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (i[4].equals("YES")) {
    p = motor.N484b61fc8(i);
    } else if (i[4].equals("NO")) {
    p = motor.N4c98385c11(i);
    } 
    return p;
  }
  static double N484b61fc8(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (i[7].equals("YES")) {
    p = motor.N45fe3ee39(i);
    } else if (i[7].equals("NO")) {
      p = 1;
    } 
    return p;
  }
  static double N45fe3ee39(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals("INNER_CITY")) {
    p = motor.N4cdf35a910(i);
    } else if (i[2].equals("RURAL")) {
      p = 1;
    } else if (i[2].equals("TOWN")) {
      p = 1;
    } else if (i[2].equals("SUBURBAN")) {
      p = 1;
    } 
    return p;
  }
  static double N4cdf35a910(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 39547.8) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() > 39547.8) {
      p = 1;
    } 
    return p;
  }
  static double N4c98385c11(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (i[7].equals("YES")) {
    p = motor.N5fcfe4b212(i);
    } else if (i[7].equals("NO")) {
      p = 0;
    } 
    return p;
  }
  static double N5fcfe4b212(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 39.0) {
    p = motor.N6bf2d08e13(i);
    } else if (((Double) i[0]).doubleValue() > 39.0) {
      p = 1;
    } 
    return p;
  }
  static double N6bf2d08e13(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 28.0) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() > 28.0) {
      p = 0;
    } 
    return p;
  }
}

