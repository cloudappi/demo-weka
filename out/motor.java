class motor {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = motor.N2530c120(i);
    return p;
  }
  static double N2530c120(Object []i) {
    double p = Double.NaN;
    if (i[5] == null) {
      p = 0;
    } else if (i[5].equals("YES")) {
    p = motor.N64a294a61(i);
    } else if (i[5].equals("NO")) {
    p = motor.N2b05039f7(i);
    } 
    return p;
  }
  static double N64a294a61(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 30099.3) {
    p = motor.N7e0b37bc2(i);
    } else if (((Double) i[3]).doubleValue() > 30099.3) {
      p = 0;
    } 
    return p;
  }
  static double N7e0b37bc2(Object []i) {
    double p = Double.NaN;
    if (i[6] == null) {
      p = 1;
    } else if (i[6].equals("YES")) {
      p = 1;
    } else if (i[6].equals("NO")) {
    p = motor.N3b95a09c3(i);
    } 
    return p;
  }
  static double N3b95a09c3(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (i[4].equals("YES")) {
    p = motor.N6ae409944(i);
    } else if (i[4].equals("NO")) {
      p = 1;
    } 
    return p;
  }
  static double N6ae409944(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() <= 13106.6) {
      p = 1;
    } else if (((Double) i[3]).doubleValue() > 13106.6) {
    p = motor.N1a93a7ca5(i);
    } 
    return p;
  }
  static double N1a93a7ca5(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (i[7].equals("YES")) {
      p = 0;
    } else if (i[7].equals("NO")) {
    p = motor.N3d82c5f36(i);
    } 
    return p;
  }
  static double N3d82c5f36(Object []i) {
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
  static double N2b05039f7(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 1;
    } else if (i[4].equals("YES")) {
    p = motor.N61e717c28(i);
    } else if (i[4].equals("NO")) {
    p = motor.N4e51566911(i);
    } 
    return p;
  }
  static double N61e717c28(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (i[7].equals("YES")) {
    p = motor.N66cd51c39(i);
    } else if (i[7].equals("NO")) {
      p = 1;
    } 
    return p;
  }
  static double N66cd51c39(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 0;
    } else if (i[2].equals("INNER_CITY")) {
    p = motor.N4dcbadb410(i);
    } else if (i[2].equals("RURAL")) {
      p = 1;
    } else if (i[2].equals("TOWN")) {
      p = 1;
    } else if (i[2].equals("SUBURBAN")) {
      p = 1;
    } 
    return p;
  }
  static double N4dcbadb410(Object []i) {
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
  static double N4e51566911(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 1;
    } else if (i[7].equals("YES")) {
    p = motor.N17d1016612(i);
    } else if (i[7].equals("NO")) {
      p = 0;
    } 
    return p;
  }
  static double N17d1016612(Object []i) {
    double p = Double.NaN;
    if (i[0] == null) {
      p = 1;
    } else if (((Double) i[0]).doubleValue() <= 39.0) {
    p = motor.N1b9e191613(i);
    } else if (((Double) i[0]).doubleValue() > 39.0) {
      p = 1;
    } 
    return p;
  }
  static double N1b9e191613(Object []i) {
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

