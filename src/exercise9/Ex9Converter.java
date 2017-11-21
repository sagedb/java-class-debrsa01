package exercise9;

/**
 * Class Ex9Converter
 * @author yasiro01
 */
public class Ex9Converter {
  public static Double c2f(Double valueFrom) {
    return (valueFrom * 9/5) + 32;
  }

  public static Double c2k(Double valueFrom) {
    return valueFrom + 273.15;
  }

  public static Double f2c(Double valueFrom) {
    return (valueFrom - 32) * 5/9;
  }

  public static Double f2k(Double valueFrom) {
    return (valueFrom - 32) * 5/9 + 273.15;
  }

  public static Double k2c(Double valueFrom) {
    return valueFrom - 273.15;
  }

  public static Double k2f(Double valueFrom) {
    return (valueFrom - 273.15) * 9/5 + 32;
  }
}
